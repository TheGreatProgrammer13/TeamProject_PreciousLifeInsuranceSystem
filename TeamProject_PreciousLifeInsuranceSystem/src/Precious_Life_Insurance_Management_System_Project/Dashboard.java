package Precious_Life_Insurance_Management_System_Project;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private JButton btnNewButton_4;
	private JPanel contentPane_1;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JLabel lblNewLabel_1;
	private JPanel panel;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private final JLabel lblNewLabel_7 = new JLabel("(You can only choose one for this transaction)");
	private JLabel lblNewLabel_8;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
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
	public Dashboard() {
		setUndecorated(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1084, 614);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Poppins", Font.BOLD, 10));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btbLife = new JButton("New button");
		btbLife.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				LifeInsurancePolicy t = new LifeInsurancePolicy();
				t.show();
				dispose();
			}
		});
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(1030, 10, 18, 28);
		contentPane.add(lblX);
		lblX.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(JOptionPane.showConfirmDialog(null, "Are you sure you want to close this application?","Confirmation", JOptionPane.YES_NO_OPTION) == 0 ) {
					Dashboard.this.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblX.setForeground(Color.red);
			}
		});
		lblX.setBackground(new Color(240, 240, 240));
		lblX.setForeground(new Color(255, 255, 255));
		lblX.setHorizontalAlignment(SwingConstants.CENTER);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 14));
		btbLife.setBounds(60, 228, 191, 171);
		btbLife.setAlignmentY(0.0f);
		btbLife.setBorder(null);
		btbLife.setBackground(new Color(255, 255, 255));
		btbLife.setForeground(new Color(255, 255, 255));
		btbLife.setIcon(new ImageIcon(Dashboard.class.getResource("/images/2.png")));
		contentPane.add(btbLife);
		
		JButton btbHealth = new JButton("New button");
		btbHealth.setBounds(261, 228, 191, 171);
		btbHealth.setBorder(null);
		btbHealth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HealthInsurancePolicy t = new HealthInsurancePolicy();
				t.show();
				dispose();
			}
		});
		btbHealth.setIcon(new ImageIcon(Dashboard.class.getResource("/images/1.png")));
		contentPane.add(btbHealth);
		
		JButton btbEducation = new JButton("New button");
		btbEducation.setBounds(462, 228, 191, 171);
		btbEducation.setBorder(null);
		btbEducation.setIcon(new ImageIcon(Dashboard.class.getResource("/images/3.png")));
		contentPane.add(btbEducation);
		
		JButton btbInvestment = new JButton("New button");
		btbInvestment.setBounds(663, 228, 191, 171);
		btbInvestment.setBorder(null);
		btbInvestment.setIcon(new ImageIcon(Dashboard.class.getResource("/images/4.png")));
		contentPane.add(btbInvestment);
		
		contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setFont(new Font("Poppins", Font.BOLD, 10));
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(Color.WHITE);
		contentPane_1.setBounds(0, 0, 1070, 577);
		contentPane.add(contentPane_1);
		
		btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBorder(null);
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.setAlignmentY(0.0f);
		btnNewButton_5.setBounds(60, 228, 191, 171);
		contentPane_1.add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("New button");
		btnNewButton_6.setBorder(null);
		btnNewButton_6.setBounds(261, 228, 191, 171);
		contentPane_1.add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("New button");
		btnNewButton_7.setBorder(null);
		btnNewButton_7.setBounds(462, 228, 191, 171);
		contentPane_1.add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("New button");
		btnNewButton_8.setBorder(null);
		btnNewButton_8.setBounds(663, 228, 191, 171);
		contentPane_1.add(btnNewButton_8);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 45, 105));
		panel.setBounds(0, 0, 1070, 94);
		contentPane_1.add(panel);
		panel.setLayout(null);
		
		btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					MainDashboard t = new MainDashboard();
					t.show();
					dispose();

				}
			}
		});

		btnNewButton.setIcon(new ImageIcon(Dashboard.class.getResource("/images/SmallSize.png")));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 45, 105));
		btnNewButton.setBounds(10, 10, 78, 74);
		panel.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(-228, -28, 69, 66);
		contentPane_1.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Life");
		lblNewLabel_2.setFont(new Font("Poppins", Font.BOLD, 30));
		lblNewLabel_2.setBounds(112, 417, 59, 35);
		contentPane_1.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Health");
		lblNewLabel_3.setFont(new Font("Poppins", Font.BOLD, 30));
		lblNewLabel_3.setBounds(300, 417, 101, 35);
		contentPane_1.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Education");
		lblNewLabel_4.setFont(new Font("Poppins", Font.BOLD, 30));
		lblNewLabel_4.setBounds(482, 417, 155, 35);
		contentPane_1.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Investment");
		lblNewLabel_5.setFont(new Font("Poppins", Font.BOLD, 30));
		lblNewLabel_5.setBounds(673, 417, 169, 35);
		contentPane_1.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("What type of insurance plan are you going to avail?");
		lblNewLabel_6.setFont(new Font("Poppins", Font.BOLD, 25));
		lblNewLabel_6.setBounds(253, 137, 611, 55);
		contentPane_1.add(lblNewLabel_6);
		lblNewLabel_7.setForeground(new Color(128, 128, 128));
		lblNewLabel_7.setFont(new Font("Poppins", Font.BOLD, 24));
		lblNewLabel_7.setBounds(284, 495, 585, 36);
		contentPane_1.add(lblNewLabel_7);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					MainDashboard t = new MainDashboard();
					t.show();
					dispose();

				}
			}
		});
		btnNewButton_4.setBounds(10, 104, 62, 55);
		contentPane_1.add(btnNewButton_4);
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setIcon(new ImageIcon(Dashboard.class.getResource("/images/backbutton.png")));
		
		JButton btbRetirement = new JButton("New button");
		btbRetirement.setIcon(new ImageIcon(Dashboard.class.getResource("/images/4.png")));
		btbRetirement.setForeground(Color.WHITE);
		btbRetirement.setBorder(null);
		btbRetirement.setBackground(Color.WHITE);
		btbRetirement.setAlignmentY(0.0f);
		btbRetirement.setBounds(864, 228, 191, 171);
		contentPane_1.add(btbRetirement);
		
		lblNewLabel_8 = new JLabel("Retirement");
		lblNewLabel_8.setFont(new Font("Dialog", Font.BOLD, 30));
		lblNewLabel_8.setBounds(874, 417, 169, 35);
		contentPane_1.add(lblNewLabel_8);
	}
}