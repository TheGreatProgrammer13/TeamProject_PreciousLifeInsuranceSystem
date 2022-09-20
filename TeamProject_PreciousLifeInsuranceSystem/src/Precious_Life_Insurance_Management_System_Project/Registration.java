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
import javax.swing.JSpinner;

public class Registration extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtLastName;
	private JTextField txtEmailAddressReg;
	private JTextField txtMonth;
	private JPasswordField pwdPasswordReg;
	private JTextField txtFirstName;
	private JTextField txtMiddleName;

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
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 1, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, 1, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 615, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, 188, SpringLayout.WEST, contentPane);
		panel.setBackground(new Color(0,45,105));
		contentPane.add(panel);
		
		JLabel labelPreciousLifeInsuranceReg = new JLabel("Precious Life Insurance");
		sl_contentPane.putConstraint(SpringLayout.NORTH, labelPreciousLifeInsuranceReg, 39, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, labelPreciousLifeInsuranceReg, 304, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, labelPreciousLifeInsuranceReg, 69, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, labelPreciousLifeInsuranceReg, 645, SpringLayout.WEST, contentPane);
		labelPreciousLifeInsuranceReg.setFont(new Font("Poppins", Font.BOLD, 28));
		contentPane.add(labelPreciousLifeInsuranceReg);
		
		JLabel labelRegistrationForm = new JLabel("Registration Form");
		sl_contentPane.putConstraint(SpringLayout.NORTH, labelRegistrationForm, 93, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, labelRegistrationForm, 367, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, labelRegistrationForm, 120, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, labelRegistrationForm, 554, SpringLayout.WEST, contentPane);
		labelRegistrationForm.setFont(new Font("Poppins", Font.PLAIN, 22));
		contentPane.add(labelRegistrationForm);
		
		JLabel labelLastName = new JLabel("Last Name:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, labelLastName, 191, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, labelLastName, 237, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, labelLastName, 218, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, labelLastName, 361, SpringLayout.WEST, contentPane);
		labelLastName.setFont(new Font("Poppins", Font.PLAIN, 23));
		contentPane.add(labelLastName);
		
		JLabel labelEmailAddress = new JLabel("Email Address:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, labelEmailAddress, 342, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, labelEmailAddress, 237, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, labelEmailAddress, 369, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, labelEmailAddress, 398, SpringLayout.WEST, contentPane);
		labelEmailAddress.setFont(new Font("Poppins", Font.PLAIN, 23));
		contentPane.add(labelEmailAddress);
		
		JLabel labelPassword = new JLabel("Password:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, labelPassword, 387, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, labelPassword, 237, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, labelPassword, 347, SpringLayout.WEST, contentPane);
		labelPassword.setFont(new Font("Poppins", Font.PLAIN, 23));
		contentPane.add(labelPassword);
		
		JLabel labelBirthday = new JLabel("Birth of Date:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, labelBirthday, 26, SpringLayout.SOUTH, labelPassword);
		sl_contentPane.putConstraint(SpringLayout.WEST, labelBirthday, 239, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, labelBirthday, 470, SpringLayout.NORTH, contentPane);
		labelBirthday.setFont(new Font("Poppins", Font.PLAIN, 23));
		contentPane.add(labelBirthday);
		
		txtLastName = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtLastName, 187, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtLastName, 406, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtLastName, 227, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtLastName, 656, SpringLayout.WEST, contentPane);
		txtLastName.addFocusListener(new FocusAdapter() {
			
		});
		txtLastName.setHorizontalAlignment(SwingConstants.LEFT);
		txtLastName.setForeground(Color.GRAY);
		txtLastName.setFont(new Font("Poppins", Font.PLAIN, 15));
		txtLastName.setColumns(10);
		txtLastName.setBackground(Color.WHITE);
		contentPane.add(txtLastName);
		
		txtEmailAddressReg = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtEmailAddressReg, 338, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtEmailAddressReg, 406, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtEmailAddressReg, 378, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtEmailAddressReg, 656, SpringLayout.WEST, contentPane);
		txtEmailAddressReg.addFocusListener(new FocusAdapter() {
			
		});
		txtEmailAddressReg.setForeground(Color.GRAY);
		txtEmailAddressReg.setFont(new Font("Poppins", Font.PLAIN, 15));
		txtEmailAddressReg.setColumns(10);
		txtEmailAddressReg.setBackground(Color.WHITE);
		contentPane.add(txtEmailAddressReg);
		
		txtMonth = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtMonth, 437, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtMonth, 406, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtMonth, 477, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtMonth, 0, SpringLayout.EAST, txtLastName);
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
		sl_contentPane.putConstraint(SpringLayout.NORTH, Submitbutton, 547, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, Submitbutton, 377, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, Submitbutton, 587, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, Submitbutton, 509, SpringLayout.WEST, contentPane);
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
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_1, 1, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_1, 734, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_1, 615, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_1, 921, SpringLayout.WEST, contentPane);
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
		sl_contentPane.putConstraint(SpringLayout.NORTH, labelRegLogo, 5, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, labelRegLogo, 192, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, labelRegLogo, 88, SpringLayout.NORTH, contentPane);
		labelRegLogo.setIcon(new ImageIcon(Registration.class.getResource("/images/SmallSize.png")));
		contentPane.add(labelRegLogo);
		
		pwdPasswordReg = new JPasswordField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, pwdPasswordReg, 387, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, pwdPasswordReg, 406, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, pwdPasswordReg, 426, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, pwdPasswordReg, 656, SpringLayout.WEST, contentPane);
		pwdPasswordReg.setFont(new Font("Poppins", Font.PLAIN, 11));
		pwdPasswordReg.setForeground(Color.GRAY);
		pwdPasswordReg.setSelectedTextColor(Color.WHITE);
		pwdPasswordReg.addFocusListener(new FocusAdapter() {
			
			
		});
		contentPane.add(pwdPasswordReg);
		
		JLabel FirstNameLabel = new JLabel("First Name:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, FirstNameLabel, 242, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, FirstNameLabel, 237, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, FirstNameLabel, 269, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, FirstNameLabel, 361, SpringLayout.WEST, contentPane);
		FirstNameLabel.setFont(new Font("Dialog", Font.PLAIN, 23));
		contentPane.add(FirstNameLabel);
		
		txtFirstName = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtFirstName, 238, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtFirstName, 406, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtFirstName, 278, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtFirstName, 656, SpringLayout.WEST, contentPane);
		txtFirstName.setHorizontalAlignment(SwingConstants.LEFT);
		txtFirstName.setForeground(Color.GRAY);
		txtFirstName.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtFirstName.setColumns(10);
		txtFirstName.setBackground(Color.WHITE);
		contentPane.add(txtFirstName);
		
		JLabel MiddleNameLabel = new JLabel("Middle Name:");
		sl_contentPane.putConstraint(SpringLayout.EAST, labelBirthday, 0, SpringLayout.EAST, MiddleNameLabel);
		sl_contentPane.putConstraint(SpringLayout.NORTH, MiddleNameLabel, 291, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, MiddleNameLabel, 237, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, MiddleNameLabel, 318, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, MiddleNameLabel, 386, SpringLayout.WEST, contentPane);
		MiddleNameLabel.setFont(new Font("Dialog", Font.PLAIN, 23));
		contentPane.add(MiddleNameLabel);
		
		txtMiddleName = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtMiddleName, 287, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtMiddleName, 406, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtMiddleName, 327, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtMiddleName, 656, SpringLayout.WEST, contentPane);
		txtMiddleName.setHorizontalAlignment(SwingConstants.LEFT);
		txtMiddleName.setForeground(Color.GRAY);
		txtMiddleName.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtMiddleName.setColumns(10);
		txtMiddleName.setBackground(Color.WHITE);
		contentPane.add(txtMiddleName);
	}
}