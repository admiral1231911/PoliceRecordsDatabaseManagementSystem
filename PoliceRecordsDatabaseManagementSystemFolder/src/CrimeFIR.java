package forJavaDocfinal;
/**
 * @author Rogelio Jr Ibacarra and Benz Walter Jacques Tan
 * @since Created October 5, 2019
 * @version  1.2
 * @title Police Records Database Management System
 */
/**
 * Represents a First Information Report
 */
public class CrimeFIR {
	
	private String FIR_ID;
	private String caseID;
	private String FIR_type;
	private String FIR_Desc;
	private String FIR_reporter;
	
	/**
	 * Getting unique FIR ID
	 * @return FIR_ID
	 */
	public String getFIR_ID() {
		return FIR_ID;
	}
	/**
	 * Getting unique CaseID
	 * @return caseID
	 */
	public String getCaseID() {
		return caseID;
	}
	/**
	 * Getting FIR Type
	 * @return FIR_type
	 */
	public String getFIR_type() {
		return FIR_type;
	}
	/**
	 * Getting Description for FIR
	 * @return FIR_Desc
	 */
	public String getFIR_Desc() {
		return FIR_Desc;
	}
	/**
	 * Getting Reporter of the FIR
	 * @return FIR_reporter
	 */
	public String getFIR_reporter() {
		return FIR_reporter;
	}
	/**
	 * Sets the Unique First Information Report field.
	 * @param fIR_ID - the First Information Report ID
	 */
	public void setFIR_ID(String fIR_ID) {
		this.FIR_ID = fIR_ID;
	}
	/**
	 * Sets the Unique Case ID.
	 * @param caseID - the First Information Report ID
	 */
	public void setCaseID(String input) {
		this.caseID = input;
	}
	
	/**
	 * Sets the First Information Report type field.
	 * @param fIR_type - the First Information Report type
	 */
	public void setFIR_type(String fIR_type) {
		this.FIR_type = fIR_type;
	}
	/**
	 * Sets the First Information Report Description field.
	 * @param fIR_Desc - the First Information Report Description
	 */
	public void setFIR_Desc(String fIR_Desc) {
		this.FIR_Desc = fIR_Desc;
	}
	/**
	 * Sets the First Information Report Description reporter
	 * @param fIR_reporter - the First Information Report reporter
	 */
	public void setFIR_reporter(String fIR_reporter) {
		this.FIR_reporter = fIR_reporter;
	}
}
