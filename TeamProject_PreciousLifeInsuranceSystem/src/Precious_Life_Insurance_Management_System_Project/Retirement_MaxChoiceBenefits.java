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
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;

public class Retirement_MaxChoiceBenefits extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Retirement_MaxChoiceBenefits frame = new Retirement_MaxChoiceBenefits();
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
	public Retirement_MaxChoiceBenefits() {
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
		lblGetAQuote_1.setBounds(841, 660, 305, 55);
		contentPane.add(lblGetAQuote_1);
		
		JLabel lblGetAQuote = new JLabel("Get a quote");
		lblGetAQuote.setForeground(new Color(242, 200, 71));
		lblGetAQuote.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblGetAQuote.setBounds(837, 660, 293, 55);
		contentPane.add(lblGetAQuote);
		
		JButton MaxChoiceBnft = new JButton("");
		MaxChoiceBnft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentFrame t = new PaymentFrame();
				t.show();
				dispose();
			}
		});
		MaxChoiceBnft.setIcon(new ImageIcon(Retirement_MaxChoiceBenefits.class.getResource("/images/NowButton1.png")));
		MaxChoiceBnft.setForeground(Color.WHITE);
		MaxChoiceBnft.setFont(new Font("Verdana", Font.BOLD, 54));
		MaxChoiceBnft.setBackground(new Color(0, 64, 128));
		MaxChoiceBnft.setBounds(866, 713, 290, 72);
		contentPane.add(MaxChoiceBnft);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 108, 811);
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(0, 84, 168));
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Retirement_StabalizeBenefits.class.getResource("/images/Retirement_Logo.png")));
		lblNewLabel_2.setBounds(10, 157, 98, 86);
		panel.add(lblNewLabel_2);
		
		JButton backbuttonSerene = new JButton("");
		backbuttonSerene.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					PaymentFrame t = new PaymentFrame();
					t.show();
					dispose();
				}
			}
		});
		backbuttonSerene.setIcon(new ImageIcon(PLSerene.class.getResource("/images/backbutton.png")));
		backbuttonSerene.setBorder(null);
		backbuttonSerene.setBackground(new Color(0, 84, 168));
		backbuttonSerene.setBounds(25, 710, 62, 55);
		panel.add(backbuttonSerene);
		
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
		btnNewButton.setIcon(new ImageIcon(SereneBenefit.class.getResource("/images/logoPng-MIDSIZE.png")));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 84, 168));
		btnNewButton.setBounds(10, 21, 98, 115);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(107, 0, 42, 843);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(0, 64, 128));
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(142, 0, 42, 843);
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(181, 674, 408, 89);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblSerene = new JLabel("MAX CHOICE");
		lblSerene.setBounds(38, 34, 429, 44);
		lblSerene.setForeground(Color.WHITE);
		lblSerene.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_1_1_1.add(lblSerene);
		
		JLabel lblNewLabel = new JLabel("PRECIOUS LIFE");
		lblNewLabel.setBounds(38, 10, 183, 24);
		panel_1_1_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_4 = new JLabel(" BENEFITS");
		lblNewLabel_4.setBounds(216, 30, 318, 72);
		lblNewLabel_4.setForeground(new Color(235, 200, 1));
		lblNewLabel_4.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 60));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(0, 651, 1257, 160);
		lblNewLabel_6.setIcon(new ImageIcon(Retirement_MaxChoiceBenefits.class.getResource("/images/RetirementMaxChoicePicture.png")));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3 = new JLabel("of PL");
		lblNewLabel_3.setBounds(510, 49, 58, 18);
		lblNewLabel_3.setForeground(new Color(235, 200, 1));
		lblNewLabel_3.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("MAX CHOICE:");
		lblNewLabel_5.setBounds(510, 72, 206, 18);
		lblNewLabel_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3_2 = new JLabel("Secure your loved ones' future with guaranteed life");
		lblNewLabel_3_2.setBounds(271, 142, 396, 32);
		lblNewLabel_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("insurance benefits equivalent to at least twice your ");
		lblNewLabel_3_2_1.setBounds(271, 165, 457, 32);
		lblNewLabel_3_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("plan's Face Amount, which goes to your family ");
		lblNewLabel_3_2_2.setBounds(271, 191, 381, 32);
		lblNewLabel_3_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_3_2_6_1 = new JLabel("Life insurance coverage");
		lblNewLabel_3_2_6_1.setBounds(271, 113, 429, 32);
		lblNewLabel_3_2_6_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3_2_6_1);
		
		JLabel lblNewLabel_3_2_7 = new JLabel("in the event of untimely demise. The amount can");
		lblNewLabel_3_2_7.setBounds(271, 217, 408, 32);
		lblNewLabel_3_2_7.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_7);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("be used to help your family in their daily expenses");
		lblNewLabel_3_2_1_1.setBounds(271, 243, 408, 32);
		lblNewLabel_3_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_3_2_2_1 = new JLabel("and to ensure that they can still fulfill the dreams ");
		lblNewLabel_3_2_2_1.setBounds(271, 266, 396, 32);
		lblNewLabel_3_2_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_2_1);
		
		JLabel lblNewLabel_3_2_6_1_1 = new JLabel("Flexible investment options");
		lblNewLabel_3_2_6_1_1.setBounds(271, 347, 263, 32);
		lblNewLabel_3_2_6_1_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3_2_6_1_1);
		
		JLabel lblNewLabel_3_2_8 = new JLabel("Choose among the investment fund options to ");
		lblNewLabel_3_2_8.setBounds(271, 376, 396, 32);
		lblNewLabel_3_2_8.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_8);
		
		JLabel lblNewLabel_3_2_1_2 = new JLabel("address your different investment objectives ");
		lblNewLabel_3_2_1_2.setBounds(271, 407, 396, 32);
		lblNewLabel_3_2_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1_2);
		
		JLabel lblNewLabel_3_2_6_1_3 = new JLabel("Funds for future needs");
		lblNewLabel_3_2_6_1_3.setBounds(689, 113, 429, 32);
		lblNewLabel_3_2_6_1_3.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3_2_6_1_3);
		
		JLabel lblNewLabel_3_2_10 = new JLabel("Build funds for your child's education, a comfortable ");
		lblNewLabel_3_2_10.setBounds(689, 142, 457, 32);
		lblNewLabel_3_2_10.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_10);
		
		JLabel lblNewLabel_3_2_1_4 = new JLabel("retirement, or an important life milestone.");
		lblNewLabel_3_2_1_4.setBounds(689, 165, 482, 32);
		lblNewLabel_3_2_1_4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1_4);
		
		JLabel lblNewLabel_3_2_2_2 = new JLabel("In case of an emergency, money comes in handy ");
		lblNewLabel_3_2_2_2.setBounds(689, 191, 457, 32);
		lblNewLabel_3_2_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_2_2);
		
		JLabel lblNewLabel_3_2_3_1 = new JLabel("via a partial fund withdrawal.");
		lblNewLabel_3_2_3_1.setBounds(689, 217, 457, 32);
		lblNewLabel_3_2_3_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_3_1);
		
		JLabel lblNewLabel_3_2_1_2_1 = new JLabel("and risk appetite.");
		lblNewLabel_3_2_1_2_1.setBounds(271, 440, 396, 32);
		lblNewLabel_3_2_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1_2_1);
		
		JLabel lblNewLabel_3_2_8_1 = new JLabel("planned together.");
		lblNewLabel_3_2_8_1.setBounds(271, 294, 367, 32);
		lblNewLabel_3_2_8_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_8_1);
		
		JLabel lblNewLabel_3_2_6_1_1_1 = new JLabel("Professional fund management");
		lblNewLabel_3_2_6_1_1_1.setBounds(271, 483, 263, 32);
		lblNewLabel_3_2_6_1_1_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3_2_6_1_1_1);
		
		JLabel lblNewLabel_3_2_8_2 = new JLabel("Take advantage of PL's professional fund managers");
		lblNewLabel_3_2_8_2.setBounds(271, 512, 396, 32);
		lblNewLabel_3_2_8_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_8_2);
		
		JLabel lblNewLabel_3_2_8_2_1 = new JLabel("investment experience and expertise.");
		lblNewLabel_3_2_8_2_1.setBounds(271, 544, 396, 32);
		lblNewLabel_3_2_8_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_8_2_1);
		
		JLabel lblNewLabel_3_2_6_1_3_1 = new JLabel("Manageable premium payment");
		lblNewLabel_3_2_6_1_3_1.setBounds(689, 266, 429, 32);
		lblNewLabel_3_2_6_1_3_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3_2_6_1_3_1);
		
		JLabel lblNewLabel_3_2_10_1 = new JLabel("Pay for at least 10 years or opt to increase your");
		lblNewLabel_3_2_10_1.setBounds(689, 347, 457, 32);
		lblNewLabel_3_2_10_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_10_1);
		
		JLabel lblNewLabel_3_2_10_1_1 = new JLabel("fund's value through top-ups or excess payments");
		lblNewLabel_3_2_10_1_1.setBounds(689, 294, 457, 32);
		lblNewLabel_3_2_10_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_10_1_1);
		
		JLabel lblNewLabel_3_2_10_1_1_1 = new JLabel("on top of your regular premium.");
		lblNewLabel_3_2_10_1_1_1.setBounds(689, 321, 457, 32);
		lblNewLabel_3_2_10_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_10_1_1_1);
		
		JLabel lblNewLabel_3_2_6_1_3_1_1 = new JLabel("Loyalty bonus");
		lblNewLabel_3_2_6_1_3_1_1.setBounds(689, 390, 429, 32);
		lblNewLabel_3_2_6_1_3_1_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_3_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3_2_6_1_3_1_1);
		
		JLabel lblNewLabel_3_2_10_1_1_2 = new JLabel("Keep your policy active for at least 10 years");
		lblNewLabel_3_2_10_1_1_2.setBounds(689, 424, 457, 32);
		lblNewLabel_3_2_10_1_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_10_1_1_2);
		
		JLabel lblNewLabel_3_2_10_1_1_2_1 = new JLabel("years and reap rewards in the form of Loyalty Bonus.");
		lblNewLabel_3_2_10_1_1_2_1.setBounds(689, 453, 457, 32);
		lblNewLabel_3_2_10_1_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_10_1_1_2_1);
		
		JLabel lblNewLabel_3_2_10_1_1_2_1_1 = new JLabel("The bonus can be used as an additional source");
		lblNewLabel_3_2_10_1_1_2_1_1.setBounds(689, 483, 457, 32);
		lblNewLabel_3_2_10_1_1_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_10_1_1_2_1_1);
		
		JLabel lblNewLabel_3_2_10_1_1_2_1_1_1 = new JLabel("of funds to boost your investment or simply to help");
		lblNewLabel_3_2_10_1_1_2_1_1_1.setBounds(689, 512, 457, 32);
		lblNewLabel_3_2_10_1_1_2_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_10_1_1_2_1_1_1);
		
		JLabel lblNewLabel_3_2_10_1_1_2_1_1_1_1 = new JLabel("you achieve your dreams faster.");
		lblNewLabel_3_2_10_1_1_2_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_10_1_1_2_1_1_1_1.setBounds(689, 544, 457, 32);
		contentPane.add(lblNewLabel_3_2_10_1_1_2_1_1_1_1);
	}
}
