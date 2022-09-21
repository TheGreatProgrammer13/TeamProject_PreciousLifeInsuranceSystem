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

public class PLGuarantee extends JFrame {

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
	public PLGuarantee() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 843);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGetAQuote_1 = new JLabel("Get a quote");
		lblGetAQuote_1.setForeground(Color.WHITE);
		lblGetAQuote_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblGetAQuote_1.setBounds(839, 68, 317, 55);
		contentPane.add(lblGetAQuote_1);
		
		JButton PLHirayaNow = new JButton("");
		PLHirayaNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentFrame t = new PaymentFrame();
				t.show();
				dispose();
			}
		});
		PLHirayaNow.setIcon(new ImageIcon(PLGuarantee.class.getResource("/images/NowButton1.png")));
		PLHirayaNow.setForeground(Color.WHITE);
		PLHirayaNow.setFont(new Font("Verdana", Font.BOLD, 54));
		PLHirayaNow.setBackground(new Color(0, 64, 128));
		PLHirayaNow.setBounds(864, 121, 292, 72);
		contentPane.add(PLHirayaNow);
		
		JLabel lblGetAQuote = new JLabel("Get a quote");
		lblGetAQuote.setForeground(new Color(242, 200, 71));
		lblGetAQuote.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblGetAQuote.setBounds(835, 68, 321, 55);
		contentPane.add(lblGetAQuote);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 84, 168));
		panel_1_1_1.setBounds(107, 150, 366, 89);
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblSerene = new JLabel("GUARANTEE\r\n");
		lblSerene.setBounds(96, 35, 276, 44);
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
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PLSerene.class.getResource("/images/logoPng-MIDSIZE.png")));
		lblNewLabel_1.setBounds(-17, 10, 136, 137);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(PLGuarantee.class.getResource("/images/HealthLogo (1).png")));
		lblNewLabel_2.setBounds(10, 157, 98, 86);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					GuaranteeBenefits t = new GuaranteeBenefits();
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
		
		JLabel lblNewLabel_3_1 = new JLabel("PreciousLife GUARANTEE\r\n");
		lblNewLabel_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
		lblNewLabel_3_1.setBounds(245, 290, 290, 32);
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
		
		JLabel lblNewLabel_3_2_1_1_1_1_1 = new JLabel("Critical illness coverage");
		lblNewLabel_3_2_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_1.setBounds(291, 565, 211, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_2 = new JLabel("Life insurance coverage\r\n");
		lblNewLabel_3_2_1_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_2.setBounds(291, 595, 244, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_2);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3 = new JLabel("Types of critical illness covered: 35");
		lblNewLabel_3_2_1_1_1_1_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_3.setBounds(291, 625, 394, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1_1_2.setBackground(new Color(0, 45, 105));
		panel_1_1_2.setBounds(245, 575, 12, 124);
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
		
		JLabel lblNewLabel_3_1_1 = new JLabel("is a life and health insurance plan that offers protection ");
		lblNewLabel_3_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_3_1_1.setBounds(534, 290, 594, 32);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("against any of the critical sickness conditions that are covered. This provides ");
		lblNewLabel_3_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_3_1_2.setBounds(276, 321, 852, 32);
		contentPane.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("you and your family with financial security and peace of mind regardless of ");
		lblNewLabel_3_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_3_1_2_1.setBounds(280, 352, 803, 32);
		contentPane.add(lblNewLabel_3_1_2_1);
		
		JLabel lblNewLabel_3_1_2_1_1 = new JLabel("what occurs.");
		lblNewLabel_3_1_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_3_1_2_1_1.setBounds(614, 381, 139, 32);
		contentPane.add(lblNewLabel_3_1_2_1_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(PLGuarantee.class.getResource("/images/suitablePictue.png")));
		lblNewLabel_7.setBounds(736, 570, 360, 114);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Moving Up");
		lblNewLabel_8.setForeground(new Color(0, 0, 128));
		lblNewLabel_8.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		lblNewLabel_8.setBounds(746, 688, 86, 32);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("Preparing");
		lblNewLabel_8_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		lblNewLabel_8_1.setBounds(876, 688, 86, 32);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_1_1_1 = new JLabel("Leaving a");
		lblNewLabel_8_1_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1_1_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		lblNewLabel_8_1_1_1.setBounds(996, 688, 86, 32);
		contentPane.add(lblNewLabel_8_1_1_1);
		
		JLabel lblNewLabel_8_1_1_1_1 = new JLabel("Legacy");
		lblNewLabel_8_1_1_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1_1_1_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		lblNewLabel_8_1_1_1_1.setBounds(1006, 719, 63, 32);
		contentPane.add(lblNewLabel_8_1_1_1_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Ahead");
		lblNewLabel_8_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		lblNewLabel_8_1_1.setBounds(886, 719, 57, 32);
		contentPane.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(PLGuarantee.class.getResource("/images/healthGuaPic.png")));
		lblNewLabel_6.setBounds(189, 0, 965, 257);
		contentPane.add(lblNewLabel_6);
		
		JButton clickInfoElderly = new JButton("Click here for more info!");
		clickInfoElderly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GuaranteeBenefits t = new GuaranteeBenefits();
				t.show();
				dispose();
			}
		});
		clickInfoElderly.setForeground(Color.GRAY);
		clickInfoElderly.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 19));
		clickInfoElderly.setBorder(UIManager.getBorder("TableHeader.cellBorder"));
		clickInfoElderly.setBackground(Color.WHITE);
		clickInfoElderly.setBounds(245, 458, 265, 23);
		contentPane.add(clickInfoElderly);
	}
}
