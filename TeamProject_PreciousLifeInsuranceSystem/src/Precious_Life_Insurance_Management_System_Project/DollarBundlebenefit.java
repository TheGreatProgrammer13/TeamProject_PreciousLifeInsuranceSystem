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
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class DollarBundlebenefit extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DollarBundlebenefit frame = new DollarBundlebenefit();
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
	public DollarBundlebenefit() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 742);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton DollarNow = new JButton("");
		DollarNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentFrame t = new PaymentFrame();
				t.show();
				dispose();
			}
		});
		DollarNow.setIcon(new ImageIcon(DollarBundlebenefit.class.getResource("/images/NowButton1.png")));
		DollarNow.setForeground(Color.WHITE);
		DollarNow.setFont(new Font("Verdana", Font.BOLD, 54));
		DollarNow.setBackground(new Color(0, 64, 128));
		DollarNow.setBounds(866, 119, 290, 72);
		contentPane.add(DollarNow);
		
		JLabel lblBUY_1 = new JLabel("AVAIL");
		lblBUY_1.setForeground(Color.WHITE);
		lblBUY_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblBUY_1.setBounds(877, 75, 177, 44);
		contentPane.add(lblBUY_1);
		
		JLabel lblBUY = new JLabel("AVAIL");
		lblBUY.setForeground(new Color(242, 200, 71));
		lblBUY.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblBUY.setBounds(866, 75, 177, 44);
		contentPane.add(lblBUY);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, -2, 118, 808);
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(0, 84, 168));
		contentPane.add(panel);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					InvestmentPolicy t = new InvestmentPolicy();
					t.show();
					dispose();

				}
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(DollarBundlebenefit.class.getResource("/images/backbutton.png")));
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(new Color(0, 84, 168));
		btnNewButton_4.setBounds(25, 606, 62, 55);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					MainDashboard t = new MainDashboard();
					t.show();
					dispose();

				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(DollarBundlebenefit.class.getResource("/images/logoPng-MIDSIZE.png")));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 84, 168));
		btnNewButton.setBounds(25, 21, 98, 115);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(DollarBundlebenefit.class.getResource("/images/Proj/investlogo.png")));
		lblNewLabel_2.setBounds(10, 146, 103, 105);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(117, -2, 42, 838);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(0, 64, 128));
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(158, -2, 42, 838);
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(200, 152, 420, 89);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblSerene = new JLabel("DOLLAR BUNDLE");
		lblSerene.setBounds(38, 34, 390 , 44);
		lblSerene.setForeground(Color.WHITE);
		lblSerene.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_1_1_1.add(lblSerene);
		
		JLabel lblNewLabel = new JLabel("PRECIOUS LIFE");
		lblNewLabel.setBounds(38, 10, 183, 24);
		panel_1_1_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_3 = new JLabel("allows you to invest in various government-issued");
		lblNewLabel_3.setBounds(515, 295, 605, 32);
		lblNewLabel_3.setFont(new Font("Microsoft YaHei", Font.ITALIC, 17));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("debts in the international market.");
		lblNewLabel_3_1.setBounds(515, 320, 605, 32);
		lblNewLabel_3_1.setFont(new Font("Microsoft YaHei", Font.ITALIC, 17));
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("PreciousLife Dollar Bundle"); 
		lblNewLabel_3_2.setBounds(257, 295, 299, 32);
		lblNewLabel_3_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 19));
		contentPane.add(lblNewLabel_3_2);
		
		
		JLabel lblNewLabel_4 = new JLabel("FOR YOU IF:");
		lblNewLabel_4.setBounds(268, 360, 313, 72);
		lblNewLabel_4.setForeground(new Color(235, 200, 1));
		lblNewLabel_4.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 46));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_2_1_1_1_1_1 = new JLabel(" You  want moderate risk for your");
		lblNewLabel_3_2_1_1_1_1_1.setBounds(296, 430, 390, 32);
		lblNewLabel_3_2_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_2 = new JLabel(" dollars and see only a medium-term");
		lblNewLabel_3_2_1_1_1_1_2.setBounds(296, 449, 430, 32);
		lblNewLabel_3_2_1_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_2);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3 = new JLabel(" investment period for your money.");
		lblNewLabel_3_2_1_1_1_1_3.setBounds(296, 469, 350, 32);
		lblNewLabel_3_2_1_1_1_1_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3);
		
		JLabel lblNewLabel_3_2_1_1_1_1_4 = new JLabel(" You want to generate some income");
		lblNewLabel_3_2_1_1_1_1_4.setBounds(296, 510, 389, 32);
		lblNewLabel_3_2_1_1_1_1_4.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_4);
		
		JLabel lblNewLabel_3_2_1_1_1_1_5 = new JLabel(" preserve what you currently have.");
		lblNewLabel_3_2_1_1_1_1_5.setBounds(296, 530, 350, 32);
		lblNewLabel_3_2_1_1_1_1_5.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_5);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBounds(234, 420, 12, 156);
		panel_1_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1_1_2.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("???");
		lblNewLabel_5.setBounds(268, 440, 18, 13);
		lblNewLabel_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("???");
		lblNewLabel_5_1.setBounds(268, 520, 18, 13);
		lblNewLabel_5_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Risk of Tolerance:");
		lblNewLabel_5_2.setBounds(790, 383, 290, 13);
		lblNewLabel_5_2.setForeground(new Color(0, 0, 145));
		lblNewLabel_5_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("Low to Moderate");
		lblNewLabel_5_2_1.setBounds(790, 400, 290, 13);
		lblNewLabel_5_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_5_3 = new JLabel("Investment Horizon:");
		lblNewLabel_5_3.setBounds(790, 435, 290, 13);
		lblNewLabel_5_3.setForeground(new Color(0, 0, 145));
		lblNewLabel_5_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_3_1 = new JLabel("Medium Term");
		lblNewLabel_5_3_1.setBounds(790, 455, 290, 13);
		lblNewLabel_5_3_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_5_3_1);
		
		JLabel lblNewLabel_5_4 = new JLabel("Minimum Initial Investment Amount:");
		lblNewLabel_5_4.setBounds(790, 490, 305, 13);
		lblNewLabel_5_4.setForeground(new Color(0, 0, 145));
		lblNewLabel_5_4.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_5_4); 
		
		JLabel lblNewLabel_5_4_1 = new JLabel("USD 500");
		lblNewLabel_5_4_1.setBounds(790, 510, 290, 13);
		lblNewLabel_5_4_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_5_4_1);
		
		JLabel lblNewLabel_5_5 = new JLabel("Minimum Additional Investment Amount:");
		lblNewLabel_5_5.setBounds(790, 540, 315, 13);
		lblNewLabel_5_5.setForeground(new Color(0, 0, 145));
		lblNewLabel_5_5.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_5_5); 
		
		JLabel lblNewLabel_5_5_1 = new JLabel("USD 500");
		lblNewLabel_5_5_1.setBounds(790, 560, 290, 13);
		lblNewLabel_5_5_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_5_5_1);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(200, 0, 948, 260);
		lblNewLabel_7.setIcon(new ImageIcon(InvestmentPolicy.class.getResource("/images/dollarbg.png")));
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(-29, -2, 1195, 262);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\xander\\Downloads\\SerenePic.png"));
		contentPane.add(lblNewLabel_6);
	

	

	}
}
