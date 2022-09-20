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

public class PLWellBeingBenefits extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PLWellBeingBenefits frame = new PLWellBeingBenefits();
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
	public PLWellBeingBenefits() {
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
		
		JButton WellbeingNow_1 = new JButton("");
		WellbeingNow_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentFrame t = new PaymentFrame();
				t.show();
				dispose();
			}
		});
		WellbeingNow_1.setIcon(new ImageIcon(PLWellBeingBenefits.class.getResource("/images/NowButton1.png")));
		WellbeingNow_1.setForeground(Color.WHITE);
		WellbeingNow_1.setFont(new Font("Verdana", Font.BOLD, 54));
		WellbeingNow_1.setBackground(new Color(0, 64, 128));
		WellbeingNow_1.setBounds(866, 713, 290, 72);
		contentPane.add(WellbeingNow_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(144, 674, 328, 89);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 64, 128));
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblSerene = new JLabel("WELL-BEING");
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
		lblNewLabel_2.setIcon(new ImageIcon(PLWellBeingBenefits.class.getResource("/images/HealthLogo (1).png")));
		lblNewLabel_2.setBounds(10, 157, 98, 86);
		panel.add(lblNewLabel_2);
		
		JButton backbuttonHiraya = new JButton("");
		backbuttonHiraya.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					PLWellBeing t = new PLWellBeing();
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
		btnNewButton.setIcon(new ImageIcon(PLWellBeingBenefits.class.getResource("/images/logoPng-MIDSIZE.png")));
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
		
		JLabel lblNewLabel_5 = new JLabel("WELL-BEING:");
		lblNewLabel_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
		lblNewLabel_5.setBounds(537, 72, 150, 18);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3_2 = new JLabel("If you are still alive and are diagnosed with one of the eight covered Minor");
		lblNewLabel_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(271, 154, 609, 32);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Critical Illnesses (CI) and Angioplasty or five covered Major Critical Illnesses");
		lblNewLabel_3_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1.setBounds(271, 177, 574, 32);
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("and have undergone any of the specified operations, you will receive cash ");
		lblNewLabel_3_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_2.setBounds(271, 201, 625, 32);
		contentPane.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_3_2_3 = new JLabel("benefits equal to a portion of the Face Amount. This ensures that you will have ");
		lblNewLabel_3_2_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3.setBounds(271, 230, 625, 32);
		contentPane.add(lblNewLabel_3_2_3);
		
		JLabel lblNewLabel_3_2_6_1 = new JLabel("Health protection");
		lblNewLabel_3_2_6_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1.setBounds(271, 135, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1);
		
		JLabel lblNewLabel_3_2_3_1 = new JLabel("the means to recover regardless of the sort of medical treatment or financial ");
		lblNewLabel_3_2_3_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1.setBounds(271, 258, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1);
		
		JLabel lblNewLabel_3_2_3_1_1 = new JLabel("support necessary to get through any stage of a covered critical illness.\r");
		lblNewLabel_3_2_3_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1.setBounds(271, 283, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1);
		
		JLabel lblNewLabel_3_2_6_1_2 = new JLabel("Insurance coverage\r\n");
		lblNewLabel_3_2_6_1_2.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_2.setBounds(271, 350, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1_2);
		
		JLabel lblNewLabel_3_2_3_1_1_1 = new JLabel("Purchase a life insurance policy to supplement the customer's existing");
		lblNewLabel_3_2_3_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1.setBounds(271, 372, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1);
		
		JLabel lblNewLabel_3_2_3_1_1_1_1 = new JLabel("coverage.\r");
		lblNewLabel_3_2_3_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_1.setBounds(271, 394, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_1);
		
		JLabel lblNewLabel_3_2_6_1_2_1 = new JLabel("Simplified issue offer (SIO)");
		lblNewLabel_3_2_6_1_2_1.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_2_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_2_1.setBounds(271, 454, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1_2_1);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2 = new JLabel("You may apply for this plan simply by filling out a brief health questionnaire ");
		lblNewLabel_3_2_3_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2.setBounds(271, 483, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2);
		
		JLabel lblNewLabel_3_2_3_1_1_1_2_1 = new JLabel("without having to undergo any medical tests.");
		lblNewLabel_3_2_3_1_1_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3_1_1_1_2_1.setBounds(271, 505, 625, 32);
		contentPane.add(lblNewLabel_3_2_3_1_1_1_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PLWellBeingBenefits.class.getResource("/images/RetirementPicture_Stabalize.png")));
		lblNewLabel_1.setBounds(174, 640, 982, 171);
		contentPane.add(lblNewLabel_1);
	}
}