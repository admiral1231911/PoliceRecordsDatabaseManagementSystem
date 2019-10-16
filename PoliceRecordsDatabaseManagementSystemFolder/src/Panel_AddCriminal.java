package forJavaDocfinal;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import java.awt.SystemColor;

/**
 * @author Rogelio Jr Ibacarra and Benz Walter Jacques Tan
 * @since Created October 5, 2019
 * @version  1.2
 * @title Police Records Database Management System
 */
/**
 * Represents Panel_AddCriminal
 */
public class Panel_AddCriminal extends JPanel{

	Criminal offender = new Criminal();
	
	protected JDateChooser datepicker;
	protected JTextField familyName;
	protected JTextField firstName;
	protected JTextField middleName;
	
	protected JTextField homeAdd;
	protected JTextField telNum;
	protected JTextField mobNum;
	protected JTextField emailAdd;
	
	protected int crimID;
	protected JTextField nickName;
	protected JTextField city;
	protected JTextField province;
	protected JTextField workAdd;
	
	protected ButtonGroup genders;
	protected JRadioButton rdbtnMale;
	protected JRadioButton rdbtnFemale;
	
	protected ButtonGroup civilstat;
	protected JRadioButton rdbtnSingle;
	protected JRadioButton rdbtnMarried;
	protected JRadioButton rdbtnWidowed;
	protected JRadioButton rdbtnDivorced;
	
	protected JLabel lblAddRecord;
	
	/**
	 * Creates the Panel Gui and its designated textfields and buttons
	 */
	public Panel_AddCriminal() {
		setForeground(SystemColor.activeCaptionBorder);
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		nickName = new JTextField();
		nickName.setColumns(10);
		nickName.setBounds(517, 66, 159, 20);
		
		city = new JTextField();
		city.setColumns(10);
		city.setBounds(179, 113, 159, 20);
		
		province = new JTextField();
		province.setColumns(10);
		province.setBounds(348, 113, 159, 20);
	
		workAdd = new JTextField();
		workAdd.setColumns(10);
		workAdd.setBounds(517, 113, 159, 20);
		
		datepicker = new JDateChooser();
		datepicker.setBounds(10, 160, 138, 20);
		datepicker.setDateFormatString("yyyy-MM-dd");
		
		familyName = new JTextField();
		familyName.setBounds(10, 66, 159, 20);
		familyName.setColumns(10);
		
		firstName = new JTextField();
		firstName.setColumns(10);
		firstName.setBounds(179, 66, 159, 20);
		
		
		middleName = new JTextField();
		middleName.setColumns(10);
		middleName.setBounds(348, 66, 159, 20);
		
		homeAdd = new JTextField();
		homeAdd.setColumns(10);
		homeAdd.setBounds(10, 113, 159, 20);
		
		mobNum = new JTextField();
		mobNum.setColumns(10);
		mobNum.setBounds(179, 160, 159, 20);
		
		telNum = new JTextField();
		telNum.setColumns(10);
		telNum.setBounds(348, 160, 159, 20);
		
		emailAdd = new JTextField();
		emailAdd.setColumns(10);
		emailAdd.setBounds(517, 160, 159, 20);
		
		
		//Text Fields
		add(familyName);
		add(firstName);
		add(middleName);
		add(homeAdd);
		add(datepicker);
		add(city);
		add(homeAdd);
		add(province);
		add(workAdd);
		add(telNum);
		add(mobNum);
		add(emailAdd);
		add(nickName);
		
		//Labels
		lblAddRecord = new JLabel("Add Record: Criminal Information");
		lblAddRecord.setBackground(Color.WHITE);
		lblAddRecord.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblAddRecord.setForeground(Color.WHITE);
		lblAddRecord.setBounds(10, 11, 328, 14);
		add(lblAddRecord);
		
		JLabel lblFamilyName = new JLabel("Family Name");
		lblFamilyName.setForeground(Color.WHITE);
		lblFamilyName.setBounds(10, 51, 87, 14);
		add(lblFamilyName);
		
		JLabel lblMiddleName = new JLabel("Middle Name");
		lblMiddleName.setForeground(Color.WHITE);
		lblMiddleName.setBounds(348, 51, 87, 14);
		add(lblMiddleName);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setBounds(179, 51, 87, 14);
		add(lblFirstName);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(Color.WHITE);
		lblGender.setBounds(10, 191, 48, 14);
		add(lblGender);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setForeground(Color.WHITE);
		lblDateOfBirth.setBounds(10, 144, 81, 14);
		add(lblDateOfBirth);
		
		JLabel lblHomeAddress = new JLabel("Home Address");
		lblHomeAddress.setForeground(Color.WHITE);
		lblHomeAddress.setBounds(10, 97, 87, 14);
		add(lblHomeAddress);
		
		JLabel lblNickName = new JLabel("Nickname");
		lblNickName.setForeground(Color.WHITE);
		lblNickName.setBounds(517, 51, 87, 14);
		add(lblNickName);
		
		JLabel lblCity = new JLabel("City/Town");
		lblCity.setForeground(Color.WHITE);
		lblCity.setBounds(179, 97, 87, 14);
		add(lblCity);
		
		JLabel lblProvince = new JLabel("Province");
		lblProvince.setForeground(Color.WHITE);
		lblProvince.setBounds(348, 97, 87, 14);
		add(lblProvince);
		
		JLabel lblWorkAddress = new JLabel("Work Address");
		lblWorkAddress.setForeground(Color.WHITE);
		lblWorkAddress.setBounds(517, 97, 87, 14);
		add(lblWorkAddress);
		
		JLabel lblCivilStatus = new JLabel("Civil Status");
		lblCivilStatus.setForeground(Color.WHITE);
		lblCivilStatus.setBounds(179, 191, 87, 14);
		add(lblCivilStatus);
		
		JLabel lblMobileNumber = new JLabel("Mobile Number");
		lblMobileNumber.setForeground(Color.WHITE);
		lblMobileNumber.setBounds(179, 144, 87, 14);
		add(lblMobileNumber);
		
		JLabel lblTelephoneNumber = new JLabel("Telephone Number");
		lblTelephoneNumber.setForeground(Color.WHITE);
		lblTelephoneNumber.setBounds(348, 144, 141, 14);
		add(lblTelephoneNumber);
		
		JLabel lblEmailAddress = new JLabel("Email Address");
		lblEmailAddress.setForeground(Color.WHITE);
		lblEmailAddress.setBounds(517, 144, 87, 14);
		add(lblEmailAddress);
		
		//Buttons
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setForeground(Color.WHITE);
		rdbtnMale.setBackground(new Color(57, 62, 70));
		rdbtnMale.setBounds(10, 212, 62, 23);
		add(rdbtnMale);
		
		rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setForeground(Color.WHITE);
		rdbtnFemale.setBackground(new Color(57, 62, 70));
		rdbtnFemale.setBounds(74, 212, 74, 23);
		add(rdbtnFemale);
		
		genders = new ButtonGroup();
		genders.add(rdbtnMale);
		genders.add(rdbtnFemale);
		
		rdbtnSingle = new JRadioButton("Single");
		rdbtnSingle.setForeground(Color.WHITE);
		rdbtnSingle.setBackground(new Color(57, 62, 70));
		rdbtnSingle.setBounds(179, 212, 62, 23);
		add(rdbtnSingle);
		
		rdbtnMarried = new JRadioButton("Married");
		rdbtnMarried.setForeground(Color.WHITE);
		rdbtnMarried.setBackground(new Color(57, 62, 70));
		rdbtnMarried.setBounds(243, 212, 74, 23);
		add(rdbtnMarried);
		
		rdbtnWidowed = new JRadioButton("Widowed");
		rdbtnWidowed.setForeground(Color.WHITE);
		rdbtnWidowed.setBackground(new Color(57, 62, 70));
		rdbtnWidowed.setBounds(319, 212, 87, 23);
		add(rdbtnWidowed);
		
		rdbtnDivorced = new JRadioButton("Divorced");
		rdbtnDivorced.setForeground(Color.WHITE);
		rdbtnDivorced.setBackground(new Color(57, 62, 70));
		rdbtnDivorced.setBounds(408, 212, 81, 23);
		add(rdbtnDivorced);
		
		civilstat = new ButtonGroup();
		civilstat.add(rdbtnSingle);
		civilstat.add(rdbtnMarried);
		civilstat.add(rdbtnWidowed);
		civilstat.add(rdbtnDivorced);
		
		
		
		//KeyListeners
		rdbtnMale.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            offender.setGender("Male");
	        }
	    });
		
		rdbtnFemale.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	offender.setGender("Female");
	        }
	    });
		
		rdbtnSingle.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            offender.setCivilStatus("Single");
	        }
	    });
		
		rdbtnMarried.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	offender.setCivilStatus("Married");
	        }
	    });
		
		rdbtnWidowed.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	offender.setCivilStatus("Widowed");
	        }
	    });
		
		rdbtnDivorced.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	offender.setCivilStatus("Divorced");
	        }
	    });
	}
	
	/**
	 * Gets the data from the textfields and encrypts them, then sends the data into the MySQLConnection Method
	 * for saving
	 */
	public void saveData() {
		MySQLConnection sql = new MySQLConnection();
		
		String[] crimData = new String[14];
		
		offender.setFamilyName(AES_ED.encrypt(familyName.getText()));
		offender.setFirstName(AES_ED.encrypt(firstName.getText()));
		offender.setMiddleName(AES_ED.encrypt(middleName.getText()));
		offender.setNickName(AES_ED.encrypt(nickName.getText()));
		offender.setBirthDate(((JTextField)datepicker.getDateEditor().getUiComponent()).getText());
		offender.setCity(AES_ED.encrypt(city.getText()));
		offender.setProvince(AES_ED.encrypt(province.getText()));
		offender.setHomeAdd(AES_ED.encrypt(homeAdd.getText()));
		offender.setWorkAdd(AES_ED.encrypt(workAdd.getText()));
		offender.setEmailAdd(AES_ED.encrypt(emailAdd.getText()));
		offender.setTelNum(AES_ED.encrypt(telNum.getText()));
		offender.setMobNum(AES_ED.encrypt(mobNum.getText()));
		
		crimData[0] = offender.getFamilyName();
		crimData[1] = offender.getFirstName();
		crimData[2] = offender.getMiddleName();
		crimData[3] = offender.getNickName();
		crimData[4] = offender.getGender();
		crimData[5] = offender.getCivilStatus();
		crimData[6] = offender.getBirthdate();
		crimData[7] = offender.getCity();
		crimData[8] = offender.getProvince();
		crimData[9] = offender.getHomeAdd();
		crimData[10] = offender.getWorkAdd();
		crimData[11] = offender.getEmailAdd();
		crimData[12] = offender.getTelNum();
		crimData[13] = offender.getMobNum();
		
		sql.add_criminal_information(crimData); 
	}
}
