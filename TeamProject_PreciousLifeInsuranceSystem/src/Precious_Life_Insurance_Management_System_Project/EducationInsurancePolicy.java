package Precious_Life_Insurance_Management_System_Project;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class EducationInsurancePolicy extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EducationInsurancePolicy frame = new EducationInsurancePolicy();
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
	public EducationInsurancePolicy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 841);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(EducationInsurancePolicy.class.getResource("/images/EducationLogo.png")));
		lblNewLabel_4.setBounds(271, 38, 96, 91);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Education Insurance Policy");
		lblNewLabel_3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 50));
		lblNewLabel_3.setBounds(419, 54, 757, 50);
		contentPane.add(lblNewLabel_3);
		
		JButton DreamComer = new JButton("New button");
		DreamComer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PLDreamComer t = new PLDreamComer();
				t.show();
				dispose();
			}
		});
		DreamComer.setBounds(45, 247, 334, 472);
		DreamComer.setBorder(null);
		DreamComer.setIcon(new ImageIcon(EducationInsurancePolicy.class.getResource("/images/Dream Comer.png")));
		contentPane.add(DreamComer);
		
		JButton BrighterLife = new JButton("New button");
		BrighterLife.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				PLBrighterLife t = new PLBrighterLife();
				t.show();
				dispose();
				
			}
		});
		BrighterLife.setBounds(423, 247, 329, 472);
		BrighterLife.setBorder(null);
		BrighterLife.setIcon(new ImageIcon(EducationInsurancePolicy.class.getResource("/images/Brighter Life.png")));
		contentPane.add(BrighterLife);
		
		JButton Flexible = new JButton("New button");
		Flexible.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				PLFlexible t = new PLFlexible ();
				t.show();
				dispose();
				
			}
		});
		Flexible.setBounds(794, 247, 334, 472);
		Flexible.setBorder(null);
		Flexible.setIcon(new ImageIcon(EducationInsurancePolicy.class.getResource("/images/Flexible.png")));
		contentPane.add(Flexible);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 127, 163);
		panel.setBorder(null);
		panel.setBackground(new Color(0, 84, 168));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(126, 0, 44, 163);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(0, 64, 128));
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(169, 0, 44, 163);
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(new Color(0,45,105));
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel(" Plans for your Children's Education Needs");
		lblNewLabel_1.setBounds(354, 197, 684, 25);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBounds(558, 739, 62, 55);
		btnNewButton_4.setIcon(new ImageIcon(LifeInsurancePolicy.class.getResource("/images/backbutton.png")));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard t = new Dashboard();
				t.show();
				dispose();
			}
		});
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setBackground(Color.WHITE);
		contentPane.add(btnNewButton_4);
		
		
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(EducationInsurancePolicy.class.getResource("/images/educbg.png")));
		lblNewLabel.setBounds(206, 0, 948, 163);
		contentPane.add(lblNewLabel);
	}

}
