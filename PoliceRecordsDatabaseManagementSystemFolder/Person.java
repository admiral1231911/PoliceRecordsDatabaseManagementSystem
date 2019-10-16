package forJavaDocfinal;

import java.sql.Date;
import java.text.DateFormat;

import com.toedter.calendar.JDateChooser;
/**
 * @author Rogelio Jr Ibacarra and Benz Walter Jacques Tan
 * @since Created October 5, 2019
 * @version  1.2
 * @title Police Records Database Management System
 */
/**
 * Represents person
 */
public class Person {
	
	protected String familyName;
	private String firstName;
	private String middleName;
	
	private String homeAdd;
	private String telNum;
	private String mobNum;
	private String emailAdd;
	
	private String birthdate;
	private String gender;
	
	
	/**
	 * For super class person
	 */
	Person() {
		
	}
	
	/**
	 * gets Family Name of the person
	 * @return familyName
	 */
	public String getFamilyName() {
		return familyName;
	}
	
	/**
	 * gets First name of the person
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	
	/**
	 * gets Middle Name of the person
	 * @return middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	
	/**
	 * gets home Address
	 * @return homeAdd
	 */
	public String getHomeAdd() {
		return homeAdd;
	}
	
	/**
	 * get Telephone Number of the person
	 * @return telNum
	 */
	public String getTelNum() {
		return telNum;
	}
	
	/**
	 * gets Mobile number of the person
	 * @return mobNum
	 */
	public String getMobNum() {
		return mobNum;
	}
	
	/**
	 * gets Email address of the person
	 * @return emailAdd
	 */
	public String getEmailAdd() {
		return emailAdd;
	}
	
	/**
	 * gets Gender of the person
	 * @return gender
	 */
	public String getGender() {
		return gender;
	}
	
	/**
	 * gets Birth day date
	 * @return birthdate
	 */
	public String getBirthdate() {
		return birthdate;
	}
	
	/**
	 * sets Family name of the person
	 * @param input
	 */
	public void setFamilyName(String input) {
		this.familyName = input;
	}
	/**
	 * sets First name of the person
	 * @param input
	 */
	public void setFirstName(String input) {
		this.firstName = input;
	}
	/**
	 * sets Middle name of the person
	 * @param input
	 */
	public void setMiddleName(String input) {
		this.middleName = input;
	}
	/**
	 * sets Home address of the person
	 * @param input
	 */
	public void setHomeAdd(String input) {
		this.homeAdd = input;
	}
	/**
	 * sets Telephone number of the person
	 * @param input
	 */
	public void setTelNum(String input) {
		this.telNum = input;
	}
	/**
	 * sets Mobile Number of the person
	 * @param input
	 */
	public void setMobNum(String input) {
		this.mobNum = input;
	}
	/**
	 * sets Email Address of the person
	 * @param input
	 */
	public void setEmailAdd(String input) {
		this.emailAdd = input;
	}
	/**
	 * sets Gender of the person
	 * @param input
	 */
	public void setGender(String input) {
		this.gender = input;
	}
	/**
	 * sets Birth day Date of the person
	 * @param input
	 */
	public void setBirthDate(String input) {
		this.birthdate = input;
	}
}
