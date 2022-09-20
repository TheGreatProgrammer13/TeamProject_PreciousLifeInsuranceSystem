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

public class PLRetirement_BrigtherLife extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PLRetirement_BrigtherLife frame = new PLRetirement_BrigtherLife();
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
	public PLRetirement_BrigtherLife() {
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
		
		JLabel lblSerene = new JLabel("BRIGTHER LIFE");
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
					RetirementPolicy t = new RetirementPolicy();
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
		
		JLabel lblNewLabel_3 = new JLabel("is a protection and savings plan is a protection ");
		lblNewLabel_3.setBounds(589, 296, 631, 32);
		lblNewLabel_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("PreciousLife Brighter Life ");
		lblNewLabel_3_1.setBounds(229, 296, 324, 32);
		lblNewLabel_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("and savings plan that offers lifetime and savings plan that offers lifetime coverage.");
		lblNewLabel_3_2.setBounds(240, 327, 880, 32);
		lblNewLabel_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Additionally, it provides financial benefits that can be used as regular income");
		lblNewLabel_3_2_1.setBounds(238, 353, 872, 32);
		lblNewLabel_3_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("in your senior years.");
		lblNewLabel_3_2_1_1.setBounds(237, 380, 835, 32);
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
		
		JLabel lblNewLabel_3_2_1_1_1_1_2 = new JLabel("Lifetime guaranteed cash benefits");
		lblNewLabel_3_2_1_1_1_1_2.setBounds(291, 595, 296, 32);
		lblNewLabel_3_2_1_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_2);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3 = new JLabel("Living benefits");
		lblNewLabel_3_2_1_1_1_1_3.setBounds(291, 625, 343, 32);
		lblNewLabel_3_2_1_1_1_1_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBounds(229, 565, 12, 92);
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
				Retirement_BrighterLifeBenefits t = new Retirement_BrighterLifeBenefits();
				t.show();
				dispose();
			}
		});
		clickInfoSerendipity.setForeground(Color.GRAY);
		clickInfoSerendipity.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 19));
		clickInfoSerendipity.setBorder(UIManager.getBorder("TableHeader.cellBorder"));
		clickInfoSerendipity.setBackground(Color.WHITE);
		contentPane.add(clickInfoSerendipity);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Prime");
		lblNewLabel_3_1_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
		lblNewLabel_3_1_1.setBounds(517, 296, 72, 32);
		contentPane.add(lblNewLabel_3_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(235, 200, 1));
		panel_2.setBounds(380, 239, 129, 32);
		contentPane.add(panel_2);
		
		JLabel lblPremium = new JLabel("PRIME");
		lblPremium.setForeground(Color.WHITE);
		lblPremium.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPremium.setBounds(28, 0, 101, 32);
		panel_2.add(lblPremium);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(PLRetirement_BrigtherLife.class.getResource("/images/Retirement_Picture.png")));
		lblNewLabel_6.setBounds(189, 0, 988, 257);
		contentPane.add(lblNewLabel_6);
	}

}
