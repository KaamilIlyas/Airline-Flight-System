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

public class Passenger_Booking extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Passenger_Booking frame = new Passenger_Booking();
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
	public Passenger_Booking() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Local");
		btnNewButton.setForeground(new Color(153, 0, 0));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Composition a type of association is used here as user click on the Local button he will be taken to the Passenger Local JFrame.
				Passenger_Local_Flight obj=new Passenger_Local_Flight();
				obj.setVisible(true);
				dispose(); //Passenger local flight JFrame will be disposed after that
			}
		});
		btnNewButton.setBounds(168, 87, 122, 50);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("International");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Composition is used here as user click on the International button he will be taken to the Passenger International flight JFrame.
				Passenger_International_Flight obj=new Passenger_International_Flight();
				obj.setVisible(true);
				dispose(); //Passenger International flight JFrame will be disposed after that
			}
		});
		btnNewButton_2.setForeground(new Color(153, 0, 0));
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(139, 148, 176, 50);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Passenger Booking");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(150, 11, 165, 25);
		contentPane.add(lblNewLabel);
	}

}
