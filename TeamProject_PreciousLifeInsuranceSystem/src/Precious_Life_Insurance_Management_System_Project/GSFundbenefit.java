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

public class GSFundbenefit  extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GSFundbenefit frame = new GSFundbenefit();
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
	public GSFundbenefit() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 742);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBUY = new JLabel("AVAIL");
		lblBUY.setForeground(new Color(242,200,71));
		lblBUY.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblBUY.setBounds(876, 79, 198, 44);
		contentPane.add(lblBUY);
		
		JLabel lblBUY_1 = new JLabel("AVAIL");
		lblBUY_1.setForeground(new Color(255, 255, 255));
		lblBUY_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblBUY_1.setBounds(886, 79, 177, 44);
		contentPane.add(lblBUY_1);
		
		JButton FundNow = new JButton("");
		FundNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentFrame t = new PaymentFrame();
				t.show();
				dispose();
			}
		});
		FundNow.setIcon(new ImageIcon(GSFundbenefit.class.getResource("/images/NowButton1.png")));
		FundNow.setForeground(new Color(255, 255, 255));
		FundNow.setBackground(new Color(0, 64, 128));
		FundNow.setFont(new Font("Verdana", Font.BOLD, 54));
		FundNow.setBounds(876, 123, 290, 72);
		contentPane.add(FundNow);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, -2, 118, 707);
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(0, 84, 168));
		contentPane.add(panel);
		
		JButton backInvestment = new JButton("");
		backInvestment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					InvestmentPolicy t = new InvestmentPolicy();
					t.show();
					dispose();

				}
			}
		});
		backInvestment.setIcon(new ImageIcon(InvestmentPolicy.class.getResource("/images/backbutton.png")));
		backInvestment.setBorder(null);
		backInvestment.setBackground(new Color(0, 84, 168));
		backInvestment.setBounds(26, 597, 62, 55);
		panel.add(backInvestment);
		
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
		btnNewButton.setIcon(new ImageIcon(GSFundbenefit.class.getResource("/images/logoPng-MIDSIZE.png")));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 84, 168));
		btnNewButton.setBounds(20, 21, 98, 115);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(GSFundbenefit.class.getResource("/images/Proj/investlogo.png")));
		lblNewLabel_2.setBounds(10, 146, 98, 105);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(117, -2, 42, 707);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(0, 64, 128));
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(158, -2, 42, 707);
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(198, 155, 258, 89);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel GSFund = new JLabel("GS FUND");
		GSFund.setBounds(38, 34, 195, 44);
		GSFund.setForeground(Color.WHITE);
		GSFund.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_1_1_1.add(GSFund);
		
		JLabel lblNewLabel = new JLabel("PRECIOUS LIFE");
		lblNewLabel.setBounds(38, 10, 183, 24);
		panel_1_1_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_3 = new JLabel("invests in local fixed income instruments.");
		lblNewLabel_3.setBounds(469, 295, 605, 32);
		lblNewLabel_3.setFont(new Font("Microsoft YaHei", Font.ITALIC, 17));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("PreciousLife GS FUND");
		lblNewLabel_3_1.setBounds(257, 295, 250, 32);
		lblNewLabel_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 19));
		contentPane.add(lblNewLabel_3_1);
		
		
		JLabel lblNewLabel_4 = new JLabel("FOR YOU IF:");
		lblNewLabel_4.setBounds(268, 350, 313, 72);
		lblNewLabel_4.setForeground(new Color(235, 200, 1));
		lblNewLabel_4.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 46));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_2_1_1_1_1_1 = new JLabel("You have money saved which you will use in");
		lblNewLabel_3_2_1_1_1_1_1.setBounds(296, 420, 390, 32);
		lblNewLabel_3_2_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_2 = new JLabel("the near future but want to earn more than the");
		lblNewLabel_3_2_1_1_1_1_2.setBounds(296, 439, 430, 32);
		lblNewLabel_3_2_1_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_2);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3 = new JLabel("standard saving account interest rates.");
		lblNewLabel_3_2_1_1_1_1_3.setBounds(296, 459, 350, 32);
		lblNewLabel_3_2_1_1_1_1_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3);
		
		JLabel lblNewLabel_3_2_1_1_1_1_4 = new JLabel("You want to preserve your nest egg without");
		lblNewLabel_3_2_1_1_1_1_4.setBounds(296, 510, 389, 32);
		lblNewLabel_3_2_1_1_1_1_4.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_4);
		
		JLabel lblNewLabel_3_2_1_1_1_1_5 = new JLabel("engaging in a business or dealing with");
		lblNewLabel_3_2_1_1_1_1_5.setBounds(296, 530, 350, 32);
		lblNewLabel_3_2_1_1_1_1_5.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_5);
		
		JLabel lblNewLabel_3_2_1_1_1_1_5_1 = new JLabel("complicated stock market trading.");
		lblNewLabel_3_2_1_1_1_1_5_1.setBounds(296, 550, 345, 32);
		lblNewLabel_3_2_1_1_1_1_5_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_5_1);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBounds(234, 420, 12, 156);
		panel_1_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1_1_2.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("â—�");
		lblNewLabel_5.setBounds(268, 430, 18, 13);
		lblNewLabel_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("â—�");
		lblNewLabel_5_1.setBounds(268, 525, 18, 13);
		lblNewLabel_5_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("Risk of Tolerance:");
		lblNewLabel_5_2.setBounds(790, 370, 290, 13);
		lblNewLabel_5_2.setForeground(new Color(0, 0, 145));
		lblNewLabel_5_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("Low to Moderate");
		lblNewLabel_5_2_1.setBounds(790, 390, 290, 13);
		lblNewLabel_5_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_5_3 = new JLabel("Investment Horizon:");
		lblNewLabel_5_3.setBounds(790, 425, 290, 13);
		lblNewLabel_5_3.setForeground(new Color(0, 0, 145));
		lblNewLabel_5_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_3_1 = new JLabel("Short to Medium Term");
		lblNewLabel_5_3_1.setBounds(790, 445, 290, 13);
		lblNewLabel_5_3_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_5_3_1);
		
		JLabel lblNewLabel_5_4 = new JLabel("Minimum Initial Investment Amount:");
		lblNewLabel_5_4.setBounds(790, 480, 305, 13);
		lblNewLabel_5_4.setForeground(new Color(0, 0, 145));
		lblNewLabel_5_4.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_5_4); 
		
		JLabel lblNewLabel_5_4_1 = new JLabel("PHP 1,000");
		lblNewLabel_5_4_1.setBounds(790, 500, 290, 13);
		lblNewLabel_5_4_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_5_4_1);
		
		JLabel lblNewLabel_5_5 = new JLabel("Minimum Additional Investment Amount:");
		lblNewLabel_5_5.setBounds(790, 530, 315, 13);
		lblNewLabel_5_5.setForeground(new Color(0, 0, 145));
		lblNewLabel_5_5.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		contentPane.add(lblNewLabel_5_5); 
		
		JLabel lblNewLabel_5_5_1 = new JLabel("PHP 1,000");
		lblNewLabel_5_5_1.setBounds(790, 550, 290, 13);
		lblNewLabel_5_5_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_5_5_1);

		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setBounds(200, 0, 948, 260);
		lblNewLabel_7.setIcon(new ImageIcon(InvestmentPolicy.class.getResource("/images/GSfundbg.png")));
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(-29, -2, 1195, 262);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\xander\\Downloads\\SerenePic.png"));
		contentPane.add(lblNewLabel_6);
	

	

	}
}



