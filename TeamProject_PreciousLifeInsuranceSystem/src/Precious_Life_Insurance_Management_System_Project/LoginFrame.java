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

public class LoginFrame extends JFrame {
	
	

	private JPanel contentPane;
	private JTextField txtUsername;
	private JTextField txtPassword;

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
		contentPane.setBorder(new LineBorder(Color.BLACK, 2));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);

		JPanel panel = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel, -15, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel, 576, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel, -449, SpringLayout.EAST, contentPane);
		panel.setBackground(new Color(0, 45, 105));
		contentPane.add(panel);

		Button button = new Button("Sign In");
		sl_contentPane.putConstraint(SpringLayout.NORTH, button, 409, SpringLayout.NORTH, contentPane);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		sl_contentPane.putConstraint(SpringLayout.WEST, button, 578, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, button, -102, SpringLayout.EAST, contentPane);
		button.setForeground(new Color(234, 218, 128));

		button.setFont(new Font("Poppins", Font.BOLD, 20));
		button.setBackground(new Color(0, 45, 105));
		contentPane.add(button);

		Button button_1 = new Button("Sign Up");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, button, -20, SpringLayout.NORTH, button_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, button_1, 469, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, button_1, 578, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, button_1, 513, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, button_1, 0, SpringLayout.EAST, button);
		button_1.setForeground(new Color(234, 218, 128));
		button_1.setFont(new Font("Poppins", Font.BOLD, 20));
		button_1.setBackground(new Color(0, 45, 105));
		contentPane.add(button_1);

		JLabel lblNewLabel = new JLabel("Username:");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 71, SpringLayout.EAST, panel);
		lblNewLabel.setFont(new Font("Poppins", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);

		JLabel lblPassword = new JLabel("Password:");
		sl_contentPane.putConstraint(SpringLayout.WEST, lblPassword, 0, SpringLayout.WEST, lblNewLabel);
		lblPassword.setFont(new Font("Poppins", Font.PLAIN, 20));
		contentPane.add(lblPassword);

		JLabel lblNewLabel_1 = new JLabel("Sign In");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 37, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_1, 182, SpringLayout.EAST, panel);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblNewLabel_1, -172, SpringLayout.EAST, contentPane);
		lblNewLabel_1.setFont(new Font("Poppins", Font.BOLD, 25));
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Precious Life Insurance");
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -38, SpringLayout.NORTH, lblNewLabel_2);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel_2, 73, SpringLayout.EAST, panel);
		lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_2);

		JSeparator separator = new JSeparator();
		sl_contentPane.putConstraint(SpringLayout.NORTH, separator, 158, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, separator, -410, SpringLayout.SOUTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 22, SpringLayout.SOUTH, separator);
		sl_contentPane.putConstraint(SpringLayout.WEST, separator, 73, SpringLayout.EAST, panel);
		panel.setLayout(null);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setBounds(63, 65, 428, 427);
		panel.add(lblIconLogo);
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblIconLogo, 39, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblIconLogo, -143, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblIconLogo, 101, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblIconLogo, -35, SpringLayout.EAST, contentPane);
		lblIconLogo.setIcon(new ImageIcon(LoginFrame.class.getResource("/images/logoPng.png")));
		sl_contentPane.putConstraint(SpringLayout.EAST, separator, -73, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, -19, SpringLayout.NORTH, separator);
		contentPane.add(separator);

		JLabel lblX = new JLabel("X");
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
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblX, 0, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblX, -22, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblX, 28, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, lblX, -10, SpringLayout.EAST, contentPane);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblX);
		
		JPanel panel_1 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_1, 10, SpringLayout.SOUTH, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_1, -308, SpringLayout.SOUTH, contentPane);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_1, 2, SpringLayout.WEST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_1, 0, SpringLayout.EAST, separator);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		sl_contentPane.putConstraint(SpringLayout.SOUTH, lblPassword, -12, SpringLayout.NORTH, panel_1_1);
		sl_contentPane.putConstraint(SpringLayout.NORTH, panel_1_1, 323, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, panel_1_1, -42, SpringLayout.NORTH, button);
		sl_contentPane.putConstraint(SpringLayout.WEST, panel_1_1, 0, SpringLayout.WEST, lblNewLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, panel_1_1, 0, SpringLayout.EAST, separator);
		panel_1_1.setBackground(Color.WHITE);
		panel_1_1.setBorder(new LineBorder(new Color(128, 128, 128), 1, true));
		panel_1.setLayout(null);
		
		txtUsername = new JTextField();
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
		
		txtPassword = new JTextField();
		txtPassword.setForeground(Color.GRAY);
		txtPassword.setBorder(null);
		txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtPassword.setText("Password");
		sl_panel_1_1.putConstraint(SpringLayout.NORTH, txtPassword, 11, SpringLayout.NORTH, panel_1_1);
		sl_panel_1_1.putConstraint(SpringLayout.WEST, txtPassword, 53, SpringLayout.WEST, panel_1_1);
		sl_panel_1_1.putConstraint(SpringLayout.SOUTH, txtPassword, 33, SpringLayout.NORTH, panel_1_1);
		sl_panel_1_1.putConstraint(SpringLayout.EAST, txtPassword, 282, SpringLayout.WEST, panel_1_1);
		txtPassword.setColumns(10);
		txtPassword.setBackground(Color.WHITE);
		panel_1_1.add(txtPassword);
		
		JLabel lblNewLabel_4 = new JLabel("");
		sl_panel_1_1.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 0, SpringLayout.NORTH, panel_1_1);
		sl_panel_1_1.putConstraint(SpringLayout.WEST, lblNewLabel_4, 0, SpringLayout.WEST, panel_1_1);
		sl_panel_1_1.putConstraint(SpringLayout.SOUTH, lblNewLabel_4, 39, SpringLayout.NORTH, panel_1_1);
		sl_panel_1_1.putConstraint(SpringLayout.EAST, lblNewLabel_4, 52, SpringLayout.WEST, panel_1_1);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setIcon(new ImageIcon(LoginFrame.class.getResource("/images/PassLogo.png")));
		panel_1_1.add(lblNewLabel_4);
		
		
	}
}
