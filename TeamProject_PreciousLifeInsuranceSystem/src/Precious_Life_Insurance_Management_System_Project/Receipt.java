package Precious_Life_Insurance_Management_System_Project;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JSeparator;
import javax.swing.JTextPane;

public class Receipt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receipt frame = new Receipt();
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
	/**
	 * Create the frame.
	 */
	public Receipt() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1170, 843);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 108, 806);
		panel.setLayout(null);
		panel.setBorder(null);
		panel.setBackground(new Color(0, 84, 168));
		contentPane.add(panel);
		
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
		
		JLabel lblNewLabel_3_1 = new JLabel("Payment Receipt");
		lblNewLabel_3_1.setBounds(457, 243, 278, 52);
		lblNewLabel_3_1.setForeground(new Color(0,45,105));
		lblNewLabel_3_1.setFont(new Font("Microsoft YaHei", Font.BOLD, 32));
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_8 = new JLabel("TYPE OF INSURANCE:");
		lblNewLabel_8.setBounds(221, 350, 203, 32);
		lblNewLabel_8.setForeground(new Color(0,45,105));
		lblNewLabel_8.setFont(new Font("Poppins", Font.BOLD, 18));
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(144, -22, 829, 149);
		lblNewLabel_1.setIcon(new ImageIcon(Receipt.class.getResource("/images/WavesTopPic.png")));
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(1046, 0, 108, 806);
		panel_2.setLayout(null);
		panel_2.setBorder(null);
		panel_2.setBackground(new Color(0, 84, 168));
		contentPane.add(panel_2);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(1005, 0, 42, 838);
		panel_1_2.setBorder(null);
		panel_1_2.setBackground(new Color(0, 64, 128));
		contentPane.add(panel_1_2);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(969, 0, 42, 838);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(188, 704, 848, 156);
		lblNewLabel.setIcon(new ImageIcon(Receipt.class.getResource("/images/WavesBottomPic2.png")));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(524, 117, 131, 115);
		contentPane.add(btnNewButton);
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
		btnNewButton.setBackground(Color.WHITE);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(211, 317, 736, 9);
		separator.setForeground(new Color(0,45,105));
		contentPane.add(separator);
		
		JLabel lblNewLabel_8_1 = new JLabel("PLAN:");
		lblNewLabel_8_1.setBounds(221, 405, 273, 32);
		lblNewLabel_8_1.setForeground(new Color(0, 45, 105));
		lblNewLabel_8_1.setFont(new Font("Dialog", Font.BOLD, 18));
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("CARD NUMBER:");
		lblNewLabel_8_1_1.setBounds(221, 461, 273, 32);
		lblNewLabel_8_1_1.setForeground(new Color(0, 45, 105));
		lblNewLabel_8_1_1.setFont(new Font("Dialog", Font.BOLD, 18));
		contentPane.add(lblNewLabel_8_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(211, 526, 736, 9);
		separator_1.setForeground(new Color(0, 45, 105));
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_8_1_1_1 = new JLabel("TOTAL AMOUNT:");
		lblNewLabel_8_1_1_1.setBounds(221, 556, 273, 32);
		lblNewLabel_8_1_1_1.setForeground(new Color(0, 45, 105));
		lblNewLabel_8_1_1_1.setFont(new Font("Dialog", Font.BOLD, 18));
		contentPane.add(lblNewLabel_8_1_1_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(211, 620, 736, 9);
		separator_1_1.setForeground(new Color(0, 45, 105));
		contentPane.add(separator_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setFont(new Font("Poppins", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(427, 346, 368, 36);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(286, 401, 368, 36);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("New label");
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBounds(369, 457, 368, 36);
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("New label");
		lblNewLabel_2_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1.setBounds(380, 552, 368, 36);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JTextPane txtpnThankYou = new JTextPane();
		txtpnThankYou.setForeground(new Color(0, 45, 105));
		txtpnThankYou.setFont(new Font("Dialog", Font.BOLD, 20));
		txtpnThankYou.setText("THANK YOU!");
		txtpnThankYou.setBounds(534, 661, 131, 32);
		contentPane.add(txtpnThankYou);
	}
}
