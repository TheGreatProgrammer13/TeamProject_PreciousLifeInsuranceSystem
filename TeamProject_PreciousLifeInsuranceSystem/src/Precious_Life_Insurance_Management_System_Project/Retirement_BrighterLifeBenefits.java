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

public class Retirement_BrighterLifeBenefits extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Retirement_BrighterLifeBenefits frame = new Retirement_BrighterLifeBenefits();
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
	public Retirement_BrighterLifeBenefits() {
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
		
		JButton BrighterLifeBnft = new JButton("");
		BrighterLifeBnft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentFrame t = new PaymentFrame();
				t.show();
				dispose();
			}
		});
		BrighterLifeBnft.setIcon(new ImageIcon(Retirement_BrighterLifeBenefits.class.getResource("/images/NowButton1.png")));
		BrighterLifeBnft.setForeground(Color.WHITE);
		BrighterLifeBnft.setFont(new Font("Verdana", Font.BOLD, 54));
		BrighterLifeBnft.setBackground(new Color(0, 64, 128));
		BrighterLifeBnft.setBounds(866, 713, 290, 72);
		contentPane.add(BrighterLifeBnft);
		
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
					PLRetirement_BrigtherLife t = new PLRetirement_BrigtherLife();
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
		
		JLabel lblSerene = new JLabel("BRIGHTER LIFE");
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
		lblNewLabel_6.setIcon(new ImageIcon(Retirement_BrighterLifeBenefits.class.getResource("/images/RetirementPicture.png")));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3 = new JLabel("of PL");
		lblNewLabel_3.setBounds(510, 49, 58, 18);
		lblNewLabel_3.setForeground(new Color(235, 200, 1));
		lblNewLabel_3.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("BRIGHTER LIFE:");
		lblNewLabel_5.setBounds(510, 72, 206, 18);
		lblNewLabel_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3_2 = new JLabel("Secure your loved ones future with life insurance ");
		lblNewLabel_3_2.setBounds(271, 129, 396, 32);
		lblNewLabel_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("benefits worth twice the Face Amount of your plan, ");
		lblNewLabel_3_2_1.setBounds(271, 152, 457, 32);
		lblNewLabel_3_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("providing coverage until age 100 or maturity.");
		lblNewLabel_3_2_2.setBounds(271, 178, 378, 32);
		lblNewLabel_3_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_3_2_6_1 = new JLabel("Life insurance coverage");
		lblNewLabel_3_2_6_1.setBounds(271, 100, 429, 32);
		lblNewLabel_3_2_6_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3_2_6_1);
		
		JLabel lblNewLabel_3_2_7 = new JLabel("You may also attach additional benefits or riders to ");
		lblNewLabel_3_2_7.setBounds(271, 230, 408, 32);
		lblNewLabel_3_2_7.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_7);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("strengthen your protection against unforeseen events ");
		lblNewLabel_3_2_1_1.setBounds(271, 253, 408, 32);
		lblNewLabel_3_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_3_2_2_1 = new JLabel("such as accidents, sickness, and impairments.\r\n");
		lblNewLabel_3_2_2_1.setBounds(271, 275, 396, 32);
		lblNewLabel_3_2_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_2_1);
		
		JLabel lblNewLabel_3_2_6_1_1 = new JLabel("Lifetime guaranteed cash benefits");
		lblNewLabel_3_2_6_1_1.setBounds(271, 324, 263, 32);
		lblNewLabel_3_2_6_1_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3_2_6_1_1);
		
		JLabel lblNewLabel_3_2_8 = new JLabel("Enjoy regular guaranteed cash benefits throughout");
		lblNewLabel_3_2_8.setBounds(271, 353, 396, 32);
		lblNewLabel_3_2_8.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_8);
		
		JLabel lblNewLabel_3_2_1_2 = new JLabel("your lifetime, starting at the end of the sixth year");
		lblNewLabel_3_2_1_2.setBounds(271, 376, 396, 32);
		lblNewLabel_3_2_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1_2);
		
		JLabel lblNewLabel_3_2_6_1_3 = new JLabel("Living benefits");
		lblNewLabel_3_2_6_1_3.setBounds(689, 100, 429, 32);
		lblNewLabel_3_2_6_1_3.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3_2_6_1_3);
		
		JLabel lblNewLabel_3_2_10 = new JLabel("Earn dividends from your plan which you may use to ");
		lblNewLabel_3_2_10.setBounds(689, 129, 457, 32);
		lblNewLabel_3_2_10.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_10);
		
		JLabel lblNewLabel_3_2_1_4 = new JLabel("increase your insurance coverage, pay for future ");
		lblNewLabel_3_2_1_4.setBounds(689, 152, 482, 32);
		lblNewLabel_3_2_1_4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1_4);
		
		JLabel lblNewLabel_3_2_2_2 = new JLabel("premiums, leave with Sun Life to accumulate, or receive");
		lblNewLabel_3_2_2_2.setBounds(689, 178, 457, 32);
		lblNewLabel_3_2_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_2_2);
		
		JLabel lblNewLabel_3_2_3_1 = new JLabel("in cash. In case of emergencies, money also comes in ");
		lblNewLabel_3_2_3_1.setBounds(689, 204, 457, 32);
		lblNewLabel_3_2_3_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_3_1);
		
		JLabel lblNewLabel_3_2_11 = new JLabel("handy via a policy loan against your plan\u2019s cash value");
		lblNewLabel_3_2_11.setBounds(689, 230, 457, 32);
		lblNewLabel_3_2_11.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_11);
		
		JLabel lblNewLabel_3_2_1_5 = new JLabel("instead of borrowing from various financial institutions");
		lblNewLabel_3_2_1_5.setBounds(689, 253, 457, 32);
		lblNewLabel_3_2_1_5.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1_5);
		
		JLabel lblNewLabel_3_2_2_3 = new JLabel("instead of borrowing from various financial institutions");
		lblNewLabel_3_2_2_3.setBounds(689, 279, 457, 32);
		lblNewLabel_3_2_2_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_2_3);
		
		JLabel lblNewLabel_3_2_3_2 = new JLabel("A portion of your Face Amount may also be given in ");
		lblNewLabel_3_2_3_2.setBounds(689, 305, 457, 32);
		lblNewLabel_3_2_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_3_2);
		
		JLabel lblNewLabel_3_2_1_2_1 = new JLabel("of your plan and every two years afterwards. You may");
		lblNewLabel_3_2_1_2_1.setBounds(271, 401, 396, 32);
		lblNewLabel_3_2_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1_2_1);
		
		JLabel lblNewLabel_3_2_1_2_1_1 = new JLabel("also choose. You may also choose to leave your cash");
		lblNewLabel_3_2_1_2_1_1.setBounds(271, 431, 396, 32);
		lblNewLabel_3_2_1_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3_2_1_2_1_1);
		
		JLabel lblNewLabel_3_2_3_2_1 = new JLabel("advance if the life insured is diagnosed to be terminally ill.");
		lblNewLabel_3_2_3_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_2_1.setBounds(689, 331, 457, 32);
		contentPane.add(lblNewLabel_3_2_3_2_1);
		
		JLabel lblNewLabel_3_2_1_2_1_1_1 = new JLabel("benefits with Sun Life to accumulate and be available");
		lblNewLabel_3_2_1_2_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_2_1_1_1.setBounds(271, 462, 396, 32);
		contentPane.add(lblNewLabel_3_2_1_2_1_1_1);
		
		JLabel lblNewLabel_3_2_1_2_1_1_1_1 = new JLabel("for future needs.");
		lblNewLabel_3_2_1_2_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_2_1_1_1_1.setBounds(271, 489, 396, 32);
		contentPane.add(lblNewLabel_3_2_1_2_1_1_1_1);
	}
}
