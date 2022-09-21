package Precious_Life_Insurance_Management_System_Project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class PLSerendipity extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PLSerendipity frame = new PLSerendipity();
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
	public PLSerendipity() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 843);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGetAQuote_1 = new JLabel("Get a quote");
		lblGetAQuote_1.setForeground(Color.WHITE);
		lblGetAQuote_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblGetAQuote_1.setBounds(841, 67, 305, 55);
		contentPane.add(lblGetAQuote_1);
		
		JLabel lblGetAQuote = new JLabel("Get a quote");
		lblGetAQuote.setForeground(new Color(242, 200, 71));
		lblGetAQuote.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblGetAQuote.setBounds(837, 67, 293, 55);
		contentPane.add(lblGetAQuote);
		
		JButton PLSerendipityNow = new JButton("");
		PLSerendipityNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentFrame t = new PaymentFrame();
				t.show();
				dispose();
			}
		});
		PLSerendipityNow.setIcon(new ImageIcon(PLSerendipity.class.getResource("/images/NowButton1.png")));
		PLSerendipityNow.setForeground(Color.WHITE);
		PLSerendipityNow.setFont(new Font("Verdana", Font.BOLD, 54));
		PLSerendipityNow.setBackground(new Color(0, 64, 128));
		PLSerendipityNow.setBounds(866, 120, 290, 72);
		contentPane.add(PLSerendipityNow);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(148, 150, 387, 89);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 64, 128));
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblSerene = new JLabel("SERENDIPITY");
		lblSerene.setBounds(60, 35, 317, 44);
		lblSerene.setForeground(Color.WHITE);
		lblSerene.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_1_1_1.add(lblSerene);
		
		JLabel lblNewLabel = new JLabel("PRECIOUS LIFE");
		lblNewLabel.setBounds(55, 10, 183, 24);
		panel_1_1_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 108, 806);
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(0, 84, 168));
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(PLSerene.class.getResource("/images/LifeLogo1 (1).png")));
		lblNewLabel_2.setBounds(10, 157, 98, 86);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					LifeInsurancePolicy t = new LifeInsurancePolicy();
					t.show();
					dispose();

				}
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(PLSerene.class.getResource("/images/backbutton.png")));
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(new Color(0, 84, 168));
		btnNewButton_4.setBounds(25, 710, 62, 55);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					MainDashboard t = new MainDashboard();
					t.show();
					dispose();

				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(PLSerendipity.class.getResource("/images/logoPng-MIDSIZE.png")));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 84, 168));
		btnNewButton.setBounds(10, 21, 98, 115);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(107, 0, 42, 838);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(0, 64, 128));
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(148, 0, 42, 838);
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("is a protection and savings plan, providing ");
		lblNewLabel_3.setBounds(627, 313, 460, 32);
		lblNewLabel_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("PreciousLife SERENDIPITY");
		lblNewLabel_3_1.setBounds(266, 311, 302, 32);
		lblNewLabel_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("everlasting double life insurance coverage. Furthermore, it gives additional ");
		lblNewLabel_3_2.setBounds(277, 342, 810, 32);
		lblNewLabel_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("financial benefits that you can use to build your savings and pay for future ");
		lblNewLabel_3_2_1.setBounds(275, 368, 805, 32);
		lblNewLabel_3_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("ambitions or target milestones.");
		lblNewLabel_3_2_1_1.setBounds(510, 395, 331, 32);
		lblNewLabel_3_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("BENEFITS");
		lblNewLabel_4.setBounds(263, 482, 272, 72);
		lblNewLabel_4.setForeground(new Color(235, 200, 1));
		lblNewLabel_4.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 60));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("SUITABLE FOR");
		lblNewLabel_4_1.setBounds(762, 487, 313, 72);
		lblNewLabel_4_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_4_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 46));
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_1 = new JLabel("Life insurance coverage.");
		lblNewLabel_3_2_1_1_1_1_1.setBounds(291, 565, 211, 32);
		lblNewLabel_3_2_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_2 = new JLabel("Flexible investment options.");
		lblNewLabel_3_2_1_1_1_1_2.setBounds(291, 595, 244, 32);
		lblNewLabel_3_2_1_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_2);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3 = new JLabel("Professional fund management.");
		lblNewLabel_3_2_1_1_1_1_3.setBounds(291, 625, 272, 32);
		lblNewLabel_3_2_1_1_1_1_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3);
		
		JLabel lblNewLabel_3_2_1_1_1_1_4 = new JLabel("Funds for future needs.");
		lblNewLabel_3_2_1_1_1_1_4.setBounds(291, 658, 211, 32);
		lblNewLabel_3_2_1_1_1_1_4.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_4);
		
		JLabel lblNewLabel_3_2_1_1_1_1_5 = new JLabel("Manageable premium payment.");
		lblNewLabel_3_2_1_1_1_1_5.setBounds(291, 689, 272, 32);
		lblNewLabel_3_2_1_1_1_1_5.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_5);
		
		JLabel lblNewLabel_3_2_1_1_1_1_5_1 = new JLabel("Loyalty bonus.");
		lblNewLabel_3_2_1_1_1_1_5_1.setBounds(291, 720, 132, 32);
		lblNewLabel_3_2_1_1_1_1_5_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_5_1);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBounds(229, 584, 12, 156);
		panel_1_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1_1_2.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("â—�");
		lblNewLabel_5.setBounds(263, 575, 18, 13);
		lblNewLabel_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("â—�");
		lblNewLabel_5_1.setBounds(263, 608, 18, 13);
		lblNewLabel_5_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("â—�");
		lblNewLabel_5_2.setBounds(263, 638, 18, 13);
		lblNewLabel_5_2.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("â—�");
		lblNewLabel_5_3.setBounds(263, 671, 18, 13);
		lblNewLabel_5_3.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("â—�");
		lblNewLabel_5_4.setBounds(263, 702, 18, 13);
		lblNewLabel_5_4.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_5_5 = new JLabel("â—�");
		lblNewLabel_5_5.setBounds(263, 733, 18, 13);
		lblNewLabel_5_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(166, 166, 166));
		panel_2.setBounds(399, 239, 103, 32);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblElite = new JLabel("ELITE");
		lblElite.setBounds(24, 0, 59, 32);
		panel_2.add(lblElite);
		lblElite.setForeground(Color.WHITE);
		lblElite.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblNewLabel_3_1_1 = new JLabel("ELITE");
		lblNewLabel_3_1_1.setForeground(new Color(150, 150, 150));
		lblNewLabel_3_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
		lblNewLabel_3_1_1.setBounds(561, 313, 68, 32);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(PLSerendipity.class.getResource("/images/Serene.png")));
		lblNewLabel_6.setBounds(189, 0, 988, 257);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(PLSerendipity.class.getResource("/images/suitablePictue.png")));
		lblNewLabel_7.setBounds(738, 559, 360, 114);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Moving Up");
		lblNewLabel_8.setForeground(new Color(0, 0, 128));
		lblNewLabel_8.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		lblNewLabel_8.setBounds(748, 677, 86, 32);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("Preparing");
		lblNewLabel_8_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		lblNewLabel_8_1.setBounds(878, 677, 86, 32);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Ahead");
		lblNewLabel_8_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		lblNewLabel_8_1_1.setBounds(888, 708, 57, 32);
		contentPane.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_8_1_1_1 = new JLabel("Leaving a");
		lblNewLabel_8_1_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1_1_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		lblNewLabel_8_1_1_1.setBounds(998, 677, 86, 32);
		contentPane.add(lblNewLabel_8_1_1_1);
		
		JLabel lblNewLabel_8_1_1_1_1 = new JLabel("Legacy");
		lblNewLabel_8_1_1_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1_1_1_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		lblNewLabel_8_1_1_1_1.setBounds(1008, 708, 63, 32);
		contentPane.add(lblNewLabel_8_1_1_1_1);
		
		JButton clickInfoSerendipity = new JButton("Click here for more info!");
		clickInfoSerendipity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SerendipityBenefits t = new SerendipityBenefits();
				t.show();
				dispose();
			}
		});
		clickInfoSerendipity.setForeground(Color.GRAY);
		clickInfoSerendipity.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 19));
		clickInfoSerendipity.setBorder(UIManager.getBorder("TableHeader.cellBorder"));
		clickInfoSerendipity.setBackground(Color.WHITE);
		clickInfoSerendipity.setBounds(242, 461, 260, 23);
		contentPane.add(clickInfoSerendipity);
	}
}
