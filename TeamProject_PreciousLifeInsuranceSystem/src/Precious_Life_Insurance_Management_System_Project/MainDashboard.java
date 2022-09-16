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
		
		JLabel DashboardMainLogo = new JLabel("");
		DashboardMainLogo.setIcon(new ImageIcon(MainDashboard.class.getResource("/images/SmallSize.png")));
		DashboardMainLogo.setBounds(10, 10, 63, 55);
		panel.add(DashboardMainLogo);
		
		JButton DashboardMainLogOut = new JButton("LOG OUT");
		DashboardMainLogOut.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to Log out?","Confirmation", JOptionPane.YES_NO_OPTION) == 0 ) {

					MainDashboard.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				DashboardMainLogOut.setForeground(Color.red);
			}
			
			public void mouseExited(MouseEvent e) {
				DashboardMainLogOut.setForeground(Color.white);
			}
		});
		DashboardMainLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				LoginFrame t = new LoginFrame();
				t.show();
				dispose();

			}
			
		});
		DashboardMainLogOut.setFont(new Font("Poppins", Font.BOLD, 10));
		DashboardMainLogOut.setBounds(819, 21, 103, 30);
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
		DashboardMainAvailUsButton.setBounds(125, 226, 284, 257);
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
		DashboardMainAboutUsButton.setBounds(568, 226, 274, 257);
		contentPane.add(DashboardMainAboutUsButton);
		
		JLabel DashboardMainAvailLabel = new JLabel("INSURANCE AVAILMENT");
		DashboardMainAvailLabel.setFont(new Font("Poppins", Font.BOLD, 20));
		DashboardMainAvailLabel.setBounds(147, 484, 284, 45);
		contentPane.add(DashboardMainAvailLabel);
		
		JLabel DashboardMainAboutUsLabel = new JLabel("ABOUT US");
		DashboardMainAboutUsLabel.setFont(new Font("Poppins", Font.BOLD, 20));
		DashboardMainAboutUsLabel.setBounds(653, 484, 200, 45);
		contentPane.add(DashboardMainAboutUsLabel);
		
		JLabel DashboardMainWelcomeTOLabel = new JLabel("WELCOME TO");
		DashboardMainWelcomeTOLabel.setFont(new Font("Poppins", Font.BOLD, 30));
		DashboardMainWelcomeTOLabel.setBounds(384, 112, 244, 35);
		contentPane.add(DashboardMainWelcomeTOLabel);
		
		JLabel DashboardMainPreciousLifeLabel = new JLabel("PRECIOUS LIFE!");
		DashboardMainPreciousLifeLabel.setFont(new Font("Poppins", Font.BOLD, 30));
		DashboardMainPreciousLifeLabel.setBounds(369, 146, 244, 35);
		contentPane.add(DashboardMainPreciousLifeLabel);
	}
}