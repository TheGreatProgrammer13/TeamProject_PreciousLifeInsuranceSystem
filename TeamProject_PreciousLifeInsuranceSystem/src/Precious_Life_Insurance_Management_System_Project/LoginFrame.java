package Precious_Life_Insurance_Management_System_Project;

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
	
	

	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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

		JLabel lblNewLabel = new JLabel("Username:");
		lblNewLabel.setBounds(569, 191, 104, 26);
		lblNewLabel.setFont(new Font("Poppins", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(569, 286, 116, 26);
		lblPassword.setFont(new Font("Poppins", Font.PLAIN, 20));
		contentPane.add(lblPassword);

		JLabel lblNewLabel_1 = new JLabel("Sign In");
		lblNewLabel_1.setBounds(680, 38, 97, 35);
		lblNewLabel_1.setFont(new Font("Poppins", Font.BOLD, 25));
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Precious Life Insurance");
		lblNewLabel_2.setBounds(605, 111, 238, 29);
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_2);

		JSeparator separator = new JSeparator();
		separator.setBorder(null);
		separator.setBounds(571, 159, 305, 10);
		panel.setLayout(null);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setBounds(63, 65, 428, 427);
		panel.add(lblIconLogo);
		lblIconLogo.setIcon(new ImageIcon(LoginFrame.class.getResource("/images/logoPng.png")));
		contentPane.add(separator);

		JLabel lblX = new JLabel("X");
		lblX.setBounds(927, 1, 12, 28);
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?","Confirmation", JOptionPane.YES_NO_OPTION) == 0 ) {
					LoginFrame.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.red);
			}
			
			public void mouseExited(MouseEvent e) {
				lblX.setForeground(Color.black);
			}
		});
		lblX.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblX);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(571, 227, 305, 44);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(569, 324, 307, 44);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		panel_1.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.addVetoableChangeListener(new VetoableChangeListener() {
			public void vetoableChange(PropertyChangeEvent evt) {
			}
		});
		txtUsername.setForeground(Color.GRAY);
		txtUsername.addFocusListener(new FocusAdapter() {
		
			@Override
			public void focusGained(FocusEvent e) {
				if(txtUsername.getText().equals("Username")) {
					txtUsername.setText("");
				}
				else {
					txtUsername.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(txtUsername.getText().equals(""))
					txtUsername.setText("Username");
			}
		});
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUsername.setForeground(Color.GRAY);
		txtUsername.setText("Username");
		txtUsername.setBackground(Color.WHITE);
		txtUsername.setBounds(51, 11, 228, 22);
		panel_1.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblUsernameIcon = new JLabel("");
		lblUsernameIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsernameIcon.setIcon(new ImageIcon(LoginFrame.class.getResource("/images/UserLogo.png")));
		lblUsernameIcon.setBounds(4, 0, 43, 44);
		panel_1.add(lblUsernameIcon);
		contentPane.add(panel_1_1);
		SpringLayout sl_panel_1_1 = new SpringLayout();
		panel_1_1.setLayout(sl_panel_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		sl_panel_1_1.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 0, SpringLayout.NORTH, panel_1_1);
		sl_panel_1_1.putConstraint(SpringLayout.WEST, lblNewLabel_4, 0, SpringLayout.WEST, panel_1_1);
		sl_panel_1_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_4, 39, SpringLayout.NORTH, panel_1_1);
		sl_panel_1_1.putConstraint(SpringLayout.EAST, lblNewLabel_4, 52, SpringLayout.WEST, panel_1_1);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon(LoginFrame.class.getResource("/images/PassLogo.png")));
		panel_1_1.add(lblNewLabel_4);
		
		pwdPassword = new JPasswordField();
		sl_panel_1_1.putConstraint(SpringLayout.NORTH, pwdPassword, 10, SpringLayout.NORTH, panel_1_1);
		sl_panel_1_1.putConstraint(SpringLayout.WEST, pwdPassword, 5, SpringLayout.EAST, lblNewLabel_4);
		sl_panel_1_1.putConstraint(SpringLayout.SOUTH, pwdPassword, -7, SpringLayout.SOUTH, lblNewLabel_4);
		sl_panel_1_1.putConstraint(SpringLayout.EAST, pwdPassword, 241, SpringLayout.EAST, lblNewLabel_4);
		pwdPassword.setFont(new Font("Poppins", Font.PLAIN, 15));
		pwdPassword.setForeground(Color.GRAY);
		pwdPassword.setEchoChar((char)0);
		pwdPassword.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(pwdPassword.getText().equals("Password")) {
					pwdPassword.setEchoChar('●');
					pwdPassword.setText("");
					
				}
				else {
					pwdPassword.selectAll();
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if(pwdPassword.getText().equals("")) {
					pwdPassword.setText("Password");
					pwdPassword.setEchoChar((char)0);
					
				}
			}
		});
		pwdPassword.setText("Password");
		pwdPassword.setBorder(null);
		panel_1_1.add(pwdPassword);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBorder(null);
		separator_1.setBounds(569, 470, 317, 10);
		contentPane.add(separator_1);
		
		
	}
}