import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class MainMenu {
	
	

	private JFrame frame;
	private JTextField cidField;
	private JTextField phoneField;
	private JTextField addressField;
	private JTextField postalField;
	private JTextField ohipField1;
	private JTextField ohipField2;
	private JTextField ohipField3;
	private JTextField firstNameField;
	private JTextField lastNameField;
	
	String cid, firstName, lastName, address, postalCode, ohipNum, phone, email;
	private JTextField emailField;
	
	PatientFile[] patDB = new PatientFile[100];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("M.R.M.");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToThe = new JLabel("Welcome to the Medical Records Manager");
		lblWelcomeToThe.setBounds(124, 7, 208, 14);
		frame.getContentPane().add(lblWelcomeToThe);
		
		JButton importButton = new JButton("Import Client Database");
		importButton.setBounds(10, 115, 156, 23);
		frame.getContentPane().add(importButton);
		
		JButton clientAddButton = new JButton("Add a new client");
		clientAddButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				cid = cidField.getText();
				firstName = firstNameField.getText();
				lastName = lastNameField.getText();
				address = addressField.getText();
				postalCode = postalField.getText();
				ohipNum =  ohipField1.getText() + ohipField2.getText() + ohipField3.getText();
				phone = phoneField.getText();
				email = emailField.getText();
				
				System.out.println(cid);
				
				PatientFile newPatient = new PatientFile(cid, firstName, lastName, address, postalCode, ohipNum, phone, email);
				
				System.out.println(newPatient);
				
			
				
				
				
			}
		});
		clientAddButton.setBounds(10, 65, 156, 23);
		frame.getContentPane().add(clientAddButton);
		
		JButton searchDirButton = new JButton("Seach Directory");
		searchDirButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		searchDirButton.setBounds(10, 92, 156, 23);
		frame.getContentPane().add(searchDirButton);
		
		JButton exportButton = new JButton("Export Client Database");
		exportButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		exportButton.setBounds(10, 139, 156, 23);
		frame.getContentPane().add(exportButton);
		
		JLabel lblFirst = new JLabel("First Name:");
		lblFirst.setBounds(200, 69, 77, 14);
		frame.getContentPane().add(lblFirst);
		
		JLabel lblLast = new JLabel("Last Name:");
		lblLast.setBounds(200, 96, 77, 14);
		frame.getContentPane().add(lblLast);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(200, 119, 57, 14);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(186, 143, 71, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblPostalCode = new JLabel("Postal Code:");
		lblPostalCode.setBounds(186, 168, 91, 14);
		frame.getContentPane().add(lblPostalCode);
		
		JLabel lblOhip = new JLabel("OHIP #:");
		lblOhip.setBounds(186, 192, 71, 14);
		frame.getContentPane().add(lblOhip);
		
		JLabel lblCid = new JLabel("CID:");
		lblCid.setBounds(286, 32, 46, 14);
		frame.getContentPane().add(lblCid);
		
		cidField = new JTextField();
		cidField.setBounds(338, 29, 86, 20);
		frame.getContentPane().add(cidField);
		cidField.setColumns(10);
		
		phoneField = new JTextField();
		phoneField.setColumns(10);
		phoneField.setBounds(277, 116, 86, 20);
		frame.getContentPane().add(phoneField);
		
		addressField = new JTextField();
		addressField.setColumns(10);
		addressField.setBounds(277, 140, 86, 20);
		frame.getContentPane().add(addressField);
		
		postalField = new JTextField();
		postalField.setColumns(10);
		postalField.setBounds(277, 165, 86, 20);
		frame.getContentPane().add(postalField);
		
		ohipField1 = new JTextField();
		ohipField1.setColumns(10);
		ohipField1.setBounds(242, 193, 46, 20);
		frame.getContentPane().add(ohipField1);
		
		ohipField2 = new JTextField();
		ohipField2.setColumns(10);
		ohipField2.setBounds(298, 193, 46, 20);
		frame.getContentPane().add(ohipField2);
		
		ohipField3 = new JTextField();
		ohipField3.setColumns(10);
		ohipField3.setBounds(353, 193, 46, 20);
		frame.getContentPane().add(ohipField3);
		
		firstNameField = new JTextField();   
		firstNameField.setColumns(10);
		firstNameField.setBounds(277, 66, 122, 20);
		frame.getContentPane().add(firstNameField);
		
		lastNameField = new JTextField();
		lastNameField.setColumns(10);
		lastNameField.setBounds(277, 93, 122, 20);
		frame.getContentPane().add(lastNameField);
		
		emailField = new JTextField();
		emailField.setColumns(10);
		emailField.setBounds(277, 224, 86, 20);
		frame.getContentPane().add(emailField);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(186, 227, 71, 14);
		frame.getContentPane().add(lblEmail);
	}
}
