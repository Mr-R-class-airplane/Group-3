import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CreditCardInfo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreditCardInfo frame = new CreditCardInfo();
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
	public CreditCardInfo() {
		setFont(new Font("Tahoma", Font.BOLD, 16));
		setTitle("Payment Information");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("MasterCard");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(6, 39, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnVisa = new JRadioButton("Visa");
		rdbtnVisa.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnVisa.setBounds(111, 62, 52, 21);
		contentPane.add(rdbtnVisa);
		
		JRadioButton rdbtnAmericanExpress = new JRadioButton("American Express");
		rdbtnAmericanExpress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnAmericanExpress.setBounds(111, 39, 135, 21);
		contentPane.add(rdbtnAmericanExpress);
		
		JRadioButton rdbtnDiscover = new JRadioButton("Discover");
		rdbtnDiscover.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnDiscover.setBounds(6, 62, 107, 21);
		contentPane.add(rdbtnDiscover);
		
		JLabel lblNewLabel = new JLabel("Debit/Credit Card");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(6, 20, 157, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNameOnCard = new JLabel("Name On Card");
		lblNameOnCard.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNameOnCard.setBounds(6, 89, 126, 13);
		contentPane.add(lblNameOnCard);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setBounds(6, 112, 273, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDebitcreditCardNumber = new JLabel("Debit/Credit Card Number");
		lblDebitcreditCardNumber.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblDebitcreditCardNumber.setBounds(6, 141, 220, 21);
		contentPane.add(lblDebitcreditCardNumber);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(6, 172, 273, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(54, 229, 87, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(189, 229, 87, 19);
		contentPane.add(textField_3);
		
		JLabel lblExpirationDate = new JLabel("Expiration Date");
		lblExpirationDate.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblExpirationDate.setBounds(6, 201, 135, 21);
		contentPane.add(lblExpirationDate);
		
		JLabel lblMonth = new JLabel("Month");
		lblMonth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMonth.setBounds(6, 232, 40, 13);
		contentPane.add(lblMonth);
		
		JLabel lblYear = new JLabel("Year");
		lblYear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblYear.setBounds(151, 232, 40, 13);
		contentPane.add(lblYear);
		
		JLabel lblSecurityCode = new JLabel("Security Code");
		lblSecurityCode.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSecurityCode.setBounds(6, 258, 117, 21);
		contentPane.add(lblSecurityCode);
		
		JLabel lblZip = new JLabel("Billing Zip");
		lblZip.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblZip.setBounds(161, 258, 117, 21);
		contentPane.add(lblZip);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(6, 289, 117, 19);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBounds(162, 289, 117, 19);
		contentPane.add(textField_5);
		
		JButton btnNewButton = new JButton("SUMBIT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(84, 335, 107, 29);
		contentPane.add(btnNewButton);
	}
}
