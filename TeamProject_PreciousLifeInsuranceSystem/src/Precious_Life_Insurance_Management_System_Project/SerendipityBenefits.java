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
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.DebugGraphics;

public class SerendipityBenefits extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SerendipityBenefits frame = new SerendipityBenefits();
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
	public SerendipityBenefits() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 843);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(144, 674, 402, 89);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 64, 128));
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblSerene = new JLabel("SERENDIPITY");
		lblSerene.setBounds(38, 34, 306, 44);
		lblSerene.setForeground(Color.WHITE);
		lblSerene.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_1_1_1.add(lblSerene);
		
		JLabel lblNewLabel = new JLabel("PRECIOUS LIFE");
		lblNewLabel.setBounds(38, 10, 183, 24);
		panel_1_1_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		JLabel lblGetAQuote = new JLabel("Get a quote");
		lblGetAQuote.setForeground(Color.WHITE);
		lblGetAQuote.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblGetAQuote.setBounds(824, 674, 306, 44);
		contentPane.add(lblGetAQuote);
		
		JButton Serendipity = new JButton("Now");
		Serendipity.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		Serendipity.setForeground(new Color(0, 64, 128));
		Serendipity.setFont(new Font("Verdana", Font.BOLD, 47));
		Serendipity.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		Serendipity.setBackground(new Color(217, 217, 0));
		Serendipity.setBounds(885, 728, 172, 56);
		contentPane.add(Serendipity);
		
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
		
		JButton backbuttonSerendipity = new JButton("");
		backbuttonSerendipity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					PLSerendipity t = new PLSerendipity();
					t.show();
					dispose();

				}
			}
		});
		backbuttonSerendipity.setIcon(new ImageIcon(PLSerene.class.getResource("/images/backbutton.png")));
		backbuttonSerendipity.setBorder(null);
		backbuttonSerendipity.setBackground(new Color(0, 84, 168));
		backbuttonSerendipity.setBounds(25, 710, 62, 55);
		panel.add(backbuttonSerendipity);
		
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
		btnNewButton.setIcon(new ImageIcon(SerendipityBenefits.class.getResource("/images/logoPng-MIDSIZE.png")));
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
		
		JLabel lblNewLabel_4 = new JLabel("● BENEFITS");
		lblNewLabel_4.setBounds(216, 30, 318, 72);
		lblNewLabel_4.setForeground(new Color(235, 200, 1));
		lblNewLabel_4.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 60));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(0, 651, 1257, 160);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\xander\\Downloads\\SerenePic.png"));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_3 = new JLabel("of PL");
		lblNewLabel_3.setForeground(new Color(235, 200, 1));
		lblNewLabel_3.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
		lblNewLabel_3.setBounds(537, 49, 58, 18);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("SERENDIPITY:");
		lblNewLabel_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
		lblNewLabel_5.setBounds(537, 72, 130, 18);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3_2 = new JLabel("Secure your loved ones' future with guaranteed life");
		lblNewLabel_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(271, 129, 457, 32);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("insurance benefit equivalent to at least twice your ");
		lblNewLabel_3_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1.setBounds(271, 152, 457, 32);
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("plan’s Face Amount, which goes to your family in the");
		lblNewLabel_3_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_2.setBounds(271, 178, 457, 32);
		contentPane.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_3_2_3 = new JLabel("event of untimely demise. The funds may be used to");
		lblNewLabel_3_2_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3.setBounds(271, 204, 457, 32);
		contentPane.add(lblNewLabel_3_2_3);
		
		JLabel lblNewLabel_3_2_4 = new JLabel("support your family with day-to-day expenses and to");
		lblNewLabel_3_2_4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4.setBounds(271, 229, 396, 32);
		contentPane.add(lblNewLabel_3_2_4);
		
		JLabel lblNewLabel_3_2_5 = new JLabel("ensure that they may continue to attain the goals");
		lblNewLabel_3_2_5.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5.setBounds(271, 255, 457, 32);
		contentPane.add(lblNewLabel_3_2_5);
		
		JLabel lblNewLabel_3_2_6 = new JLabel("you have all set for yourselves.");
		lblNewLabel_3_2_6.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_6.setBounds(271, 280, 429, 32);
		contentPane.add(lblNewLabel_3_2_6);
		
		JLabel lblNewLabel_3_2_6_1 = new JLabel("Life insurance coverage");
		lblNewLabel_3_2_6_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1.setBounds(271, 100, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1);
		
		JLabel lblNewLabel_3_2_7 = new JLabel("You may also attach additional benefits or riders to");
		lblNewLabel_3_2_7.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_7.setBounds(271, 325, 457, 32);
		contentPane.add(lblNewLabel_3_2_7);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("stregthen your protection against unforeseen");
		lblNewLabel_3_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_1.setBounds(271, 348, 457, 32);
		contentPane.add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_3_2_2_1 = new JLabel("events such as accidents, sickness, and impairments");
		lblNewLabel_3_2_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_2_1.setBounds(271, 370, 457, 32);
		contentPane.add(lblNewLabel_3_2_2_1);
		
		JLabel lblNewLabel_3_2_6_1_1 = new JLabel("Flexible investment options");
		lblNewLabel_3_2_6_1_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_1.setBounds(271, 419, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1_1);
		
		JLabel lblNewLabel_3_2_8 = new JLabel("Choose from the available investment fund solutions");
		lblNewLabel_3_2_8.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_8.setBounds(271, 448, 396, 32);
		contentPane.add(lblNewLabel_3_2_8);
		
		JLabel lblNewLabel_3_2_1_2 = new JLabel("to fit your unique investing goals and risk tolerance");
		lblNewLabel_3_2_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_2.setBounds(271, 471, 396, 32);
		contentPane.add(lblNewLabel_3_2_1_2);
		
		JLabel lblNewLabel_3_2_6_1_2 = new JLabel("Professional fund management");
		lblNewLabel_3_2_6_1_2.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_2.setBounds(271, 513, 396, 32);
		contentPane.add(lblNewLabel_3_2_6_1_2);
		
		JLabel lblNewLabel_3_2_9 = new JLabel("Profit from PreciousLife's experience fund maangers'");
		lblNewLabel_3_2_9.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_9.setBounds(271, 542, 396, 32);
		contentPane.add(lblNewLabel_3_2_9);
		
		JLabel lblNewLabel_3_2_1_3 = new JLabel("loyalty incentive, which is not guaranteed, is ");
		lblNewLabel_3_2_1_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_3.setBounds(271, 565, 396, 32);
		contentPane.add(lblNewLabel_3_2_1_3);
		
		JLabel lblNewLabel_3_2_6_1_3 = new JLabel("Funds for future needs");
		lblNewLabel_3_2_6_1_3.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_3.setBounds(689, 100, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1_3);
		
		JLabel lblNewLabel_3_2_10 = new JLabel("Save money for your child's education, a");
		lblNewLabel_3_2_10.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_10.setBounds(689, 129, 457, 32);
		contentPane.add(lblNewLabel_3_2_10);
		
		JLabel lblNewLabel_3_2_1_4 = new JLabel("comfortable retirement, or an important life");
		lblNewLabel_3_2_1_4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_4.setBounds(689, 152, 457, 32);
		contentPane.add(lblNewLabel_3_2_1_4);
		
		JLabel lblNewLabel_3_2_2_2 = new JLabel("event. A partial money withdrawal allows you");
		lblNewLabel_3_2_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_2_2.setBounds(689, 178, 457, 32);
		contentPane.add(lblNewLabel_3_2_2_2);
		
		JLabel lblNewLabel_3_2_3_1 = new JLabel("to access funds in an emergency");
		lblNewLabel_3_2_3_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1.setBounds(689, 204, 457, 32);
		contentPane.add(lblNewLabel_3_2_3_1);
		
		JLabel lblNewLabel_3_2_6_1_4 = new JLabel("Manageable premium payment");
		lblNewLabel_3_2_6_1_4.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_4.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_4.setBounds(689, 246, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1_4);
		
		JLabel lblNewLabel_3_2_11 = new JLabel("Pay for minimum of five years, or opt to");
		lblNewLabel_3_2_11.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_11.setBounds(689, 275, 457, 32);
		contentPane.add(lblNewLabel_3_2_11);
		
		JLabel lblNewLabel_3_2_1_5 = new JLabel("increase the value of your fund by making");
		lblNewLabel_3_2_1_5.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_5.setBounds(689, 298, 457, 32);
		contentPane.add(lblNewLabel_3_2_1_5);
		
		JLabel lblNewLabel_3_2_2_3 = new JLabel("additional payments over and above your");
		lblNewLabel_3_2_2_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_2_3.setBounds(689, 324, 457, 32);
		contentPane.add(lblNewLabel_3_2_2_3);
		
		JLabel lblNewLabel_3_2_3_2 = new JLabel("regular premium");
		lblNewLabel_3_2_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_2.setBounds(689, 350, 457, 32);
		contentPane.add(lblNewLabel_3_2_3_2);
		
		JLabel lblNewLabel_3_2_6_1_5 = new JLabel("Loyalty bonus");
		lblNewLabel_3_2_6_1_5.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_5.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_5.setBounds(689, 390, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1_5);
		
		JLabel lblNewLabel_3_2_12 = new JLabel("Maintain the validity of your insurance for at");
		lblNewLabel_3_2_12.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_12.setBounds(689, 419, 457, 32);
		contentPane.add(lblNewLabel_3_2_12);
		
		JLabel lblNewLabel_3_2_1_6 = new JLabel("least 10 years to qualify for a loyalty bonus.");
		lblNewLabel_3_2_1_6.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_6.setBounds(689, 442, 457, 32);
		contentPane.add(lblNewLabel_3_2_1_6);
		
		JLabel lblNewLabel_3_2_2_4 = new JLabel("The bonus might be used as an additional");
		lblNewLabel_3_2_2_4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_2_4.setBounds(689, 468, 457, 32);
		contentPane.add(lblNewLabel_3_2_2_4);
		
		JLabel lblNewLabel_3_2_3_3 = new JLabel("source of funds to raise your investment or");
		lblNewLabel_3_2_3_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_3.setBounds(689, 494, 457, 32);
		contentPane.add(lblNewLabel_3_2_3_3);
		
		JLabel lblNewLabel_3_2_4_1 = new JLabel("just to accelerate the achievement of your");
		lblNewLabel_3_2_4_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1.setBounds(689, 519, 457, 32);
		contentPane.add(lblNewLabel_3_2_4_1);
		
		JLabel lblNewLabel_3_2_5_1 = new JLabel("ambitions. One of the criteria influencing the");
		lblNewLabel_3_2_5_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1.setBounds(689, 545, 457, 32);
		contentPane.add(lblNewLabel_3_2_5_1);
		
		JLabel lblNewLabel_3_2_6_2 = new JLabel("loyalty incentive, which is not guaranteed, is");
		lblNewLabel_3_2_6_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_6_2.setBounds(689, 570, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_2);
		
		JLabel lblNewLabel_3_2_6_2_1 = new JLabel("the fund's average monthly balance.");
		lblNewLabel_3_2_6_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_6_2_1.setBounds(689, 596, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_2_1);
	}
}
