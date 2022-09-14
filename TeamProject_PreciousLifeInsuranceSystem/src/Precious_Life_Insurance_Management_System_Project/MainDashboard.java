package Precious_Life_Insurance_Management_System_Project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 977, 643);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(new Color(0, 0, 255));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel Darkblueblock = new JPanel();
		Darkblueblock.setBackground(new Color(0, 45, 105));
		Darkblueblock.setForeground(new Color(0, 0, 255));
		Darkblueblock.setBounds(-14, 0, 977, 75);
		contentPane.add(Darkblueblock);
		Darkblueblock.setLayout(null);
		
		JLabel DashboardMainLogo = new JLabel("");
		DashboardMainLogo.setIcon(new ImageIcon(MainDashboard.class.getResource("/images/SmallSize.png")));
		DashboardMainLogo.setBounds(10, 10, 63, 55);
		Darkblueblock.add(DashboardMainLogo);
		
		JButton DashboardMainLogOut = new JButton("LOG OUT");
		DashboardMainLogOut.setFont(new Font("Poppins", Font.BOLD, 10));
		DashboardMainLogOut.setBounds(819, 21, 103, 30);
		Darkblueblock.add(DashboardMainLogOut);
		
		JButton DashboardMainAvailUsButton = new JButton("");
		DashboardMainAvailUsButton.setBackground(new Color(255, 255, 255));
		DashboardMainAvailUsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		DashboardMainAvailUsButton.setBorder(null);
		DashboardMainAvailUsButton.setForeground(Color.WHITE);
		DashboardMainAvailUsButton.setIcon(new ImageIcon(MainDashboard.class.getResource("/images/Avail-removebg-preview.png")));
		DashboardMainAvailUsButton.setBounds(125, 226, 284, 257);
		contentPane.add(DashboardMainAvailUsButton);
		
		JButton DashboardMainAboutUsButton = new JButton("");
		DashboardMainAboutUsButton.setBackground(new Color(255, 255, 255));
		DashboardMainAboutUsButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		DashboardMainAboutUsButton.setBorder(null);
		DashboardMainAboutUsButton.setIcon(new ImageIcon(MainDashboard.class.getResource("/images/About_Us-removebg-preview.png")));
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
