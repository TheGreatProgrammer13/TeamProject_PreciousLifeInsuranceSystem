package Precious_Life_Insurance_Management_System_Project;

import java.awt.BorderLayout;
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
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class PLRetirement_MaxChoice extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PLRetirement_MaxChoice frame = new PLRetirement_MaxChoice();
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
	public PLRetirement_MaxChoice() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 843);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(148, 150, 417, 89);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 64, 128));
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblSerene = new JLabel("MAX CHOICE");
		lblSerene.setBounds(60, 35, 397, 44);
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
		lblNewLabel_2.setIcon(new ImageIcon(PLRetirement_Stabalize.class.getResource("/images/Retirement_Logo.png")));
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
		
		JLabel lblNewLabel_3 = new JLabel("is a life insurance policy that is linked to investments");
		lblNewLabel_3.setBounds(546, 298, 631, 32);
		lblNewLabel_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("PreciousLife Max Choice");
		lblNewLabel_3_1.setBounds(263, 298, 272, 32);
		lblNewLabel_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("and can assist you in saving and can assist you in saving. PL Max Choice offers ");
		lblNewLabel_3_2.setBounds(274, 329, 880, 32);
		lblNewLabel_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("investment options in addition to the insurance coverage it offers, enabling your");
		lblNewLabel_3_2_1.setBounds(272, 355, 872, 32);
		lblNewLabel_3_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("money to increase over time.");
		lblNewLabel_3_2_1_1.setBounds(271, 382, 835, 32);
		lblNewLabel_3_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("BENEFITS");
		lblNewLabel_4.setBounds(263, 455, 272, 72);
		lblNewLabel_4.setForeground(new Color(235, 200, 1));
		lblNewLabel_4.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 60));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("SUITABLE FOR");
		lblNewLabel_4_1.setBounds(758, 453, 313, 72);
		lblNewLabel_4_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_4_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 46));
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_1 = new JLabel("Life insurance coverage");
		lblNewLabel_3_2_1_1_1_1_1.setBounds(291, 565, 274, 32);
		lblNewLabel_3_2_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_2 = new JLabel("Flexible investment options");
		lblNewLabel_3_2_1_1_1_1_2.setBounds(291, 595, 296, 32);
		lblNewLabel_3_2_1_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_2);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3 = new JLabel("Professional fund management");
		lblNewLabel_3_2_1_1_1_1_3.setBounds(291, 625, 343, 32);
		lblNewLabel_3_2_1_1_1_1_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3);
		
		JLabel lblNewLabel_3_2_1_1_1_1_4 = new JLabel("Funds for future needs");
		lblNewLabel_3_2_1_1_1_1_4.setBounds(291, 658, 296, 32);
		lblNewLabel_3_2_1_1_1_1_4.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_4);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBounds(229, 565, 12, 195);
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
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(189, 0, 988, 257);
		lblNewLabel_6.setIcon(new ImageIcon(PLRetirement_MaxChoice.class.getResource("/images/RetirementMaxChoicePicture.png")));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(768, 536, 302, 137);
		lblNewLabel_7.setIcon(new ImageIcon(PLRetirement_Stabalize.class.getResource("/images/suitablePicture2.png")));
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Moving Up");
		lblNewLabel_8.setBounds(795, 671, 86, 32);
		lblNewLabel_8.setForeground(new Color(0, 0, 128));
		lblNewLabel_8.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("Preparing");
		lblNewLabel_8_1.setBounds(952, 671, 86, 32);
		lblNewLabel_8_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Ahead");
		lblNewLabel_8_1_1.setBounds(962, 702, 57, 32);
		lblNewLabel_8_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		contentPane.add(lblNewLabel_8_1_1);
		
		JButton clickInfoSerendipity = new JButton("Click for more info!");
		clickInfoSerendipity.setBounds(263, 536, 239, 23);
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
		contentPane.add(clickInfoSerendipity);
		
		JLabel lblNewLabel_3_2_1_1_1_1_4_1 = new JLabel("Manageable premium payments");
		lblNewLabel_3_2_1_1_1_1_4_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_4_1.setBounds(291, 691, 296, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_4_1);
		
		JLabel lblNewLabel_5_3_1 = new JLabel("\u00E2\u2014\uFFFD");
		lblNewLabel_5_3_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_3_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5_3_1.setBounds(263, 704, 18, 13);
		contentPane.add(lblNewLabel_5_3_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_4_1_1 = new JLabel("Loyalty Bonus");
		lblNewLabel_3_2_1_1_1_1_4_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_4_1_1.setBounds(291, 728, 296, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_4_1_1);
		
		JLabel lblNewLabel_5_3_1_1 = new JLabel("\u00E2\u2014\uFFFD");
		lblNewLabel_5_3_1_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5_3_1_1.setBounds(263, 741, 18, 13);
		contentPane.add(lblNewLabel_5_3_1_1);
	}
}
