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

public class PLBrighterLife extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PLBrighterLife frame = new PLBrighterLife();
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
	public PLBrighterLife() {
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
		lblGetAQuote_1.setBounds(837, 79, 317, 55);
		contentPane.add(lblGetAQuote_1);
		
		JLabel lblGetAQuote = new JLabel("Get a quote");
		lblGetAQuote.setForeground(new Color(242, 200, 71));
		lblGetAQuote.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblGetAQuote.setBounds(833, 79, 302, 55);
		contentPane.add(lblGetAQuote);
		
		JButton PLBL = new JButton("");
		PLBL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentFrame t = new PaymentFrame();
				t.show();
				dispose();
			}
		});
		PLBL.setIcon(new ImageIcon(PLBrighterLife.class.getResource("/images/NowButton1.png")));
		PLBL.setForeground(Color.WHITE);
		PLBL.setFont(new Font("Verdana", Font.BOLD, 54));
		PLBL.setBackground(new Color(0, 64, 128));
		PLBL.setBounds(862, 132, 292, 72);
		contentPane.add(PLBL);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(148, 150, 402, 89);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 64, 128));
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblSerene = new JLabel("BRIGHTER LIFE");
		lblSerene.setBounds(60, 35, 365, 44);
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
		btnNewButton_4.setIcon(new ImageIcon(PLBrighterLife.class.getResource("/images/backbutton.png")));
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(new Color(0, 84, 168));
		btnNewButton_4.setBounds(21, 670, 62, 55);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("");
		btnNewButton_4_1.setIcon(new ImageIcon(PLBrighterLife.class.getResource("/images/EducationLogo.png")));
		btnNewButton_4_1.setBorder(null);
		btnNewButton_4_1.setBackground(new Color(0, 84, 168));
		btnNewButton_4_1.setBounds(10, 144, 97, 93);
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					EducationInsurancePolicy t = new EducationInsurancePolicy();
					t.show();
					dispose();

				}
			}
		});
		panel.add(btnNewButton_4_1);
		
		JButton btnNewButton_4_1_1 = new JButton("");
		btnNewButton_4_1_1.setIcon(new ImageIcon(PLBrighterLife.class.getResource("/images/logoPng-MIDSIZE.png")));
		btnNewButton_4_1_1.setBorder(null);
		btnNewButton_4_1_1.setBackground(new Color(0, 84, 168));
		btnNewButton_4_1_1.setBounds(9, 11, 98, 122);
		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					Dashboard t = new Dashboard();
					t.show();
					dispose();

				}
			}
		});
		panel.add(btnNewButton_4_1_1);
		
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
		
		JLabel lblNewLabel_3 = new JLabel("is a protection and savings plan that offers ");
		lblNewLabel_3.setBounds(620, 311, 460, 32);
		lblNewLabel_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("PreciousLife Brighter Life\r\n");
		lblNewLabel_3_1.setBounds(266, 311, 280, 32);
		lblNewLabel_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("lifetime double life insurance coverage. Additionally, it provides financial");
		lblNewLabel_3_2.setBounds(277, 342, 810, 32);
		lblNewLabel_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("benefits that you can use to supplement the cost of your child's education.\r\n\n\r\n");
		lblNewLabel_3_2_1.setBounds(275, 368, 805, 32);
		lblNewLabel_3_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3_2_1);
		
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
		
		JLabel lblNewLabel_3_2_1_1_1_1_1 = new JLabel("Life insurance coverage");
		lblNewLabel_3_2_1_1_1_1_1.setBounds(291, 565, 211, 32);
		lblNewLabel_3_2_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_2 = new JLabel("Lifetime guaranteed cash benefits");
		lblNewLabel_3_2_1_1_1_1_2.setBounds(291, 595, 303, 32);
		lblNewLabel_3_2_1_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_2);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3 = new JLabel("Living Benefits");
		lblNewLabel_3_2_1_1_1_1_3.setBounds(291, 625, 272, 32);
		lblNewLabel_3_2_1_1_1_1_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3);
		
		JLabel lblNewLabel_3_2_1_1_1_1_4 = new JLabel("Manageable premium payment");
		lblNewLabel_3_2_1_1_1_1_4.setBounds(291, 658, 211, 32);
		lblNewLabel_3_2_1_1_1_1_4.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_4);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBounds(230, 554, 12, 156);
		panel_1_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1_1_2.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("●");
		lblNewLabel_5.setBounds(263, 575, 18, 13);
		lblNewLabel_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("●");
		lblNewLabel_5_1.setBounds(263, 608, 18, 13);
		lblNewLabel_5_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("●");
		lblNewLabel_5_2.setBounds(263, 638, 18, 13);
		lblNewLabel_5_2.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("●");
		lblNewLabel_5_3.setBounds(263, 671, 18, 13);
		lblNewLabel_5_3.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Prime");
		lblNewLabel_3_1_1.setForeground(new Color(255, 204, 51));
		lblNewLabel_3_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
		lblNewLabel_3_1_1.setBounds(549, 311, 65, 32);
		contentPane.add(lblNewLabel_3_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(235, 200, 1));
		panel_2.setBounds(389, 238, 95, 32);
		contentPane.add(panel_2);
		
		JLabel lblPrime = new JLabel("PRIME\r\n");
		lblPrime.setForeground(Color.WHITE);
		lblPrime.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPrime.setBounds(18, 0, 69, 32);
		panel_2.add(lblPrime);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(PLBrighterLife.class.getResource("/images/Ellipse 17.png")));
		lblNewLabel_7.setBounds(795, 546, 108, 111);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3_1 = new JLabel("Moving Up");
		lblNewLabel_3_2_1_1_1_1_3_1.setForeground(new Color(0, 51, 102));
		lblNewLabel_3_2_1_1_1_1_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_3_1.setBounds(795, 658, 117, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3_1_1 = new JLabel("Moving Up");
		lblNewLabel_3_2_1_1_1_1_3_1_1.setForeground(new Color(0, 51, 102));
		lblNewLabel_3_2_1_1_1_1_3_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_3_1_1.setBounds(795, 658, 117, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3_1_2 = new JLabel("Preparing ");
		lblNewLabel_3_2_1_1_1_1_3_1_2.setForeground(new Color(0, 51, 102));
		lblNewLabel_3_2_1_1_1_1_3_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_3_1_2.setBounds(933, 658, 95, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3_1_2);
		
		JLabel lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.setIcon(new ImageIcon(PLBrighterLife.class.getResource("/images/Ellipse 18.png")));
		lblNewLabel_7_1.setBounds(923, 546, 108, 111);
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3_1_2_1 = new JLabel("Ahead\r\n");
		lblNewLabel_3_2_1_1_1_1_3_1_2_1.setForeground(new Color(0, 51, 102));
		lblNewLabel_3_2_1_1_1_1_3_1_2_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_3_1_2_1.setBounds(943, 686, 65, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3_1_2_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(PLBrighterLife.class.getResource("/images/brightbg.png")));
		lblNewLabel_6.setBounds(189, 0, 965, 265);
		contentPane.add(lblNewLabel_6);
		
		JButton BLbenefits = new JButton("Click here for more info!");
		BLbenefits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BrighterLifeBENEFITS t = new BrighterLifeBENEFITS();
				t.show();
				dispose();
			}
		});
		BLbenefits.setForeground(Color.GRAY);
		BLbenefits.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 19));
		BLbenefits.setBorder(UIManager.getBorder("TableHeader.cellBorder"));
		BLbenefits.setBackground(Color.WHITE);
		BLbenefits.setBounds(230, 455, 260, 23);
		contentPane.add(BLbenefits);
	}
}
