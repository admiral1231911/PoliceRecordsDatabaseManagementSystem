package forJavaDocfinal;

/**
 * @author Rogelio Jr Ibacarra and Benz Walter Jacques Tan
 * @since Created October 5, 2019
 * @version  1.2
 * @title Police Records Database Management System
 */
/**
 * Represents a Court Information
 */
public class CourtInformation {
	
	private String courtID;
	private String caseID;
	private String courtName;
	private String courtType;
	private String courtDesc;
	private String courtLocation;
	
	/**
	 * sets CourtID in String input
	 * @param input 
	 */
	public void setCourtID(String input) {
		this.courtID = input;
	}
	/**
	 * sets CaseID in String input
	 * @param input 
	 */
	public void setCaseID(String input) {
		this.caseID = input;
	}
	/**
	 * sets Court name in String input
	 * @param input 
	 */
	public void setCourtName(String input) {
		this.courtName = input;
	}
	/**
	 * sets the type of the court in String input
	 * @param input 
	 */
	public void setCourtType(String input) {
		this.courtType = input;
	}
	/**
	 * sets description of court in String input
	 * @param input 
	 */
	public void setCourtDesc(String input) {
		this.courtDesc = input;
	}
	/**
	 * sets location of the court in String input
	 * @param input 
	 */
	public void setCourtLoc(String input) {
		this.courtLocation = input;
	}
	
	/**
	 * Getting input of Case ID
	 * @return caseID
	 */
	public String getCaseID() {
		return caseID;
	}
	/**
	 * Getting input of Court ID
	 * @return courtID
	 */
	public String getCourtID() {
		return courtID;
	}
	/**
	 * Getting input of CourtName
	 * @return courtName
	 */
	public String getCourtName() {
		return courtName;
	}
	/**
	 * Getting input of choosen Court Type
	 * @return courtType
	 */
	public String getCourtType() {
		return courtType;
	}
	/**
	 * Getting Description of the Court
	 * @return courtDesc
	 */
	public String getCourtDesc() {
		return courtDesc;
	}
	/**
	 * Getting Location of the Court
	 * @return courtLocation
	 */
	public String getCourtLocation() {
		return courtLocation;
	}
}
