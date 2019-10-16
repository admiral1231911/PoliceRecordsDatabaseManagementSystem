package forJavaDocfinal;
import java.util.Calendar;
/**
 * @author Rogelio Jr Ibacarra and Benz Walter Jacques Tan
 * @since Created October 5, 2019
 * @version  1.2
 * @title Police Records Database Management System
 */
/**
 * Represents a Criminal Information that extends Person
 */

public class Criminal extends Person {
	
	private int crimID;
	private String nickName;
	private String city;
	private String province;
	private String workAdd;
	private String civilstatus;
	
	/**
	 * Sets Crime ID for the criminal
	 * @param input
	 */
	public void setcrimID(int input) {
		this.crimID = input;
	}
	
	/**
	 * Sets Nickname of the Criminal
	 * @param input
	 */
	public void setNickName(String input) {
		this.nickName = input;
	}
	
	/**
	 * sets City Location of the criminal
	 * @param input
	 */
	public void setCity(String input) {
		this.city = input;
	}
	
	/**
	 * Sets Province Location
	 * @param input
	 */
	public void setProvince(String input) {
		this.province = input;
	}
	
	/**
	 * Sets working address
	 * @param input
	 */
	public void setWorkAdd(String input) {
		this.workAdd = input;
	}
	
	/**
	 * Sets Civil Status
	 * @param input
	 */
	public void setCivilStatus(String input) {
		this.civilstatus = input;
	}
	
	/**
	 * Gets unique Criminal ID
	 * @return crimID
	 */
	public int getcrimID() {
		return crimID;
	}
	
	/**
	 * gets Nickname of the Criminal
	 * @return nickName
	 */
	public String getNickName() {
		return nickName;
	}
	
	/**
	 * gets City Location of the Criminal
	 * @return
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * gets Province Location
	 * @return province
	 */
	public String getProvince() {
		return province;
	}
	
	/**
	 * gets working address
	 * @return workAdd
	 */
	public String getWorkAdd() {
		return workAdd;
	}
	
	/**
	 * gets Civil Status of the Criminal
	 * @return civilstatus
	 */
	public String getCivilStatus() {
		return civilstatus;
	}
	
	public String toString() {
		String print = Integer.toString(crimID) + " - " + AES_ED.decrypt(familyName);
		return print;
	}
}
