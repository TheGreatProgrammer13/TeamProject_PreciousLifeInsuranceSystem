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

public class BrighterLifeBENEFITS extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BrighterLifeBENEFITS frame = new BrighterLifeBENEFITS();
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
	public BrighterLifeBENEFITS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 771);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGetAQuote_1 = new JLabel("Get a quote");
		lblGetAQuote_1.setForeground(Color.WHITE);
		lblGetAQuote_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblGetAQuote_1.setBounds(837, 600, 317, 55);
		contentPane.add(lblGetAQuote_1);
		
		JLabel lblGetAQuote = new JLabel("Get a quote");
		lblGetAQuote.setForeground(new Color(242, 200, 71));
		lblGetAQuote.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblGetAQuote.setBounds(833, 600, 302, 55);
		contentPane.add(lblGetAQuote);
		
		JButton BLbenefits = new JButton("");
		BLbenefits.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentFrame t = new PaymentFrame();
				t.show();
				dispose();
			}
		});
		BLbenefits.setIcon(new ImageIcon(BrighterLifeBENEFITS.class.getResource("/images/NowButton1.png")));
		BLbenefits.setForeground(Color.WHITE);
		BLbenefits.setFont(new Font("Verdana", Font.BOLD, 54));
		BLbenefits.setBackground(new Color(0, 64, 128));
		BLbenefits.setBounds(862, 653, 292, 72);
		contentPane.add(BLbenefits);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 64, 128));
		panel_1_1_1.setBounds(148, 589, 402, 89);
		contentPane.add(panel_1_1_1);
		
		JLabel lblSerene = new JLabel("BRIGHTER LIFE");
		lblSerene.setForeground(Color.WHITE);
		lblSerene.setFont(new Font("Tahoma", Font.BOLD, 42));
		lblSerene.setBounds(60, 35, 365, 44);
		panel_1_1_1.add(lblSerene);
		
		JLabel lblNewLabel_5 = new JLabel("PRECIOUS LIFE");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_5.setBounds(55, 10, 183, 24);
		panel_1_1_1.add(lblNewLabel_5);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 108, 734);
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(0, 84, 168));
		contentPane.add(panel);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					PLBrighterLife t = new PLBrighterLife();
					t.show();
					dispose();

				}
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(PLDreamComer.class.getResource("/images/backbutton.png")));
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(new Color(0, 84, 168));
		btnNewButton_4.setBounds(22, 609, 62, 55);
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
		panel_1.setBounds(107, 0, 42, 734);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(0, 64, 128));
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(148, 0, 42, 734);
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Secure your loved ones’ future with life insurance");
		lblNewLabel_3.setBounds(308, 160, 376, 32);
		lblNewLabel_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Life insurance coverage");
		lblNewLabel_3_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_3_1.setBounds(308, 139, 302, 32);
		lblNewLabel_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("BENEFITS");
		lblNewLabel_4.setBounds(287, 56, 272, 72);
		lblNewLabel_4.setForeground(new Color(255, 215, 0));
		lblNewLabel_4.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 60));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5_5 = new JLabel("â—�");
		lblNewLabel_5_5.setBounds(263, 733, 18, 13);
		lblNewLabel_5_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("\u25CF\n");
		lblNewLabel_4_1.setForeground(new Color(255, 215, 0));
		lblNewLabel_4_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 60));
		lblNewLabel_4_1.setBounds(239, 56, 42, 72);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel = new JLabel("OF PL");
		lblNewLabel.setBounds(555, 73, 76, 24);
		contentPane.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 204, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		
		JLabel lblDreamComer_1 = new JLabel("BRIGHTER LIFE:");
		lblDreamComer_1.setForeground(new Color(255, 204, 0));
		lblDreamComer_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblDreamComer_1.setBounds(555, 92, 218, 24);
		contentPane.add(lblDreamComer_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Lifetime guaranteed cash benefits");
		lblNewLabel_3_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_3_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_1_1.setBounds(308, 246, 302, 32);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Living benefits\r\n");
		lblNewLabel_3_1_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_3_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_1_2.setBounds(308, 353, 302, 32);
		contentPane.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("Manageable premium payment");
		lblNewLabel_3_1_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_3_1_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_1_3.setBounds(721, 139, 302, 32);
		contentPane.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_3_2 = new JLabel("benefits worth twice the Face Amount of your\r\n");
		lblNewLabel_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(308, 182, 376, 32);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("plan, providing coverage until age 100 or maturity.");
		lblNewLabel_3_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1.setBounds(308, 203, 383, 32);
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("Enjoy regular guaranteed cash benefits throughout");
		lblNewLabel_3_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(308, 267, 376, 32);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("your lifetime, starting at the end of the sixth");
		lblNewLabel_3_3_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_1.setBounds(308, 289, 376, 32);
		contentPane.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("year of your plan and every two years afterwards.");
		lblNewLabel_3_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_2.setBounds(308, 310, 376, 32);
		contentPane.add(lblNewLabel_3_3_2);
		
		JLabel lblNewLabel_3_3_2_1 = new JLabel("future premiums, leave with Precious Life to");
		lblNewLabel_3_3_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_2_1.setBounds(308, 418, 376, 32);
		contentPane.add(lblNewLabel_3_3_2_1);
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("increase your insurance coverage, pay for\r\n");
		lblNewLabel_3_3_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_1_1.setBounds(308, 397, 376, 32);
		contentPane.add(lblNewLabel_3_3_1_1);
		
		JLabel lblNewLabel_3_3_3 = new JLabel("Earn dividends from your plan which you may use to");
		lblNewLabel_3_3_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_3.setBounds(308, 375, 383, 32);
		contentPane.add(lblNewLabel_3_3_3);
		
		JLabel lblNewLabel_3_3_2_2 = new JLabel("policy loan against your plan’s cash value");
		lblNewLabel_3_3_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_2_2.setBounds(308, 483, 376, 32);
		contentPane.add(lblNewLabel_3_3_2_2);
		
		JLabel lblNewLabel_3_3_1_2 = new JLabel("emergencies, money also comes in handy via a");
		lblNewLabel_3_3_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_1_2.setBounds(308, 462, 376, 32);
		contentPane.add(lblNewLabel_3_3_1_2);
		
		JLabel lblNewLabel_3_3_4 = new JLabel("accumulate, or receive in cash. In case of\r\n");
		lblNewLabel_3_3_4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_4.setBounds(308, 440, 376, 32);
		contentPane.add(lblNewLabel_3_3_4);
		
		JLabel lblNewLabel_3_3_2_2_1 = new JLabel("institutions or selling your prized possessions.");
		lblNewLabel_3_3_2_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_2_2_1.setBounds(308, 526, 376, 32);
		contentPane.add(lblNewLabel_3_3_2_2_1);
		
		JLabel lblNewLabel_3_3_1_2_1 = new JLabel("instead of borrowing from various financial");
		lblNewLabel_3_3_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_1_2_1.setBounds(308, 505, 376, 32);
		contentPane.add(lblNewLabel_3_3_1_2_1);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("opt for a shorter guaranteed payment period \r\n");
		lblNewLabel_3_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_1.setBounds(721, 203, 383, 32);
		contentPane.add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("semi-annual, or quarterly basis. You may also");
		lblNewLabel_3_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_2.setBounds(721, 182, 376, 32);
		contentPane.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_3_4 = new JLabel("Pay your premiums regularly on an annual,");
		lblNewLabel_3_4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_4.setBounds(721, 160, 376, 32);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_2_1_1_1 = new JLabel("of only 5 or 10 years.");
		lblNewLabel_3_2_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_1_1.setBounds(721, 225, 383, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(BrighterLifeBENEFITS.class.getResource("/images/brightbenbg.png")));
		lblNewLabel_6.setBounds(188, 576, 966, 165);
		contentPane.add(lblNewLabel_6);
	}
}
