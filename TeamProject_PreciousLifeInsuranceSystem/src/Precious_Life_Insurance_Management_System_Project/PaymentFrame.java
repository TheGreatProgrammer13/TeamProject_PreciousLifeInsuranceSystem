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
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Button;

public class PaymentFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentFrame frame = new PaymentFrame();
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
	public PaymentFrame() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 843);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(148, 41, 490, 89);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 64, 128));
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblSerene = new JLabel("PAYMENT METHOD");
		lblSerene.setBackground(Color.YELLOW);
		lblSerene.setBounds(60, 35, 509, 44);
		lblSerene.setForeground(new Color(235, 200, 1));
		lblSerene.setFont(new Font("Poppins", Font.BOLD, 42));
		panel_1_1_1.add(lblSerene);
		
		JLabel lblNewLabel = new JLabel("PRECIOUS LIFE");
		lblNewLabel.setBounds(55, 10, 183, 24);
		panel_1_1_1.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 108, 806);
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(0, 84, 168));
		contentPane.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(PLRetirement_Stabalize.class.getResource("/images/Retirement_Logo.png")));
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
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					MainDashboard t = new MainDashboard();
					t.show();
					dispose();

				}
			}
		});
		btnNewButton.setIcon(new ImageIcon(PLSerendipity.class.getResource("/images/logoPng-MIDSIZE.png")));
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(0, 84, 168));
		btnNewButton.setBounds(10, 21, 98, 115);
		panel.add(btnNewButton);
		
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
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBounds(264, 587, 12, 89);
		panel_1_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1_1_2.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1_2);
		
		JLabel lblNewLabel_3_1 = new JLabel("Great! Please enter the following information:");
		lblNewLabel_3_1.setBounds(295, 172, 590, 32);
		lblNewLabel_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 22));
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_8 = new JLabel("TYPE OF INSURANCE");
		lblNewLabel_8.setBounds(295, 258, 273, 32);
		lblNewLabel_8.setForeground(new Color(0, 0, 128));
		lblNewLabel_8.setFont(new Font("Poppins", Font.BOLD, 18));
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_2 = new JLabel("FULL NAME");
		lblNewLabel_8_2.setBounds(295, 372, 182, 32);
		lblNewLabel_8_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_2.setFont(new Font("Poppins", Font.BOLD, 18));
		contentPane.add(lblNewLabel_8_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(292, 415, 327, 40);
		textField_2.setHorizontalAlignment(SwingConstants.LEFT);
		textField_2.setForeground(Color.GRAY);
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_8_3 = new JLabel("GENDER");
		lblNewLabel_8_3.setBounds(696, 372, 182, 32);
		lblNewLabel_8_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_3.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		contentPane.add(lblNewLabel_8_3);
		
		JLabel lblNewLabel_8_2_1 = new JLabel("CONTACT NUMBER");
		lblNewLabel_8_2_1.setBounds(696, 479, 182, 32);
		lblNewLabel_8_2_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_2_1.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		contentPane.add(lblNewLabel_8_2_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(696, 522, 327, 40);
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		textField_4.setForeground(Color.GRAY);
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 15));
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		contentPane.add(textField_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(292, 301, 327, 40);
		comboBox.setFont(new Font("Poppins", Font.PLAIN, 18));
		comboBox.setMaximumRowCount(10);
		comboBox.setEditable(true);
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"hello ", "hi", "wazapp"}));
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(696, 301, 327, 40);
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setForeground(Color.GRAY);
		textField.setFont(new Font("Dialog", Font.PLAIN, 15));
		textField.setColumns(10);
		textField.setBackground(Color.WHITE);
		contentPane.add(textField);
		
		JLabel lblNewLabel_8_2_2 = new JLabel("EMAIL ADDRESS");
		lblNewLabel_8_2_2.setBounds(699, 258, 182, 32);
		lblNewLabel_8_2_2.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_2_2.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		contentPane.add(lblNewLabel_8_2_2);
		
		textField_5 = new JTextField();
		textField_5.setBounds(292, 522, 327, 40);
		textField_5.setHorizontalAlignment(SwingConstants.LEFT);
		textField_5.setForeground(Color.GRAY);
		textField_5.setFont(new Font("Dialog", Font.PLAIN, 15));
		textField_5.setColumns(10);
		textField_5.setBackground(Color.WHITE);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_8_2_3 = new JLabel("DATE OF BIRTH");
		lblNewLabel_8_2_3.setBounds(295, 479, 182, 32);
		lblNewLabel_8_2_3.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_2_3.setFont(new Font("Franklin Gothic Medium", Font.BOLD, 18));
		contentPane.add(lblNewLabel_8_2_3);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(696, 415, 327, 40);
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"MALE ", "FEMALE"}));
		comboBox_1_1.setMaximumRowCount(10);
		comboBox_1_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		comboBox_1_1.setEditable(true);
		comboBox_1_1.setBackground(Color.WHITE);
		contentPane.add(comboBox_1_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("MODE OF PAYMENT");
		lblNewLabel_8_1.setForeground(new Color(0, 0, 128));
		lblNewLabel_8_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_8_1.setBounds(298, 587, 273, 32);
		contentPane.add(lblNewLabel_8_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Debit Card", "Gcash"}));
		comboBox_1.setMaximumRowCount(10);
		comboBox_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		comboBox_1.setEditable(true);
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(295, 630, 327, 40);
		contentPane.add(comboBox_1);
		
		Button button = new Button("PROCEED TO PAYMENT");
		button.setForeground(new Color(234, 218, 128));
		button.setFont(new Font("Dialog", Font.BOLD, 20));
		button.setBackground(new Color(0, 45, 105));
		button.setBounds(814, 754, 260, 40);
		contentPane.add(button);
	}
}
