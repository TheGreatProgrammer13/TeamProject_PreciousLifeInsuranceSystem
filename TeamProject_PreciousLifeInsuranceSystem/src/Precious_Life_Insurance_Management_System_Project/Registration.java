package Precious_Life_Insurance_Management_System_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
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

public class Registration extends JFrame {

	private JPanel contentPane;
	private JTextField tpEmail;
	private JTextField tpBday;
	private JTextField tpName;
	private JTextField tpPass;
	
	
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
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Registration Form");
		lblNewLabel_1.setBounds(367, 93, 187, 27);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name:");
		lblNewLabel_1_1.setBounds(262, 191, 83, 27);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Email:");
		lblNewLabel_1_1_1.setBounds(261, 258, 72, 27);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Password:");
		lblNewLabel_1_1_1_1.setBounds(262, 312, 110, 30);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Birthday:");
		lblNewLabel_1_1_1_1_1.setBounds(262, 378, 100, 27);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		tpEmail = new JTextField();
		tpEmail.setBounds(382, 251, 250, 40);
		tpEmail.setText("");
		tpEmail.setColumns(10);
		contentPane.add(tpEmail);
		
		tpBday = new JTextField();
		tpBday.setBounds(382, 373, 250, 40);
		tpBday.setText("");
		tpBday.setColumns(10);
		contentPane.add(tpBday);
		
		Button btnSubmit = new Button("Submit");
		btnSubmit.setBounds(382, 484, 132, 40);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (tpName.getText().isEmpty() || tpEmail.getText().isEmpty() || tpPass.getText().isEmpty() || tpBday.getText().isEmpty()) {
						
						JOptionPane.showMessageDialog(null,"Please complete the details.");
				}
				
					else {
						
				try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginaccount", "root", "");
							String query = "INSERT INTO registration (Name, Email, Password, Birthday) VALUES (?, ?, ?, ?)";	
							pst=con.prepareStatement(query);
							pst.setString(1, tpName.getText());
							pst.setString(2, tpEmail.getText());
							pst.setString(3, tpPass.getText());
							pst.setString(4, tpBday.getText());
							pst.executeUpdate();
							
							JOptionPane.showMessageDialog(null,"Successfully Registered!");
						
							
								} catch (SQLException e1) {
									Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, e1);
								} catch (ClassNotFoundException e1) {
									Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, e1);
								}
						}
					}
			});
			
		
		btnSubmit.setForeground(new Color(234, 218, 128));
		btnSubmit.setFont(new Font("Dialog", Font.BOLD, 20));
		btnSubmit.setBackground(new Color(0, 45, 105));
		contentPane.add(btnSubmit);
		
		tpName = new JTextField();
		tpName.setBounds(384, 187, 248, 40);
		tpName.setText("");
		tpName.setColumns(10);
		contentPane.add(tpName);
		
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
		lblX.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(192, 5, 72, 83);
		lblLogo.setIcon(new ImageIcon(Registration.class.getResource("/images/logoPng.png")));
		contentPane.add(lblLogo);
		
		tpPass = new JTextField();
		tpPass.setBounds(381, 312, 251, 40);
		tpPass.setText("");
		tpPass.setColumns(10);
		contentPane.add(tpPass);
	}
}