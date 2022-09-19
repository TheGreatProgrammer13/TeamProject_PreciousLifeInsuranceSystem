package Precious_Life_Insurance_Management_System_Project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class LifeInsurancePolicy extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LifeInsurancePolicy frame = new LifeInsurancePolicy();
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
	public LifeInsurancePolicy() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 841);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(LifeInsurancePolicy.class.getResource("/images/LifeLogo1 (1).png")));
		lblNewLabel_4.setBounds(271, 38, 96, 91);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Life Insurance Policy");
		lblNewLabel_3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 50));
		lblNewLabel_3.setBounds(419, 54, 527, 50);
		contentPane.add(lblNewLabel_3);
		
		JButton Serene = new JButton("New button");
		Serene.setForeground(new Color(0, 0, 0));
		Serene.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PLSerene t = new PLSerene();
				t.show();
				dispose();
			}
		});
		Serene.setBounds(28, 247, 351, 472);
		Serene.setBorder(null);
		Serene.setIcon(new ImageIcon(LifeInsurancePolicy.class.getResource("/images/Serene88.png")));
		contentPane.add(Serene);
		
		JButton Serendipity = new JButton("New button");
		Serendipity.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				PLSerendipity t = new PLSerendipity();
				t.show();
				dispose();
				
			}
		});
		Serendipity.setBounds(407, 247, 345, 472);
		Serendipity.setBorder(null);
		Serendipity.setIcon(new ImageIcon(LifeInsurancePolicy.class.getResource("/images/Serendipity90.png")));
		contentPane.add(Serendipity);
		
		JButton Hiraya = new JButton("New button");
		Hiraya.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				PLHiraya t = new PLHiraya ();
				t.show();
				dispose();
				
			}
		});
		Hiraya.setBounds(783, 247, 345, 472);
		Hiraya.setBorder(null);
		Hiraya.setIcon(new ImageIcon(LifeInsurancePolicy.class.getResource("/images/Hiraya100.png")));
		contentPane.add(Hiraya);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 127, 163);
		panel.setBorder(null);
		panel.setBackground(new Color(0, 84, 168));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon(LifeInsurancePolicy.class.getResource("/images/logoPng-MIDSIZE.png")));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 84, 168));
		btnNewButton.setBounds(29, 21, 98, 115);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(208, 0, 948, 163);
		lblNewLabel.setIcon(new ImageIcon(LifeInsurancePolicy.class.getResource("/images/agreementbg.png")));
		contentPane.add(lblNewLabel);
		
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
		
		JLabel lblNewLabel_1 = new JLabel("Life insurance plans that help in preparing for life milestones");
		lblNewLabel_1.setBounds(249, 195, 684, 25);
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
	}

}
