package forJavaDocfinal;
/**
 * @author Rogelio Jr Ibacarra and Benz Walter Jacques Tan
 * @since Created October 5, 2019
 * @version  1.2
 * @title Police Records Database Management System
 */
/**
 * Represents CrimeHistory
 */
public class CrimeHistory {
	
	private String crimID;
	private String caseID;
	private String offense; 
	private String offenseDesc;
	private String offenseLoc;
	private String offenseDate;
	private String sentence;
	
	/**
	 * @param id - the unique Case ID
	 * @param off - Offense information
	 */
	CrimeHistory(String id, String off){
		this.caseID = id;
		this.offense = off;
		
	}
	
	/**
	 * sets Criminal ID from user
	 * @param input
	 */
	public void setCrimID(String input) {
		this.crimID = input;
	}
	/**
	 * sets Case ID from user
	 * @param input
	 */
	public void setCaseID(String input) {
		this.caseID = input;
	}
	/**
	 * sets Offense from user
	 * @param input
	 */
	public void setOffense(String input) {
		this.offense = input;
	}
	/**
	 * sets Description for offense from user
	 * @param input
	 */
	public void setOffenseDesc(String input) {
		this.offenseDesc = input;
	}
	/**
	 * sets Offense Location from user
	 * @param input
	 */
	public void setOffenseLoc(String input) {
		this.offenseLoc = input;
	}
	/**
	 * sets Date from selected
	 * @param input
	 */
	public void setOffenseDate(String input) {
		this.offenseDate = input;
	}
	/**
	 * sets Sentence from user
	 * @param input
	 */
	public void setSentence(String input) {
		this.sentence = input;
	}
	
	/**
	 * Getting Crime ID
	 * @return crimID
	 */
	public String getCrimID() {
		return this.crimID;
	}
	/**
	 * Getting Case ID
	 * @return caseID
	 */
	public String getCaseID() {
		return this.caseID;
	}
	/**
	 * Getting Offense
	 * @return offense
	 */
	public String getOffense() {
		return this.offense;
	}
	/**
	 * Getting Description of the chosen offense
	 * @return offenseDesc
	 */
	public String getOffenseDesc(){
		return this.offenseDesc;
	}
	/**
	 * Getting Offense Location
	 * @return offenseLoc
	 */
	public String getOffenseLoc() {
		return this.offenseLoc;
	}
	/**
	 * Getting Date of the Offense
	 * @return offenseDate
	 */
	public String getOffenseDate() {
		return this.offenseDate;
	}
	/**
	 * Getting Offense Sentence
	 * @return sentence
	 */
	public String getSentence() {
		return this.sentence;
	}
	public String toString() {
		return AES_ED.decrypt(offense);
	}
}
