package forJavaDocfinal;
/**
 * @author Rogelio Jr Ibacarra and Benz Walter Jacques Tan
 * @since Created October 5, 2019
 * @version  1.2
 * @title Police Records Database Management System
 */
/**
 * Generating of the Key
 */

public class GeneratedKeys {
	
	private static int crimID;
	private static int caseID;
	
	/**
	 * Sets Criminal ID
	 * @param input
	 */
	public static void setCrimID(int input) {
		crimID = input;
	}
	
	/**
	 * sets Case ID
	 * @param input
	 */
	public static void setCaseID(int input) {
		caseID = input;
	}

	/**
	 *getting generated Criminal ID
	 * @return crimID
	 */
	public static int getCrimID() {
		return crimID;
	}
	
	/**
	 * getting generated Criminal ID
	 * @return caseID
	 */
	public static int getCaseID() {
		return caseID;
	}
}
