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

public class DreamComerBENEFITS extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DreamComerBENEFITS frame = new DreamComerBENEFITS();
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
	public DreamComerBENEFITS() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 772);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton PLFlex = new JButton("");
		PLFlex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentFrame t = new PaymentFrame();
				t.show();
				dispose();
			}
		});
		PLFlex.setIcon(new ImageIcon(DreamComerBENEFITS.class.getResource("/images/NowButton1.png")));
		PLFlex.setForeground(Color.WHITE);
		PLFlex.setFont(new Font("Verdana", Font.BOLD, 54));
		PLFlex.setBackground(new Color(0, 64, 128));
		PLFlex.setBounds(862, 642, 292, 72);
		contentPane.add(PLFlex);
		
		JLabel lblGetAQuote_1 = new JLabel("Get a quote");
		lblGetAQuote_1.setForeground(Color.WHITE);
		lblGetAQuote_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblGetAQuote_1.setBounds(837, 589, 317, 55);
		contentPane.add(lblGetAQuote_1);
		
		JLabel lblGetAQuote = new JLabel("Get a quote");
		lblGetAQuote.setForeground(new Color(242, 200, 71));
		lblGetAQuote.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblGetAQuote.setBounds(833, 589, 302, 55);
		contentPane.add(lblGetAQuote);
		
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
					PLDreamComer t = new PLDreamComer();
					t.show();
					dispose();

				}
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(PLDreamComer.class.getResource("/images/backbutton.png")));
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(new Color(0, 84, 168));
		btnNewButton_4.setBounds(24, 608, 62, 55);
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
		panel_1_1.setBounds(148, 0, 42, 741);
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("Enjoy maximum coverage that protects the  life of  the insured Parent");
		lblNewLabel_3.setBounds(311, 180, 810, 32);
		lblNewLabel_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Life insurance coverage");
		lblNewLabel_3_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_3_1.setBounds(311, 150, 302, 32);
		lblNewLabel_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel(" or Pay for the entire duration of the policy.\r\n");
		lblNewLabel_3_2.setBounds(307, 208, 466, 32);
		lblNewLabel_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4 = new JLabel("BENEFITS");
		lblNewLabel_4.setBounds(287, 56, 272, 72);
		lblNewLabel_4.setForeground(new Color(255, 215, 0));
		lblNewLabel_4.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 60));
		contentPane.add(lblNewLabel_4);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 45, 105));
		panel_1_1_1.setBounds(188, 589, 371, 89);
		contentPane.add(panel_1_1_1);
		
		JLabel lblDreamComer = new JLabel("DREAM COMER\r\n");
		lblDreamComer.setForeground(Color.WHITE);
		lblDreamComer.setFont(new Font("Tahoma", Font.BOLD, 42));
		lblDreamComer.setBounds(38, 34, 328, 44);
		panel_1_1_1.add(lblDreamComer);
		
		JLabel lblNewLabel_5 = new JLabel("PRECIOUS LIFE");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_5.setBounds(38, 10, 183, 24);
		panel_1_1_1.add(lblNewLabel_5);
		
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
		
		JLabel lblDreamComer_1 = new JLabel("DREAM COMER:\r\n");
		lblDreamComer_1.setForeground(new Color(255, 204, 0));
		lblDreamComer_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblDreamComer_1.setBounds(555, 92, 218, 24);
		contentPane.add(lblDreamComer_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Guaranteed Education benefits");
		lblNewLabel_3_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_3_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
		lblNewLabel_3_1_1.setBounds(311, 408, 403, 32);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Flexible Premium Payment \r\n");
		lblNewLabel_3_1_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_3_1_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
		lblNewLabel_3_1_1_1.setBounds(311, 251, 403, 32);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_3_3 = new JLabel("Receive four (4) annual cash payouts that increase by 15% every year");
		lblNewLabel_3_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_3_3.setBounds(311, 279, 810, 32);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("regardless of school or chosen degree. These guaranteed cash benefits,");
		lblNewLabel_3_3_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_3_3_1.setBounds(311, 305, 810, 32);
		contentPane.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("totaling 100% of the insurance coverage, can be used to boost");
		lblNewLabel_3_3_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_3_3_1_1.setBounds(311, 336, 810, 32);
		contentPane.add(lblNewLabel_3_3_1_1);
		
		JLabel lblNewLabel_3_3_1_1_1 = new JLabel("your fund for your child’s education.");
		lblNewLabel_3_3_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_3_3_1_1_1.setBounds(311, 365, 810, 32);
		contentPane.add(lblNewLabel_3_3_1_1_1);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("Pay your premiums for only 5 years, in annual, semi-annual, or quarterly ");
		lblNewLabel_3_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_3_3_2.setBounds(311, 440, 810, 32);
		contentPane.add(lblNewLabel_3_3_2);
		
		JLabel lblNewLabel_3_3_1_2 = new JLabel("terms. Monthly payment through Auto-Debit or Auto-Charge may");
		lblNewLabel_3_3_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_3_3_1_2.setBounds(311, 466, 810, 32);
		contentPane.add(lblNewLabel_3_3_1_2);
		
		JLabel lblNewLabel_3_3_1_1_2 = new JLabel("also be arranged after payment of the initial quarterly premium.\r\n");
		lblNewLabel_3_3_1_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_3_3_1_1_2.setBounds(311, 497, 810, 32);
		contentPane.add(lblNewLabel_3_3_1_1_2);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(DreamComerBENEFITS.class.getResource("/images/dreambenbg.png")));
		lblNewLabel_6.setBounds(188, 576, 966, 165);
		contentPane.add(lblNewLabel_6);
	}
}
