package forJavaDocfinal;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import com.toedter.calendar.JDateChooser;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

/**
 * @author Rogelio Jr Ibacarra and Benz Walter Jacques Tan
 * @since Created October 5, 2019
 * @version  1.2
 * @title Police Records Database Management System
 */
/**
 * Represents Panel_EditOthers
 */
public class Panel_EditOthers extends JPanel {
	private JTextField txtFOffense;
	private JTextField txtFSentence;
	private JTextField txtFCourtName;
	private JTextField txtFReporter;
	private JTextField txtFOffLoc;
	private JTextField txtFCourtLoc;
	private JDateChooser datepicker;
	
	private JTextPane txtPOffDesc;
	private JTextPane txtPCourtDesc;
	private JTextPane txtPFIRDesc;
	
	private JComboBox cbOffenses;
	private JComboBox cbCourtType;
	private JComboBox cbFIRType;
	
	ArrayList<CrimeHistory> ch = new ArrayList<CrimeHistory>();
	CourtInformation ci = new CourtInformation();
	CrimeFIR cfir = new CrimeFIR();

	/**
	 * Creates the Panel_EditOthers and its designated buttons and textfields
	 */
	public Panel_EditOthers() {
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		//DatePicker
		datepicker = new JDateChooser();
		datepicker.setBounds(10, 311, 153, 20);
		datepicker.setDateFormatString("yyyy-MM-dd");
		add(datepicker);
		
		//TextPanes
		txtPOffDesc = new JTextPane();
		txtPOffDesc.setBounds(10, 173, 183, 77);
		add(txtPOffDesc);
		
		txtPCourtDesc = new JTextPane();
		txtPCourtDesc.setBounds(231, 173, 183, 77);
		add(txtPCourtDesc);
		
		txtPFIRDesc = new JTextPane();
		txtPFIRDesc.setBounds(455, 173, 183, 77);
		add(txtPFIRDesc);
		
		//TextFields
		txtFOffense = new JTextField();
		txtFOffense.setBounds(10, 89, 183, 20);
		add(txtFOffense);
		txtFOffense.setColumns(10);
		
		txtFOffLoc = new JTextField();
		txtFOffLoc.setColumns(10);
		txtFOffLoc.setBounds(10, 271, 183, 20);
		add(txtFOffLoc);
		
		txtFCourtLoc = new JTextField();
		txtFCourtLoc.setColumns(10);
		txtFCourtLoc.setBounds(231, 271, 183, 20);
		add(txtFCourtLoc);
		
		txtFSentence = new JTextField();
		txtFSentence.setBounds(10, 131, 183, 20);
		add(txtFSentence);
		txtFSentence.setColumns(10);
		
		txtFCourtName = new JTextField();
		txtFCourtName.setBounds(231, 89, 183, 20);
		add(txtFCourtName);
		txtFCourtName.setColumns(10);
				
		txtFReporter = new JTextField();
		txtFReporter.setColumns(10);
		txtFReporter.setBounds(455, 89, 183, 20);
		add(txtFReporter);
		
		JLabel lblOffense = new JLabel("Offense");
		lblOffense.setForeground(Color.WHITE);
		lblOffense.setBounds(10, 73, 48, 14);
		add(lblOffense);
		
		JLabel lblLocation = new JLabel("Offense Sentence");
		lblLocation.setForeground(Color.WHITE);
		lblLocation.setBounds(10, 116, 128, 14);
		add(lblLocation);
		
		JLabel lblOffenseDescription = new JLabel("Offense Description");
		lblOffenseDescription.setForeground(Color.WHITE);
		lblOffenseDescription.setBounds(10, 153, 113, 20);
		add(lblOffenseDescription);
		
		JLabel lblOffenseLocation = new JLabel("Offense Location");
		lblOffenseLocation.setForeground(Color.WHITE);
		lblOffenseLocation.setBounds(10, 253, 128, 20);
		add(lblOffenseLocation);
		
		JLabel lblOffenseDate = new JLabel("Offense Date");
		lblOffenseDate.setForeground(Color.WHITE);
		lblOffenseDate.setBounds(10, 293, 128, 20);
		add(lblOffenseDate);
		
		JLabel lblCourt = new JLabel(" Court Name");
		lblCourt.setForeground(Color.WHITE);
		lblCourt.setBounds(231, 73, 93, 14);
		add(lblCourt);
		
		JLabel lblCourtType = new JLabel(" Court Type");
		lblCourtType.setForeground(Color.WHITE);
		lblCourtType.setBounds(231, 110, 120, 20);
		add(lblCourtType);
		
		JLabel lblCourtDescription = new JLabel("Court Description");
		lblCourtDescription.setForeground(Color.WHITE);
		lblCourtDescription.setBounds(231, 153, 113, 23);
		add(lblCourtDescription);
		
		JLabel lblCourtLocation = new JLabel("Court Location");
		lblCourtLocation.setForeground(Color.WHITE);
		lblCourtLocation.setBounds(231, 253, 128, 23);
		add(lblCourtLocation);
		
		JLabel lblFirReporter = new JLabel("FIR Reporter");
		lblFirReporter.setForeground(Color.WHITE);
		lblFirReporter.setBounds(455, 73, 93, 14);
		add(lblFirReporter);
		
		JLabel lblFirType = new JLabel("FIR Type");
		lblFirType.setForeground(Color.WHITE);
		lblFirType.setBounds(455, 110, 93, 20);
		add(lblFirType);
		
		JLabel lblFirDescription = new JLabel("FIR Description");
		lblFirDescription.setForeground(Color.WHITE);
		lblFirDescription.setBounds(455, 156, 93, 20);
		add(lblFirDescription);
		
		JLabel lblNewLabel = new JLabel("Crime");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 48, 128, 14);
		add(lblNewLabel);
		
		JLabel lblCourt_1 = new JLabel("Court");
		lblCourt_1.setForeground(Color.WHITE);
		lblCourt_1.setBounds(231, 48, 128, 14);
		add(lblCourt_1);
		
		JLabel lblFir = new JLabel("FIR");
		lblFir.setForeground(Color.WHITE);
		lblFir.setBounds(455, 48, 128, 14);
		add(lblFir);
		
		//ComboBoxes
		cbFIRType = new JComboBox();
		cbFIRType.setBounds(455, 130, 183, 22);
		add(cbFIRType);
		
		cbFIRType.addItem("Resulted in Injury");
		cbFIRType.addItem("Near Miss");
		
		cbCourtType = new JComboBox();
		cbCourtType.setBounds(231, 130, 183, 22);
		add(cbCourtType);
		
		cbCourtType.addItem("Supreme Court");
		cbCourtType.addItem("Court of Appeals");
		cbCourtType.addItem("Regional Trial Courts");
		cbCourtType.addItem("Metropolitan Trial Courts");
		cbCourtType.addItem("Municipal Trial Courts in Cities");
		cbCourtType.addItem("Municipal Trial Courts");
		cbCourtType.addItem("Municipal Circuit Trial Courts");	
		
		cbOffenses = new JComboBox();
		cbOffenses.setBounds(10, 11, 183, 22);
		add(cbOffenses);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBackground(Color.LIGHT_GRAY);
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				UpdateData();
			}
		});
		btnUpdate.setBounds(508, 308, 89, 23);
		add(btnUpdate);
		
		cbOffenses.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            	setCriminalInfo();
            	setCourtInfo();
            	setFIR();
            }
        });       
	}
	
	/**
	 * Gets the CrimeHistory from the database and adds it into the JComboBox
	 */
	public void getDatas() {
		MySQLConnection sql = new MySQLConnection();
			
			ch = sql.getCrimeHistory();
			
			for(int x = 0; x < ch.size(); x++) {
				cbOffenses.addItem(ch.get(x));
			}
		}
		
	/**
	 * Gets the selected JCombobox info, and decrypts it into the Criminal Info textfields for viewing
	 */
	public void setCriminalInfo() {
		if(ch.isEmpty()==false) {
    		Object item = cbOffenses.getSelectedItem();
    		
    		txtFOffense.setText(AES_ED.decrypt(((CrimeHistory)item).getOffense()));
			placeHolder(txtFOffense, AES_ED.decrypt(((CrimeHistory)item).getOffense()));
			
			txtFOffLoc.setText(AES_ED.decrypt(((CrimeHistory)item).getOffenseLoc()));
			placeHolder(txtFOffLoc, AES_ED.decrypt(((CrimeHistory)item).getOffenseLoc()));
			
			txtFSentence.setText(AES_ED.decrypt(((CrimeHistory)item).getSentence()));
			placeHolder(txtFSentence, AES_ED.decrypt(((CrimeHistory)item).getSentence()));
			
			txtPOffDesc.setText(AES_ED.decrypt(((CrimeHistory)item).getOffenseDesc()));
			placeHolder2(txtPOffDesc, AES_ED.decrypt(((CrimeHistory)item).getOffenseDesc()));
			
			String birthdate = ((CrimeHistory)item).getOffenseDate();
			java.util.Date date2;
			try {
				date2 = new SimpleDateFormat("yyyy-MM-dd").parse(birthdate);
				datepicker.setDate(date2);
			} catch (ParseException e) {
				e.printStackTrace();
			}	
    	}
	}
	
	/**
	 * Gets the selected JCombobox info, and decrypts it into the CourtInfo textfields for viewing
	 */
	public void setCourtInfo() {
		Object item = cbOffenses.getSelectedItem();
		
		MySQLConnection sql = new MySQLConnection();
		ci = sql.getCourtInfo(((CrimeHistory)item).getCaseID());
		
		txtFCourtName.setText(AES_ED.decrypt(ci.getCourtName()));
		placeHolder(txtFCourtName, AES_ED.decrypt(ci.getCourtName()));
		
		txtPCourtDesc.setText(AES_ED.decrypt(ci.getCourtDesc()));
		placeHolder2(txtPCourtDesc, AES_ED.decrypt(ci.getCourtDesc()));
		
		txtFCourtLoc.setText(AES_ED.decrypt(ci.getCourtLocation()));
		placeHolder(txtFCourtLoc, ci.getCourtLocation());
		 
		for(int x = 0; x < cbOffenses.getItemCount(); x++) {
			if(cbCourtType.getItemAt(x).toString().equalsIgnoreCase(AES_ED.decrypt(ci.getCourtType()))) {
				cbCourtType.setSelectedIndex(x);
				break;
			}
		}
	}
	
	/**
	 * Gets the selected JCombobox info, and decrypts it into the FIR textfields for viewing
	 */
	public void setFIR() {
		Object item = cbOffenses.getSelectedItem();
		
		MySQLConnection sql = new MySQLConnection();
		cfir = sql.getCrimeFIR(((CrimeHistory)item).getCaseID());
		
		txtFReporter.setText(AES_ED.decrypt(cfir.getFIR_reporter()));
		placeHolder(txtFReporter, AES_ED.decrypt(cfir.getFIR_reporter()));
		
		txtPFIRDesc.setText(AES_ED.decrypt(cfir.getFIR_Desc()));
		placeHolder2(txtPFIRDesc, AES_ED.decrypt(cfir.getFIR_Desc()));
		
		for(int x = 0; x < cbFIRType.getItemCount(); x++) {
			if(cbFIRType.getItemAt(x).toString().equalsIgnoreCase(AES_ED.decrypt(cfir.getFIR_type()))) {
				cbFIRType.setSelectedIndex(x);
				break;
			}
		}	
	}
	
	/**
	 * Encrypts and sends the data into the MySQLConnection for Updating.
	 */
	public void UpdateData() {
		MySQLConnection sql = new MySQLConnection();
		
		CrimeHistory tempCH = new CrimeHistory("","");
		CourtInformation tempCI = new CourtInformation();
		CrimeFIR tempCF = new CrimeFIR();
		
		Object item = cbOffenses.getSelectedItem();
		
		tempCH.setCaseID(((CrimeHistory)item).getCaseID());
		tempCH.setOffense(AES_ED.encrypt(txtFOffense.getText()));
		tempCH.setOffenseDesc(AES_ED.encrypt(txtPOffDesc.getText()));
		tempCH.setOffenseLoc(AES_ED.encrypt(txtFOffLoc.getText()));
		tempCH.setOffenseDate(((JTextField)datepicker.getDateEditor().getUiComponent()).getText());
		tempCH.setSentence(AES_ED.encrypt(txtFSentence.getText()));
		
		tempCI.setCaseID(((CrimeHistory)item).getCaseID());
		tempCI.setCourtName(AES_ED.encrypt(txtFCourtName.getText()));
		tempCI.setCourtType(AES_ED.encrypt(cbCourtType.getSelectedItem().toString()));
		tempCI.setCourtDesc(AES_ED.encrypt(txtPCourtDesc.getText()));
		tempCI.setCourtLoc(AES_ED.encrypt(txtFCourtLoc.getText()));
		
		tempCF.setCaseID(((CrimeHistory)item).getCaseID());
		tempCF.setFIR_Desc(AES_ED.encrypt(txtPFIRDesc.getText()));
		tempCF.setFIR_reporter(AES_ED.encrypt(txtFReporter.getText()));
		tempCF.setFIR_type(AES_ED.encrypt(cbFIRType.getSelectedItem().toString()));
		
		sql.updateCrimeHistory(tempCH);
		sql.updateCourtInfo(tempCI);
		sql.updateFIR(tempCF);
		
		JOptionPane.showMessageDialog(null, ((CrimeHistory)item).getCaseID() + " Updated...");
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
	
	/**
	 * Gets the JtextPane Info for placeholding
	 * @param item, the designated textfield
	 * @param content, content of the textfield
	 */
	public void placeHolder2(JTextPane item, String content) {
		item.addFocusListener(new FocusListener() {
		    @Override
		    public void focusGained(FocusEvent e) {
		        if (item.getText().equals(content)) {
		            item.setForeground(Color.GRAY);
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
