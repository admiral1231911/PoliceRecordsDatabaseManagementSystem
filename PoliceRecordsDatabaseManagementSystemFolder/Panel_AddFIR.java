package forJavaDocfinal;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;

/**
 * @author Rogelio Jr Ibacarra and Benz Walter Jacques Tan
 * @since Created October 5, 2019
 * @version  1.2
 * @title Police Records Database Management System
 */
/**
 * Represents Panel_AddFIR
 */
public class Panel_AddFIR extends JPanel {

	JComboBox cbCrimeList = new JComboBox();
	private JTextField tfReporter;
	
	ArrayList<CrimeFIR> cf = new ArrayList<CrimeFIR>();

	/**
	 * Creates the panel for adding FIR Information and its designated textfields and buttons
	 */
	public Panel_AddFIR() {
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		tfReporter = new JTextField();
		tfReporter.setBounds(260, 84, 167, 20);
		add(tfReporter);
		tfReporter.setColumns(10);
		
		JTextPane tpDesc = new JTextPane();
		tpDesc.setBounds(260, 141, 380, 117);
		add(tpDesc);
		
		JLabel lblReporter = new JLabel("Reporter");
		lblReporter.setForeground(Color.WHITE);
		lblReporter.setBounds(260, 66, 122, 14);
		add(lblReporter);
		
		JLabel lblNewLabel_2 = new JLabel("Crime");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(51, 66, 142, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Court Type");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(473, 66, 110, 14);
		add(lblNewLabel_3);
		
		JLabel lblDesc = new JLabel("Description");
		lblDesc.setForeground(Color.WHITE);
		lblDesc.setBounds(260, 127, 122, 14);
		add(lblDesc);
		
		cbCrimeList.setBounds(51, 83, 167, 22);
		add(cbCrimeList);
		
		JComboBox cbFIRTypes = new JComboBox();
		cbFIRTypes.setBounds(473, 83, 167, 22);
		add(cbFIRTypes);
		
		cbFIRTypes.addItem("Resulted in Injury");
		cbFIRTypes.addItem("Near Miss");
		
		JButton btnAddinfo = new JButton("Add");
		btnAddinfo.setBackground(Color.LIGHT_GRAY);
		btnAddinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CrimeFIR tempCF = new CrimeFIR();
				
				Object item = cbCrimeList.getSelectedItem();
				int caseid = ((JListInfo)item).getCaseID();
				
				tempCF.setCaseID(Integer.toString(caseid));
				tempCF.setFIR_reporter(AES_ED.encrypt(tfReporter.getText()));
				tempCF.setFIR_Desc(AES_ED.encrypt(tpDesc.getText()));
				tempCF.setFIR_type(AES_ED.encrypt(cbFIRTypes.getSelectedItem().toString()));
				
				cf.add(tempCF);
				
				int index  = cbCrimeList.getSelectedIndex();
				cbCrimeList.removeItemAt(index);
			}
		});
		btnAddinfo.setBounds(551, 269, 89, 23);
		add(btnAddinfo);	
		
		JLabel lblAddRecordFir = new JLabel("Add Record: First Incident Report");
		lblAddRecordFir.setForeground(Color.WHITE);
		lblAddRecordFir.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblAddRecordFir.setBackground(Color.WHITE);
		lblAddRecordFir.setBounds(20, 11, 328, 14);
		add(lblAddRecordFir);
	}
	
	/**
	 * Add contents to the JCombobox, by decrypting the first
	 */
	public void setJBItems() {
		MySQLConnection sql = new MySQLConnection();
		
		ArrayList<JListInfo> data = sql.getJListInfo();
		
		for(int x = 0; x < data.size(); x++) {
			cbCrimeList.addItem(new JListInfo(AES_ED.decrypt(data.get(x).getOffense()), data.get(x).getCaseID()));
		}
	}
	
	/**
	 * gets the FIR data and sends it to the MySQLConnection Methods for saving.
	 */
	public void saveData() {
		MySQLConnection sql = new MySQLConnection();
		
		for(int x = 0; x < cf.size(); x++) {
			
			String[] data = new String[4]; 
			
			data[0] = cf.get(x).getCaseID();
			data[1] = cf.get(x).getFIR_type();
			data[2] = cf.get(x).getFIR_Desc();
			data[3] = cf.get(x).getFIR_reporter();
			
			sql.add_crime_FIR(data);
		}
	}
}
