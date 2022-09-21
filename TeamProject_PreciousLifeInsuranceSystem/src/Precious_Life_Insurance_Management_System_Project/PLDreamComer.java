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

public class PLDreamComer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PLDreamComer frame = new PLDreamComer();
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
	public PLDreamComer() {
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
		lblGetAQuote_1.setBounds(837, 68, 317, 55);
		contentPane.add(lblGetAQuote_1);
		
		JLabel lblGetAQuote = new JLabel("Get a quote");
		lblGetAQuote.setForeground(new Color(242, 200, 71));
		lblGetAQuote.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblGetAQuote.setBounds(833, 68, 302, 55);
		contentPane.add(lblGetAQuote);
		
		JButton PLDC = new JButton("");
		PLDC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PaymentFrame t = new PaymentFrame();
				t.show();
				dispose();
			}
		});
		PLDC.setIcon(new ImageIcon(PLDreamComer.class.getResource("/images/NowButton1.png")));
		PLDC.setForeground(Color.WHITE);
		PLDC.setFont(new Font("Verdana", Font.BOLD, 54));
		PLDC.setBackground(new Color(0, 64, 128));
		PLDC.setBounds(862, 121, 292, 72);
		contentPane.add(PLDC);
		
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
					EducationInsurancePolicy t = new EducationInsurancePolicy();
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
		btnNewButton_4_1_1.setBounds(9, 11, 98, 122);
		btnNewButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					MainDashboard t = new MainDashboard();
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
		
		JLabel lblNewLabel_3 = new JLabel("is a life insurance and savings plan created to");
		lblNewLabel_3.setBounds(567, 311, 497, 32);
		lblNewLabel_3.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("PreciousLife Dream Comer\r\n");
		lblNewLabel_3_1.setBounds(266, 311, 302, 32);
		lblNewLabel_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel(" secure your family's financial future while paying for your child's education.");
		lblNewLabel_3_2.setBounds(254, 342, 810, 32);
		lblNewLabel_3_2.setFont(new Font("Microsoft YaHei", Font.PLAIN, 22));
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4 = new JLabel("BENEFITS");
		lblNewLabel_4.setBounds(263, 482, 272, 72);
		lblNewLabel_4.setForeground(new Color(235, 200, 1));
		lblNewLabel_4.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 60));
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("SUITABLE FOR");
		lblNewLabel_4_1.setBounds(762, 487, 313, 72);
		lblNewLabel_4_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_4_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 46));
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_1 = new JLabel("Life insurance coverage");
		lblNewLabel_3_2_1_1_1_1_1.setBounds(291, 585, 211, 32);
		lblNewLabel_3_2_1_1_1_1_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_2 = new JLabel("Guaranteed education benefits");
		lblNewLabel_3_2_1_1_1_1_2.setBounds(291, 608, 302, 32);
		lblNewLabel_3_2_1_1_1_1_2.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_2);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3 = new JLabel("Flexible premium payment");
		lblNewLabel_3_2_1_1_1_1_3.setBounds(291, 636, 272, 32);
		lblNewLabel_3_2_1_1_1_1_3.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBounds(235, 566, 12, 133);
		panel_1_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1_1_2.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1_2);
		
		JLabel lblNewLabel_5 = new JLabel("\u25CF");
		lblNewLabel_5.setBounds(273, 595, 18, 13);
		lblNewLabel_5.setForeground(new Color(235, 200, 1));
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("\u25CF");
		lblNewLabel_5_1.setBounds(273, 618, 18, 13);
		lblNewLabel_5_1.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("\u25CF");
		lblNewLabel_5_2.setBounds(273, 646, 18, 13);
		lblNewLabel_5_2.setForeground(new Color(235, 200, 1));
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		contentPane.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(PLDreamComer.class.getResource("/images/Ellipse 17.png")));
		lblNewLabel_7.setBounds(864, 557, 108, 111);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3_1 = new JLabel("Moving Up");
		lblNewLabel_3_2_1_1_1_1_3_1.setForeground(new Color(0, 51, 102));
		lblNewLabel_3_2_1_1_1_1_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 17));
		lblNewLabel_3_2_1_1_1_1_3_1.setBounds(874, 667, 117, 32);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 45, 105));
		panel_1_1_1.setBounds(189, 153, 371, 89);
		contentPane.add(panel_1_1_1);
		
		JLabel lblDreamComer = new JLabel("DREAM COMER\r\n");
		lblDreamComer.setForeground(Color.WHITE);
		lblDreamComer.setFont(new Font("Tahoma", Font.BOLD, 42));
		lblDreamComer.setBounds(38, 34, 328, 44);
		panel_1_1_1.add(lblDreamComer);
		
		JLabel lblNewLabel = new JLabel("PRECIOUS LIFE");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(38, 10, 183, 24);
		panel_1_1_1.add(lblNewLabel);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(PLDreamComer.class.getResource("/images/dreambg.png")));
		lblNewLabel_6.setBounds(189, 0, 965, 265);
		contentPane.add(lblNewLabel_6);
		
		JButton clickInfoSerendipity = new JButton("Click here for more info!");
		clickInfoSerendipity.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DreamComerBENEFITS t = new DreamComerBENEFITS();
				t.show();
				dispose();

			}
		});
		clickInfoSerendipity.setForeground(Color.GRAY);
		clickInfoSerendipity.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 19));
		clickInfoSerendipity.setBorder(UIManager.getBorder("TableHeader.cellBorder"));
		clickInfoSerendipity.setBackground(Color.WHITE);
		clickInfoSerendipity.setBounds(235, 457, 260, 23);
		contentPane.add(clickInfoSerendipity);
	}
}
