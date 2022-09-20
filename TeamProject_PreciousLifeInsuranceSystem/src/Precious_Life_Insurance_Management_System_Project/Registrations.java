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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.beans.PropertyChangeEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JSpinner;
import java.awt.Choice;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Registrations extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtLastName;
	private JTextField txtEmailAddressReg;
	private JPasswordField pwdPasswordReg;
	private JTextField txtFirstName;
	private JTextField txtMiddleName;
	
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrations frame = new Registrations();
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
	public Registrations() {
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
		sl_contentPane.putConstraint(SpringLayout.NORTH, labelLastName, 38, SpringLayout.SOUTH, labelRegistrationForm);
		labelLastName.setFont(new Font("Poppins", Font.PLAIN, 23));
		contentPane.add(labelLastName);
		
		JLabel labelEmailAddress = new JLabel("Email Address:");
		sl_contentPane.putConstraint(SpringLayout.WEST, labelLastName, 0, SpringLayout.WEST, labelEmailAddress);
		sl_contentPane.putConstraint(SpringLayout.NORTH, labelEmailAddress, 188, SpringLayout.SOUTH, labelRegistrationForm);
		labelEmailAddress.setFont(new Font("Poppins", Font.PLAIN, 23));
		contentPane.add(labelEmailAddress);
		
		JLabel labelPassword = new JLabel("Password:");
		sl_contentPane.putConstraint(SpringLayout.WEST, labelPassword, 0, SpringLayout.WEST, labelEmailAddress);
		labelPassword.setFont(new Font("Poppins", Font.PLAIN, 23));
		contentPane.add(labelPassword);
		
		txtLastName = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.EAST, labelLastName, -45, SpringLayout.WEST, txtLastName);
		sl_contentPane.putConstraint(SpringLayout.EAST, labelPassword, -13, SpringLayout.WEST, txtLastName);
		sl_contentPane.putConstraint(SpringLayout.EAST, labelEmailAddress, -1, SpringLayout.WEST, txtLastName);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtLastName, 24, SpringLayout.SOUTH, labelRegistrationForm);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtLastName, 218, SpringLayout.EAST, panel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtLastName, 184, SpringLayout.NORTH, contentPane);
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
		sl_contentPane.putConstraint(SpringLayout.SOUTH, labelEmailAddress, 0, SpringLayout.SOUTH, txtEmailAddressReg);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtEmailAddressReg, 175, SpringLayout.SOUTH, labelRegistrationForm);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtEmailAddressReg, 218, SpringLayout.EAST, panel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtEmailAddressReg, 335, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtEmailAddressReg, 656, SpringLayout.WEST, contentPane);
		txtEmailAddressReg.addFocusListener(new FocusAdapter() {
			
		});
		txtEmailAddressReg.setForeground(Color.GRAY);
		txtEmailAddressReg.setFont(new Font("Poppins", Font.PLAIN, 15));
		txtEmailAddressReg.setColumns(10);
		txtEmailAddressReg.setBackground(Color.WHITE);
		contentPane.add(txtEmailAddressReg);
		
		Button Submitbutton = new Button("Submit");
		sl_contentPane.putConstraint(SpringLayout.WEST, Submitbutton, 0, SpringLayout.WEST, txtLastName);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, Submitbutton, 451, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, Submitbutton, -16, SpringLayout.EAST, labelRegistrationForm);
		Submitbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtLastName.getText().isEmpty() || txtFirstName.getText().isEmpty() || txtMiddleName.getText().isEmpty() || txtEmailAddressReg.getText().isEmpty() || pwdPasswordReg.getText().isEmpty())   {
						
						JOptionPane.showMessageDialog(null,"Please complete the details.");
				}
				
					else {
						
				try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginaccount", "root", "");
							String query = "INSERT INTO `registrations`(`LastName`, `FirstName`, `MiddleName`, `EmailAddress`, `Password`) VALUES (?,?,?,?,?)";	
							pst=con.prepareStatement(query);
							pst.setString(1, txtLastName.getText());
							pst.setString(2, txtFirstName.getText());
							pst.setString(3, txtMiddleName.getText());
							pst.setString(4, txtEmailAddressReg.getText());
							pst.setString(5, pwdPasswordReg.getText());
							pst.executeUpdate();
							
							JOptionPane.showMessageDialog(null,"Successfully Registered!");
							LoginFrame t = new LoginFrame();
							t.show();
							dispose();
							
							
						

								
							
						
							
								} catch (SQLException e1) {
									Logger.getLogger(Registrations.class.getName()).log(Level.SEVERE, null, e1);
								} catch (ClassNotFoundException e1) {
									Logger.getLogger(Registrations.class.getName()).log(Level.SEVERE, null, e1);
								}
						}
					}
			});
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
					Registrations.this.dispose();
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
		labelRegLogo.setIcon(new ImageIcon(Registrations.class.getResource("/images/SmallSize.png")));
		contentPane.add(labelRegLogo);
		
		pwdPasswordReg = new JPasswordField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, Submitbutton, 28, SpringLayout.SOUTH, pwdPasswordReg);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, labelPassword, 0, SpringLayout.SOUTH, pwdPasswordReg);
		sl_contentPane.putConstraint(SpringLayout.NORTH, pwdPasswordReg, 224, SpringLayout.SOUTH, labelRegistrationForm);
		sl_contentPane.putConstraint(SpringLayout.WEST, pwdPasswordReg, 218, SpringLayout.EAST, panel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, pwdPasswordReg, 383, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, pwdPasswordReg, 656, SpringLayout.WEST, contentPane);
		pwdPasswordReg.setFont(new Font("Poppins", Font.PLAIN, 11));
		pwdPasswordReg.setForeground(Color.GRAY);
		pwdPasswordReg.setSelectedTextColor(Color.WHITE);
		pwdPasswordReg.addFocusListener(new FocusAdapter() {
			
			
		});
		contentPane.add(pwdPasswordReg);
		
		JLabel FirstNameLabel = new JLabel("First Name:");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, labelLastName, -23, SpringLayout.NORTH, FirstNameLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, labelEmailAddress, 0, SpringLayout.WEST, FirstNameLabel);
		sl_contentPane.putConstraint(SpringLayout.NORTH, FirstNameLabel, 88, SpringLayout.SOUTH, labelRegistrationForm);
		sl_contentPane.putConstraint(SpringLayout.WEST, FirstNameLabel, 56, SpringLayout.EAST, panel);
		sl_contentPane.putConstraint(SpringLayout.EAST, FirstNameLabel, -38, SpringLayout.WEST, txtLastName);
		FirstNameLabel.setFont(new Font("Dialog", Font.PLAIN, 23));
		contentPane.add(FirstNameLabel);
		
		txtFirstName = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, FirstNameLabel, 0, SpringLayout.SOUTH, txtFirstName);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtFirstName, 75, SpringLayout.SOUTH, labelRegistrationForm);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtFirstName, 218, SpringLayout.EAST, panel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtFirstName, 235, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtFirstName, 656, SpringLayout.WEST, contentPane);
		txtFirstName.setHorizontalAlignment(SwingConstants.LEFT);
		txtFirstName.setForeground(Color.GRAY);
		txtFirstName.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtFirstName.setColumns(10);
		txtFirstName.setBackground(Color.WHITE);
		contentPane.add(txtFirstName);
		
		JLabel MiddleNameLabel = new JLabel("Middle Name:");
		sl_contentPane.putConstraint(SpringLayout.NORTH, MiddleNameLabel, 137, SpringLayout.SOUTH, labelRegistrationForm);
		sl_contentPane.putConstraint(SpringLayout.WEST, MiddleNameLabel, 56, SpringLayout.EAST, panel);
		sl_contentPane.putConstraint(SpringLayout.EAST, MiddleNameLabel, -13, SpringLayout.WEST, txtLastName);
		MiddleNameLabel.setFont(new Font("Dialog", Font.PLAIN, 23));
		contentPane.add(MiddleNameLabel);
		
		txtMiddleName = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, MiddleNameLabel, 0, SpringLayout.SOUTH, txtMiddleName);
		sl_contentPane.putConstraint(SpringLayout.NORTH, txtMiddleName, 124, SpringLayout.SOUTH, labelRegistrationForm);
		sl_contentPane.putConstraint(SpringLayout.WEST, txtMiddleName, 218, SpringLayout.EAST, panel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, txtMiddleName, 284, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, txtMiddleName, 656, SpringLayout.WEST, contentPane);
		txtMiddleName.setHorizontalAlignment(SwingConstants.LEFT);
		txtMiddleName.setForeground(Color.GRAY);
		txtMiddleName.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtMiddleName.setColumns(10);
		txtMiddleName.setBackground(Color.WHITE);
		contentPane.add(txtMiddleName);
	}
}