package forJavaDocfinal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Rogelio Jr Ibacarra and Benz Walter Jacques Tan
 * @since Created October 5, 2019
 * @version  1.2
 * @title Police Records Database Management System
 */
/**
 * Represents MySQLConnection
 */
/**
 * @author admiral
 *
 */
/**
 * @author admiral
 *
 */
/**
 * @author admiral
 *
 */
public class MySQLConnection {
	
	/**Connects the program to the Database
	 * @return
	 */
	public static Connection getConnection() {
		try{
			String driver = "com.mysql.cj.jdbc.Driver";
			String url = "jdbc:mysql://localhost/police_records?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String username = "roger";
			String password = "Arjking098@@";
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(url, username, password);
			//System.out.println("Connection Successful!");
			return con;
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return null;
	}
	
	//Importing to Database
	/**
	 * Enters the added criminal information into the database
	 * @param data
	 */
	public static void add_criminal_information(String[] data) {
		GeneratedKeys gk = new GeneratedKeys();
		
		int key = 0;
		
		try {
			String values = "";
			
			for(int x = 0; x < data.length; x++) {
				if(x == 13) {
					values += "'" + data[x] + "'";
				}else {
					values += "'" + data[x] + "', "; 
				}
			}
			
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO criminal_information (familyname, firstname, middlename, nickname, gender, civilstatus, " +
					"birthdate, city, province, homeaddress, workaddress, emailaddress, phonenum, mobilenum) " +
					"VALUES (" + values +")", Statement.RETURN_GENERATED_KEYS);
			
			System.out.println(values);
			int affectedRows = posted.executeUpdate();
			
			if (affectedRows == 0) {
	            throw new SQLException("Creating user failed, no rows affected.");
	        }
			
			 try (ResultSet generatedKeys = posted.getGeneratedKeys()) {
		            if (generatedKeys.next()) {
		                key = (int) generatedKeys.getLong(1);
		                gk.setCrimID(key);
		            }else  {
		                throw new SQLException("Creating user failed, no ID obtained.");
		            }
			 }
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Insert Completed");
		}
		
		System.out.println("TEST3 "+gk.getCrimID());
		System.out.println("TEST4 "+key);
	}
	
	
	/**
	 * Enters the added criminal_history into the database
	 * @param data
	 */
	public static void add_criminal_history(String[] data) {
		GeneratedKeys gk = new GeneratedKeys();
		
		int key = 0;
		
		try {
			String values = "";
			
			for(int x = 0; x < data.length; x++) {
				if(x == 0) {
					values += data[x] + ", ";
				}else if(x == 5) {
					values += "'" + data[x] + "'";
				}else {
					values += "'" + data[x] + "', "; 
				}
			}
			
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO crime_history (crimID, offense," + 
															" offenseDesc, offenseLocation, offenseDate, sentence)" +
															" VALUES (" + values +")", Statement.RETURN_GENERATED_KEYS);
			System.out.println(values);
			int affectedRows = posted.executeUpdate();
			
			if (affectedRows == 0) {
	            throw new SQLException("Creating user failed, no rows affected.");
	        }
			
			 try (ResultSet generatedKeys = posted.getGeneratedKeys()) {
		            if (generatedKeys.next()) {
		                key = (int) generatedKeys.getLong(1);
		                gk.setCaseID(key);
		            }else  {
		                throw new SQLException("Creating user failed, no ID obtained.");
		            }
			 }
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Insert Completed");
		}
	}
	
	/**
	 * Enters the added FIR into the database
	 * @param data
	 */
	public static void add_crime_FIR(String[] data) {
		try {
			String values = "";
			
			for(int x = 0; x < data.length; x++) {
				if(x == 0) {
					values += data[x] + ", ";
				}else if(x == 3) {
					values += "'" + data[x] + "'";
				}else {
					values += "'" + data[x] + "', "; 
				}
			}
			
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO crime_fir (case_ID, fir_type," + 
															" fir_desc, fir_reporter)" +
															" VALUES (" + values +")");
			System.out.println(values);
			posted.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("FIR Insert Completed");
		}
	}
	
	
	/**
	 * Enters the added court information into the database
	 * @param data
	 */
	public static void add_court_information(String[] data) {
		try {
			String values = "";
			
			for(int x = 0; x < data.length; x++) {
				if(x == 0) {
					values += data[x] + ", ";
				}else if(x == 4) {
					values += "'" + data[x] + "'";
				}else {
					values += "'" + data[x] + "', "; 
				}
			}
			
			Connection con = getConnection();
			PreparedStatement posted = con.prepareStatement("INSERT INTO court_information (caseID, courtName," + 
															" courtType, courtDesc, courtLocation)" +
															" VALUES (" + values +")");
			System.out.println(values);
			posted.executeUpdate();
		} catch(Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Insert Completed");
		}
	}
	
	
	//Exporting from Database
	/**
	 * Logs the user into the database, checks the inputed user and inputed password if it is valid
	 * @param user
	 * @param password
	 * @return
	 */
	public static boolean getAccess(String user, String password) {
		boolean access = false;
		
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT * FROM user WHERE userID = '" + user + "' and password = '" + password +"'");
			ResultSet result = statement.executeQuery();
			
			if(result.next()) {
				access = true;
			} else {
				access = false;
			}
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		return access;
	} 
	
	
	public static String getCaseID(String where) {
		String id = null;
		
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT caseID FROM crime_history WHERE crimID = '" + where + "' ");
			
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				id = result.getString("caseID");
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("PRIMARY" + id);
		return id;
	}
	
	
	/**
	 * Gets the criminal information from the database, and return its last crimID
	 * @param search
	 * @return
	 */
	public static ArrayList<Criminal> getCriminals(String search) {
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT crimID, familyname, firstname, middlename, nickname, gender, "
															 + "civilstatus, birthdate, city, province, homeaddress, workaddress,"
															 + "emailaddress, phonenum, mobilenum FROM criminal_information WHERE crimID = "
															 + "'" + search + "' " + "or" + " familyname = '" + search + "' or "
															 + "firstname = '" + search + "' or nickname = '" + search + "'");
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<Criminal> crim = new ArrayList<Criminal>();
			
			while(result.next()) {
				Criminal criminal = new Criminal();
				
				criminal.setcrimID(result.getInt("crimID"));
				criminal.setFamilyName(result.getString("familyname"));
				criminal.setFirstName(result.getString("firstname"));
				criminal.setMiddleName(result.getString("middlename"));
				criminal.setNickName(result.getString("nickname"));
				criminal.setGender(result.getString("gender"));
				criminal.setCivilStatus(result.getString("civilstatus"));
				criminal.setBirthDate(result.getString("birthdate"));
				criminal.setCity(result.getString("city"));
				criminal.setProvince(result.getString("province"));
				criminal.setHomeAdd(result.getString("homeaddress"));
				criminal.setWorkAdd(result.getString("workaddress"));
				criminal.setEmailAdd(result.getString("emailaddress"));
				criminal.setMobNum(result.getString("mobilenum"));
				criminal.setTelNum(result.getString("phonenum"));
				
				crim.add(criminal);
			}
			return crim;
		} catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}
	
	/*
	 * Gets the various crime types from the database, and returns it
	 * @return
	 */
	public static ArrayList<CrimeTypes> getCrimeTypes(){
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT * FROM crime_type");
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<CrimeTypes> array = new ArrayList<CrimeTypes>();
			while(result.next()) {
				CrimeTypes ct = new CrimeTypes(result.getInt("CT_ID"), result.getString("CT_Name"), result.getString("CT_Description"));
				array.add(ct);
			}
			return array;
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

	/**
	 * Gets the caseID's Criminal History from the database and returns it
	 * @return
	 */
	public static ArrayList<CrimeHistory> getCrimeHistory(){
		try {
			GeneratedKeys gk = new GeneratedKeys();
			
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT caseID, offense, offenseDesc, offenselocation, offenseDate, Sentence "
															 + "FROM crime_history WHERE crimID = '" + gk.getCrimID() + "' ");
			ResultSet result = statement.executeQuery();
			
			ArrayList<CrimeHistory> chArray = new ArrayList<CrimeHistory>();
			while(result.next()) {
				CrimeHistory ch = new CrimeHistory(result.getString("caseID"), result.getString("offense"));
				ch.setOffenseDesc(result.getString("offenseDesc"));
				ch.setOffenseLoc(result.getString("offenselocation"));
				ch.setOffenseDate(result.getString("offenseDate"));
				ch.setSentence(result.getString("Sentence"));
				
				chArray.add(ch);
			}
			
			return chArray;	
		}catch(Exception e){System.out.println(e);}
		return null;
	}
	
	
	/**
	 * Gets the last generetad ID's Court info from the database, and returns it.
	 * @param crimid
	 * @return
	 */
	public static CourtInformation getCourtInfo(String crimid){
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT courtName, courtType, courtDesc, courtLocation "
															 + "FROM court_information WHERE caseID = '" + crimid + "' ");
			ResultSet result = statement.executeQuery();
			CourtInformation ct = new CourtInformation();
			
			if(result.next()) {
				
				ct.setCourtName(result.getString("courtName"));
				ct.setCourtType(result.getString("courtType"));
				ct.setCourtDesc(result.getString("courtDesc"));
				ct.setCourtLoc(result.getString("courtLocation"));
			}
			return ct;	
		}catch(Exception e){System.out.println(e);}
		return null;
	}
	
	/**
	 * Gets the crimID's Court information from the database
	 * @param crimid
	 * @return
	 */
	public static CrimeFIR getCrimeFIR(String crimid) {
		try {
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT fir_type, fir_desc, fir_reporter "
															 + "FROM crime_fir WHERE case_ID = '" + crimid + "' ");
			ResultSet result = statement.executeQuery();
			CrimeFIR cfir = new CrimeFIR();
			
			if(result.next()) {
				cfir.setFIR_type(result.getString("fir_type"));
				cfir.setFIR_Desc(result.getString("fir_desc"));
				cfir.setFIR_reporter(result.getString("fir_reporter"));
			}
			return cfir;	
		}catch(Exception e){System.out.println(e);}
		return null;
	}
	
	/**
	 * Gets the needed Info for the Jlist from the database
	 * @return
	 */
	public static ArrayList<JListInfo> getJListInfo(){
		try {
			GeneratedKeys gk = new GeneratedKeys();
			
			Connection con = getConnection();
			PreparedStatement statement = con.prepareStatement("SELECT offense, caseID FROM crime_history WHERE crimID = '" + gk.getCrimID() + "' ");
			
			ResultSet result = statement.executeQuery();
			
			ArrayList<JListInfo> array = new ArrayList<JListInfo>();
			while (result.next()) {
				JListInfo info = new JListInfo(result.getString("offense"), result.getInt("caseID"));
				System.out.println("WORKING");
				array.add(info);
			} 
			return array;
		}catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

	//Updates
	/**
	 * Gets the criminal information from the Program and updates the database with it
	 * @param crim
	 */
	public static void updateCriminal(Criminal crim) {
		try {
			Connection con = getConnection();
			PreparedStatement update = con.prepareStatement ("UPDATE criminal_information SET familyname = ?, firstname = ?, middlename = ?, "
														   + "nickname = ?, gender = ?, civilstatus = ?, birthdate = ?, city = ?, province = ?, "
														   + "homeaddress = ?, workaddress = ?, emailaddress = ?, phonenum = ?, mobilenum = ? "
														   + "WHERE crimID = ?");
			
			update.setString(1, crim.getFamilyName());
			update.setString(2, crim.getFirstName());	
			update.setString(3, crim.getMiddleName());	
			update.setString(4, crim.getNickName());	
			update.setString(5, crim.getGender());	
			update.setString(6, crim.getCivilStatus());	
			update.setString(7, crim.getBirthdate());	
			update.setString(8, crim.getCity());	
			update.setString(9, crim.getProvince());	
			update.setString(10, crim.getHomeAdd());	
			update.setString(11, crim.getWorkAdd());	
			update.setString(12, crim.getEmailAdd());	
			update.setString(13, crim.getTelNum());	
			update.setString(14, crim.getMobNum());	
			update.setInt(15, crim.getcrimID());
			
			update.executeUpdate();
			System.out.println("Criminal Information Updated...");
			}catch(Exception e) {System.out.println(e);}
	}

	/**
	 * Gets the CrimeHistory from the program and updates the database with it
	 * @param ch
	 */
	public static void updateCrimeHistory(CrimeHistory ch) {
		try {
			Connection con = getConnection();
			PreparedStatement update = con.prepareStatement ("UPDATE crime_history SET offense = ?, offenseDesc = ?, offenseLocation = ?, "
														   + "offenseDate = ?, Sentence = ? WHERE caseID = ?");
			
			update.setString(1, ch.getOffense());
			update.setString(2, ch.getOffenseDesc());	
			update.setString(3, ch.getOffenseLoc());	
			update.setString(4, ch.getOffenseDate());	
			update.setString(5, ch.getSentence());	
			update.setString(6, ch.getCaseID());
			
			update.executeUpdate();
			System.out.println("Criminal History Updated...");
			}catch(Exception e) {System.out.println(e);}
	}

	/**
	 * Gets the FIR from the program and updates the database with it
	 * @param cf
	 */
	public static void updateFIR(CrimeFIR cf) {
		try {
			Connection con = getConnection();
			PreparedStatement update = con.prepareStatement ("UPDATE crime_fir SET fir_type = ?, fir_desc = ?, fir_reporter = ? "
														   + "WHERE case_ID = ?");
			
			update.setString(1, cf.getFIR_type());
			update.setString(2, cf.getFIR_Desc());	
			update.setString(3, cf.getFIR_reporter());	
			update.setString(4, cf.getCaseID());	
			
			update.executeUpdate();
			System.out.println("FIR Updated...");
			}catch(Exception e) {System.out.println(e);}
	}

	/**
	 * Gets the CourtInfo from the program and updates the database with it
	 * @param ci
	 */
	public static void updateCourtInfo(CourtInformation ci) {
		try {
			Connection con = getConnection();
			PreparedStatement update = con.prepareStatement ("UPDATE court_information SET courtName = ?, courtType = ?, courtDesc = ?, "
														   + "courtLocation = ? WHERE caseID = ?");
			
			update.setString(1, ci.getCourtName());
			update.setString(2, ci.getCourtType());	
			update.setString(3, ci.getCourtDesc());	
			update.setString(4, ci.getCourtLocation());	
			update.setString(5, ci.getCaseID());	
			
			update.executeUpdate();
			System.out.println("Court Information Updated...");
			}catch(Exception e) {System.out.println(e);}
	}
}
