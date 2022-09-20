package Precious_Life_Insurance_Management_System_Project;
import java.awt.BorderLayout;
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

import java.beans.VetoableChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class RetirementPolicy extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RetirementPolicy frame = new RetirementPolicy();
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
	public RetirementPolicy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 841);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.addVetoableChangeListener(new VetoableChangeListener() {
			public void vetoableChange(PropertyChangeEvent evt) {
			}
		});
		lblNewLabel_4.setIcon(new ImageIcon(RetirementPolicy.class.getResource("/images/Retirement_Logo.png")));
		lblNewLabel_4.setBounds(271, 38, 96, 91);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Retirement Insurance Policy");
		lblNewLabel_3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 50));
		lblNewLabel_3.setBounds(373, 54, 709, 50);
		contentPane.add(lblNewLabel_3);
		
		JButton StabilizeRetirement = new JButton("New button");
		StabilizeRetirement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PLRetirement_Stabalize t = new PLRetirement_Stabalize();
				t.show();
				dispose();
			}
		});
		StabilizeRetirement.setBounds(58, 247, 316, 472);
		StabilizeRetirement.setIcon(new ImageIcon(RetirementPolicy.class.getResource("/images/retirementStabilize.png")));
		contentPane.add(StabilizeRetirement);
		
		JButton BrighterRetirement = new JButton("New button");
		BrighterRetirement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PLRetirement_BrigtherLife t = new PLRetirement_BrigtherLife();
				t.show();
				dispose();
			}
		});
		BrighterRetirement.setBounds(435, 247, 316, 472);
		BrighterRetirement.setIcon(new ImageIcon(RetirementPolicy.class.getResource("/images/retirementBrighter.png")));
		contentPane.add(BrighterRetirement);
		
		JButton MaxChoiceRetirement = new JButton("New button");
		MaxChoiceRetirement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PLRetirement_MaxChoice t = new PLRetirement_MaxChoice();
				t.show();
				dispose();
			}
		});
		MaxChoiceRetirement.setBounds(797, 247, 316, 472);
		MaxChoiceRetirement.setIcon(new ImageIcon(RetirementPolicy.class.getResource("/images/retirementMaxChoice.png")));
		contentPane.add(MaxChoiceRetirement);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 127, 163);
		panel.setBorder(null);
		panel.setBackground(new Color(0, 84, 168));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(LifeInsurancePolicy.class.getResource("/images/logoPng-MIDSIZE.png")));
		lblNewLabel_2.setBounds(-13, 10, 117, 132);
		panel.add(lblNewLabel_2);
		
		JLabel RetirementPicture = new JLabel("");
		RetirementPicture.setBounds(209, 0, 974, 163);
		RetirementPicture.setIcon(new ImageIcon(RetirementPolicy.class.getResource("/images/Retirement_Picture2.png")));
		contentPane.add(RetirementPicture);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(126, 0, 42, 163);
		panel_1.setBorder(null);
		panel_1.setBackground(new Color(0, 64, 128));
		contentPane.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(167, 0, 42, 163);
		panel_1_1.setBorder(null);
		panel_1_1.setBackground(new Color(0,45,105));
		contentPane.add(panel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Plans for your Retirement needs");
		lblNewLabel_1.setBounds(419, 196, 365, 25);
		lblNewLabel_1.setFont(new Font("Poppins", Font.PLAIN, 25));
		contentPane.add(lblNewLabel_1);
		
		JButton BackButtonRetirement = new JButton("");
		BackButtonRetirement.addVetoableChangeListener(new VetoableChangeListener() {
			public void vetoableChange(PropertyChangeEvent evt) {
			}
		});
		
		
		BackButtonRetirement.setBorder(null);
		BackButtonRetirement.setBounds(558, 739, 62, 55);
		BackButtonRetirement.setIcon(new ImageIcon(LifeInsurancePolicy.class.getResource("/images/backbutton.png")));
		BackButtonRetirement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dashboard t = new Dashboard();
				t.show();
				dispose();
			}
		});
		BackButtonRetirement.setBackground(Color.WHITE);
		contentPane.add(BackButtonRetirement);
	}

}
