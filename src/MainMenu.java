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
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_1;
	private JTextField textField_2;

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
		lblWelcomeToThe.setBounds(89, 11, 208, 14);
		frame.getContentPane().add(lblWelcomeToThe);
		
		JButton btnImportClientDatabase = new JButton("Import Client Database");
		btnImportClientDatabase.setBounds(10, 115, 156, 23);
		frame.getContentPane().add(btnImportClientDatabase);
		
		JButton button = new JButton("Add a new client");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(10, 65, 156, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("Seach Directory");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(10, 92, 156, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Export Client Database");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(10, 139, 156, 23);
		frame.getContentPane().add(button_2);
		
		JLabel lblFirst = new JLabel("First Name:");
		lblFirst.setBounds(200, 69, 57, 14);
		frame.getContentPane().add(lblFirst);
		
		JLabel lblLast = new JLabel("Last Name:");
		lblLast.setBounds(200, 96, 57, 14);
		frame.getContentPane().add(lblLast);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(200, 119, 46, 14);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(186, 143, 46, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblPostalCode = new JLabel("Postal Code:");
		lblPostalCode.setBounds(186, 168, 71, 14);
		frame.getContentPane().add(lblPostalCode);
		
		JLabel lblOhip = new JLabel("OHIP #:");
		lblOhip.setBounds(186, 192, 46, 14);
		frame.getContentPane().add(lblOhip);
		
		JLabel lblCid = new JLabel("CID:");
		lblCid.setBounds(286, 32, 46, 14);
		frame.getContentPane().add(lblCid);
		
		textField = new JTextField();
		textField.setBounds(338, 29, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(277, 116, 86, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(277, 140, 86, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(277, 165, 86, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(242, 193, 46, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(298, 193, 46, 20);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(353, 193, 46, 20);
		frame.getContentPane().add(textField_8);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(277, 66, 122, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(277, 93, 122, 20);
		frame.getContentPane().add(textField_2);
	}
}
