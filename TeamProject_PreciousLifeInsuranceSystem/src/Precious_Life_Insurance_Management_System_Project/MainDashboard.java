package Precious_Life_Insurance_Management_System_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class MainDashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainDashboard frame = new MainDashboard();
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
	public MainDashboard() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 977, 643);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(new Color(0, 0, 255));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(-14, 0, 977, 75);
		panel.setBackground(new Color(0, 45, 105));
		panel.setForeground(new Color(0, 0, 255));

		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(MainDashboard.class.getResource("/images/SmallSize.png")));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 45, 105));
		btnNewButton.setBounds(27, 10, 66, 55);
		panel.add(btnNewButton);
		
		JButton DashboardMainLogOut = new JButton("");
		DashboardMainLogOut.setBorder(null);
		DashboardMainLogOut.setIcon(new ImageIcon(MainDashboard.class.getResource("/images/logoutbutton2.png")));
		DashboardMainLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int result = JOptionPane.showConfirmDialog(null,"Are you sure you want to log out?", "Swing Tester",
			               JOptionPane.YES_NO_OPTION,
			               JOptionPane.QUESTION_MESSAGE);

		            if(result == JOptionPane.YES_OPTION){
		            	
		    					LoginFrame t = new LoginFrame();
		    					t.show();
		    					dispose();

		    			
		            }else if (result == JOptionPane.NO_OPTION){
		              
		            	MainDashboard t = new MainDashboard();
    					t.show();
    					dispose();
				}
			}
		});
	
		DashboardMainLogOut.setIcon(new ImageIcon(MainDashboard.class.getResource("/images/logoutbutton2.png")));
		DashboardMainLogOut.setHorizontalAlignment(SwingConstants.CENTER);
		DashboardMainLogOut.setFont(new Font("Tahoma", Font.BOLD, 14));
		DashboardMainLogOut.setBounds(806, 10, 161, 55);
		panel.add(DashboardMainLogOut);
		
		JButton DashboardMainAvailUsButton = new JButton("");
		DashboardMainAvailUsButton.setBackground(new Color(255, 255, 255));
		DashboardMainAvailUsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					Dashboard t = new Dashboard();
					t.show();
					dispose();

				}
			}
		});
		DashboardMainAvailUsButton.setBorder(null);
		DashboardMainAvailUsButton.setForeground(Color.WHITE);
		DashboardMainAvailUsButton.setIcon(new ImageIcon(MainDashboard.class.getResource("/images/Avail.png")));
		DashboardMainAvailUsButton.setBounds(198, 249, 264, 244);
		contentPane.add(DashboardMainAvailUsButton);
		
		JButton DashboardMainAboutUsButton = new JButton("");
		DashboardMainAboutUsButton.setBackground(new Color(255, 255, 255));
		DashboardMainAboutUsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					AboutUS t = new AboutUS();
					t.show();
					dispose();

				}
			}
		});
		DashboardMainAboutUsButton.setBorder(null);
		DashboardMainAboutUsButton.setIcon(new ImageIcon(MainDashboard.class.getResource("/images/About_Us.png")));
		DashboardMainAboutUsButton.setForeground(Color.WHITE);
		DashboardMainAboutUsButton.setBounds(510, 249, 257, 244);
		contentPane.add(DashboardMainAboutUsButton);
		
		JLabel DashboardMainAvailLabel = new JLabel("INSURANCE AVAILMENT");
		DashboardMainAvailLabel.setFont(new Font("Poppins", Font.BOLD, 20));
		DashboardMainAvailLabel.setBounds(219, 494, 264, 45);
		contentPane.add(DashboardMainAvailLabel);
		
		JLabel DashboardMainAboutUsLabel = new JLabel("ABOUT US");
		DashboardMainAboutUsLabel.setFont(new Font("Poppins", Font.BOLD, 20));
		DashboardMainAboutUsLabel.setBounds(582, 494, 110, 45);
		contentPane.add(DashboardMainAboutUsLabel);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(MainDashboard.class.getResource("/images/PSWelcome3.png")));
		lblNewLabel.setBounds(234, 85, 507, 144);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setForeground(Color.BLUE);
		panel_1.setBackground(new Color(0, 45, 105));
		panel_1.setBounds(0, 591, 977, 51);
		contentPane.add(panel_1);
	}
}