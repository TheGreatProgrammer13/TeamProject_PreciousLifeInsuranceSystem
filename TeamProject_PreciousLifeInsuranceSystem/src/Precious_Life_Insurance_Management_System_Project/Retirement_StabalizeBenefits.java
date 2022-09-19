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

public class Retirement_StabalizeBenefits extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Retirement_StabalizeBenefits frame = new Retirement_StabalizeBenefits();
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
	public Retirement_StabalizeBenefits() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 843);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGetAQuote = new JLabel("Get a quote");
		lblGetAQuote.setBounds(824, 674, 306, 44);
		lblGetAQuote.setForeground(Color.WHITE);
		lblGetAQuote.setFont(new Font("Tahoma", Font.BOLD, 50));
		contentPane.add(lblGetAQuote);
		
		JButton btnNewButton_1 = new JButton("Now");
		btnNewButton_1.setBounds(885, 728, 168, 56);
		btnNewButton_1.setForeground(new Color(0, 64, 128));
		btnNewButton_1.setFont(new Font("Verdana", Font.BOLD, 47));
		btnNewButton_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		contentPane.add(btnNewButton_1);
		
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
					PLSerene t = new PLSerene();
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
		panel_1_1_1.setBounds(181, 674, 311, 89);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblSerene = new JLabel("STABALIZE");
		lblSerene.setBounds(38, 34, 254, 44);
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
		lblNewLabel_6.setIcon(new ImageIcon(Retirement_StabalizeBenefits.class.getResource("/images/RetirementPicture_Stabalize.png")));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3 = new JLabel("of PL");
		lblNewLabel_3.setBounds(510, 49, 58, 18);
		lblNewLabel_3.setForeground(new Color(235, 200, 1));
		lblNewLabel_3.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Stabalize");
		lblNewLabel_5.setBounds(510, 72, 112, 18);
		lblNewLabel_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3_2 = new JLabel("Accelerate protection with increasing life insurance ");
		lblNewLabel_3_2.setBounds(271, 129, 396, 32);
		lblNewLabel_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("coverage of up to 228% of the Face Amount starting");
		lblNewLabel_3_2_1.setBounds(271, 152, 457, 32);
		lblNewLabel_3_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("on the 9th policy year.\r\n");
		lblNewLabel_3_2_2.setBounds(271, 178, 378, 32);
		lblNewLabel_3_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_3_2_6_1 = new JLabel("Increasing Life Insurance Coverage");
		lblNewLabel_3_2_6_1.setBounds(271, 100, 429, 32);
		lblNewLabel_3_2_6_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3_2_6_1);
		
		JLabel lblNewLabel_3_2_7 = new JLabel("You may also attach additional benefits or riders to");
		lblNewLabel_3_2_7.setBounds(271, 230, 408, 32);
		lblNewLabel_3_2_7.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_7);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("strengthen your protection against unforeseen");
		lblNewLabel_3_2_1_1.setBounds(271, 253, 408, 32);
		lblNewLabel_3_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_3_2_2_1 = new JLabel("events such as accidents, sickness, and impairments.");
		lblNewLabel_3_2_2_1.setBounds(271, 275, 396, 32);
		lblNewLabel_3_2_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_2_1);
		
		JLabel lblNewLabel_3_2_6_1_1 = new JLabel("Increasing cash benefits");
		lblNewLabel_3_2_6_1_1.setBounds(271, 324, 263, 32);
		lblNewLabel_3_2_6_1_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3_2_6_1_1);
		
		JLabel lblNewLabel_3_2_8 = new JLabel("Accelerate your saving goals with guaranteed");
		lblNewLabel_3_2_8.setBounds(271, 353, 396, 32);
		lblNewLabel_3_2_8.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_8);
		
		JLabel lblNewLabel_3_2_1_2 = new JLabel("and increasing cash benefits starting at the end of");
		lblNewLabel_3_2_1_2.setBounds(271, 376, 396, 32);
		lblNewLabel_3_2_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1_2);
		
		JLabel lblNewLabel_3_2_6_1_2 = new JLabel("Guaranteed Maturity Benefit");
		lblNewLabel_3_2_6_1_2.setBounds(271, 494, 396, 32);
		lblNewLabel_3_2_6_1_2.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3_2_6_1_2);
		
		JLabel lblNewLabel_3_2_9 = new JLabel("Receive the lump sum guaranteed cash benefit");
		lblNewLabel_3_2_9.setBounds(271, 522, 396, 32);
		lblNewLabel_3_2_9.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_9);
		
		JLabel lblNewLabel_3_2_1_3 = new JLabel("equal to 102% of your Face Amount, at the end ");
		lblNewLabel_3_2_1_3.setBounds(271, 545, 396, 32);
		lblNewLabel_3_2_1_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1_3);
		
		JLabel lblNewLabel_3_2_6_1_3 = new JLabel("Special Bonus and Dividend Earnings");
		lblNewLabel_3_2_6_1_3.setBounds(689, 100, 429, 32);
		lblNewLabel_3_2_6_1_3.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3_2_6_1_3);
		
		JLabel lblNewLabel_3_2_10 = new JLabel("Be rewarded with a Special Paid-Up Bonus");
		lblNewLabel_3_2_10.setBounds(689, 129, 457, 32);
		lblNewLabel_3_2_10.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_10);
		
		JLabel lblNewLabel_3_2_1_4 = new JLabel("after eight years and dividend earnings onwards.");
		lblNewLabel_3_2_1_4.setBounds(689, 152, 482, 32);
		lblNewLabel_3_2_1_4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1_4);
		
		JLabel lblNewLabel_3_2_2_2 = new JLabel("You may choose to get these in cash or leave");
		lblNewLabel_3_2_2_2.setBounds(689, 178, 457, 32);
		lblNewLabel_3_2_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_2_2);
		
		JLabel lblNewLabel_3_2_3_1 = new JLabel("them with Sun Life to accumulate.");
		lblNewLabel_3_2_3_1.setBounds(689, 204, 457, 32);
		lblNewLabel_3_2_3_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_3_1);
		
		JLabel lblNewLabel_3_2_6_1_4 = new JLabel("Limited payment period");
		lblNewLabel_3_2_6_1_4.setBounds(689, 246, 429, 32);
		lblNewLabel_3_2_6_1_4.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_4.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3_2_6_1_4);
		
		JLabel lblNewLabel_3_2_11 = new JLabel("Pay your premiums for only 8 years, in annual,");
		lblNewLabel_3_2_11.setBounds(689, 275, 457, 32);
		lblNewLabel_3_2_11.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_11);
		
		JLabel lblNewLabel_3_2_1_5 = new JLabel("semi-annual, or quarterly term.");
		lblNewLabel_3_2_1_5.setBounds(689, 298, 457, 32);
		lblNewLabel_3_2_1_5.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1_5);
		
		JLabel lblNewLabel_3_2_2_3 = new JLabel("Monthly payment through Auto-Debit or Auto-Charge");
		lblNewLabel_3_2_2_3.setBounds(689, 324, 457, 32);
		lblNewLabel_3_2_2_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_2_3);
		
		JLabel lblNewLabel_3_2_3_2 = new JLabel("may also be arranged after payment of the initial");
		lblNewLabel_3_2_3_2.setBounds(689, 350, 457, 32);
		lblNewLabel_3_2_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_3_2);
		
		JLabel lblNewLabel_3_2_1_2_1 = new JLabel("the eighth policy year and every two years onwards");
		lblNewLabel_3_2_1_2_1.setBounds(271, 401, 396, 32);
		lblNewLabel_3_2_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1_2_1);
		
		JLabel lblNewLabel_3_2_1_2_1_1 = new JLabel("until your policy matures.");
		lblNewLabel_3_2_1_2_1_1.setBounds(271, 431, 396, 32);
		lblNewLabel_3_2_1_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1_2_1_1);
		
		JLabel lblNewLabel_3_2_1_3_1 = new JLabel("of your policy's 20th year.");
		lblNewLabel_3_2_1_3_1.setBounds(271, 570, 349, 32);
		lblNewLabel_3_2_1_3_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1_3_1);
		
		JLabel lblNewLabel_3_2_3_2_1 = new JLabel("quarterly premium.");
		lblNewLabel_3_2_3_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_2_1.setBounds(689, 376, 189, 32);
		contentPane.add(lblNewLabel_3_2_3_2_1);
	}

}
