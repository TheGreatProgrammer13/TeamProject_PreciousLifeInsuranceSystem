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
	private JButton btnNewButton_4;
	private JLabel lblNewLabel;
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
		
		lblNewLabel_2 = new JLabel("Life");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(112, 421, 59, 24);
		contentPane_1.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Health");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_3.setBounds(300, 405, 101, 56);
		contentPane_1.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Education");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_4.setBounds(472, 416, 155, 35);
		contentPane_1.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Retirement");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_5.setBounds(663, 416, 183, 35);
		contentPane_1.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("What type of insurance plan are you going to avail?");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_6.setBounds(127, 136, 677, 55);
		contentPane_1.add(lblNewLabel_6);
		lblNewLabel_7.setForeground(new Color(128, 128, 128));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_7.setBounds(167, 496, 585, 36);
		contentPane_1.add(lblNewLabel_7);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.setBounds(10, 104, 62, 55);
		contentPane_1.add(btnNewButton_4);
		btnNewButton_4.setBackground(new Color(255, 255, 255));
		btnNewButton_4.setBorder(null);
		btnNewButton_4.setIcon(new ImageIcon(dashboard.class.getResource("/images/backbutton.png")));
	}
}