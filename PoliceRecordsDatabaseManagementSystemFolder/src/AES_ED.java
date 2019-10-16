package forJavaDocfinal;
/**
 * @author Rogelio Jr Ibacarra and Benz Walter Jacques Tan
 * @since Created October 5, 2019
 * @version  1.2
 * @title Police Records Database Management System
 */

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 * Represents a Encryption 
 */
public class AES_ED {
	
	 private static SecretKeySpec secretKey;
	 private static byte[] key;
	
	 /**
	  * Setting key for Encrypting
	 * @param myKey
	 */
	public static void setKey(String myKey)
	    {
	        MessageDigest sha = null;
	        try {
	            key = myKey.getBytes("UTF-8");
	            sha = MessageDigest.getInstance("SHA-1");
	            key = sha.digest(key);
	            key = Arrays.copyOf(key, 16);
	            secretKey = new SecretKeySpec(key, "AES");
	        }
	        catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        }
	        catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        }
	    }
	
	 /**
	  * To encrypt selected data
	 * @param strToEncrypt
	 * @return
	 */
	public static String encrypt(String strToEncrypt)
	    {
	        try
	        {
	            setKey("BenzIsGood");
	            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
	            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
	            return Base64.getEncoder().encodeToString(cipher.doFinal(strToEncrypt.getBytes("UTF-8")));
	        }
	        catch (Exception e)
	        {
	            System.out.println("Error while encrypting: " + e.toString());
	        }
	        return null;
	    }
	 
	 /**
	  * to decrypt Selected Data
	 * @param strToDecrypt
	 * @return
	 */
	public static String decrypt(String strToDecrypt)
	 {
		 try
	     {
			 setKey("BenzIsGood");
	         Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
	         cipher.init(Cipher.DECRYPT_MODE, secretKey);
	         return new String(cipher.doFinal(Base64.getDecoder().decode(strToDecrypt)));
	     }
	     catch (Exception e)
	     {
	          System.out.println("Error while decrypting: " + e.toString());
	     }
	  return null;
	 }
}
