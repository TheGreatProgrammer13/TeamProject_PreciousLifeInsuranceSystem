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


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ElderlyCareBenefits extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElderlyCareBenefits frame = new ElderlyCareBenefits();
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
	public ElderlyCareBenefits() {
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
		lblGetAQuote_1.setBounds(841, 648, 305, 55);
		contentPane.add(lblGetAQuote_1);
		
		JLabel lblGetAQuote = new JLabel("Get a quote");
		lblGetAQuote.setForeground(new Color(242, 200, 71));
		lblGetAQuote.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblGetAQuote.setBounds(837, 648, 293, 55);
		contentPane.add(lblGetAQuote);
		
		JButton ElderBNow = new JButton("");
		ElderBNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentFrame t = new PaymentFrame();
				t.show();
				dispose();
			}
		});
		ElderBNow.setIcon(new ImageIcon(ElderlyCareBenefits.class.getResource("/images/NowButton1.png")));
		ElderBNow.setForeground(Color.WHITE);
		ElderBNow.setFont(new Font("Verdana", Font.BOLD, 54));
		ElderBNow.setBackground(new Color(0, 64, 128));
		ElderBNow.setBounds(866, 701, 290, 72);
		contentPane.add(ElderBNow);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(144, 674, 390, 89);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 64, 128));
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblSerene = new JLabel("ELDERLY CARE");
		lblSerene.setBounds(38, 34, 342, 44);
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
					PLElderlyCare t = new PLElderlyCare();
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
		btnNewButton.setIcon(new ImageIcon(ElderlyCareBenefits.class.getResource("/images/logoPng-MIDSIZE.png")));
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
		lblNewLabel_6_1.setIcon(new ImageIcon(ElderlyCareBenefits.class.getResource("/images/HirayaPic3.png")));
		lblNewLabel_6_1.setBounds(-10, 616, 1166, 190);
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
		
		JLabel lblNewLabel_5 = new JLabel("ELDERLY CARE");
		lblNewLabel_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
		lblNewLabel_5.setBounds(537, 72, 163, 18);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3_2_6_1_2_1 = new JLabel("Simplified issue offer (SIO)");
		lblNewLabel_3_2_6_1_2_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_2_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_2_1.setBounds(271, 454, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1_2_1);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2 = new JLabel("Ready and secure To alleviate the financial burden ");
		lblNewLabel_3_2_3_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2.setBounds(271, 477, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("New label");
		lblNewLabel_6_1_1.setBounds(-20, 616, 1166, 257);
		contentPane.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_3_2_3_2_1_1_1_1 = new JLabel("and other treatment and recovery-related expenses.");
		lblNewLabel_3_2_3_2_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_2_1_1_1_1.setBounds(271, 424, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_2_1_1_1_1);
		
		JLabel lblNewLabel_3_2_6_1_1_2_1 = new JLabel("Prevention");
		lblNewLabel_3_2_6_1_1_2_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_1_2_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_1_2_1.setBounds(271, 128, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1_1_2_1);
		
		JLabel lblNewLabel_3_2_4_1_2 = new JLabel("Treatment is superior to prevention. With PL Elderly ");
		lblNewLabel_3_2_4_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_2.setBounds(271, 150, 609, 32);
		contentPane.add(lblNewLabel_3_2_4_1_2);
		
		JLabel lblNewLabel_3_2_1_1_1_2 = new JLabel("Care, you may join in PreciousLife's wellness program, ");
		lblNewLabel_3_2_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_1_1_2.setBounds(271, 170, 574, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_2);
		
		JLabel lblNewLabel_3_2_2_1_1_2 = new JLabel("which offers preventative care services, health benefits,");
		lblNewLabel_3_2_2_1_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_2_1_1_2.setBounds(271, 192, 625, 32);
		contentPane.add(lblNewLabel_3_2_2_1_1_2);
		
		JLabel lblNewLabel_3_2_3_2_1_2 = new JLabel("and unique advantages.\r");
		lblNewLabel_3_2_3_2_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_2_1_2.setBounds(271, 212, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_2_1_2);
		
		JLabel lblNewLabel_3_2_6_1_1_1_1_1 = new JLabel("Diagnosis, treatment and rehabilitation\r");
		lblNewLabel_3_2_6_1_1_1_1_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_1_1_1_1.setBounds(271, 255, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_4_1_1_1 = new JLabel("When you need it the most, you need protection. If you ");
		lblNewLabel_3_2_4_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_1_1.setBounds(271, 283, 609, 32);
		contentPane.add(lblNewLabel_3_2_4_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_2 = new JLabel("are diagnosed with one of the seventeen (17) common ");
		lblNewLabel_3_2_1_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_1_1_1_2.setBounds(271, 303, 574, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_2);
		
		JLabel lblNewLabel_3_2_2_1_1_1_2 = new JLabel("advanced-age critical medical illnesses covered by PL ");
		lblNewLabel_3_2_2_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_2_1_1_1_2.setBounds(271, 325, 625, 32);
		contentPane.add(lblNewLabel_3_2_2_1_1_1_2);
		
		JLabel lblNewLabel_3_2_3_2_1_1_2 = new JLabel("Elderly Care, you will receive a substantial cash benefit");
		lblNewLabel_3_2_3_2_1_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_2_1_1_2.setBounds(271, 346, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_2_1_1_2);
		
		JLabel lblNewLabel_3_2_1_1_1_1_1_1 = new JLabel("equal to 150% of the plan's Face Amount. This can help ");
		lblNewLabel_3_2_1_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_1_1_1_1_1.setBounds(271, 382, 574, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_2_1_1_1_1_1 = new JLabel("you recoup the money you spent on diagnostic testing ");
		lblNewLabel_3_2_2_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_2_1_1_1_1_1.setBounds(271, 404, 625, 32);
		contentPane.add(lblNewLabel_3_2_2_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2_2 = new JLabel("associated with any of the four (4) specific qualified ");
		lblNewLabel_3_2_3_1_1_1_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2_2.setBounds(271, 499, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2_2);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2_1_1 = new JLabel("surgeries/conditions, PL Elderly Care provides an ");
		lblNewLabel_3_2_3_1_1_1_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2_1_1.setBounds(271, 522, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2_1_1);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2_2_1 = new JLabel("additional one-time cash benefit equal to 5% of the ");
		lblNewLabel_3_2_3_1_1_1_2_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2_2_1.setBounds(271, 541, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2_2_1);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2_2_1_1 = new JLabel("Face Amount.\r");
		lblNewLabel_3_2_3_1_1_1_2_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2_2_1_1.setBounds(271, 564, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2_2_1_1);
		
		JLabel lblNewLabel_3_2_6_1_2_1_1 = new JLabel("Life insurance protection\r");
		lblNewLabel_3_2_6_1_2_1_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_2_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_2_1_1.setBounds(718, 128, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1_2_1_1);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2_1 = new JLabel("Plan for your loved ones' future while you are ");
		lblNewLabel_3_2_3_1_1_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2_1.setBounds(718, 150, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2_1);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2_2_2 = new JLabel("in good health! PL Elderly Care provides life ");
		lblNewLabel_3_2_3_1_1_1_2_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2_2_2.setBounds(718, 170, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2_2_2);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2_1_1_1 = new JLabel("insurance coverage equal to 150% of the plan's ");
		lblNewLabel_3_2_3_1_1_1_2_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2_1_1_1.setBounds(718, 192, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2_1_1_1);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2_2_1_2 = new JLabel("face value until the age of 100, presuming no ");
		lblNewLabel_3_2_3_1_1_1_2_2_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2_2_1_2.setBounds(718, 212, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2_2_1_2);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2_2_1_1_1 = new JLabel("critical illness benefit has been paid.\r");
		lblNewLabel_3_2_3_1_1_1_2_2_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2_2_1_1_1.setBounds(718, 234, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2_2_1_1_1);
		
		JLabel lblNewLabel_3_2_6_1_2_1_1_1 = new JLabel("Limited payment period\r");
		lblNewLabel_3_2_6_1_2_1_1_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_2_1_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_2_1_1_1.setBounds(718, 282, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1_2_1_1_1);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2_1_2 = new JLabel("You can pay for PL Elderly Care in three, five, or ");
		lblNewLabel_3_2_3_1_1_1_2_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2_1_2.setBounds(718, 304, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2_1_2);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2_2_2_1 = new JLabel("ten annual installments, each of which will ");
		lblNewLabel_3_2_3_1_1_1_2_2_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2_2_2_1.setBounds(718, 324, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2_2_2_1);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2_1_1_1_1 = new JLabel("cost the same amount. You can pay yearly, ");
		lblNewLabel_3_2_3_1_1_1_2_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2_1_1_1_1.setBounds(718, 346, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2_1_1_1_1);
		
		JLabel lblNewLabel_3_2_3_2_1_1_2_1 = new JLabel("semi-annually, quarterly, or monthly.\r");
		lblNewLabel_3_2_3_2_1_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_2_1_1_2_1.setBounds(718, 367, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_2_1_1_2_1);
		
		JLabel lblNewLabel_3_2_6_1_2_1_1_2 = new JLabel("Living benefits\r");
		lblNewLabel_3_2_6_1_2_1_1_2.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_2_1_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_2_1_1_2.setBounds(718, 416, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1_2_1_1_2);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2_1_3 = new JLabel("Earn dividends from your plan that you may ");
		lblNewLabel_3_2_3_1_1_1_2_1_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2_1_3.setBounds(718, 438, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2_1_3);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2_2_2_2 = new JLabel("use to pay future premiums, leave with ");
		lblNewLabel_3_2_3_1_1_1_2_2_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2_2_2_2.setBounds(718, 458, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2_2_2_2);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2_2_1_2_1 = new JLabel("the event of an emergency, the cash value of");
		lblNewLabel_3_2_3_1_1_1_2_2_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2_2_1_2_1.setBounds(718, 500, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2_2_1_2_1);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2_1_1_1_2 = new JLabel("PreciousLife to accumulate, or get in cash. In ");
		lblNewLabel_3_2_3_1_1_1_2_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2_1_1_1_2.setBounds(718, 480, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2_1_1_1_2);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2_2_1_1_1_1 = new JLabel("your plan is also accessible for borrowing.");
		lblNewLabel_3_2_3_1_1_1_2_2_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2_2_1_1_1_1.setBounds(718, 522, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2_2_1_1_1_1);
	}
}