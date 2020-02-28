import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class AirlineSelect extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AirlineSelect frame = new AirlineSelect();
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
	public AirlineSelect() {
		setFont(new Font("Tahoma", Font.BOLD, 16));
		setTitle("Select Airline");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 265, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("$222*");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(149, 24, 52, 20);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Delta");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnNewRadioButton.setBounds(24, 24, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnSouhwest = new JRadioButton("Souhwest");
		rdbtnSouhwest.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnSouhwest.setBounds(24, 58, 105, 21);
		contentPane.add(rdbtnSouhwest);
		
		JRadioButton rdbtnJetblue = new JRadioButton("JetBlue");
		rdbtnJetblue.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnJetblue.setBounds(24, 91, 105, 21);
		contentPane.add(rdbtnJetblue);
		
		JRadioButton rdbtnAlaska = new JRadioButton("Alaska");
		rdbtnAlaska.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnAlaska.setBounds(24, 125, 105, 21);
		contentPane.add(rdbtnAlaska);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(68, 183, 103, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("*Prices are per person");
		lblNewLabel_1.setBounds(58, 155, 113, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("$225*");
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(149, 58, 52, 20);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("$230*");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(149, 91, 52, 20);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("$221*");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(149, 126, 52, 20);
		contentPane.add(label_2);
	}
}
