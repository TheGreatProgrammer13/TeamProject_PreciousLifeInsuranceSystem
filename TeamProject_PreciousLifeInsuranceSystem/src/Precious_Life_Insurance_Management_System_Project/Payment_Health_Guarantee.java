package Precious_Life_Insurance_Management_System_Project;

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
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JOptionPane;
public class Payment_Health_Guarantee extends JFrame {

	private JPanel contentPane;
	private JTextField Cardnum;
	private JTextField Pay;
	private JTextField CVC;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment_Life_Serene frame = new Payment_Life_Serene();
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
	public Payment_Health_Guarantee() {
		
		int LSerene = 150000;
		
		
		
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 918, 843);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(149, 0, 755, 89);
		panel_1_1_1.setBorder(null);
		panel_1_1_1.setBackground(new Color(0, 45, 105));
		contentPane.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JLabel lblSerene = new JLabel("Payment Details");
		lblSerene.setBackground(new Color(255, 255, 255));
		lblSerene.setBounds(60, 35, 364, 44);
		lblSerene.setForeground(new Color(242,200,71));
		lblSerene.setFont(new Font("Tahoma", Font.BOLD, 42));
		panel_1_1_1.add(lblSerene);
		
		JLabel lblNewLabel = new JLabel("PRECIOUS LIFE");
		lblNewLabel.setBounds(60, 10, 183, 24);
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
		lblNewLabel_2.setIcon(new ImageIcon(PLSerene.class.getResource("/images/LifeLogo1 (1).png")));
		lblNewLabel_2.setBounds(10, 157, 98, 86);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					PaymentFrame t = new PaymentFrame();
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
		panel_1_1_2.setBorder(null);
		panel_1_1_2.setBackground(new Color(200, 227, 255));
		panel_1_1_2.setBounds(191, 89, 713, 208);
		contentPane.add(panel_1_1_2);
		panel_1_1_2.setLayout(null);
		
		JLabel TypeOfInsurance = new JLabel("TYPE OF INSURANCE:");
		TypeOfInsurance.setForeground(new Color(0, 45, 105));
		TypeOfInsurance.setFont(new Font("Tahoma", Font.BOLD, 22));
		TypeOfInsurance.setBounds(22, 21, 257, 24);
		panel_1_1_2.add(TypeOfInsurance);
		
		JLabel Plan = new JLabel("PLAN:");
		Plan.setForeground(new Color(0, 45, 105));
		Plan.setFont(new Font("Tahoma", Font.BOLD, 22));
		Plan.setBounds(472, 21, 68, 24);
		panel_1_1_2.add(Plan);
		
		JLabel LAmount = new JLabel("AMOUNT:");
		LAmount.setForeground(new Color(0, 45, 105));
		LAmount.setFont(new Font("Tahoma", Font.BOLD, 22));
		LAmount.setBounds(22, 86, 109, 24);
		panel_1_1_2.add(LAmount);
		
		JLabel AmountNeeded = new JLabel("AMOUNT NEEDED:");
		AmountNeeded.setForeground(new Color(0, 45, 105));
		AmountNeeded.setFont(new Font("Tahoma", Font.BOLD, 22));
		AmountNeeded.setBounds(22, 155, 273, 24);
		panel_1_1_2.add(AmountNeeded);
		
		JLabel Amount = new JLabel("New label");
		Amount.setFont(new Font("Tahoma", Font.PLAIN, 19));
		Amount.setBounds(141, 86, 184, 24);
		panel_1_1_2.add(Amount);
		Amount.setText(Integer.toString(LSerene));
		
		
		
		JLabel RemainingBalance = new JLabel("");
		RemainingBalance.setFont(new Font("Tahoma", Font.PLAIN, 18));
		RemainingBalance.setBounds(246, 155, 184, 24);
		panel_1_1_2.add(RemainingBalance);
		
		JLabel Entered = new JLabel("ENTERED AMOUNT:");
		Entered.setForeground(new Color(0, 45, 105));
		Entered.setFont(new Font("Tahoma", Font.BOLD, 22));
		Entered.setBounds(22, 121, 273, 24);
		panel_1_1_2.add(Entered);
		
		JLabel EAmount = new JLabel("");
		EAmount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		EAmount.setBounds(246, 121, 184, 24);
		panel_1_1_2.add(EAmount);
		
		JLabel LifeInsurance = new JLabel("Health");
		LifeInsurance.setFont(new Font("Tahoma", Font.PLAIN, 18));
		LifeInsurance.setBounds(277, 23, 141, 24);
		panel_1_1_2.add(LifeInsurance);
		
		JLabel Serene = new JLabel("Guarantee");
		Serene.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Serene.setBounds(550, 21, 141, 24);
		panel_1_1_2.add(Serene);
		
		JLabel CardNumber = new JLabel("");
		CardNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		CardNumber.setBounds(472, 86, 193, 24);
		panel_1_1_2.add(CardNumber);
		
		JLabel lblCardNumber = new JLabel("CARD NUMBER:");
		lblCardNumber.setForeground(new Color(0, 45, 105));
		lblCardNumber.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblCardNumber.setBounds(274, 86, 184, 24);
		panel_1_1_2.add(lblCardNumber);

		Cardnum = new JTextField();
		Cardnum.setBounds(246, 377, 575, 49);
		contentPane.add(Cardnum);
		Cardnum.setColumns(10);
		
	
		
		JLabel lblNewLabel_1_4 = new JLabel("CARD NUMBER");
		lblNewLabel_1_4.setForeground(new Color(0, 45, 105));
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_4.setBounds(248, 343, 257, 24);
		contentPane.add(lblNewLabel_1_4);
		
	
		
		JLabel lblNewLabel_1_4_1 = new JLabel("PIN CODE");
		lblNewLabel_1_4_1.setForeground(new Color(0, 45, 105));
		lblNewLabel_1_4_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_4_1.setBounds(248, 455, 257, 24);
		contentPane.add(lblNewLabel_1_4_1);
		
		Pay = new JTextField();
		Pay.setColumns(10);
		Pay.setBounds(248, 608, 575, 49);
		contentPane.add(Pay);
		
		JLabel lblNewLabel_1_4_2 = new JLabel("PAYMENT");
		lblNewLabel_1_4_2.setForeground(new Color(0, 45, 105));
		lblNewLabel_1_4_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_4_2.setBounds(248, 565, 257, 24);
		contentPane.add(lblNewLabel_1_4_2);
		
		JLabel lblNewLabel_1_4_1_1 = new JLabel("CV CODE");
		lblNewLabel_1_4_1_1.setForeground(new Color(0, 45, 105));
		lblNewLabel_1_4_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_1_4_1_1.setBounds(544, 455, 257, 24);
		contentPane.add(lblNewLabel_1_4_1_1);
		
		CVC = new JTextField();
		CVC.setColumns(10);
		CVC.setBounds(542, 489, 279, 49);
		contentPane.add(CVC);
		
		JLabel lblNewLabel_3 = new JLabel("In order to protect your card from fraudulenbt transaction we might redirect your");
		lblNewLabel_3.setForeground(new Color(128, 128, 128));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(264, 668, 569, 35);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("site, that will verify your card information, before we proceed with the payment.");
		lblNewLabel_3_1.setForeground(new Color(128, 128, 128));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(263, 693, 569, 35);
		contentPane.add(lblNewLabel_3_1);
		
	
		
		passwordField = new JPasswordField();
		passwordField.setBounds(248, 490, 257, 48);
		contentPane.add(passwordField);
			
			
		
		
		
		
	
		
		JButton Subscription = new JButton("Start Subscription");
		Subscription.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				int jml = Integer.parseInt(Cardnum.getText());
				CardNumber.setText(Integer.toString(jml));
				
				JLabel C = CardNumber;
		
				int Cash = Integer.parseInt(Pay.getText());
				int RBalance = LSerene - Cash;
			
				int newBalance = 0;
				newBalance = RBalance;
				
				EAmount.setText(Integer.toString(Cash));
				Amount.setText(Integer.toString(LSerene));
				RemainingBalance.setText(Integer.toString(newBalance));
				if (RBalance ==0) {
					
					JOptionPane.showMessageDialog(null, "Payment Successful! \nThank you for your patronage!");
					
					JOptionPane.showMessageDialog(null, 
								"Here is your summary"
							+ "\nType of Insurance: Health Insurance \nPlan: Guarantee" 
							+ "\nStatus: PAID"
							
						);
					MainDashboard t = new MainDashboard();
					t.show();
					dispose();
				}
				else{
					JOptionPane.showMessageDialog(null, "Please pay the exact amount.");
					}
				}
			}
			
		);	
		Subscription.setBackground(new Color(0, 215, 54));
		Subscription.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Subscription.setBounds(409, 744, 247, 35);
		contentPane.add(Subscription);
		
		
		
		
	
	}
}