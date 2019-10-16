package forJavaDocfinal;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import com.toedter.calendar.JDateChooser;
import java.awt.Font;

/**
 * @author Rogelio Jr Ibacarra and Benz Walter Jacques Tan
 * @since Created October 5, 2019
 * @version  1.2
 * @title Police Records Database Management System
 */
/**
 * Represents Panel_AddHistory
 */
public class Panel_AddHistory extends JPanel {
	
	JList<CrimeTypes> list = new JList();
	JList<CrimeTypes> AddedList = new JList();
	DefaultListModel<CrimeTypes> model = new DefaultListModel<>();
	DefaultListModel<CrimeTypes> model2 = new DefaultListModel<>();
	
	ArrayList<CrimeHistory> ch = new ArrayList<CrimeHistory>();
	ArrayList<CrimeTypes> ct = new ArrayList<CrimeTypes>();
	
	private JTextField textFSentence;
	private JTextField textFOffenseLoc;
	
	/**
	 * Creates the Panel for Adding Criminal History Info and its designated textfields and buttons
	 */
	public Panel_AddHistory() {
		setBackground(new Color(57, 62, 70));
		setLayout(null);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(136, 284, 168, 20);
		dateChooser.setDateFormatString("yyyy-MM-dd");
		add(dateChooser);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 64, 116, 281);
		add(scrollPane);
		scrollPane.setViewportView(list);
		
		JTextPane textPOffenseDesc = new JTextPane();
		textPOffenseDesc.setBounds(136, 174, 221, 53);
		add(textPOffenseDesc);
		
		JPanel panel = new JPanel();
		panel.setBounds(136, 64, 221, 92);
		add(panel);
		panel.setLayout(null);
		
		//Labels
		JLabel lblOffenses = new JLabel("Offenses");
		lblOffenses.setForeground(Color.WHITE);
		lblOffenses.setBounds(10, 48, 62, 14);
		add(lblOffenses);
		
		JLabel lblOffenseDescription = new JLabel("Crime Description");
		lblOffenseDescription.setForeground(Color.WHITE);
		lblOffenseDescription.setBounds(136, 48, 116, 14);
		add(lblOffenseDescription);
		
		JLabel lblOffenseLocation = new JLabel("Offense Location");
		lblOffenseLocation.setForeground(Color.WHITE);
		lblOffenseLocation.setBounds(136, 234, 116, 14);
		add(lblOffenseLocation);
		
		JLabel lblAddRecordCrime = new JLabel("Add Record: Crime  History");
		lblAddRecordCrime.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		lblAddRecordCrime.setForeground(Color.WHITE);
		lblAddRecordCrime.setBounds(10, 11, 293, 14);
		add(lblAddRecordCrime);
		
		JLabel lblDateOfOffense = new JLabel("Date of Offense");
		lblDateOfOffense.setForeground(Color.WHITE);
		lblDateOfOffense.setBounds(136, 270, 167, 14);
		add(lblDateOfOffense);
		
		JLabel lblSentence = new JLabel("Sentence");
		lblSentence.setForeground(Color.WHITE);
		lblSentence.setBounds(136, 309, 116, 14);
		add(lblSentence);
		
		JLabel lblOffenseDe = new JLabel("Offense Description");
		lblOffenseDe.setForeground(Color.WHITE);
		lblOffenseDe.setBounds(136, 159, 116, 14);
		add(lblOffenseDe);
		
		JLabel lblAddedList = new JLabel("Added List");
		lblAddedList.setForeground(Color.WHITE);
		lblAddedList.setBounds(451, 48, 116, 14);
		add(lblAddedList);
		
		JLabel lblCrimeTypeDec = new JLabel("");
		lblCrimeTypeDec.setBounds(0, 0, 219, 92);
		panel.add(lblCrimeTypeDec);
		
		//Buttons
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(451, 322, 89, 23);
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setBackground(Color.LIGHT_GRAY);
		add(btnAdd);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(550, 322, 89, 23);
		btnDelete.setForeground(Color.BLACK);
		btnDelete.setBackground(Color.LIGHT_GRAY);
		add(btnDelete);
		
		//TextFields
		textFSentence = new JTextField();
		textFSentence.setBounds(136, 323, 222, 20);
		add(textFSentence);
		textFSentence.setColumns(10);
		
		textFOffenseLoc = new JTextField();
		textFOffenseLoc.setColumns(10);
		textFOffenseLoc.setBounds(136, 248, 221, 20);
		add(textFOffenseLoc);
		
		//List
		AddedList.setBounds(451, 65, 188, 237);
		add(AddedList);
		list.setModel(model);
		AddedList.setModel(model2);
		
		MySQLConnection con = new MySQLConnection();
		ct = con.getCrimeTypes();
		
		for(int x = 0; x < ct.size(); x++) {
			model.addElement(new CrimeTypes(ct.get(x).getCTID(), con.getCrimeTypes().get(x).getCrimeName(), con.getCrimeTypes().get(x).getCrimeDesc()));		
		}
		
		list.getSelectionModel().addListSelectionListener(e -> {
			CrimeTypes roger = list.getSelectedValue();
			
			String nxtLine = "<html>";
			char[] chars = roger.getCrimeDesc().toCharArray();
			
			int counter = 0;
			for(int x = 0; x < chars.length; x++) {
				if(counter == 25) {
					nxtLine += "<br/>";
					counter = 0;
				}else {
					nxtLine += chars[x];
				}
			}
			nxtLine += "</html>";
			
			lblCrimeTypeDec.setText(nxtLine);
		});
		
		AddedList.getSelectionModel().addListSelectionListener(e -> {
			CrimeTypes roger = AddedList.getSelectedValue();
			
		});
		
		//Actions
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CrimeTypes added = list.getSelectedValue();
				
				model2.addElement(added);
				AddedList.setModel(model2);
				
				CrimeHistory tempCH = new CrimeHistory("","");
		
				tempCH.setOffense(AES_ED.encrypt(list.getSelectedValue().getCrimeName()));	
				tempCH.setOffenseDesc(AES_ED.encrypt(textPOffenseDesc.getText()));
				tempCH.setOffenseLoc(AES_ED.encrypt(textFOffenseLoc.getText()));
				tempCH.setOffenseDate(((JTextField)dateChooser.getDateEditor().getUiComponent()).getText());
				tempCH.setSentence(AES_ED.encrypt(textFSentence.getText()));
				
				ch.add(tempCH);
			}
		});
		
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int value = AddedList.getSelectedIndex();
				
				if(model2.getSize() != 0) {
					model2.removeElementAt(value);
					ch.remove(value);
				}
			}
		});
	}
	
	/**Gets the Criminal History data and sends it into the MySQLConnection Class for saving
	 * 
	 */
	public void saveData() {
		MySQLConnection sql = new MySQLConnection();
		GeneratedKeys gk = new GeneratedKeys();
		
		String[] data = new String[6];
		
		for(int x = 0; x < ch.size(); x++) {
				
			ch.get(x).setCrimID(Integer.toString(gk.getCrimID()));
			
			data[0] = ch.get(x).getCrimID();
			data[1] = ch.get(x).getOffense();
			data[2] = ch.get(x).getOffenseDesc();
			data[3] = ch.get(x).getOffenseLoc();
			data[4] = ch.get(x).getOffenseDate();
			data[5] = ch.get(x).getSentence();
			
			sql.add_criminal_history(data);
		}
	}
	
	
	/**
	 * returns the criminalHistory
	 * @return
	 */
	public ArrayList<CrimeHistory> getCrimeHistory() {
		return ch;
	}
}
