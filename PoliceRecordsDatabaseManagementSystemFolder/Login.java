package forJavaDocfinal;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * @author Rogelio Jr Ibacarra and Benz Walter Jacques Tan
 * @since Created October 5, 2019
 * @version  1.2
 * @title Police Records Database Management System
 */
/**
 * Represents Login that Extends built in Jframe
 */
public class Login extends JFrame {

	Menu mu = new Menu();
	
	private JPanel contentPane;
	private JTextField User;
	private JPasswordField passwordField;

	
	/**
	 * to run login
	 */
	public void runLogin() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creating GUI of Login
	 */
	public Login() {
		setType(Type.UTILITY);
		setTitle("Police Records Database System Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/Webp.net-resizeimage (1).png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(image));
		lblNewLabel.setBounds(27, 27, 138, 133);
		contentPane.add(lblNewLabel);
		
		JLabel lblUserId = new JLabel("User ID");
		lblUserId.setBackground(new Color(240, 240, 240));
		lblUserId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUserId.setBounds(324, 22, 59, 20);
		contentPane.add(lblUserId);
		
		User = new JTextField();
		User.setBounds(169, 52, 213, 34);
		contentPane.add(User);
		User.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(324, 96, 97, 20);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(245, 126, 138, 34);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("");
		//Image image2 = new ImageIcon(this.getClass().getResource("/Security-Password-2-icon.png")).getImage();
		//lblNewLabel_1.setIcon(new ImageIcon(image2));
		lblNewLabel_1.setBounds(211, 126, 24, 24);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MySQLConnection sql = new MySQLConnection();
				
				if(sql.getAccess(User.getText(), passwordField.getText())==true) {
					mu.runGUI();
				}else {
					JOptionPane.showMessageDialog(null, "Incorrect username or password");
				}
			}
		});
		btnNewButton.setBackground(new Color(176, 224, 230));
		btnNewButton.setBounds(268, 190, 115, 50);
		contentPane.add(btnNewButton);
		
//		JCheckBox chckbxRegularPolice = new JCheckBox("Regular Police");
//		chckbxRegularPolice.setBackground(new Color(248, 248, 255));
//		chckbxRegularPolice.setBounds(27, 194, 115, 21);
//		contentPane.add(chckbxRegularPolice);
//		
//		JCheckBox chckbxAdminPolice = new JCheckBox("Admin Police");
//		chckbxAdminPolice.setBackground(new Color(248, 248, 255));
//		chckbxAdminPolice.setBounds(27, 219, 115, 21);
//		contentPane.add(chckbxAdminPolice);

	}
}
