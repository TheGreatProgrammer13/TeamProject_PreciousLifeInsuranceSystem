package Precious_Life_Insurance_Management_System_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AboutUS extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AboutUS frame = new AboutUS();
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
	public AboutUS() {
		setBackground(new Color(255, 255, 255));
		setUndecorated(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 933, 605);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setToolTipText("");
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?","Confirmation", JOptionPane.YES_NO_OPTION) == 0 ) {
					AboutUS.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.red);
			}
		});
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon(AboutUS.class.getResource("/images/backbutton.png")));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					MainDashboard t = new MainDashboard();
					t.show();
					dispose();

				}
			}
		});
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setBounds(98, 187, 62, 55);
		contentPane.add(btnNewButton_4);
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setForeground(Color.WHITE);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblX.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblX.setBackground(new Color(0, 64, 128));
		lblX.setBounds(891, 10, 18, 28);
		contentPane.add(lblX);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(0, 45, 105));
		panel.setBounds(0, 0, 88, 593);
		contentPane.add(panel);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(AboutUS.class.getResource("/images/SmallSize.png")));
		lblNewLabel_4.setBounds(10, 10, 67, 71);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(null);
		lblNewLabel.setIcon(new ImageIcon(AboutUS.class.getResource("/images/Life Insurance Photo3.jpg")));
		lblNewLabel.setBounds(-147, 0, 1066, 177);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("About Us");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_1.setBounds(451, 200, 119, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Precious Life Impact");
		lblNewLabel_2.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 20));
		lblNewLabel_2.setBounds(169, 255, 197, 21);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Launched   in   2022,   our   corporate   social ");
		lblNewLabel_3.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(119, 286, 347, 13);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("responsibility (CSR) program, Precious Life , is ");
		lblNewLabel_3_1.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 16));
		lblNewLabel_3_1.setBounds(119, 309, 347, 13);
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("designed  to  financially   guard   you  against");
		lblNewLabel_3_1_1.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 16));
		lblNewLabel_3_1_1.setBounds(119, 332, 392, 13);
		contentPane.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("unpredictable life occurrences.");
		lblNewLabel_3_1_1_1.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 16));
		lblNewLabel_3_1_1_1.setBounds(119, 355, 347, 13);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Precious Life Impact");
		lblNewLabel_2_1.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(623, 255, 197, 21);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Precious   life   is  our  guide   for   the   strategies,");
		lblNewLabel_3_2.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 16));
		lblNewLabel_3_2.setBounds(521, 286, 376, 13);
		contentPane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("emphasize service   and  ongoing support that will");
		lblNewLabel_3_2_1.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 16));
		lblNewLabel_3_2_1.setBounds(521, 309, 376, 13);
		contentPane.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("take our company, customers, partners, employees");
		lblNewLabel_3_2_1_1.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 16));
		lblNewLabel_3_2_1_1.setBounds(521, 332, 383, 13);
		contentPane.add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1 = new JLabel("and communities into the bright future we envision.");
		lblNewLabel_3_2_1_1_1.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 16));
		lblNewLabel_3_2_1_1_1.setBounds(521, 357, 383, 13);
		contentPane.add(lblNewLabel_3_2_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1 = new JLabel("COPYRIGHT  ANY   ILLEGAL   REPRODUCTION OF THIS CONTENT WILL RESULT  IN");
		lblNewLabel_3_2_1_1_1_1.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lblNewLabel_3_2_1_1_1_1.setBounds(262, 405, 496, 13);
		contentPane.add(lblNewLabel_3_2_1_1_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("2022-2023 ALL RIGHTS RESERVED");
		lblNewLabel_2_2.setFont(new Font("Microsoft New Tai Lue", Font.BOLD, 17));
		lblNewLabel_2_2.setBounds(371, 520, 282, 21);
		contentPane.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2_1_1_1_1_1 = new JLabel("IMMEDIATE LEGAL ACTION. COPYRIGHT DISCLAIMER UNDER SECTION 107 OF THE");
		lblNewLabel_3_2_1_1_1_1_1.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lblNewLabel_3_2_1_1_1_1_1.setBounds(262, 428, 503, 13);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_1);
		
		JLabel lblNewLabel_3_2_1_1_1_1_2 = new JLabel("COPYRIGHT ACT:  THIS  DISCLAIMER APPEARS ON SYSTEM THAT USES SOMEONE");
		lblNewLabel_3_2_1_1_1_1_2.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lblNewLabel_3_2_1_1_1_1_2.setBounds(262, 451, 496, 13);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_2);
		
		JLabel lblNewLabel_3_2_1_1_1_1_3 = new JLabel("ELSE'S   COPYRIGHTED   CONTENT.   NCLUDING THIS STATEMENT  OF  \"FAIR USE\" ");
		lblNewLabel_3_2_1_1_1_1_3.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lblNewLabel_3_2_1_1_1_1_3.setBounds(262, 474, 496, 13);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_3);
		
		JLabel lblNewLabel_3_2_1_1_1_1_4 = new JLabel("HELPS PROTECT AGAINST COPYRIGHT INFRINGEMENT CLAIMS.");
		lblNewLabel_3_2_1_1_1_1_4.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13));
		lblNewLabel_3_2_1_1_1_1_4.setBounds(262, 497, 483, 13);
		contentPane.add(lblNewLabel_3_2_1_1_1_1_4);
	}
}
