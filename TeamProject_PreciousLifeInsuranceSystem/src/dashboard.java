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

public class dashboard extends JFrame {

	private JPanel contentPane;
	private JTextField txtLife;
	private JTextField txtH;
	private JTextField txtEducation;
	private JTextField txtRetirement;
	private JTextField textField_3;

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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 45, 105));
		panel.setBounds(0, 0, 916, 94);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setAlignmentY(0.0f);
		btnNewButton.setBorder(null);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\xander\\Downloads\\2.png"));
		btnNewButton.setBounds(60, 228, 191, 171);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\xander\\Downloads\\1.png"));
		btnNewButton_1.setBounds(261, 228, 191, 171);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\xander\\Downloads\\3.png"));
		btnNewButton_2.setBounds(462, 228, 191, 171);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\xander\\Downloads\\4.png"));
		btnNewButton_3.setBounds(663, 228, 191, 171);
		contentPane.add(btnNewButton_3);
		
		txtLife = new JTextField();
		txtLife.setBorder(null);
		txtLife.setFont(new Font("Tahoma", Font.PLAIN, 42));
		txtLife.setText("Life");
		txtLife.setBounds(113, 409, 69, 43);
		contentPane.add(txtLife);
		txtLife.setColumns(10);
		
		txtH = new JTextField();
		txtH.setText("Health");
		txtH.setBounds(302, 434, 96, 19);
		contentPane.add(txtH);
		txtH.setColumns(10);
		
		txtEducation = new JTextField();
		txtEducation.setText("Education");
		txtEducation.setBounds(508, 434, 96, 19);
		contentPane.add(txtEducation);
		txtEducation.setColumns(10);
		
		txtRetirement = new JTextField();
		txtRetirement.setText("Retirement");
		txtRetirement.setBounds(710, 434, 96, 19);
		contentPane.add(txtRetirement);
		txtRetirement.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(128, 142, 678, 55);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}