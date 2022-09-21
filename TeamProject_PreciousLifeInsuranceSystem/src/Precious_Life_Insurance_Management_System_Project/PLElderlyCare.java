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
import javax.swing.UIManager;

public class PLElderlyCare extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PLElderlyCare frame = new PLElderlyCare();
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
	public PLElderlyCare() {
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
		lblGetAQuote_1.setBounds(841, 63, 305, 55);
		contentPane.add(lblGetAQuote_1);
		
		JLabel lblGetAQuote = new JLabel("Get a quote");
		lblGetAQuote.setForeground(new Color(242, 200, 71));
		lblGetAQuote.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblGetAQuote.setBounds(837, 63, 293, 55);
		contentPane.add(lblGetAQuote);
		
		JButton PLElderNow = new JButton("");
		PLElderNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentFrame t = new PaymentFrame();
				t.show();
				dispose();
			}
		});
		PLElderNow.setIcon(new ImageIcon(PLElderlyCare.class.getResource("/images/NowButton1.png")));
		PLElderNow.setForeground(Color.WHITE);
		PLElderNow.setFont(new Font("Verdana", Font.BOLD, 54));
		PLElderNow.setBackground(new Color(0, 64, 128));
		PLElderNow.setBounds(866, 116, 290, 72);
		contentPane.add(PLElderNow);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 84, 168));
		panel_1_1_1.setBounds(107, 150, 428, 89);
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblSerene = new JLabel("ELDERLY CARE");
		lblSerene.setBounds(96, 35, 318, 44);
		lblSerene.setForeground(Color.WHITE);
		lblSerene.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_1_1_1.add(lblSerene);
		
		JLabel lblNewLabel = new JLabel("PRECIOUS LIFE");
		lblNewLabel.setBounds(86, 10, 183, 24);
		panel_1_1_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(0, 84, 168));
		panel.setBounds(0, 0, 108, 806);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(PLWellBeing.class.getResource("/images/HealthLogo (1).png")));
		lblNewLabel_2.setBounds(10, 157, 98, 86);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					HealthInsurancePolicy t = new HealthInsurancePolicy();
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
				MainDashboard t = new MainDashboard();
				t.show();
				dispose();
			}
		});
		btnNewButton.setIcon(new ImageIcon(PLElderlyCare.class.getResource("/images/logoPng-MIDSIZE.png")));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 84, 168));
		btnNewButton.setBounds(10, 20, 98, 115);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(0, 64, 128));
		panel_1.setBounds(107, 0, 42, 838);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(new Color(0, 45, 105));
		panel_1_1.setBounds(148, 0, 42, 838);
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("PreciousLife ELDERLY CARE, \r\n");
		lblNewLabel_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
		lblNewLabel_3_1.setBounds(263, 290, 329, 32);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("BENEFITS");
		lblNewLabel_4.setForeground(new Color(235, 200, 1));
		lblNewLabel_4.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 60));
		lblNewLabel_4.setBounds(263, 482, 272, 72);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("SUITABLE FOR");
		lblNewLabel_4_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_4_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 46));
		lblNewLabel_4_1.setBounds(762, 487, 313, 72);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_1 = new JLabel("Prevention\r");
		lblNewLabel_3_2_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_1.setBounds(291, 565, 211, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_2 = new JLabel("Diagnosis, treatment and rehabilitation\r");
		lblNewLabel_3_2_1_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_2.setBounds(291, 595, 408, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_2);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3 = new JLabel("Special benefit\r");
		lblNewLabel_3_2_1_1_1_1_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_3.setBounds(291, 625, 272, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3);
		
		JLabel lblNewLabel_3_2_1_1_1_1_4 = new JLabel("Life insurance protection\r");
		lblNewLabel_3_2_1_1_1_1_4.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_4.setBounds(291, 658, 233, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_4);
		
		JLabel lblNewLabel_3_2_1_1_1_1_5 = new JLabel("Limited payment period\r");
		lblNewLabel_3_2_1_1_1_1_5.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_5.setBounds(291, 689, 272, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_5);
		
		JLabel lblNewLabel_3_2_1_1_1_1_5_1 = new JLabel("Living benefits");
		lblNewLabel_3_2_1_1_1_1_5_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_5_1.setBounds(291, 720, 132, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_5_1);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1_1_2.setBackground(new Color(0, 45, 105));
		panel_1_1_2.setBounds(229, 584, 12, 156);
		contentPane.add(panel_1_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("●");
		lblNewLabel_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(263, 575, 18, 13);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("●");
		lblNewLabel_5_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5_1.setBounds(263, 608, 18, 13);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("●");
		lblNewLabel_5_2.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5_2.setBounds(263, 638, 18, 13);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("●");
		lblNewLabel_5_3.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5_3.setBounds(263, 671, 18, 13);
		contentPane.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("●");
		lblNewLabel_5_4.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5_4.setBounds(263, 702, 18, 13);
		contentPane.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_5_5 = new JLabel("●");
		lblNewLabel_5_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5_5.setBounds(263, 733, 18, 13);
		contentPane.add(lblNewLabel_5_5);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("a protection and savings program, offers lifelong");
		lblNewLabel_3_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_3_1_1.setBounds(580, 290, 538, 32);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("double life insurance. It also provides extra financial benefits that you may use ");
		lblNewLabel_3_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_3_1_2.setBounds(265, 324, 852, 32);
		contentPane.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("to increase your savings and pay for prospective objectives or milestones.");
		lblNewLabel_3_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_3_1_2_1.setBounds(291, 355, 827, 32);
		contentPane.add(lblNewLabel_3_1_2_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("New label");
		lblNewLabel_6_1.setIcon(new ImageIcon(PLElderlyCare.class.getResource("/images/HirayaPic3.png")));
		lblNewLabel_6_1.setBounds(0, 0, 1166, 257);
		contentPane.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_8 = new JLabel("Living a legacy");
		lblNewLabel_8.setForeground(new Color(0, 0, 128));
		lblNewLabel_8.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		lblNewLabel_8.setBounds(782, 708, 123, 32);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(PLElderlyCare.class.getResource("/images/suitablePicture2.png")));
		lblNewLabel_7.setBounds(772, 570, 292, 131);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8_1 = new JLabel("Preparing");
		lblNewLabel_8_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		lblNewLabel_8_1.setBounds(957, 713, 86, 32);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Ahead");
		lblNewLabel_8_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		lblNewLabel_8_1_1.setBounds(967, 744, 57, 32);
		contentPane.add(lblNewLabel_8_1_1);
		
		JButton clickInfoElderly = new JButton("Click here for more info!");
		clickInfoElderly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ElderlyCareBenefits t = new ElderlyCareBenefits();
				t.show();
				dispose();
			}
		});
		clickInfoElderly.setForeground(Color.GRAY);
		clickInfoElderly.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 19));
		clickInfoElderly.setBorder(UIManager.getBorder("TableHeader.cellBorder"));
		clickInfoElderly.setBackground(Color.WHITE);
		clickInfoElderly.setBounds(219, 458, 265, 23);
		contentPane.add(clickInfoElderly);
	}
}