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

public class FlexibleBENEFITS extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlexibleBENEFITS frame = new FlexibleBENEFITS();
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
	public FlexibleBENEFITS() {
		setForeground(new Color(255, 255, 255));
		setBackground(new Color(0, 0, 0));
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
		panel.setBounds(0, 0, 108, 806);
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(0, 84, 168));
		contentPane.add(panel);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					PLFlexible t = new PLFlexible();
					t.show();
					dispose();

				}
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(PLDreamComer.class.getResource("/images/backbutton.png")));
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(new Color(0, 84, 168));
		btnNewButton_4.setBounds(24, 673, 62, 55);
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
		btnNewButton_4_1_1.setBounds(18, 11, 89, 122);
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
		
		JLabel lblNewLabel_3 = new JLabel("Choose among the investment fund options to");
		lblNewLabel_3.setBounds(287, 355, 376, 32);
		lblNewLabel_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Flexible investment options");
		lblNewLabel_3_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_3_1.setBounds(287, 334, 302, 32);
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
		
		JLabel lblDreamComer_1 = new JLabel("FLEXIBLE:");
		lblDreamComer_1.setForeground(new Color(255, 204, 0));
		lblDreamComer_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblDreamComer_1.setBounds(555, 92, 218, 24);
		contentPane.add(lblDreamComer_1);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("Funds for future needs");
		lblNewLabel_3_1_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_3_1_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_1_3.setBounds(694, 96, 302, 32);
		contentPane.add(lblNewLabel_3_1_3);
		
		JLabel lblNewLabel_3_2 = new JLabel("address your different investment objectives and risk");
		lblNewLabel_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(287, 377, 393, 32);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("appetite.\r\n");
		lblNewLabel_3_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1.setBounds(287, 398, 383, 32);
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("milestone. In case of an emergency, money");
		lblNewLabel_3_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_1.setBounds(694, 160, 383, 32);
		contentPane.add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_3_2_2 = new JLabel("comfortable retirement, or an important life");
		lblNewLabel_3_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_2.setBounds(694, 139, 376, 32);
		contentPane.add(lblNewLabel_3_2_2);
		
		JLabel lblNewLabel_3_4 = new JLabel("Build funds for your child's education, a");
		lblNewLabel_3_4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_4.setBounds(694, 117, 376, 32);
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_2_1_1_1 = new JLabel("comes in handy via a partial fund withdrawal.");
		lblNewLabel_3_2_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_1_1.setBounds(694, 182, 383, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1);
		
		JLabel lblNewLabel_3_3_1_2_1 = new JLabel("together.");
		lblNewLabel_3_3_1_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_1_2_1.setBounds(287, 291, 376, 32);
		contentPane.add(lblNewLabel_3_3_1_2_1);
		
		JLabel lblNewLabel_3_3_2_2 = new JLabel("they can still fulfill the dreams you have planned");
		lblNewLabel_3_3_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_2_2.setBounds(287, 269, 376, 32);
		contentPane.add(lblNewLabel_3_3_2_2);
		
		JLabel lblNewLabel_3_3_1_2 = new JLabel("your family in their daily expenses and to ensure that");
		lblNewLabel_3_3_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_1_2.setBounds(287, 248, 393, 32);
		contentPane.add(lblNewLabel_3_3_1_2);
		
		JLabel lblNewLabel_3_3_4 = new JLabel("of untimely demise. The amount can be used to help");
		lblNewLabel_3_3_4.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_4.setBounds(287, 226, 393, 32);
		contentPane.add(lblNewLabel_3_3_4);
		
		JLabel lblNewLabel_3_3_2_1 = new JLabel("Face Amount, which goes to your family in the event");
		lblNewLabel_3_3_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_2_1.setBounds(287, 204, 402, 32);
		contentPane.add(lblNewLabel_3_3_2_1);
		
		JLabel lblNewLabel_3_3_1_1 = new JLabel("nsurance benefits equivalent to at least your plan’s\r\n");
		lblNewLabel_3_3_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_1_1.setBounds(287, 183, 393, 32);
		contentPane.add(lblNewLabel_3_3_1_1);
		
		JLabel lblNewLabel_3_3_3 = new JLabel("Secure your loved ones' future with guaranteed life");
		lblNewLabel_3_3_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_3.setBounds(287, 161, 383, 32);
		contentPane.add(lblNewLabel_3_3_3);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Living benefits\r\n");
		lblNewLabel_3_1_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_3_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_1_2.setBounds(287, 139, 302, 32);
		contentPane.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Take advantage of PL’s professional fund managers' ");
		lblNewLabel_3_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(287, 462, 393, 32);
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Professional fund management");
		lblNewLabel_3_1_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_3_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_1_1.setBounds(287, 441, 302, 32);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2_3 = new JLabel("investment experience and expertise.\r\n");
		lblNewLabel_3_2_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_3.setBounds(287, 484, 376, 32);
		contentPane.add(lblNewLabel_3_2_3);
		
		JLabel lblNewLabel_3_2_1_1_2 = new JLabel("payments on top of your regular premium.\r\n");
		lblNewLabel_3_2_1_1_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_1_1_2.setBounds(694, 289, 383, 32);
		contentPane.add(lblNewLabel_3_2_1_1_2);
		
		JLabel lblNewLabel_3_2_2_1 = new JLabel("anytime through top-ups or excess\r\n");
		lblNewLabel_3_2_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_2_2_1.setBounds(694, 268, 376, 32);
		contentPane.add(lblNewLabel_3_2_2_1);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("You may opt to increase your fund’s value");
		lblNewLabel_3_4_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_4_1.setBounds(694, 246, 376, 32);
		contentPane.add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_3_1_3_1 = new JLabel("Manageable premium payment");
		lblNewLabel_3_1_3_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_3_1_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_1_3_1.setBounds(694, 225, 302, 32);
		contentPane.add(lblNewLabel_3_1_3_1);
		
		JLabel lblNewLabel_3_3_1_2_1_1 = new JLabel("influencing the loyalty incentive, which is not ");
		lblNewLabel_3_3_1_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_1_2_1_1.setBounds(694, 486, 376, 32);
		contentPane.add(lblNewLabel_3_3_1_2_1_1);
		
		JLabel lblNewLabel_3_3_2_2_1 = new JLabel("your dreams faster. One of the criteria");
		lblNewLabel_3_3_2_2_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_2_2_1.setBounds(694, 464, 376, 32);
		contentPane.add(lblNewLabel_3_3_2_2_1);
		
		JLabel lblNewLabel_3_3_1_2_2 = new JLabel("investment or simply to help you achieve");
		lblNewLabel_3_3_1_2_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_1_2_2.setBounds(694, 443, 376, 32);
		contentPane.add(lblNewLabel_3_3_1_2_2);
		
		JLabel lblNewLabel_3_3_4_1 = new JLabel("additional source of funds to boost your");
		lblNewLabel_3_3_4_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_4_1.setBounds(694, 421, 376, 32);
		contentPane.add(lblNewLabel_3_3_4_1);
		
		JLabel lblNewLabel_3_3_2_1_1 = new JLabel("Bonus. The bonus can be used as an ");
		lblNewLabel_3_3_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_2_1_1.setBounds(694, 399, 376, 32);
		contentPane.add(lblNewLabel_3_3_2_1_1);
		
		JLabel lblNewLabel_3_3_1_1_1 = new JLabel("and reap rewards in the form of Loyalty");
		lblNewLabel_3_3_1_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_1_1_1.setBounds(694, 378, 376, 32);
		contentPane.add(lblNewLabel_3_3_1_1_1);
		
		JLabel lblNewLabel_3_3_3_1 = new JLabel("Keep your policy active for at least 10 years");
		lblNewLabel_3_3_3_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_3_1.setBounds(694, 356, 383, 32);
		contentPane.add(lblNewLabel_3_3_3_1);
		
		JLabel lblNewLabel_3_1_2_1 = new JLabel("Loyalty bonus");
		lblNewLabel_3_1_2_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_3_1_2_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 15));
		lblNewLabel_3_1_2_1.setBounds(694, 334, 302, 32);
		contentPane.add(lblNewLabel_3_1_2_1);
		
		JLabel lblNewLabel_3_3_2_2_1_1 = new JLabel("guaranteed, is the fund's average monthly balance.");
		lblNewLabel_3_3_2_2_1_1.setFont(new Font("Microsoft YaHei", Font.PLAIN, 15));
		lblNewLabel_3_3_2_2_1_1.setBounds(694, 507, 376, 32);
		contentPane.add(lblNewLabel_3_3_2_2_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(FlexibleBENEFITS.class.getResource("/images/flexbenbg.png")));
		lblNewLabel_6.setBounds(188, 576, 966, 165);
		contentPane.add(lblNewLabel_6);
	}
}
