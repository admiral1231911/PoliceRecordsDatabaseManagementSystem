package forJavaDocfinal;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;

import java.util.ArrayList;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.Font;

/**
 * @author Rogelio Jr Ibacarra and Benz Walter Jacques Tan
 * @since Created October 5, 2019
 * @version  1.2
 * @title Police Records Database Management System
 */
/**
 * Represents Panel_AddCourt
 */
public class Panel_AddCourt extends JPanel {
	
	JComboBox cbCrimeList = new JComboBox();
	private JTextField tfCourtName;
	private JTextField tfCourtLocation;
	
	ArrayList<CourtInformation> ci = new ArrayList<CourtInformation>();

	/**
	 * Creates the Panel and its designated buttons and fields for the Adding Court Information
	 */
	public Panel_AddCourt() {
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		tfCourtName = new JTextField();
		tfCourtName.setBounds(255, 84, 372, 20);
		add(tfCourtName);
		tfCourtName.setColumns(10);
		
		tfCourtLocation = new JTextField();
		tfCourtLocation.setColumns(10);
		tfCourtLocation.setBounds(255, 131, 372, 20);
		add(tfCourtLocation);
		
		JTextPane tpDesc = new JTextPane();
		tpDesc.setBounds(255, 187, 372, 117);
		add(tpDesc);
		
		JLabel lblCourtName = new JLabel("Court Name");
		lblCourtName.setForeground(Color.WHITE);
		lblCourtName.setBounds(255, 66, 122, 14);
		add(lblCourtName);
		
		JLabel lblCourtLoc = new JLabel("Court Location");
		lblCourtLoc.setForeground(Color.WHITE);
		lblCourtLoc.setBounds(255, 115, 142, 14);
		add(lblCourtLoc);
		
		JLabel lblNewLabel_2 = new JLabel("Crime");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(58, 66, 142, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Court Type");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(58, 115, 110, 14);
		add(lblNewLabel_3);
		
		JLabel lblDesc = new JLabel("Description");
		lblDesc.setForeground(Color.WHITE);
		lblDesc.setBounds(255, 172, 122, 14);
		add(lblDesc);
		
		cbCrimeList.setBounds(58, 83, 167, 22);
		add(cbCrimeList);
		
		JComboBox cbCourtTypes = new JComboBox();
		cbCourtTypes.setBounds(58, 130, 167, 22);
		add(cbCourtTypes);
		
		cbCourtTypes.addItem("Supreme Court");
		cbCourtTypes.addItem("Court of Appeals");
		cbCourtTypes.addItem("Regional Trial Courts");
		cbCourtTypes.addItem("Metropolitan Trial Courts");
		cbCourtTypes.addItem("Municipal Trial Courts in Cities");
		cbCourtTypes.addItem("Municipal Trial Courts");
		cbCourtTypes.addItem("Municipal Circuit Trial Courts");	
		
		JButton btnAddinfo = new JButton("Add");
		btnAddinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CourtInformation tempCI = new CourtInformation();
				
				Object item = cbCrimeList.getSelectedItem();
				int caseid = ((JListInfo)item).getCaseID();
				
				tempCI.setCaseID(Integer.toString(caseid));
				tempCI.setCourtName(AES_ED.encrypt(tfCourtName.getText()));
				tempCI.setCourtDesc(AES_ED.encrypt(tpDesc.getText()));
				tempCI.setCourtLoc(AES_ED.encrypt(tfCourtLocation.getText()));
				tempCI.setCourtType(AES_ED.encrypt(cbCourtTypes.getSelectedItem().toString()));
				
				ci.add(tempCI);
				
				int index  = cbCrimeList.getSelectedIndex();
				cbCrimeList.removeItemAt(index);
			}
		});
		btnAddinfo.setBounds(538, 315, 89, 23);
		btnAddinfo.setForeground(Color.BLACK);
		btnAddinfo.setBackground(Color.LIGHT_GRAY);
		add(btnAddinfo);	
		
		JLabel lblAddRecordCourt = new JLabel("Add Record: Court Information");
		lblAddRecordCourt.setForeground(Color.WHITE);
		lblAddRecordCourt.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblAddRecordCourt.setBackground(Color.WHITE);
		lblAddRecordCourt.setBounds(10, 11, 328, 14);
		add(lblAddRecordCourt);
	}
	
	
	/**
	 * Sets the JComboBox Contents
	 */
	public void setJBItems() {
		MySQLConnection sql = new MySQLConnection();
		
		ArrayList<JListInfo> data = sql.getJListInfo();
		
		for(int x = 0; x < data.size(); x++) {
			cbCrimeList.addItem(new JListInfo(AES_ED.decrypt(data.get(x).getOffense()), data.get(x).getCaseID()));
		}
	}
	
	/**
	 * Sends the textFields data and send it to the MySQLConnection Class for saving
	 */
	public void saveData() {
		MySQLConnection sql = new MySQLConnection();
		
		for(int x = 0; x < ci.size(); x++) {
			
			String[] data = new String[5]; 
			
			System.out.println("TEST: " + ci.get(x).getCaseID());
			
			data[0] = ci.get(x).getCaseID();
			data[1] = ci.get(x).getCourtName();
			data[2] = ci.get(x).getCourtType();
			data[3] = ci.get(x).getCourtDesc();
			data[4] = ci.get(x).getCourtLocation();
			
			sql.add_court_information(data);
		}
	}
}
