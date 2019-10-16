package forJavaDocfinal;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Paths;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.Window.Type;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;

/**
 * @author Rogelio Jr Ibacarra and Benz Walter Jacques Tan
 * @since Created October 5, 2019
 * @version  1.2
 * @title Police Records Database Management System
 */
/**
 * Represents the Menu of the Program
 */
/**
 * @author admiral
 *
 */
public class Menu extends JFrame {

	private JPanel contentPane;
	private int nextbuttons = 0;

	
	public static void runGUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creates the GUI of the Menu
	 */
	public Menu() {
		setForeground(Color.LIGHT_GRAY);
		setTitle("Police Records Database System Management");
		setType(Type.UTILITY);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 461);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.desktop);
		contentPane.setBackground(new Color(34, 40, 49));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//Panels
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(171, 11, 687, 355);
		contentPane.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		Panel_AddCriminal padd = new Panel_AddCriminal();
		layeredPane.add(padd, "Add Criminal Info");
		padd.setLayout(null);
		
		Panel_AddHistory paddH = new Panel_AddHistory();
		layeredPane.add(paddH, "Add Criminal History");
		paddH.setLayout(null);
		
		Panel_AddFIR paddF = new Panel_AddFIR();
		layeredPane.add(paddF, "Add Crime FIR");
		paddF.setLayout(null);
		
		Panel_AddCourt paddC = new Panel_AddCourt();
		layeredPane.add(paddC, " Add Criminal Court B");
		paddC.setLayout(null);
		Image gg = new ImageIcon(this.getClass().getResource("/Webp.net-resizeimage (1).png")).getImage();
		
		Panel_EditCriminal pedit = new Panel_EditCriminal();
		layeredPane.add(pedit, "Edit Criminal Information");
		pedit.setLayout(null);
		
		Panel_EditOthers peditO = new Panel_EditOthers();
		layeredPane.add(peditO, "Edit Other Information");
		peditO.setLayout(null);
		
		//Labels
		JLabel lblCriminalRecords = new JLabel("Criminal Records");
		lblCriminalRecords.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 15));
		lblCriminalRecords.setForeground(Color.WHITE);
		lblCriminalRecords.setHorizontalAlignment(SwingConstants.CENTER);
		lblCriminalRecords.setBounds(0, 154, 170, 14);
		contentPane.add(lblCriminalRecords);
	
		//BUTTONS
		//Menu Buttons
		JButton btnAddRecord = new JButton("Add Record");
		btnAddRecord.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		btnAddRecord.setForeground(Color.BLACK);
		btnAddRecord.setBackground(new Color(0,173,181));
		btnAddRecord.setBounds(17, 179, 137, 23);
		contentPane.add(btnAddRecord);
		
		JButton btnEditRecord = new JButton("View or Edit");
		btnEditRecord.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		btnEditRecord.setForeground(Color.BLACK);
		btnEditRecord.setBackground(new Color(0,173,181));
		btnEditRecord.setBounds(17, 209, 137, 23);
		contentPane.add(btnEditRecord);
		
		JButton btnNext = new JButton("Next");
		btnNext.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		btnNext.setForeground(Color.BLACK);
		btnNext.setBackground(new Color(0,173,181));
		btnNext.setBounds(723, 377, 102, 34);
		contentPane.add(btnNext);
		
		JButton btnBack = new JButton("Cancel");
		btnBack.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		btnBack.setForeground(Color.BLACK);
		btnBack.setBackground(new Color(0,173,181));
		btnBack.setBounds(611, 377, 102, 34);
		contentPane.add(btnBack);
		
	
		
		//Labels
		JLabel policeLogo = new JLabel("");
		policeLogo.setBounds(38, 22, 84, 121);
		contentPane.add(policeLogo);
		policeLogo.setIcon(new ImageIcon(gg));
		
		
	
		//BUTTON ACTION LISTENERS
		//Menu Buttons
		btnAddRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				layeredPane.removeAll();
				layeredPane.add(padd);
				layeredPane.repaint();
				layeredPane.revalidate();
				btnNext.setText("Next");;
				btnNext.setVisible(true);
				btnBack.setVisible(true);
				nextbuttons = 0;
			}
		});
		
		btnEditRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(pedit);
				layeredPane.repaint();
				layeredPane.revalidate();
				btnNext.setText("Others");;
				btnBack.setVisible(false);
				nextbuttons = 10;
			}
		});
			
		//Next Buttons
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				
				//ADD BUTTON COMMANDS
				if(nextbuttons==0) {
					btnBack.setText("Back");
					layeredPane.add(paddH);
					nextbuttons += 1;
					
				}else if(nextbuttons==1) {
					padd.saveData();
					paddH.saveData();	
					paddF.setJBItems();
					layeredPane.add(paddF);
					nextbuttons += 1;
				}
				
				else if(nextbuttons==2) {
					layeredPane.add(paddC);				
					paddC.setJBItems();	
					btnNext.setText("Save");
					nextbuttons += 1;
				}
				
				else if(nextbuttons==3) {
					paddF.saveData();
					paddC.saveData();
				}
				
				//EDIT BUTTON COMMANDS			
				else if(nextbuttons==10) {
					peditO.getDatas();
					layeredPane.add(peditO);
				}
				
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		
		//Back Buttons
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				
				if(nextbuttons==0) {
					layeredPane.removeAll();
				}
				
				else if(nextbuttons==1) {
					btnBack.setText("Cancel");
					layeredPane.add(padd);
					nextbuttons -= 1;
				
				}else if(nextbuttons==2) {
					layeredPane.add(paddH);
					nextbuttons -= 1;
				
				}else if(nextbuttons==3) {
					layeredPane.add(paddF);
					nextbuttons -= 1;
				}
				
				layeredPane.repaint();
				layeredPane.revalidate();	
			}
		});
	}
}
