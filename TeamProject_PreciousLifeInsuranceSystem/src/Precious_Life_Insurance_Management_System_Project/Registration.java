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
	private JTextField txtLastName;
	private JTextField txtEmailAddressReg;
	private JTextField txtMonth;
	private JPasswordField pwdPasswordReg;
	private JTextField txtFirstName;
	private JTextField txtMiddleName;
	private JTextField txtYear;
	private JTextField txtDay;

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
		
		JLabel labelPreciousLifeInsuranceReg = new JLabel("Precious Life Insurance");
		labelPreciousLifeInsuranceReg.setBounds(304, 39, 341, 30);
		labelPreciousLifeInsuranceReg.setFont(new Font("Poppins", Font.BOLD, 28));
		contentPane.add(labelPreciousLifeInsuranceReg);
		
		JLabel labelRegistrationForm = new JLabel("Registration Form");
		labelRegistrationForm.setBounds(367, 93, 187, 27);
		labelRegistrationForm.setFont(new Font("Poppins", Font.PLAIN, 22));
		contentPane.add(labelRegistrationForm);
		
		JLabel labelLastName = new JLabel("Last Name:");
		labelLastName.setBounds(237, 191, 124, 27);
		labelLastName.setFont(new Font("Poppins", Font.PLAIN, 23));
		contentPane.add(labelLastName);
		
		JLabel labelEmailAddress = new JLabel("Email Address:");
		labelEmailAddress.setBounds(237, 342, 161, 27);
		labelEmailAddress.setFont(new Font("Poppins", Font.PLAIN, 23));
		contentPane.add(labelEmailAddress);
		
		JLabel labelPassword = new JLabel("Password:");
		labelPassword.setBounds(237, 387, 110, 30);
		labelPassword.setFont(new Font("Poppins", Font.PLAIN, 23));
		contentPane.add(labelPassword);
		
		JLabel labelBirthday = new JLabel("Birthday:");
		labelBirthday.setBounds(237, 441, 100, 27);
		labelBirthday.setFont(new Font("Poppins", Font.PLAIN, 23));
		contentPane.add(labelBirthday);
		
		txtLastName = new JTextField();
		txtLastName.setBounds(406, 187, 250, 40);
		txtLastName.addFocusListener(new FocusAdapter() {
			
		});
		txtLastName.setHorizontalAlignment(SwingConstants.LEFT);
		txtLastName.setForeground(Color.GRAY);
		txtLastName.setFont(new Font("Poppins", Font.PLAIN, 15));
		txtLastName.setColumns(10);
		txtLastName.setBackground(Color.WHITE);
		contentPane.add(txtLastName);
		
		txtEmailAddressReg = new JTextField();
		txtEmailAddressReg.setBounds(406, 338, 250, 40);
		txtEmailAddressReg.addFocusListener(new FocusAdapter() {
			
		});
		txtEmailAddressReg.setForeground(Color.GRAY);
		txtEmailAddressReg.setFont(new Font("Poppins", Font.PLAIN, 15));
		txtEmailAddressReg.setColumns(10);
		txtEmailAddressReg.setBackground(Color.WHITE);
		contentPane.add(txtEmailAddressReg);
		
		txtMonth = new JTextField();
		txtMonth.setBounds(406, 437, 72, 40);
		txtMonth.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtMonth.getText().equals("Month")) {
					txtMonth.setText("");
				}
				else {
					txtMonth.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtMonth.getText().equals(""))
					txtMonth.setText("Month");
			}
		});
		txtMonth.setText("Month");
		txtMonth.setForeground(Color.GRAY);
		txtMonth.setFont(new Font("Poppins", Font.PLAIN, 15));
		txtMonth.setColumns(10);
		txtMonth.setBackground(Color.WHITE);
		contentPane.add(txtMonth);
		
		Button Submitbutton = new Button("Submit");
		Submitbutton.setBounds(377, 547, 132, 40);
		Submitbutton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Submitbutton.setForeground(new Color(189,151,87));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				Submitbutton.setForeground(new Color(205,196,125));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				Submitbutton.setForeground(new Color(146,102,44));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				Submitbutton.setForeground(new Color(205,196,125));
			}
		});
		Submitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Submitbutton.setForeground(new Color(234, 218, 128));
		Submitbutton.setFont(new Font("Dialog", Font.BOLD, 20));
		Submitbutton.setBackground(new Color(0, 45, 105));
		contentPane.add(Submitbutton);
		
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
		
		JLabel labelRegLogo = new JLabel("");
		labelRegLogo.setBounds(192, 5, 72, 83);
		labelRegLogo.setIcon(new ImageIcon(Registration.class.getResource("/images/SmallSize.png")));
		contentPane.add(labelRegLogo);
		
		pwdPasswordReg = new JPasswordField();
		pwdPasswordReg.setBounds(406, 387, 250, 39);
		pwdPasswordReg.setFont(new Font("Poppins", Font.PLAIN, 11));
		pwdPasswordReg.setForeground(Color.GRAY);
		pwdPasswordReg.setSelectedTextColor(Color.WHITE);
		pwdPasswordReg.addFocusListener(new FocusAdapter() {
			
			
		});
		contentPane.add(pwdPasswordReg);
		
		JLabel FirstNameLabel = new JLabel("First Name:");
		FirstNameLabel.setBounds(237, 242, 124, 27);
		FirstNameLabel.setFont(new Font("Dialog", Font.PLAIN, 23));
		contentPane.add(FirstNameLabel);
		
		txtFirstName = new JTextField();
		txtFirstName.setBounds(406, 238, 250, 40);
		txtFirstName.setHorizontalAlignment(SwingConstants.LEFT);
		txtFirstName.setForeground(Color.GRAY);
		txtFirstName.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtFirstName.setColumns(10);
		txtFirstName.setBackground(Color.WHITE);
		contentPane.add(txtFirstName);
		
		JLabel MiddleNameLabel = new JLabel("Middle Name:");
		MiddleNameLabel.setBounds(237, 291, 149, 27);
		MiddleNameLabel.setFont(new Font("Dialog", Font.PLAIN, 23));
		contentPane.add(MiddleNameLabel);
		
		txtMiddleName = new JTextField();
		txtMiddleName.setBounds(406, 287, 250, 40);
		txtMiddleName.setHorizontalAlignment(SwingConstants.LEFT);
		txtMiddleName.setForeground(Color.GRAY);
		txtMiddleName.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtMiddleName.setColumns(10);
		txtMiddleName.setBackground(Color.WHITE);
		contentPane.add(txtMiddleName);
		
		txtYear = new JTextField();
		txtYear.setBounds(570, 437, 86, 40);
		txtYear.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtYear.getText().equals("Year")) {
					txtYear.setText("");
				}
				else {
					txtYear.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtYear.getText().equals(""))
					txtYear.setText("Year");
			}
		});
		txtYear.setText("Year");
		txtYear.setForeground(Color.GRAY);
		txtYear.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtYear.setColumns(10);
		txtYear.setBackground(Color.WHITE);
		contentPane.add(txtYear);
		
		txtDay = new JTextField();
		txtDay.setBounds(488, 437, 72, 40);
		txtDay.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtDay.getText().equals("Day")) {
					txtDay.setText("");
				}
				else {
					txtDay.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtDay.getText().equals(""))
					txtDay.setText("Day");
			}
		});
		txtDay.addMouseListener(new MouseAdapter() {
		});
		txtDay.setText("Day");
		txtDay.setForeground(Color.GRAY);
		txtDay.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtDay.setColumns(10);
		txtDay.setBackground(Color.WHITE);
		contentPane.add(txtDay);
	}
}