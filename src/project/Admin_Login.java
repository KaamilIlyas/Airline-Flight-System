package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Admin_Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Login frame = new Admin_Login();
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
	public Admin_Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(107, 72, 69, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(107, 116, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(204, 69, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(204, 113, 86, 20);
		contentPane.add(passwordField);
		
	    //Array list of admin username and admin password is created
		ArrayList<String> admin_username = new ArrayList<String>();
		ArrayList<String> admin_password = new ArrayList<String>();
		
		//kamil is stored in admin username and 12345678 is stored in admin password
		admin_username.add("kamil");
		admin_password.add("12345678");
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//When user click on the login button he provides his input in the username and password text field and that is stored in username and password
				String username=textField.getText();
				String password=passwordField.getText();
				
				//When admin username and admin password matches i.e kamil and 12345678 to the text that user entered in the username and password 
				//text field he will then be taken to the admin menu JFrame else message will be displayed "invalid credentials"
				if (admin_username.get(0).equals(username)&&admin_password.get(0).equals(password))
				{
					Admin_Menu obj=new Admin_Menu();
					obj.setVisible(true);
					dispose();
				}
				else 
					JOptionPane.showMessageDialog(null, "Invalid Credentials");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(266, 149, 89, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel_2 = new JLabel("Admin Login");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setForeground(new Color(204, 0, 0));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(155, 11, 109, 23);
		contentPane.add(lblNewLabel_2);
	}

}
