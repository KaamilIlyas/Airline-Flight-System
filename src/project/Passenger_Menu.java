package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Passenger_Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Passenger_Menu frame = new Passenger_Menu();
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
	public Passenger_Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Booking");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Composition is used here as user click on the Booking button he will be taken to the Passenger Booking JFrame.
				Passenger_Booking obj=new Passenger_Booking();
				obj.setVisible(true); //We will see the Passenger Booking JFrame as object of passenger login is setVisible(true)
				dispose();
				
			}
		});
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(new Color(0, 0, 204));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(52, 60, 121, 43);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Main Menu");
		btnNewButton_2.setForeground(new Color(0, 0, 204));
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Composition a type of association is used here as user click on the Main Menu button he will be taken to the Menu JFrame.
				Menu obj=new Menu();
				obj.setVisible(true); //We will see the Menu JFrame as object of passenger login is setVisible(true)
				dispose();
			}
		});
		btnNewButton_2.setBounds(245, 60, 121, 43);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Go Back");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Composition is used here as user click on the Go back button he will be taken to the Passenger Login JFrame.
				Passenger_Login obj=new Passenger_Login();
				obj.setVisible(true); //We will see the Passenger Login JFrame as object of passenger login is setVisible(true)
				dispose();
			}
		});
		btnNewButton_3.setForeground(new Color(0, 0, 204));
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.setBounds(139, 146, 132, 43);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel = new JLabel("Passenger Menu");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(204, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(149, 11, 156, 22);
		contentPane.add(lblNewLabel);
	}
}
