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

public class GuaranteeBenefits extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PLGuarantee frame = new PLGuarantee();
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
	public GuaranteeBenefits() {
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
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(144, 674, 328, 89);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 64, 128));
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblSerene = new JLabel("GUARANTEE");
		lblSerene.setBounds(38, 34, 294, 44);
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
		
		JButton backbuttonG = new JButton("");
		backbuttonG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					HealthInsurancePolicy t = new HealthInsurancePolicy();
					t.show();
					dispose();

				}
			}
		});
		backbuttonG.setIcon(new ImageIcon(PLSerene.class.getResource("/images/backbutton.png")));
		backbuttonG.setBorder(null);
		backbuttonG.setBackground(new Color(0, 84, 168));
		backbuttonG.setBounds(25, 710, 62, 55);
		panel.add(backbuttonG);
		
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
		btnNewButton.setIcon(new ImageIcon(GuaranteeBenefits.class.getResource("/images/logoPng-MIDSIZE.png")));
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
		
		JLabel lblNewLabel_3 = new JLabel("of PL");
		lblNewLabel_3.setForeground(new Color(235, 200, 1));
		lblNewLabel_3.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
		lblNewLabel_3.setBounds(537, 49, 58, 18);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("GUARANTEE:");
		lblNewLabel_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
		lblNewLabel_5.setBounds(537, 72, 117, 18);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3_2_6_1_1 = new JLabel("Critical illness coverage");
		lblNewLabel_3_2_6_1_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_1.setBounds(226, 458, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1_1);
		
		JLabel lblNewLabel_3_2_6_1_2_1 = new JLabel("Critical illness coverage");
		lblNewLabel_3_2_6_1_2_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_2_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_2_1.setBounds(701, 521, 228, 32);
		contentPane.add(lblNewLabel_3_2_6_1_2_1);
		
		JLabel lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_1 = new JLabel("33.");
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_1.setBounds(701, 546, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_1_1 = new JLabel("34.");
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_1_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_1_1.setBounds(701, 571, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_1_1_1 = new JLabel("35.");
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_1_1_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_1_1_1.setBounds(701, 595, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_5_1_1_3_1_1 = new JLabel("Major Organ Transplant");
		lblNewLabel_3_2_5_1_1_3_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_1_1.setBounds(733, 546, 237, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_1_1);
		
		JLabel lblNewLabel_3_2_5_1_1_3_1_2 = new JLabel("Coronary Artery Bypass Surgery");
		lblNewLabel_3_2_5_1_1_3_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_1_2.setBounds(733, 571, 237, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_1_2);
		
		JLabel lblNewLabel_3_2_5_1_1_3_1_3 = new JLabel("Surgery for Disease of the Aorta (Aortic Surgery)\r");
		lblNewLabel_3_2_5_1_1_3_1_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_1_3.setBounds(733, 595, 361, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_1_3);
		
		JLabel lblNewLabel_3_2_4_2 = new JLabel("17.");
		lblNewLabel_3_2_4_2.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_2.setBounds(901, 124, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_2);
		
		JLabel lblNewLabel_3_2_4_1_9 = new JLabel("18.");
		lblNewLabel_3_2_4_1_9.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_9.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_9.setBounds(901, 149, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_9);
		
		JLabel lblNewLabel_3_2_4_1_1_1 = new JLabel("19.");
		lblNewLabel_3_2_4_1_1_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_1_1.setBounds(901, 175, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_1_1);
		
		JLabel lblNewLabel_3_2_4_1_2_1 = new JLabel("20.");
		lblNewLabel_3_2_4_1_2_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_2_1.setBounds(901, 199, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_2_1);
		
		JLabel lblNewLabel_3_2_4_1_3_1 = new JLabel("21.");
		lblNewLabel_3_2_4_1_3_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_3_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_3_1.setBounds(901, 224, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_3_1);
		
		JLabel lblNewLabel_3_2_4_1_4_1 = new JLabel("22.");
		lblNewLabel_3_2_4_1_4_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_4_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_4_1.setBounds(901, 248, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_4_1);
		
		JLabel lblNewLabel_3_2_4_1_5_1 = new JLabel("23.");
		lblNewLabel_3_2_4_1_5_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_5_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_5_1.setBounds(901, 271, 28, 32);
		contentPane.add(lblNewLabel_3_2_4_1_5_1);
		
		JLabel lblNewLabel_3_2_4_1_6_1 = new JLabel("24");
		lblNewLabel_3_2_4_1_6_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_6_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_6_1.setBounds(901, 296, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_6_1);
		
		JLabel lblNewLabel_3_2_4_1_7_1 = new JLabel("25.");
		lblNewLabel_3_2_4_1_7_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_7_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_7_1.setBounds(901, 320, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_7_1);
		
		JLabel lblNewLabel_3_2_4_1_8_2 = new JLabel("26.");
		lblNewLabel_3_2_4_1_8_2.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_8_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_8_2.setBounds(901, 343, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_8_2);
		
		JLabel lblNewLabel_3_2_4_1_8_1_2 = new JLabel("27.");
		lblNewLabel_3_2_4_1_8_1_2.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_8_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_8_1_2.setBounds(901, 369, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_8_1_2);
		
		JLabel lblNewLabel_3_2_4_1_8_1_1_2 = new JLabel("28.");
		lblNewLabel_3_2_4_1_8_1_1_2.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_8_1_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_8_1_1_2.setBounds(901, 393, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_8_1_1_2);
		
		JLabel lblNewLabel_3_2_5_1_3 = new JLabel("Stroke");
		lblNewLabel_3_2_5_1_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_3.setBounds(985, 369, 58, 32);
		contentPane.add(lblNewLabel_3_2_5_1_3);
		
		JLabel lblNewLabel_3_2_5_1_1_5 = new JLabel("Cancer\r");
		lblNewLabel_3_2_5_1_1_5.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_5.setBounds(985, 393, 58, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_5);
		
		JLabel lblNewLabel_3_2_6_1_2_2 = new JLabel("Critical illness coverage");
		lblNewLabel_3_2_6_1_2_2.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_2_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_2_2.setBounds(624, 100, 181, 32);
		contentPane.add(lblNewLabel_3_2_6_1_2_2);
		
		JLabel lblNewLabel_3_2_4_3 = new JLabel("1.\r\n");
		lblNewLabel_3_2_4_3.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_3.setBounds(624, 124, 13, 32);
		contentPane.add(lblNewLabel_3_2_4_3);
		
		JLabel lblNewLabel_3_2_5_4 = new JLabel("Heart Attack\r");
		lblNewLabel_3_2_5_4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_4.setBounds(645, 124, 117, 32);
		contentPane.add(lblNewLabel_3_2_5_4);
		
		JLabel lblNewLabel_3_2_4_1_10 = new JLabel("2.\r\n");
		lblNewLabel_3_2_4_1_10.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_10.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_10.setBounds(624, 149, 13, 32);
		contentPane.add(lblNewLabel_3_2_4_1_10);
		
		JLabel lblNewLabel_3_2_5_1_4 = new JLabel("Stroke");
		lblNewLabel_3_2_5_1_4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_4.setBounds(645, 149, 58, 32);
		contentPane.add(lblNewLabel_3_2_5_1_4);
		
		JLabel lblNewLabel_3_2_4_1_1_2 = new JLabel("3.\r\n");
		lblNewLabel_3_2_4_1_1_2.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_1_2.setBounds(624, 174, 13, 32);
		contentPane.add(lblNewLabel_3_2_4_1_1_2);
		
		JLabel lblNewLabel_3_2_5_1_1_6 = new JLabel("Cancer\r");
		lblNewLabel_3_2_5_1_1_6.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_6.setBounds(645, 174, 58, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_6);
		
		JLabel lblNewLabel_3_2_4_1_2_2 = new JLabel("4.\r\n");
		lblNewLabel_3_2_4_1_2_2.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_2_2.setBounds(624, 199, 13, 32);
		contentPane.add(lblNewLabel_3_2_4_1_2_2);
		
		JLabel lblNewLabel_3_2_5_1_1_1_3 = new JLabel("Kidney Failure");
		lblNewLabel_3_2_5_1_1_1_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_1_3.setBounds(645, 199, 117, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_1_3);
		
		JLabel lblNewLabel_3_2_4_1_3_2 = new JLabel("5.\r\n");
		lblNewLabel_3_2_4_1_3_2.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_3_2.setBounds(624, 224, 13, 32);
		contentPane.add(lblNewLabel_3_2_4_1_3_2);
		
		JLabel lblNewLabel_3_2_5_1_1_2_3 = new JLabel("Dissecting Aortic Aneurysm");
		lblNewLabel_3_2_5_1_1_2_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_2_3.setBounds(645, 224, 207, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_2_3);
		
		JLabel lblNewLabel_3_2_4_1_4_2 = new JLabel("6.\r\n");
		lblNewLabel_3_2_4_1_4_2.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_4_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_4_2.setBounds(624, 248, 13, 32);
		contentPane.add(lblNewLabel_3_2_4_1_4_2);
		
		JLabel lblNewLabel_3_2_5_1_1_3_7 = new JLabel("End Stage Lung Disease\r");
		lblNewLabel_3_2_5_1_1_3_7.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_7.setBounds(645, 248, 176, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_7);
		
		JLabel lblNewLabel_3_2_4_1_5_2 = new JLabel("7.\r\n");
		lblNewLabel_3_2_4_1_5_2.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_5_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_5_2.setBounds(624, 271, 13, 32);
		contentPane.add(lblNewLabel_3_2_4_1_5_2);
		
		JLabel lblNewLabel_3_2_5_1_1_3_1_6 = new JLabel("Progressive Muscular Atrophy");
		lblNewLabel_3_2_5_1_1_3_1_6.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_1_6.setBounds(645, 271, 237, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_1_6);
		
		JLabel lblNewLabel_3_2_4_1_6_2 = new JLabel("8.\r\n");
		lblNewLabel_3_2_4_1_6_2.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_6_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_6_2.setBounds(624, 296, 13, 32);
		contentPane.add(lblNewLabel_3_2_4_1_6_2);
		
		JLabel lblNewLabel_3_2_5_1_1_3_2_2 = new JLabel("Major Burns\r");
		lblNewLabel_3_2_5_1_1_3_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_2_2.setBounds(645, 296, 207, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_2_2);
		
		JLabel lblNewLabel_3_2_5_1_1_3_3_2 = new JLabel("Multiple Sclerosis\r");
		lblNewLabel_3_2_5_1_1_3_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_3_2.setBounds(645, 320, 141, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_3_2);
		
		JLabel lblNewLabel_3_2_4_1_7_2 = new JLabel("9.\r\n");
		lblNewLabel_3_2_4_1_7_2.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_7_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_7_2.setBounds(624, 320, 13, 32);
		contentPane.add(lblNewLabel_3_2_4_1_7_2);
		
		JLabel lblNewLabel_3_2_4_1_8_3 = new JLabel("10.\r\n");
		lblNewLabel_3_2_4_1_8_3.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_8_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_8_3.setBounds(624, 343, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_8_3);
		
		JLabel lblNewLabel_3_2_5_1_1_3_4_7 = new JLabel("Paralysis");
		lblNewLabel_3_2_5_1_1_3_4_7.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_4_7.setBounds(655, 343, 75, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_4_7);
		
		JLabel lblNewLabel_3_2_5_1_1_3_4_1_1 = new JLabel("Total Blindness\r");
		lblNewLabel_3_2_5_1_1_3_4_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_4_1_1.setBounds(656, 369, 130, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_4_1_1);
		
		JLabel lblNewLabel_3_2_5_1_1_3_4_2_1 = new JLabel("Loss of Limbs");
		lblNewLabel_3_2_5_1_1_3_4_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_4_2_1.setBounds(656, 393, 130, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_4_2_1);
		
		JLabel lblNewLabel_3_2_5_1_1_3_4_3_1 = new JLabel("Aplastic Anaemia");
		lblNewLabel_3_2_5_1_1_3_4_3_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_4_3_1.setBounds(655, 416, 131, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_4_3_1);
		
		JLabel lblNewLabel_3_2_5_1_1_3_4_4_1 = new JLabel("Bacterial Meningitis");
		lblNewLabel_3_2_5_1_1_3_4_4_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_4_4_1.setBounds(655, 442, 155, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_4_4_1);
		
		JLabel lblNewLabel_3_2_5_1_1_3_4_5_1 = new JLabel("Benign Brain Tumour");
		lblNewLabel_3_2_5_1_1_3_4_5_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_4_5_1.setBounds(656, 470, 176, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_4_5_1);
		
		JLabel lblNewLabel_3_2_5_1_1_3_4_6_1 = new JLabel("Deafness\r");
		lblNewLabel_3_2_5_1_1_3_4_6_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_4_6_1.setBounds(655, 498, 75, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_4_6_1);
		
		JLabel lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_3 = new JLabel("16.\r\n");
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_3.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_3.setBounds(624, 498, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_3);
		
		JLabel lblNewLabel_3_2_4_1_8_1_1_1_1_1_3 = new JLabel("15.\r\n");
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_3.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_3.setBounds(624, 470, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_8_1_1_1_1_1_3);
		
		JLabel lblNewLabel_3_2_4_1_8_1_1_1_3 = new JLabel("13.\r\n");
		lblNewLabel_3_2_4_1_8_1_1_1_3.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_8_1_1_1_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_8_1_1_1_3.setBounds(624, 416, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_8_1_1_1_3);
		
		JLabel lblNewLabel_3_2_4_1_8_1_1_1_1_3 = new JLabel("14.\r\n");
		lblNewLabel_3_2_4_1_8_1_1_1_1_3.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_8_1_1_1_1_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_8_1_1_1_1_3.setBounds(624, 442, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_8_1_1_1_1_3);
		
		JLabel lblNewLabel_3_2_4_1_8_1_1_3 = new JLabel("12.\r\n");
		lblNewLabel_3_2_4_1_8_1_1_3.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_8_1_1_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_8_1_1_3.setBounds(624, 393, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_8_1_1_3);
		
		JLabel lblNewLabel_3_2_4_1_8_1_3 = new JLabel("11.\r\n");
		lblNewLabel_3_2_4_1_8_1_3.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_8_1_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_8_1_3.setBounds(624, 369, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_8_1_3);
		
		JLabel lblNewLabel_3_2_4_1_8_1_1_1_2_1 = new JLabel("29.");
		lblNewLabel_3_2_4_1_8_1_1_1_2_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_8_1_1_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_8_1_1_1_2_1.setBounds(901, 416, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_8_1_1_1_2_1);
		
		JLabel lblNewLabel_3_2_5_1_1_1_2_1 = new JLabel("Kidney Failure");
		lblNewLabel_3_2_5_1_1_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_1_2_1.setBounds(928, 416, 117, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_1_2_1);
		
		JLabel lblNewLabel_3_2_4_1_8_1_1_1_1_2_1 = new JLabel("30.");
		lblNewLabel_3_2_4_1_8_1_1_1_1_2_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_8_1_1_1_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_8_1_1_1_1_2_1.setBounds(901, 437, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_8_1_1_1_1_2_1);
		
		JLabel lblNewLabel_3_2_5_1_1_2_2_1 = new JLabel("Dissecting Aortic Aneurysm");
		lblNewLabel_3_2_5_1_1_2_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_2_2_1.setBounds(928, 437, 207, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_2_2_1);
		
		JLabel lblNewLabel_3_2_4_1_8_1_1_1_1_1_2_1 = new JLabel("31.");
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_2_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_2_1.setBounds(901, 463, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_8_1_1_1_1_1_2_1);
		
		JLabel lblNewLabel_3_2_5_1_1_3_6_1 = new JLabel("End Stage Lung Disease\r");
		lblNewLabel_3_2_5_1_1_3_6_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_6_1.setBounds(928, 463, 176, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_6_1);
		
		JLabel lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_2_1 = new JLabel("32.");
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_2_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_2_1.setBounds(901, 486, 22, 32);
		contentPane.add(lblNewLabel_3_2_4_1_8_1_1_1_1_1_1_2_1);
		
		JLabel lblNewLabel_3_2_5_1_1_3_1_5_1 = new JLabel("Progressive Muscular Atrophy");
		lblNewLabel_3_2_5_1_1_3_1_5_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_1_5_1.setBounds(928, 486, 237, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_1_5_1);
		
		JLabel lblNewLabel_3_2_5_2_1 = new JLabel("Encephalitis");
		lblNewLabel_3_2_5_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_2_1.setBounds(928, 124, 117, 32);
		contentPane.add(lblNewLabel_3_2_5_2_1);
		
		JLabel lblNewLabel_3_2_5_1_2_1 = new JLabel("Amyotrophic Lateral Sclerosis (ALS)\r");
		lblNewLabel_3_2_5_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_2_1.setBounds(928, 149, 171, 32);
		contentPane.add(lblNewLabel_3_2_5_1_2_1);
		
		JLabel lblNewLabel_3_2_5_1_1_4_1 = new JLabel("Cancer\r");
		lblNewLabel_3_2_5_1_1_4_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_4_1.setBounds(928, 174, 58, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_4_1);
		
		JLabel lblNewLabel_3_2_5_1_1_1_1_1 = new JLabel("Kidney Failure");
		lblNewLabel_3_2_5_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_1_1_1.setBounds(928, 199, 117, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_5_1_1_2_1_1 = new JLabel("Dissecting Aortic Aneurysm");
		lblNewLabel_3_2_5_1_1_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_2_1_1.setBounds(928, 224, 207, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_2_1_1);
		
		JLabel lblNewLabel_3_2_5_1_1_3_5_1 = new JLabel("End Stage Lung Disease\r");
		lblNewLabel_3_2_5_1_1_3_5_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_5_1.setBounds(928, 248, 176, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_5_1);
		
		JLabel lblNewLabel_3_2_5_1_1_3_1_4_1 = new JLabel("Progressive Muscular Atrophy");
		lblNewLabel_3_2_5_1_1_3_1_4_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_1_4_1.setBounds(928, 271, 237, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_1_4_1);
		
		JLabel lblNewLabel_3_2_5_1_1_3_2_1_1 = new JLabel("Major Burns\r");
		lblNewLabel_3_2_5_1_1_3_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_2_1_1.setBounds(928, 296, 207, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_2_1_1);
		
		JLabel lblNewLabel_3_2_5_1_1_3_3_1_1 = new JLabel("Multiple Sclerosis\r");
		lblNewLabel_3_2_5_1_1_3_3_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_3_3_1_1.setBounds(928, 320, 141, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_3_3_1_1);
		
		JLabel lblNewLabel_3_2_5_3_1 = new JLabel("Heart Attack\r");
		lblNewLabel_3_2_5_3_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_3_1.setBounds(928, 343, 117, 32);
		contentPane.add(lblNewLabel_3_2_5_3_1);
		
		JLabel lblNewLabel_3_2_5_1_3_1 = new JLabel("Stroke");
		lblNewLabel_3_2_5_1_3_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_3_1.setBounds(928, 369, 58, 32);
		contentPane.add(lblNewLabel_3_2_5_1_3_1);
		
		JLabel lblNewLabel_3_2_5_1_1_5_1 = new JLabel("Cancer\r");
		lblNewLabel_3_2_5_1_1_5_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_5_1_1_5_1.setBounds(928, 393, 58, 32);
		contentPane.add(lblNewLabel_3_2_5_1_1_5_1);
		
		JLabel lblNewLabel_3_2_6_1_2 = new JLabel("Critical illness coverage");
		lblNewLabel_3_2_6_1_2.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_2.setBounds(226, 100, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1_2);
		
		JLabel lblNewLabel_3_2_4 = new JLabel("Reduce your anxiety about high-priced ");
		lblNewLabel_3_2_4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_4.setBounds(226, 124, 349, 32);
		contentPane.add(lblNewLabel_3_2_4);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("medical treatment and hospital bills. If you are ");
		lblNewLabel_3_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_1.setBounds(226, 149, 393, 32);
		contentPane.add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_3_2_2_1 = new JLabel("diagnosed with or endure any of the 36 ");
		lblNewLabel_3_2_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_2_1.setBounds(226, 175, 305, 32);
		contentPane.add(lblNewLabel_3_2_2_1);
		
		JLabel lblNewLabel_3_2_3_2 = new JLabel("mentioned catastrophic diseases or surgeries");
		lblNewLabel_3_2_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_2.setBounds(226, 199, 361, 32);
		contentPane.add(lblNewLabel_3_2_3_2);
		
		JLabel lblNewLabel_3_2_3_1_2 = new JLabel("you can receive a lump sum cash benefit ");
		lblNewLabel_3_2_3_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_2.setBounds(226, 224, 334, 32);
		contentPane.add(lblNewLabel_3_2_3_1_2);
		
		JLabel lblNewLabel_3_2_3_1_1_1 = new JLabel("equal to your plan's Face amount. You may");
		lblNewLabel_3_2_3_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1.setBounds(227, 248, 328, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1);
		
		JLabel lblNewLabel_3_2_3_1_1_2_2 = new JLabel("money anyway you want—for healing, ");
		lblNewLabel_3_2_3_1_1_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_2_2.setBounds(227, 271, 349, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_2_2);
		
		JLabel lblNewLabel_3_2_3_1_1_2_1_2 = new JLabel("researching alternative therapies, or simply");
		lblNewLabel_3_2_3_1_1_2_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_2_1_2.setBounds(227, 296, 349, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_2_1_2);
		
		JLabel lblNewLabel_3_2_3_1_1_2_1_1_2 = new JLabel("crossing something off your bucket list.\r");
		lblNewLabel_3_2_3_1_1_2_1_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_2_1_1_2.setBounds(227, 320, 305, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_2_1_1_2);
		
		JLabel lblNewLabel_3_2_3_1_1_2_1_1_1_3 = new JLabel("For maximum protection, you can add riders to ");
		lblNewLabel_3_2_3_1_1_2_1_1_1_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_2_1_1_1_3.setBounds(226, 357, 376, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_2_1_1_1_3);
		
		JLabel lblNewLabel_3_2_3_1_1_2_1_1_1_1_2 = new JLabel("your policy to cover unforeseen situations");
		lblNewLabel_3_2_3_1_1_2_1_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_2_1_1_1_1_2.setBounds(226, 381, 318, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_2_1_1_1_1_2);
		
		JLabel lblNewLabel_3_2_3_1_1_2_1_1_1_1_1_1 = new JLabel("such as accidents and incapacity.\r");
		lblNewLabel_3_2_3_1_1_2_1_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_2_1_1_1_1_1_1.setBounds(226, 404, 268, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_3_1_1_2_1_1_1_2_2 = new JLabel("In the event of death other than from a");
		lblNewLabel_3_2_3_1_1_2_1_1_1_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_2_1_1_1_2_2.setBounds(226, 486, 293, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_2_1_1_1_2_2);
		
		JLabel lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_2 = new JLabel("catastrophic disease, your family will receive ");
		lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_2.setBounds(226, 509, 349, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_2);
		
		JLabel lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_1_3 = new JLabel("the cash benefit equal to your plan's Face");
		lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_1_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_1_3.setBounds(226, 534, 318, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_1_3);
		
		JLabel lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_1_1_1 = new JLabel("Amount. After obtaining reimbursement for a ");
		lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_1_1_1.setBounds(226, 559, 349, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_1_1_1);
		
		JLabel lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_1_2_2 = new JLabel("serious illness or death, the PL Guarantee ");
		lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_1_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_1_2_2.setBounds(226, 583, 324, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_1_2_2);
		
		JLabel lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_1_2_1_1 = new JLabel("expires.");
		lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_1_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_1_2_1_1.setBounds(226, 609, 228, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_2_1_1_1_2_1_1_2_1_1);
		
		JButton DollarNow = new JButton("");
		DollarNow.setIcon(new ImageIcon(GuaranteeBenefits.class.getResource("/images/healthGuaPic22.png")));
		DollarNow.setForeground(Color.WHITE);
		DollarNow.setFont(new Font("Verdana", Font.BOLD, 54));
		DollarNow.setBackground(new Color(0, 64, 128));
		DollarNow.setBounds(183, 659, 982, 134);
		contentPane.add(DollarNow);
	}
}