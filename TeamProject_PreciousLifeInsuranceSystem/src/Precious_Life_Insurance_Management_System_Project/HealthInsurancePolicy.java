package Precious_Life_Insurance_Management_System_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class HealthInsurancePolicy extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HealthInsurancePolicy frame = new HealthInsurancePolicy();
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
	public HealthInsurancePolicy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 841);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(HealthInsurancePolicy.class.getResource("/images/HealthLogo (1).png")));
		lblNewLabel_4.setBounds(271, 38, 96, 91);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Health Insurance Policy");
		lblNewLabel_3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 50));
		lblNewLabel_3.setBounds(419, 54, 610, 50);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(0, 84, 168));
		panel.setBounds(0, 0, 127, 163);
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(HealthInsurancePolicy.class.getResource("/images/logoPng-MIDSIZE.png")));
		lblNewLabel_2.setBounds(-13, 10, 117, 132);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(0, 64, 128));
		panel_1.setBounds(126, 0, 42, 163);
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(new Color(0, 45, 105));
		panel_1_1.setBounds(165, 0, 42, 163);
		contentPane.add(panel_1_1);
		
		JButton Health75 = new JButton("New button");
		Health75.setIcon(new ImageIcon(HealthInsurancePolicy.class.getResource("/images/Health75.png")));
		Health75.setBorder(null);
		Health75.setBounds(47, 241, 334, 472);
		contentPane.add(Health75);
		
		JButton Health80 = new JButton("New button");
		Health80.setIcon(new ImageIcon(HealthInsurancePolicy.class.getResource("/images/Health80.png")));
		Health80.setBorder(null);
		Health80.setBounds(424, 241, 334, 472);
		contentPane.add(Health80);
		
		JButton HealthCritical = new JButton("New button");
		HealthCritical.setIcon(new ImageIcon(HealthInsurancePolicy.class.getResource("/images/HealthCritical.png")));
		HealthCritical.setBorder(null);
		HealthCritical.setBounds(792, 241, 334, 472);
		contentPane.add(HealthCritical);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(HealthInsurancePolicy.class.getResource("/images/agreementbg.png")));
		lblNewLabel.setBounds(208, 0, 948, 163);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				Dashboard t = new Dashboard();
				t.show();
				dispose();
			}
		});
		btnNewButton_4.setIcon(new ImageIcon(HealthInsurancePolicy.class.getResource("/images/backbutton.png")));
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setBounds(558, 739, 62, 55);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel_1 = new JLabel("Health insurance plans for your health protection needs");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(286, 193, 623, 25);
		contentPane.add(lblNewLabel_1);
	}

}
