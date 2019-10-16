package forJavaDocfinal;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import java.awt.SystemColor;
import javax.swing.JComboBox;

/**
 * @author Rogelio Jr Ibacarra and Benz Walter Jacques Tan
 * @since Created October 5, 2019
 * @version  1.2
 * @title Police Records Database Management System
 */
/**
 * Represents Panel_EditCriminal
 */
public class Panel_EditCriminal extends Panel_AddCriminal{
	
	ArrayList<Criminal> crims = new ArrayList<Criminal>();
	
	JComboBox cbResults = new JComboBox();
	private JTextField txtFSearch;
	private String gender;
	private String civilstatus;
	
	/**
	 * Creates the Panel for Editing of the Criminal Information and its designated textfields and buttons
	 */
	Panel_EditCriminal(){
		lblAddRecord.setBounds(10, 262, 181, 14);
		lblAddRecord.setText(" ");
		
		txtFSearch = new JTextField();
		txtFSearch.setBounds(10, 8, 123, 20);
		add(txtFSearch);
		txtFSearch.setColumns(10);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(529, 212, 89, 23);
		btnUpdate.setForeground(Color.BLACK);
		btnUpdate.setBackground(Color.LIGHT_GRAY);
		add(btnUpdate);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(139, 7, 89, 23);
		btnSearch.setForeground(Color.BLACK);
		btnSearch.setBackground(Color.LIGHT_GRAY);
		add(btnSearch);
		
		cbResults.setBounds(238, 7, 159, 22);
		add(cbResults);
		
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateData();
			}
		});
		
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Search();
			}
		});
		
		cbResults.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoadData();
			}
		});
	}
	
	/**
	 * Sends the inputed String to the MySQLConnection class for searching
	 */
	public void Search() {
		MySQLConnection sql = new MySQLConnection();
		
		String searchItem = null;
		
		if(txtFSearch.getText().charAt(0)=='1') {
			searchItem = txtFSearch.getText();
		}else {
			searchItem = AES_ED.encrypt(txtFSearch.getText());
		}
		
		
		crims = sql.getCriminals(searchItem);
		
		for(int x = 0; x < crims.size(); x++) {
			cbResults.addItem(crims.get(x));
		}
	}
	
	/**
	 * Sents the criminal data into the MySQLConnection for Saving
	 */
	public void UpdateData() {
		MySQLConnection sql = new MySQLConnection();
		
		Criminal crim = new Criminal();
		Object item = cbResults.getSelectedItem();
		
		crim.setcrimID(((Criminal)item).getcrimID());
		crim.setFamilyName(AES_ED.encrypt(familyName.getText()));
		crim.setFirstName(AES_ED.encrypt(firstName.getText()));
		crim.setMiddleName(AES_ED.encrypt(middleName.getText()));
		crim.setNickName(AES_ED.encrypt(nickName.getText()));
		crim.setBirthDate(((JTextField)datepicker.getDateEditor().getUiComponent()).getText());
		crim.setCity(AES_ED.encrypt(city.getText()));
		crim.setProvince(AES_ED.encrypt(province.getText()));
		crim.setHomeAdd(AES_ED.encrypt(homeAdd.getText()));
		crim.setWorkAdd(AES_ED.encrypt(workAdd.getText()));
		crim.setEmailAdd(AES_ED.encrypt(emailAdd.getText()));
		crim.setTelNum(AES_ED.encrypt(telNum.getText()));
		crim.setMobNum(AES_ED.encrypt(mobNum.getText()));
		crim.setGender(AES_ED.encrypt(gender));
		crim.setCivilStatus(AES_ED.encrypt(civilstatus));
		
		sql.updateCriminal(crim);
		
		JOptionPane.showMessageDialog(null, crim.getcrimID() + " Updated...");
	}
	
	/**
	 * Loads the selected decrypted JCombobox info into its designated textfields
	 */
	public void LoadData() {
		if(crims.isEmpty()==false) {
			Object item = cbResults.getSelectedItem();
			GeneratedKeys gk = new GeneratedKeys();
			
			gk.setCrimID(((Criminal)item).getcrimID());
			
			familyName.setText(AES_ED.decrypt(((Criminal)item).getFamilyName()));
			placeHolder(familyName, AES_ED.decrypt(((Criminal)item).getFamilyName()));
			
			firstName.setText(AES_ED.decrypt(((Criminal)item).getFirstName()));
			placeHolder(firstName, ((Criminal)item).getFirstName());
			
			middleName.setText(AES_ED.decrypt(((Criminal)item).getMiddleName()));
			placeHolder(middleName, AES_ED.decrypt(((Criminal)item).getMiddleName()));
			
			nickName.setText(AES_ED.decrypt(((Criminal)item).getNickName()));
			placeHolder(nickName, AES_ED.decrypt(((Criminal)item).getNickName()));
			
			city.setText(AES_ED.decrypt(((Criminal)item).getCity()));
			placeHolder(city, AES_ED.decrypt(((Criminal)item).getCity()));
			
			province.setText(AES_ED.decrypt(((Criminal)item).getProvince()));
			placeHolder(province, AES_ED.decrypt(((Criminal)item).getProvince()));
			
			homeAdd.setText(AES_ED.decrypt(((Criminal)item).getHomeAdd()));
			placeHolder(homeAdd, AES_ED.decrypt(((Criminal)item).getHomeAdd()));
			
			workAdd.setText(AES_ED.decrypt(((Criminal)item).getWorkAdd()));
			placeHolder(workAdd, AES_ED.decrypt(((Criminal)item).getWorkAdd()));
			
			emailAdd.setText(AES_ED.decrypt(((Criminal)item).getEmailAdd()));
			placeHolder(emailAdd, ((Criminal)item).getEmailAdd());
			
			telNum.setText(AES_ED.decrypt(((Criminal)item).getTelNum()));
			placeHolder(telNum, AES_ED.decrypt(((Criminal)item).getTelNum()));
			
			mobNum.setText(AES_ED.decrypt(((Criminal)item).getTelNum()));
			placeHolder(mobNum, AES_ED.decrypt(((Criminal)item).getTelNum()));
			
			String birthdate = ((Criminal)item).getBirthdate();
			java.util.Date date2;
			try {
				date2 = new SimpleDateFormat("yyyy-MM-dd").parse(birthdate);
				datepicker.setDate(date2);
			} catch (ParseException e) {
				e.printStackTrace();
			}
						
			if(((Criminal)item).getGender().equalsIgnoreCase("Male")) {
				genders.setSelected(rdbtnMale.getModel(), true);
				gender = "Male";
			}else {
				genders.setSelected(rdbtnMale.getModel(), false);
				gender = "Female";
			}
			
			if(((Criminal)item).getCivilStatus().equalsIgnoreCase("Single")) {
				civilstat.setSelected(rdbtnSingle.getModel(), true);
				civilstatus = "Single";
			}else if(((Criminal)item).getCivilStatus().equalsIgnoreCase("Married")) {
				civilstat.setSelected(rdbtnMarried.getModel(), true);
				civilstatus = "Married";
				
			}else if(((Criminal)item).getCivilStatus().equalsIgnoreCase("Widowed")) {
				civilstat.setSelected(rdbtnWidowed.getModel(), true);
				civilstatus = "Widowed";
				
			}else if(((Criminal)item).getCivilStatus().equalsIgnoreCase("Divorced")) {
				civilstat.setSelected(rdbtnDivorced.getModel(), true);
				civilstatus = "Divorced";
			}
		}
	}

	/**
	 * Gets the JtextField Info for placeholding
	 * @param item, the designated textfield
	 * @param content, content of the textfield
	 */
	public void placeHolder(JTextField item, String content) {
		item.addFocusListener(new FocusListener() {
		    @Override
		    public void focusGained(FocusEvent e) {
		        if (item.getText().equals(content)) {
		            item.setForeground(Color.BLACK);
		        }
		    }
		    @Override
		    public void focusLost(FocusEvent e) {
		        if (item.getText().isEmpty()) {
		            item.setText(content);
		            item.setForeground(Color.BLACK);
		        }else if(item.getText().equals(content)) {
		        	item.setForeground(Color.BLACK);
		        }else {item.setForeground(Color.GRAY);}
		    }
		});
	}
}
