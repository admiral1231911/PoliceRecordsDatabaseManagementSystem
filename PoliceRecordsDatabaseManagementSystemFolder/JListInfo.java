package forJavaDocfinal;
/**
 * @author Rogelio Jr Ibacarra and Benz Walter Jacques Tan
 * @since Created October 5, 2019
 * @version  1.2
 * @title Police Records Database Management System
 */
/**
 * Represents List of Information
 */
public class JListInfo {
	
	private String offense;
	private int caseID;
	
	/**
	 * @param off - sets Offense type
	 * @param id - sets unique ID
	 */
	public JListInfo(String off, int id){
		this.offense = off;
		this.caseID = id;
	}
	
	/**
	 * gets Offense type
	 * @return offense
	 */
	public String getOffense() {
		return offense;
	}
	
	/**
	 * gets case ID
	 * @return caseID
	 */
	public int getCaseID() {
		return caseID;
	}
	
	public String toString() {
		return offense;
	}
}
