package forJavaDocfinal;
/**
 * @author Rogelio Jr Ibacarra and Benz Walter Jacques Tan
 * @since Created October 5, 2019
 * @version  1.2
 * @title Police Records Database Management System
 */
/**
 * Represents Crime Types
 */
public class CrimeTypes {
	private int crimetypeID;
	private String crimename;
	private String crimedesc;	
	
	/**
	 * @param id - Sets unique ID
	 * @param name - Sets Name of the Crime type
	 * @param desc - sets Description of the crime
	 */
	public CrimeTypes(int id, String name, String desc) {
		this.crimetypeID = id;
		this.crimename = name;
		this.crimedesc = desc;
	}
	
	/**
	 * Gets Crime Type ID
	 * @return crimetypeID
	 */
	public int getCTID() {
		return crimetypeID;
	}
	/**
	 * Gets Crime name
	 * @return crimename
	 */
	public String getCrimeName() {
		return crimename;
	}
	/**
	 * Gets Crime description
	 * @return crimedesc
	 */
	public String getCrimeDesc() {
		return crimedesc;
	}
	public String toString() {
		return crimename;
	}
}
