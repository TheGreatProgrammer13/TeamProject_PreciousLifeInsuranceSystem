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

public class SereneBenefit extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SereneBenefit frame = new SereneBenefit();
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
	public SereneBenefit() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 843);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 108, 811);
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(0, 84, 168));
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PLSerene.class.getResource("/images/logoPng-MIDSIZE.png")));
		lblNewLabel_1.setBounds(-17, 10, 136, 137);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(PLSerene.class.getResource("/images/LifeLogo1 (1).png")));
		lblNewLabel_2.setBounds(10, 157, 98, 86);
		panel.add(lblNewLabel_2);
		
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
		btnNewButton_4.setIcon(new ImageIcon(PLSerene.class.getResource("/images/backbutton.png")));
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(new Color(0, 84, 168));
		btnNewButton_4.setBounds(25, 710, 62, 55);
		panel.add(btnNewButton_4);
		
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
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(181, 674, 249, 89);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblSerene = new JLabel("SERENE");
		lblSerene.setBounds(38, 34, 195, 44);
		lblSerene.setForeground(Color.WHITE);
		lblSerene.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_1_1_1.add(lblSerene);
		
		JLabel lblNewLabel = new JLabel("PRECIOUS LIFE");
		lblNewLabel.setBounds(38, 10, 183, 24);
		panel_1_1_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
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
		
		JLabel lblNewLabel_5 = new JLabel("SERENE:");
		lblNewLabel_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 20));
		lblNewLabel_5.setBounds(537, 72, 83, 18);
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
		lblNewLabel_3_2_4.setBounds(271, 229, 457, 32);
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
		lblNewLabel_3_2_8.setBounds(271, 448, 457, 32);
		contentPane.add(lblNewLabel_3_2_8);
		
		JLabel lblNewLabel_3_2_1_2 = new JLabel("to fit your unique investing goals and risk tolerance");
		lblNewLabel_3_2_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_2.setBounds(271, 471, 457, 32);
		contentPane.add(lblNewLabel_3_2_1_2);
		
		JLabel lblNewLabel_3_2_6_1_2 = new JLabel("Professional fund management");
		lblNewLabel_3_2_6_1_2.setForeground(new Color(0, 0, 145));
		lblNewLabel_3_2_6_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_2_6_1_2.setBounds(271, 513, 429, 32);
		contentPane.add(lblNewLabel_3_2_6_1_2);
		
		JLabel lblNewLabel_3_2_9 = new JLabel("Secure your loved ones' future with guaranteed life");
		lblNewLabel_3_2_9.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_9.setBounds(271, 542, 457, 32);
		contentPane.add(lblNewLabel_3_2_9);
		
		JLabel lblNewLabel_3_2_1_3 = new JLabel("insurance benefit equivalent to at least twice your ");
		lblNewLabel_3_2_1_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_3.setBounds(271, 565, 457, 32);
		contentPane.add(lblNewLabel_3_2_1_3);
	}
}
