package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Passenger_Register extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JTextField gender;
	private JTextField age;
	private JTextField cnic;
	private JTextField username;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Passenger_Register frame = new Passenger_Register();
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
	public Passenger_Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 557, 486);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setForeground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Passenger Signup");
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setForeground(new Color(204, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(188, 11, 136, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(105, 71, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		name = new JTextField();
		name.setBounds(178, 68, 101, 20);
		contentPane.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(105, 119, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		gender = new JTextField();
		gender.setBounds(178, 116, 101, 20);
		contentPane.add(gender);
		gender.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Age");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(105, 167, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		age = new JTextField();
		age.setBounds(178, 164, 101, 20);
		contentPane.add(age);
		age.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("CNIC");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(105, 214, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		cnic = new JTextField();
		cnic.setBounds(178, 211, 101, 20);
		contentPane.add(cnic);
		cnic.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Username");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(87, 263, 64, 14);
		contentPane.add(lblNewLabel_5);
		
		username = new JTextField();
		username.setBounds(178, 260, 101, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		gender = new JTextField();
		gender.setBounds(178, 116, 101, 20);
		contentPane.add(gender);
		gender.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Password");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(87, 307, 64, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Already have account?");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(60, 398, 145, 14);
		contentPane.add(lblNewLabel_7);
		
		password = new JPasswordField();
		password.setBounds(178, 304, 101, 20);
		contentPane.add(password);
		
		JLabel lbl1 = new JLabel("");
		lbl1.setBounds(289, 71, 177, 14);
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("");
		lbl2.setBounds(289, 119, 177, 14);
		contentPane.add(lbl2);
		
		JLabel lbl3 = new JLabel("");
		lbl3.setBounds(289, 167, 177, 14);
		contentPane.add(lbl3);
		
		JLabel lbl4 = new JLabel("");
		lbl4.setBounds(289, 214, 177, 14);
		contentPane.add(lbl4);
		
		JLabel lbl5 = new JLabel("");
		lbl5.setBounds(289, 263, 177, 14);
		contentPane.add(lbl5);
		
		JLabel lbl6 = new JLabel("");
		lbl6.setBounds(289, 307, 177, 14);
		contentPane.add(lbl6);
		
		JButton btnNewButton = new JButton("Signup");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				/*Here the conditions are applied if any of the text field is left empty it will display message "Can't leave the field empty" 
				infront of that text also if cnic text field is not up to 13 digits it will display message "Format not followed" in addition to
				it if user enter password that is shorter than 8 digit or longer than 15 digit it will display message "format not followed"*/
				if (name.getText().isEmpty())
				{
					lbl1.setText("Can't leave the field empty");
				}
				
				else if (age.getText().isEmpty())
				{
					lbl3.setText("Can't leave the field empty");
				}
				
				else if (cnic.getText().isEmpty())
				{
					lbl4.setText("Can't leave the field empty");
				}
				
				else if (cnic.getText().length()==13==false)
	         	{
                    lbl4.setText("Format not followed");			
	        	}
				
				else if (username.getText().isEmpty())
				{
					lbl5.setText("Can't leave the field empty");
				} 
				
				else if (password.getText().isEmpty())
				{
					lbl6.setText("Can't leave the field empty");
				}
					
				else if ((password.getText().length()>7&&password.getText().length()<16)==false)
				{
					lbl6.setText("Format not followed");
				}
				
				else 
				{
						
				/*Else will execute and inputs will be taken from the user which should not satisfy the above conditions and after that user will
				will be taken to the Passenger login JFrame as passenger object is called here and composition is used on the signup button*/
				Passenger obj=new Passenger(name.getText(),gender.getText(),age.getText(),cnic.getText(),username.getText(),password.getText());
				Menu.validation.add(obj); //When user will provide his input in the text fields his inputs will be stored in the validation by obj.
				
				Passenger_Login obj1=new Passenger_Login ();
				obj1.setVisible(true); //We will see the Passenger Login JFrame as object of passenger login is setVisible(true)
				dispose(); //Passenger Login JFrame will be disposed after that
				}
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(274, 344, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Composition is used on the login button which is present on the passenger signup frame when user click on the login button
				//he will be taken to the login JFrame.
				Passenger_Login obj=new Passenger_Login();
				obj.setVisible(true); //We will see the Passenger Login JFrame as object of passenger login is setVisible(true)
				dispose(); //Passenger Login JFrame will be disposed after that
						
			}
			
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(204, 394, 89, 23);
		contentPane.add(btnNewButton_1);
		
	}
}
