package Precious_Life_Insurance_Management_System_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import javax.swing.SpringLayout;
import javax.swing.JSeparator;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;

public class PLSerene extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PLSerene frame = new PLSerene();
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
	public PLSerene() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 843);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 108, 806);
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(0, 84, 168));
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PLSerene.class.getResource("/images/logoPng-MIDSIZE.png")));
		lblNewLabel_1.setBounds(-17, 10, 136, 137);
		panel.add(lblNewLabel_1);
		
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(112, 5, 42, 838);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(0, 64, 128));
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(153, 5, 42, 838);
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(193, 155, 249, 89);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblSerene = new JLabel("SERENE");
		lblSerene.setBounds(38, 34, 195, 44);
		lblSerene.setForeground(Color.WHITE);
		lblSerene.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_1_1_1.add(lblSerene);
		
		JLabel lblNewLabel = new JLabel("PRECIOUS LIFE");
		lblNewLabel.setBounds(38, 10, 183, 24);
		panel_1_1_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_3 = new JLabel("is an investment-linked life insurance plan that provides ");
		lblNewLabel_3.setBounds(490, 295, 605, 32);
		lblNewLabel_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("PreciousLife SERENE");
		lblNewLabel_3_1.setBounds(257, 295, 234, 32);
		lblNewLabel_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("financial stability and peace of mind as your money increases over time. It");
		lblNewLabel_3_2.setBounds(279, 323, 789, 32);
		lblNewLabel_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("combines the benefits of insurance protection with investment. It allows you to ");
		lblNewLabel_3_2_1.setBounds(253, 349, 861, 32);
		lblNewLabel_3_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("save money for at least five years and allows you to potentially enhance your ");
		lblNewLabel_3_2_1_1.setBounds(263, 376, 832, 32);
		lblNewLabel_3_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1 = new JLabel("initial savings for higher growth potential. This might help you prepare financially");
		lblNewLabel_3_2_1_1_1.setBounds(242, 403, 872, 32);
		lblNewLabel_3_2_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3_2_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1 = new JLabel("for any upcoming life goals or milestones.");
		lblNewLabel_3_2_1_1_1_1.setBounds(453, 430, 447, 32);
		lblNewLabel_3_2_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3_2_1_1_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("BENEFITS");
		lblNewLabel_4.setBounds(268, 487, 272, 72);
		lblNewLabel_4.setForeground(new Color(235, 200, 1));
		lblNewLabel_4.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 60));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("SUITABLE FOR");
		lblNewLabel_4_1.setBounds(767, 492, 313, 72);
		lblNewLabel_4_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_4_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 46));
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_1 = new JLabel("Life insurance coverage.");
		lblNewLabel_3_2_1_1_1_1_1.setBounds(296, 570, 211, 32);
		lblNewLabel_3_2_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_2 = new JLabel("Flexible investment options.");
		lblNewLabel_3_2_1_1_1_1_2.setBounds(296, 600, 244, 32);
		lblNewLabel_3_2_1_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_2);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3 = new JLabel("Professional fund management.");
		lblNewLabel_3_2_1_1_1_1_3.setBounds(296, 630, 272, 32);
		lblNewLabel_3_2_1_1_1_1_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3);
		
		JLabel lblNewLabel_3_2_1_1_1_1_4 = new JLabel("Funds for future needs.");
		lblNewLabel_3_2_1_1_1_1_4.setBounds(296, 663, 211, 32);
		lblNewLabel_3_2_1_1_1_1_4.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_4);
		
		JLabel lblNewLabel_3_2_1_1_1_1_5 = new JLabel("Manageable premium payment.");
		lblNewLabel_3_2_1_1_1_1_5.setBounds(296, 694, 272, 32);
		lblNewLabel_3_2_1_1_1_1_5.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_5);
		
		JLabel lblNewLabel_3_2_1_1_1_1_5_1 = new JLabel("Loyalty bonus.");
		lblNewLabel_3_2_1_1_1_1_5_1.setBounds(296, 725, 132, 32);
		lblNewLabel_3_2_1_1_1_1_5_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_5_1);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBounds(234, 589, 12, 156);
		panel_1_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1_1_2.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("●");
		lblNewLabel_5.setBounds(268, 580, 18, 13);
		lblNewLabel_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("●");
		lblNewLabel_5_1.setBounds(268, 613, 18, 13);
		lblNewLabel_5_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("●");
		lblNewLabel_5_2.setBounds(268, 643, 18, 13);
		lblNewLabel_5_2.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("●");
		lblNewLabel_5_3.setBounds(268, 676, 18, 13);
		lblNewLabel_5_3.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("●");
		lblNewLabel_5_4.setBounds(268, 707, 18, 13);
		lblNewLabel_5_4.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_5_5 = new JLabel("●");
		lblNewLabel_5_5.setBounds(268, 738, 18, 13);
		lblNewLabel_5_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(-34, 5, 1195, 262);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\xander\\Downloads\\SerenePic.png"));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(743, 558, 360, 114);
		lblNewLabel_7.setIcon(new ImageIcon(PLSerene.class.getResource("/images/suitablePictue.png")));
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Moving Up");
		lblNewLabel_8.setBounds(753, 676, 86, 32);
		lblNewLabel_8.setForeground(new Color(0, 0, 128));
		lblNewLabel_8.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("Preparing");
		lblNewLabel_8_1.setBounds(883, 676, 86, 32);
		lblNewLabel_8_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Ahead");
		lblNewLabel_8_1_1.setBounds(893, 707, 57, 32);
		lblNewLabel_8_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		contentPane.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_8_1_1_1 = new JLabel("Leaving a");
		lblNewLabel_8_1_1_1.setBounds(1003, 676, 86, 32);
		lblNewLabel_8_1_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1_1_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		contentPane.add(lblNewLabel_8_1_1_1);
		
		JLabel lblNewLabel_8_1_1_1_1 = new JLabel("Legacy");
		lblNewLabel_8_1_1_1_1.setBounds(1013, 707, 63, 32);
		lblNewLabel_8_1_1_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1_1_1_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		contentPane.add(lblNewLabel_8_1_1_1_1);
		
		JButton btnNewButton = new JButton("Click for more info!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SereneBenefit t = new SereneBenefit();
				t.show();
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(128, 128, 128));
		btnNewButton.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 19));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBorder(UIManager.getBorder("TableHeader.cellBorder"));
		btnNewButton.setBounds(259, 467, 183, 23);
		contentPane.add(btnNewButton);
	}
}
