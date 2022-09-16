package Precious_Life_Insurance_Management_System_Project;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Rectangle;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.beans.VetoableChangeListener;
import java.beans.PropertyChangeEvent;

public class LoginFrame extends JFrame {
	

	private void sysout() {
		// TODO Auto-generated method stub

	}
	
	private JPanel contentPane;
	private JTextField txtEmailAddressLogin;
	private JPasswordField pwdPasswordLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 580);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		contentPane.setBounds(new Rectangle(0, 0, 20, 20));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(-14, 1, 514, 576);
		panel.setBackground(new Color(0, 45, 105));
		contentPane.add(panel);

		Button button = new Button("Sign In");
		button.setBounds(627, 400, 203, 40);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button.setForeground(new Color(189,151,87));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				button.setForeground(new Color(205,196,125));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				button.setForeground(new Color(146,102,44));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button.setForeground(new Color(205,196,125));
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setForeground(new Color(234, 218, 128));

		button.setFont(new Font("Poppins", Font.BOLD, 20));
		button.setBackground(new Color(0, 45, 105));
		contentPane.add(button);

		Button button_1 = new Button("Create an account");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Registration t = new Registration();
				t.show();
				dispose();

			}
		});
		button_1.setBounds(627, 500, 203, 38);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button_1.setForeground(new Color(189,151,87));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				button_1.setForeground(new Color(205,196,125));
			}
			@Override
			public void mousePressed(MouseEvent e) {
				button_1.setForeground(new Color(146,102,44));
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				button_1.setForeground(new Color(205,196,125));
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Dialog", Font.BOLD, 15));
		button_1.setBackground(new Color(0, 128, 0));
		contentPane.add(button_1);

		JLabel labelEmail = new JLabel("Email:");
		labelEmail.setBounds(569, 191, 104, 26);
		labelEmail.setFont(new Font("Poppins", Font.PLAIN, 20));
		contentPane.add(labelEmail);

		JLabel labelPassword = new JLabel("Password:");
		labelPassword.setBounds(569, 286, 116, 26);
		labelPassword.setFont(new Font("Poppins", Font.PLAIN, 20));
		contentPane.add(labelPassword);

		JLabel labelSignIn = new JLabel("Sign In");
		labelSignIn.setBounds(680, 38, 97, 35);
		labelSignIn.setFont(new Font("Poppins", Font.BOLD, 25));
		contentPane.add(labelSignIn);

		JLabel labelPreciousLifeInsurance = new JLabel("Precious Life Insurance");
		labelPreciousLifeInsurance.setBounds(605, 111, 238, 29);
		labelPreciousLifeInsurance.setFont(new Font("Dialog", Font.PLAIN, 22));
		contentPane.add(labelPreciousLifeInsurance);

		JSeparator separator = new JSeparator();
		separator.setBorder(null);
		separator.setBounds(571, 159, 305, 10);
		panel.setLayout(null);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setBounds(63, 65, 428, 427);
		panel.add(lblIconLogo);
		lblIconLogo.setIcon(new ImageIcon(LoginFrame.class.getResource("/images/logoPng.png")));
		contentPane.add(separator);

		JLabel labelX = new JLabel("X");
		labelX.setBounds(927, 1, 12, 28);
		labelX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?","Confirmation", JOptionPane.YES_NO_OPTION) == 0 ) {
					LoginFrame.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				labelX.setForeground(Color.red);
			}
			
			public void mouseExited(MouseEvent e) {
				labelX.setForeground(Color.black);
			}
		});
		labelX.setFont(new Font("Tahoma", Font.BOLD, 14));
		labelX.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(labelX);
		
		JPanel panelEmail = new JPanel();
		panelEmail.setBounds(571, 227, 305, 44);
		panelEmail.setBackground(Color.WHITE);
		panelEmail.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		contentPane.add(panelEmail);
		
		JPanel panelPassword = new JPanel();
		panelPassword.setBounds(569, 324, 307, 44);
		panelPassword.setBackground(Color.WHITE);
		panelPassword.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		panelEmail.setLayout(null);
		
		txtEmailAddressLogin = new JTextField();
		txtEmailAddressLogin.addVetoableChangeListener(new VetoableChangeListener() {
			public void vetoableChange(PropertyChangeEvent evt) {
			}
		});
		txtEmailAddressLogin.setForeground(Color.GRAY);
		txtEmailAddressLogin.addFocusListener(new FocusAdapter() {
		
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEmailAddressLogin.getText().equals("Email Address")) {
					txtEmailAddressLogin.setText("");
				}
				else {
					txtEmailAddressLogin.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtEmailAddressLogin.getText().equals(""))
					txtEmailAddressLogin.setText("Email Adress");
			}
		});
		txtEmailAddressLogin.setBorder(null);
		txtEmailAddressLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtEmailAddressLogin.setForeground(Color.GRAY);
		txtEmailAddressLogin.setText("Email Address");
		txtEmailAddressLogin.setBackground(Color.WHITE);
		txtEmailAddressLogin.setBounds(51, 11, 228, 22);
		panelEmail.add(txtEmailAddressLogin);
		txtEmailAddressLogin.setColumns(10);
		
		JLabel labelEmailIcon = new JLabel("");
		labelEmailIcon.setHorizontalAlignment(SwingConstants.CENTER);
		labelEmailIcon.setIcon(new ImageIcon(LoginFrame.class.getResource("/images/UserLogo.png")));
		labelEmailIcon.setBounds(4, 0, 43, 44);
		panelEmail.add(labelEmailIcon);
		contentPane.add(panelPassword);
		SpringLayout sl_panelPassword = new SpringLayout();
		panelPassword.setLayout(sl_panelPassword);
		
		JLabel labelPasswordIcon = new JLabel("");
		sl_panelPassword.putConstraint(SpringLayout.NORTH, labelPasswordIcon, 0, SpringLayout.NORTH, panelPassword);
		sl_panelPassword.putConstraint(SpringLayout.WEST, labelPasswordIcon, 0, SpringLayout.WEST, panelPassword);
		sl_panelPassword.putConstraint(SpringLayout.SOUTH, labelPasswordIcon, 39, SpringLayout.NORTH, panelPassword);
		sl_panelPassword.putConstraint(SpringLayout.EAST, labelPasswordIcon, 52, SpringLayout.WEST, panelPassword);
		labelPasswordIcon.setHorizontalAlignment(SwingConstants.CENTER);
		labelPasswordIcon.setIcon(new ImageIcon(LoginFrame.class.getResource("/images/PassLogo.png")));
		panelPassword.add(labelPasswordIcon);
		
		pwdPasswordLogin = new JPasswordField();
		sl_panelPassword.putConstraint(SpringLayout.NORTH, pwdPasswordLogin, 10, SpringLayout.NORTH, panelPassword);
		sl_panelPassword.putConstraint(SpringLayout.WEST, pwdPasswordLogin, 5, SpringLayout.EAST, labelPasswordIcon);
		sl_panelPassword.putConstraint(SpringLayout.SOUTH, pwdPasswordLogin, -7, SpringLayout.SOUTH, labelPasswordIcon);
		sl_panelPassword.putConstraint(SpringLayout.EAST, pwdPasswordLogin, 241, SpringLayout.EAST, labelPasswordIcon);
		pwdPasswordLogin.setFont(new Font("Poppins", Font.PLAIN, 15));
		pwdPasswordLogin.setForeground(Color.GRAY);
		pwdPasswordLogin.setEchoChar((char)0);
		pwdPasswordLogin.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(pwdPasswordLogin.getText().equals("Password")) {
					pwdPasswordLogin.setEchoChar('●');
					pwdPasswordLogin.setText("");
					
				}
				else {
					pwdPasswordLogin.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(pwdPasswordLogin.getText().equals("")) {
					pwdPasswordLogin.setText("Password");
					pwdPasswordLogin.setEchoChar((char)0);
					
				}
			}
		});
		pwdPasswordLogin.setText("Password");
		pwdPasswordLogin.setBorder(null);
		panelPassword.add(pwdPasswordLogin);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBorder(null);
		separator_1.setBounds(569, 470, 317, 10);
		contentPane.add(separator_1);
		
		
	}
}