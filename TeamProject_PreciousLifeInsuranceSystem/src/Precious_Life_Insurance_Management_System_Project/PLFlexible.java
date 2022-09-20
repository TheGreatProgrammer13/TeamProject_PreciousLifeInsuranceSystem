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

public class PLFlexible extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PLFlexible frame = new PLFlexible();
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
	public PLFlexible() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 843);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 84, 168));
		panel_1_1_1.setBounds(107, 154, 313, 89);
		contentPane.add(panel_1_1_1);
		
		JLabel lblFlexible = new JLabel("FLEXIBLE\r\n");
		lblFlexible.setForeground(Color.WHITE);
		lblFlexible.setFont(new Font("Tahoma", Font.BOLD, 42));
		lblFlexible.setBounds(96, 35, 247, 44);
		panel_1_1_1.add(lblFlexible);
		
		JLabel lblNewLabel = new JLabel("PRECIOUS LIFE");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(86, 10, 183, 24);
		panel_1_1_1.add(lblNewLabel);
		
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
		btnNewButton_4.setIcon(new ImageIcon(PLSerene.class.getResource("/images/backbutton.png")));
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(new Color(0, 84, 168));
		btnNewButton_4.setBounds(22, 672, 62, 55);
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
		
		JLabel lblNewLabel_3 = new JLabel("is an affordable investment-linked life insurance plan that");
		lblNewLabel_3.setBounds(499, 284, 618, 32);
		lblNewLabel_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("PreciousLife Flexible");
		lblNewLabel_3_1.setBounds(263, 284, 302, 32);
		lblNewLabel_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("enables you to build an education fund for your child’s future. Alongside the");
		lblNewLabel_3_2.setBounds(263, 314, 840, 32);
		lblNewLabel_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("insurance coverage it provides, PL Flexible offers investment options that will");
		lblNewLabel_3_2_1.setBounds(275, 339, 821, 32);
		lblNewLabel_3_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_4 = new JLabel("BENEFITS");
		lblNewLabel_4.setBounds(263, 470, 272, 72);
		lblNewLabel_4.setForeground(new Color(235, 200, 1));
		lblNewLabel_4.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 60));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("SUITABLE FOR");
		lblNewLabel_4_1.setBounds(750, 474, 313, 72);
		lblNewLabel_4_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_4_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 46));
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_1 = new JLabel("Life insurance coverage");
		lblNewLabel_3_2_1_1_1_1_1.setBounds(291, 540, 211, 32);
		lblNewLabel_3_2_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_2 = new JLabel("Flexible investment options");
		lblNewLabel_3_2_1_1_1_1_2.setBounds(291, 565, 244, 32);
		lblNewLabel_3_2_1_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_2);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3 = new JLabel("Professional fund management.");
		lblNewLabel_3_2_1_1_1_1_3.setBounds(291, 597, 294, 32);
		lblNewLabel_3_2_1_1_1_1_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3);
		
		JLabel lblNewLabel_3_2_1_1_1_1_4 = new JLabel("Funds for future needs");
		lblNewLabel_3_2_1_1_1_1_4.setBounds(291, 627, 211, 32);
		lblNewLabel_3_2_1_1_1_1_4.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_4);
		
		JLabel lblNewLabel_3_2_1_1_1_1_5 = new JLabel("Manageable premium payment");
		lblNewLabel_3_2_1_1_1_1_5.setBounds(291, 660, 294, 32);
		lblNewLabel_3_2_1_1_1_1_5.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_5);
		
		JLabel lblNewLabel_3_2_1_1_1_1_5_1 = new JLabel("Loyalty bonus");
		lblNewLabel_3_2_1_1_1_1_5_1.setBounds(291, 691, 132, 32);
		lblNewLabel_3_2_1_1_1_1_5_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_5_1);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBounds(230, 558, 12, 156);
		panel_1_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1_1_2.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("●\n");
		lblNewLabel_5.setBounds(263, 544, 18, 13);
		lblNewLabel_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("allow your money to grow over time. This will help meet your child’s school");
		lblNewLabel_3_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_3_2_2.setBounds(263, 367, 840, 32);
		contentPane.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_3_2_2_1 = new JLabel("expenses and secure your family’s future no matter what happens.\r\n\n");
		lblNewLabel_3_2_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_3_2_2_1.setBounds(314, 392, 840, 32);
		contentPane.add(lblNewLabel_3_2_2_1);
		
		JLabel lblNewLabel_5_1 = new JLabel("●\n");
		lblNewLabel_5_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5_1.setBounds(263, 576, 18, 13);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("●\n");
		lblNewLabel_5_2.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5_2.setBounds(263, 606, 18, 13);
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_3 = new JLabel("●\n");
		lblNewLabel_5_3.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5_3.setBounds(263, 639, 18, 13);
		contentPane.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_4 = new JLabel("●\n");
		lblNewLabel_5_4.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5_4.setBounds(263, 670, 18, 13);
		contentPane.add(lblNewLabel_5_4);
		
		JLabel lblNewLabel_5_6 = new JLabel("●\n");
		lblNewLabel_5_6.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_5_6.setBounds(263, 701, 18, 13);
		contentPane.add(lblNewLabel_5_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(PLFlexible.class.getResource("/images/Ellipse 13.png")));
		lblNewLabel_7.setBounds(779, 540, 108, 111);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3_1 = new JLabel("Getting ");
		lblNewLabel_3_2_1_1_1_1_3_1.setForeground(new Color(0, 51, 102));
		lblNewLabel_3_2_1_1_1_1_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_3_1.setBounds(799, 652, 69, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.setIcon(new ImageIcon(PLFlexible.class.getResource("/images/Ellipse 17.png")));
		lblNewLabel_7_1.setBounds(903, 540, 108, 111);
		contentPane.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3_1_1 = new JLabel("Moving Up");
		lblNewLabel_3_2_1_1_1_1_3_1_1.setForeground(new Color(0, 51, 102));
		lblNewLabel_3_2_1_1_1_1_3_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_3_1_1.setBounds(903, 652, 117, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3_1_2 = new JLabel("Started\r\n");
		lblNewLabel_3_2_1_1_1_1_3_1_2.setForeground(new Color(0, 51, 102));
		lblNewLabel_3_2_1_1_1_1_3_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_3_1_2.setBounds(799, 682, 62, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3_1_2);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(PLFlexible.class.getResource("/images/flexbg.png")));
		lblNewLabel_6.setBounds(189, 0, 965, 265);
		contentPane.add(lblNewLabel_6);
		
		JButton btbFlex = new JButton("");
		btbFlex.setBackground(new Color(255, 255, 255));
		btbFlex.setIcon(new ImageIcon(PLDreamComer.class.getResource("/images/Click for more info!.png")));
		btbFlex.setBorder(null);
		btbFlex.setBounds(266, 462, 134, 32);
		btbFlex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FlexibleBENEFITS t = new FlexibleBENEFITS();
				t.show();
				dispose();
			}
		});
		contentPane.add(btbFlex);
	}
}