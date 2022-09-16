package Precious_Life_Insurance_Management_System_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Button;
import javax.swing.ImageIcon;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.LineBorder;
import javax.swing.JPasswordField;
import java.beans.VetoableChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;

public class Registration extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtLastNameFirst;
	private JTextField txtEmailAddress;
	private JTextField textField;
	private JTextField txtMmddyyyy;
	private JTextField textField_5;
	private JTextField textField_1;
	private JPasswordField pwdPasswordReg;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration() {
		setUndecorated(true);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 614);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(1, 1, 187, 614);
		panel.setBackground(new Color(0,45,105));
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Precious Life Insurance");
		lblNewLabel.setBounds(304, 39, 341, 30);
		lblNewLabel.setFont(new Font("Poppins", Font.BOLD, 28));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Registration Form");
		lblNewLabel_1.setBounds(367, 93, 187, 27);
		lblNewLabel_1.setFont(new Font("Poppins", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name:");
		lblNewLabel_1_1.setBounds(262, 191, 83, 27);
		lblNewLabel_1_1.setFont(new Font("Poppins", Font.PLAIN, 23));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email:");
		lblNewLabel_1_1_1.setBounds(261, 258, 72, 27);
		lblNewLabel_1_1_1.setFont(new Font("Poppins", Font.PLAIN, 23));
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Password:");
		lblNewLabel_1_1_1_1.setBounds(262, 312, 110, 30);
		lblNewLabel_1_1_1_1.setFont(new Font("Poppins", Font.PLAIN, 23));
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Birthday:");
		lblNewLabel_1_1_1_1_1.setBounds(262, 378, 100, 27);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Poppins", Font.PLAIN, 23));
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		txtLastNameFirst = new JTextField();
		txtLastNameFirst.setBounds(394, 197, 221, 22);
		txtLastNameFirst.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtLastNameFirst.getText().equals("Name")) {
					txtLastNameFirst.setText("");
				}
				else {
					txtLastNameFirst.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtLastNameFirst.getText().equals(""))
					txtLastNameFirst.setText("Name");
			}
		});
		txtLastNameFirst.setHorizontalAlignment(SwingConstants.LEFT);
		txtLastNameFirst.setText("Name");
		txtLastNameFirst.setForeground(Color.GRAY);
		txtLastNameFirst.setFont(new Font("Poppins", Font.PLAIN, 15));
		txtLastNameFirst.setColumns(10);
		txtLastNameFirst.setBorder(null);
		txtLastNameFirst.setBackground(Color.WHITE);
		contentPane.add(txtLastNameFirst);
		
		txtEmailAddress = new JTextField();
		txtEmailAddress.setBounds(394, 263, 221, 22);
		txtEmailAddress.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEmailAddress.getText().equals("Email Address")) {
					txtEmailAddress.setText("");
				}
				else {
					txtEmailAddress.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEmailAddress.getText().equals(""))
					txtEmailAddress.setText("Email Address");
			}
		});
		txtEmailAddress.setText("Email Address");
		txtEmailAddress.setForeground(Color.GRAY);
		txtEmailAddress.setFont(new Font("Poppins", Font.PLAIN, 15));
		txtEmailAddress.setColumns(10);
		txtEmailAddress.setBorder(null);
		txtEmailAddress.setBackground(Color.WHITE);
		contentPane.add(txtEmailAddress);
		
		textField = new JTextField();
		textField.setBounds(382, 251, 250, 40);
		textField.setText("   ");
		textField.setColumns(10);
		contentPane.add(textField);
		
		txtMmddyyyy = new JTextField();
		txtMmddyyyy.setBounds(394, 384, 221, 22);
		txtMmddyyyy.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtMmddyyyy.getText().equals("MM/DD/YYYY")) {
					txtMmddyyyy.setText("");
				}
				else {
					txtMmddyyyy.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtMmddyyyy.getText().equals(""))
					txtMmddyyyy.setText("MM/DD/YYYY");
			}
		});
		txtMmddyyyy.setText("MM/DD/YYYY");
		txtMmddyyyy.setForeground(Color.GRAY);
		txtMmddyyyy.setFont(new Font("Poppins", Font.PLAIN, 15));
		txtMmddyyyy.setColumns(10);
		txtMmddyyyy.setBorder(null);
		txtMmddyyyy.setBackground(Color.WHITE);
		contentPane.add(txtMmddyyyy);
		
		textField_5 = new JTextField();
		textField_5.setBounds(382, 373, 250, 40);
		textField_5.setText("   ");
		textField_5.setColumns(10);
		contentPane.add(textField_5);
		
		Button button = new Button("Submit");
		button.setBounds(382, 484, 132, 40);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setForeground(new Color(234, 218, 128));
		button.setFont(new Font("Dialog", Font.BOLD, 20));
		button.setBackground(new Color(0, 45, 105));
		contentPane.add(button);
		
		textField_1 = new JTextField();
		textField_1.setBounds(384, 187, 248, 40);
		textField_1.setText("   ");
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(734, 1, 187, 614);
		panel_1.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?","Confirmation", JOptionPane.YES_NO_OPTION) == 0 ) {
					Registration.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.red);
			}
			
			public void mouseExited(MouseEvent e) {
				lblX.setForeground(Color.white);
			}
		});
		lblX.addMouseMotionListener(new MouseMotionAdapter() {

		});
		lblX.addVetoableChangeListener(new VetoableChangeListener() {
			public void vetoableChange(PropertyChangeEvent evt) {
			}
		});
		lblX.setForeground(Color.WHITE);
		lblX.setBounds(155, 11, 10, 17);
		panel_1.add(lblX);
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Poppins", Font.BOLD, 14));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(192, 5, 72, 83);
		lblNewLabel_2.setIcon(new ImageIcon(Registration.class.getResource("/images/SmallSize.png")));
		contentPane.add(lblNewLabel_2);
		
		pwdPasswordReg = new JPasswordField();
		pwdPasswordReg.setFont(new Font("Poppins", Font.PLAIN, 11));
		pwdPasswordReg.setBounds(394, 321, 221, 22);
		pwdPasswordReg.setForeground(Color.GRAY);
		pwdPasswordReg.setSelectedTextColor(Color.WHITE);
		pwdPasswordReg.addFocusListener(new FocusAdapter() {
			
			@Override
			public void focusGained(FocusEvent e) {
				if(pwdPasswordReg.getText().equals("Password")) {
					pwdPasswordReg.setEchoChar('●');
					pwdPasswordReg.setText("");
					
				}
				else {
					pwdPasswordReg.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(pwdPasswordReg.getText().equals("")) {
					pwdPasswordReg.setText("Password");
					pwdPasswordReg.setEchoChar((char)0);
					
				}
			}
		});
		pwdPasswordReg.setBorder(null);
		pwdPasswordReg.setText("  Password");
		contentPane.add(pwdPasswordReg);
		
		textField_2 = new JTextField();
		textField_2.setBounds(381, 312, 251, 40);
		textField_2.setText("   ");
		textField_2.setColumns(10);
		contentPane.add(textField_2);
	}
}