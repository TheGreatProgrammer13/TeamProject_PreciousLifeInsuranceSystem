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

public class dashboard extends JFrame {

	private JPanel contentPane;
	private JTextField txtLife;
	private JTextField txtH;
	private JTextField txtEducation;
	private JTextField txtRetirement;
	private JTextField txtWhatTypeOf;
	private JTextField txtyouCanOnly;
	private JButton btnNewButton_4;
	private JLabel lblNewLabel;
	private JPanel contentPane_1;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnNewButton_9;
	private JLabel lblNewLabel_1;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dashboard frame = new dashboard();
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
	public dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 614);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(60, 228, 191, 171);
		btnNewButton.setAlignmentY(0.0f);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon(dashboard.class.getResource("/images/2.png")));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(261, 228, 191, 171);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(dashboard.class.getResource("/images/1.png")));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(462, 228, 191, 171);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setIcon(new ImageIcon(dashboard.class.getResource("/images/3.png")));
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(663, 228, 191, 171);
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setIcon(new ImageIcon(dashboard.class.getResource("/images/4.png")));
		contentPane.add(btnNewButton_3);
		
		txtLife = new JTextField();
		txtLife.setBounds(110, 409, 85, 43);
		txtLife.setBorder(null);
		txtLife.setFont(new Font("Tahoma", Font.BOLD, 37));
		txtLife.setText("Life");
		contentPane.add(txtLife);
		txtLife.setColumns(10);
		
		txtH = new JTextField();
		txtH.setBounds(290, 404, 136, 55);
		txtH.setFont(new Font("Tahoma", Font.BOLD, 34));
		txtH.setBorder(null);
		txtH.setText("Health");
		contentPane.add(txtH);
		txtH.setColumns(10);
		
		txtEducation = new JTextField();
		txtEducation.setBounds(462, 404, 182, 55);
		txtEducation.setFont(new Font("Tahoma", Font.BOLD, 35));
		txtEducation.setBorder(null);
		txtEducation.setText("Education");
		contentPane.add(txtEducation);
		txtEducation.setColumns(10);
		
		txtRetirement = new JTextField();
		txtRetirement.setBounds(673, 412, 182, 43);
		txtRetirement.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtRetirement.setBorder(null);
		txtRetirement.setText("Retirement");
		contentPane.add(txtRetirement);
		txtRetirement.setColumns(10);
		
		txtWhatTypeOf = new JTextField();
		txtWhatTypeOf.setBounds(128, 142, 678, 55);
		txtWhatTypeOf.setBorder(null);
		txtWhatTypeOf.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtWhatTypeOf.setText("What type of insurance plan are you going to avail?");
		contentPane.add(txtWhatTypeOf);
		txtWhatTypeOf.setColumns(10);
		
		txtyouCanOnly = new JTextField();
		txtyouCanOnly.setBounds(178, 501, 561, 35);
		txtyouCanOnly.setBorder(null);
		txtyouCanOnly.setForeground(new Color(192, 192, 192));
		txtyouCanOnly.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtyouCanOnly.setText("(You can only choose one for this transaction)");
		contentPane.add(txtyouCanOnly);
		txtyouCanOnly.setColumns(10);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.setBounds(10, 104, 62, 55);
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setIcon(new ImageIcon(dashboard.class.getResource("/images/backbutton.png")));
		contentPane.add(btnNewButton_4);
		
		contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(Color.WHITE);
		contentPane_1.setBounds(0, 0, 916, 577);
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
		
		textField = new JTextField();
		textField.setText("Life");
		textField.setFont(new Font("Tahoma", Font.BOLD, 37));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(110, 409, 85, 43);
		contentPane_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setText("Health");
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 34));
		textField_1.setColumns(10);
		textField_1.setBorder(null);
		textField_1.setBounds(290, 404, 136, 55);
		contentPane_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("Education");
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 35));
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setBounds(462, 404, 182, 55);
		contentPane_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("Retirement");
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBounds(673, 412, 182, 43);
		contentPane_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("What type of insurance plan are you going to avail?");
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		textField_4.setColumns(10);
		textField_4.setBorder(null);
		textField_4.setBounds(128, 142, 678, 55);
		contentPane_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("(You can only choose one for this transaction)");
		textField_5.setForeground(Color.GRAY);
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 24));
		textField_5.setColumns(10);
		textField_5.setBorder(null);
		textField_5.setBounds(178, 501, 561, 35);
		contentPane_1.add(textField_5);
		
		btnNewButton_9 = new JButton("New button");
		btnNewButton_9.setBorder(null);
		btnNewButton_9.setBackground(Color.WHITE);
		btnNewButton_9.setBounds(10, 104, 69, 55);
		contentPane_1.add(btnNewButton_9);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(-228, -28, 69, 66);
		contentPane_1.add(lblNewLabel_1);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 45, 105));
		panel.setBounds(0, 0, 916, 94);
		contentPane_1.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 5, 72, 79);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(dashboard.class.getResource("/images/SmallSize.png")));
	}
}