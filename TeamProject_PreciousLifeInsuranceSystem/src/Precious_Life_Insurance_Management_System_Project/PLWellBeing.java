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

public class PLWellBeing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PLHiraya frame = new PLHiraya();
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
	public PLWellBeing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 843);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 84, 168));
		panel_1_1_1.setBounds(107, 150, 379, 89);
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblSerene = new JLabel("WELL-BEING\r\n");
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
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(PLWellBeing.class.getResource("/images/HealthLogo (1).png")));
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
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(0, 64, 128));
		panel_1.setBounds(107, 0, 42, 838);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(new Color(0, 45, 105));
		panel_1_1.setBounds(148, 0, 42, 838);
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("PreciousLife WELL-BEING");
		lblNewLabel_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
		lblNewLabel_3_1.setBounds(271, 290, 313, 32);
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
		
		JLabel lblNewLabel_3_2_1_1_1_1_1 = new JLabel("Health protection");
		lblNewLabel_3_2_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_1.setBounds(291, 565, 211, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_2 = new JLabel("Insurance coverage\r\n");
		lblNewLabel_3_2_1_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_2.setBounds(291, 595, 244, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_2);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3 = new JLabel("Simplified issue offer (SIO)");
		lblNewLabel_3_2_1_1_1_1_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_3.setBounds(291, 625, 272, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1_1_2.setBackground(new Color(0, 45, 105));
		panel_1_1_2.setBounds(229, 571, 12, 89);
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
		
		JLabel lblNewLabel_3_1_1 = new JLabel("is an easy-to-use, low-cost health and life solution ");
		lblNewLabel_3_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_3_1_1.setBounds(562, 290, 538, 32);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("that provides protection benefits to help you survive any stage of a serious ");
		lblNewLabel_3_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_3_1_2.setBounds(286, 321, 852, 32);
		contentPane.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("disease so you may be well and live the life you want.\r");
		lblNewLabel_3_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		lblNewLabel_3_1_2_1.setBounds(438, 351, 574, 32);
		contentPane.add(lblNewLabel_3_1_2_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(PLWellBeing.class.getResource("/images/suitablePictue.png")));
		lblNewLabel_7.setBounds(715, 559, 360, 114);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Moving Up");
		lblNewLabel_8.setForeground(new Color(0, 0, 128));
		lblNewLabel_8.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		lblNewLabel_8.setBounds(725, 677, 86, 32);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("Preparing");
		lblNewLabel_8_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		lblNewLabel_8_1.setBounds(855, 677, 86, 32);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_1_1_1 = new JLabel("Leaving a");
		lblNewLabel_8_1_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1_1_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		lblNewLabel_8_1_1_1.setBounds(975, 677, 86, 32);
		contentPane.add(lblNewLabel_8_1_1_1);
		
		JLabel lblNewLabel_8_1_1_1_1 = new JLabel("Legacy");
		lblNewLabel_8_1_1_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1_1_1_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		lblNewLabel_8_1_1_1_1.setBounds(985, 708, 63, 32);
		contentPane.add(lblNewLabel_8_1_1_1_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Ahead");
		lblNewLabel_8_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		lblNewLabel_8_1_1.setBounds(865, 708, 57, 32);
		contentPane.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(PLWellBeing.class.getResource("/images/healthpic3.png")));
		lblNewLabel_6.setBounds(190, 0, 988, 257);
		contentPane.add(lblNewLabel_6);
	}
}