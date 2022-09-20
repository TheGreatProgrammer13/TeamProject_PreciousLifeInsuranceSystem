package Precious_Life_Insurance_Management_System_Project;

import java.awt.Color;
import java.awt.Cursor;
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

public class HirayaBenefits extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HirayaBenefits frame = new HirayaBenefits();
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
	public HirayaBenefits() {
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
		lblGetAQuote_1.setBounds(841, 659, 305, 55);
		contentPane.add(lblGetAQuote_1);
		
		JLabel lblGetAQuote = new JLabel("Get a quote");
		lblGetAQuote.setForeground(new Color(242, 200, 71));
		lblGetAQuote.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblGetAQuote.setBounds(837, 659, 293, 55);
		contentPane.add(lblGetAQuote);
		
		JButton DollarNow = new JButton("");
		DollarNow.setIcon(new ImageIcon(HirayaBenefits.class.getResource("/images/NowButton1.png")));
		DollarNow.setForeground(Color.WHITE);
		DollarNow.setFont(new Font("Verdana", Font.BOLD, 54));
		DollarNow.setBackground(new Color(0, 64, 128));
		DollarNow.setBounds(866, 712, 290, 72);
		contentPane.add(DollarNow);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(144, 674, 226, 89);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 64, 128));
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblSerene = new JLabel("HIRAYA");
		lblSerene.setBounds(38, 34, 176, 44);
		lblSerene.setForeground(Color.WHITE);
		lblSerene.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_1_1_1.add(lblSerene);
		
		JLabel lblNewLabel = new JLabel("PRECIOUS LIFE");
		lblNewLabel.setBounds(38, 10, 183, 24);
		panel_1_1_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 108, 811);
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(0, 84, 168));
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(PLSerene.class.getResource("/images/LifeLogo1 (1).png")));
		lblNewLabel_2.setBounds(10, 157, 98, 86);
		panel.add(lblNewLabel_2);
		
		JButton backbuttonHiraya = new JButton("");
		backbuttonHiraya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					PLHiraya t = new PLHiraya();
					t.show();
					dispose();

				}
			}
		});
		backbuttonHiraya.setIcon(new ImageIcon(PLSerene.class.getResource("/images/backbutton.png")));
		backbuttonHiraya.setBorder(null);
		backbuttonHiraya.setBackground(new Color(0, 84, 168));
		backbuttonHiraya.setBounds(25, 710, 62, 55);
		panel.add(backbuttonHiraya);
		
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
		btnNewButton.setIcon(new ImageIcon(HirayaBenefits.class.getResource("/images/logoPng-MIDSIZE.png")));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 84, 168));
		btnNewButton.setBounds(10, 20, 98, 115);
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
		
		JLabel lblNewLabel_6_1 = new JLabel("New label");
		lblNewLabel_6_1.setIcon(new ImageIcon(HirayaBenefits.class.getResource("/images/HirayaPic3.png")));
		lblNewLabel_6_1.setBounds(-10, 651, 1166, 257);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_4 = new JLabel("● BENEFITS");
		lblNewLabel_4.setBounds(216, 30, 318, 72);
		lblNewLabel_4.setForeground(new Color(235, 200, 1));
		lblNewLabel_4.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 60));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("of PL");
		lblNewLabel_3.setForeground(new Color(235, 200, 1));
		lblNewLabel_3.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
		lblNewLabel_3.setBounds(537, 49, 58, 18);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("HIRAYA:");
		lblNewLabel_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
		lblNewLabel_5.setBounds(537, 72, 82, 18);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3_2 = new JLabel("Protect your loved ones' future with a");
		lblNewLabel_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(271, 129, 318, 32);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("life insurance payment of double the");
		lblNewLabel_3_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1.setBounds(271, 152, 457, 32);
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("plan's Face Amount and protection");
		lblNewLabel_3_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_2.setBounds(271, 178, 457, 32);
		contentPane.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_3_2_3 = new JLabel("until age 100 or maturity.");
		lblNewLabel_3_2_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3.setBounds(271, 204, 457, 32);
		contentPane.add(lblNewLabel_3_2_3);
		
		JLabel lblNewLabel_3_2_5 = new JLabel("Improve your plan by introducing riders");
		lblNewLabel_3_2_5.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5.setBounds(271, 255, 457, 32);
		contentPane.add(lblNewLabel_3_2_5);
		
		JLabel lblNewLabel_3_2_6 = new JLabel("or supplemental benefits that might");
		lblNewLabel_3_2_6.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_6.setBounds(271, 280, 429, 32);
		contentPane.add(lblNewLabel_3_2_6);
		
		JLabel lblNewLabel_3_2_6_1 = new JLabel("Life insurance coverage");
		lblNewLabel_3_2_6_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1.setBounds(271, 100, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1);
		
		JLabel lblNewLabel_3_2_7 = new JLabel("provide additional protection against");
		lblNewLabel_3_2_7.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_7.setBounds(271, 305, 457, 32);
		contentPane.add(lblNewLabel_3_2_7);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("unforeseen occurrences like accidents,");
		lblNewLabel_3_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_1.setBounds(271, 328, 457, 32);
		contentPane.add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_3_2_2_1 = new JLabel("illness, and disability.\r\n");
		lblNewLabel_3_2_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_2_1.setBounds(271, 350, 457, 32);
		contentPane.add(lblNewLabel_3_2_2_1);
		
		JLabel lblNewLabel_3_2_6_1_1 = new JLabel("Lifetime guaranteed cash benefits");
		lblNewLabel_3_2_6_1_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_1.setBounds(271, 398, 262, 32);
		contentPane.add(lblNewLabel_3_2_6_1_1);
		
		JLabel lblNewLabel_3_2_8 = new JLabel("Benefit from consistent lifetime");
		lblNewLabel_3_2_8.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_8.setBounds(271, 427, 396, 32);
		contentPane.add(lblNewLabel_3_2_8);
		
		JLabel lblNewLabel_3_2_1_2 = new JLabel("guaranteed cash benefits beginning");
		lblNewLabel_3_2_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_2.setBounds(271, 450, 396, 32);
		contentPane.add(lblNewLabel_3_2_1_2);
		
		JLabel lblNewLabel_3_2_9 = new JLabel("with the sixth year of your plan and");
		lblNewLabel_3_2_9.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_9.setBounds(272, 477, 396, 32);
		contentPane.add(lblNewLabel_3_2_9);
		
		JLabel lblNewLabel_3_2_1_3 = new JLabel("continuing every two years after that.");
		lblNewLabel_3_2_1_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_3.setBounds(272, 500, 396, 32);
		contentPane.add(lblNewLabel_3_2_1_3);
		
		JLabel lblNewLabel_3_2_6_1_3 = new JLabel("Living benefits");
		lblNewLabel_3_2_6_1_3.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_3.setBounds(613, 100, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1_3);
		
		JLabel lblNewLabel_3_2_10 = new JLabel("Gain dividends from your plan that you may use to pay future");
		lblNewLabel_3_2_10.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_10.setBounds(613, 129, 457, 32);
		contentPane.add(lblNewLabel_3_2_10);
		
		JLabel lblNewLabel_3_2_1_4 = new JLabel("premiums, increase your insurance coverage, leave with");
		lblNewLabel_3_2_1_4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_4.setBounds(613, 152, 457, 32);
		contentPane.add(lblNewLabel_3_2_1_4);
		
		JLabel lblNewLabel_3_2_2_2 = new JLabel("PreciousLife to accumulate, or cash out. Instead of borrowing\r\n");
		lblNewLabel_3_2_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_2_2.setBounds(613, 178, 494, 32);
		contentPane.add(lblNewLabel_3_2_2_2);
		
		JLabel lblNewLabel_3_2_3_1 = new JLabel("money from many lenders or selling valuable assets, you can");
		lblNewLabel_3_2_3_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1.setBounds(613, 204, 457, 32);
		contentPane.add(lblNewLabel_3_2_3_1);
		
		JLabel lblNewLabel_3_2_11 = new JLabel("receive cash in an emergency by borrowing against the cash value");
		lblNewLabel_3_2_11.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_11.setBounds(613, 231, 494, 32);
		contentPane.add(lblNewLabel_3_2_11);
		
		JLabel lblNewLabel_3_2_1_5 = new JLabel("of your policy.");
		lblNewLabel_3_2_1_5.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_5.setBounds(613, 254, 457, 32);
		contentPane.add(lblNewLabel_3_2_1_5);
		
		JLabel lblNewLabel_3_2_2_3 = new JLabel("Furthermore, if it is decided that the life insured is terminally sick, a");
		lblNewLabel_3_2_2_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_2_3.setBounds(613, 302, 457, 32);
		contentPane.add(lblNewLabel_3_2_2_3);
		
		JLabel lblNewLabel_3_2_3_2 = new JLabel("portion of your Face Amount may be paid in advance.");
		lblNewLabel_3_2_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_2.setBounds(613, 328, 457, 32);
		contentPane.add(lblNewLabel_3_2_3_2);
		
		JLabel lblNewLabel_3_2_6_1_5 = new JLabel("Manageable premium payments");
		lblNewLabel_3_2_6_1_5.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_5.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_5.setBounds(613, 383, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1_5);
		
		JLabel lblNewLabel_3_2_12 = new JLabel("Pay your premiums quarterly, semiannually, or annually. You can");
		lblNewLabel_3_2_12.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_12.setBounds(613, 412, 494, 32);
		contentPane.add(lblNewLabel_3_2_12);
		
		JLabel lblNewLabel_3_2_1_6 = new JLabel("also select a guaranteed payment duration of simply five or 10");
		lblNewLabel_3_2_1_6.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_6.setBounds(613, 435, 510, 32);
		contentPane.add(lblNewLabel_3_2_1_6);
		
		JLabel lblNewLabel_3_2_2_4 = new JLabel(" years.");
		lblNewLabel_3_2_2_4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_2_4.setBounds(613, 461, 69, 32);
		contentPane.add(lblNewLabel_3_2_2_4);
		
		JLabel lblNewLabel_3_2_4_1 = new JLabel("After paying the initial quarterly membership, monthly payments");
		lblNewLabel_3_2_4_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1.setBounds(613, 500, 478, 32);
		contentPane.add(lblNewLabel_3_2_4_1);
		
		JLabel lblNewLabel_3_2_5_1 = new JLabel("via auto-debit or auto-charge are also possible.");
		lblNewLabel_3_2_5_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1.setBounds(613, 526, 457, 32);
		contentPane.add(lblNewLabel_3_2_5_1);
		
		JLabel lblNewLabel_3_2_9_1 = new JLabel("You can also leave your financial");
		lblNewLabel_3_2_9_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_9_1.setBounds(271, 526, 396, 32);
		contentPane.add(lblNewLabel_3_2_9_1);
		
		JLabel lblNewLabel_3_2_1_3_1 = new JLabel("advantages with PreciousLife to");
		lblNewLabel_3_2_1_3_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_3_1.setBounds(271, 549, 396, 32);
		contentPane.add(lblNewLabel_3_2_1_3_1);
		
		JLabel lblNewLabel_3_2_9_1_1 = new JLabel("accumulate and be ready when you");
		lblNewLabel_3_2_9_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_9_1_1.setBounds(271, 570, 396, 32);
		contentPane.add(lblNewLabel_3_2_9_1_1);
		
		JLabel lblNewLabel_3_2_9_1_2 = new JLabel("need them.");
		lblNewLabel_3_2_9_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_9_1_2.setBounds(271, 596, 396, 32);
		contentPane.add(lblNewLabel_3_2_9_1_2);
	}
}
