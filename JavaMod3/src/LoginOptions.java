import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JButton;

public class LoginOptions extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginOptions frame = new LoginOptions();
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
	public LoginOptions() {
		setFont(new Font("Tahoma", Font.BOLD, 16));
		setOpacity(0.0f);
		setTitle("Select Checkout Method");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 109);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Guest Checkout");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(10, 28, 159, 21);
		contentPane.add(btnNewButton);
		
		JButton btnAccountLogin = new JButton("Account Login");
		btnAccountLogin.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAccountLogin.setBounds(179, 28, 159, 21);
		contentPane.add(btnAccountLogin);
	}

}
