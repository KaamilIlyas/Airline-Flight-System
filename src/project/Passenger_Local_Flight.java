package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Passenger_Local_Flight extends JFrame {

	private JPanel contentPane;
	//Array List of flights is created 
	static ArrayList<Flights>list=new ArrayList<Flights>();
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Passenger_Local_Flight frame = new Passenger_Local_Flight();
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
	public Passenger_Local_Flight() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 607, 381);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Here following attributes will come in each of the column in the table
		String[]column= {"From City","To City","Duration_Time","Date","Economy Seat","Bussiness Seat"};
		
		DefaultTableModel Ltable=new DefaultTableModel(column,0);
		
		//for each loop is used here and it store the flights in the list
		for(Flights object: Admin_Local_Flight.list)
		{
			Object[] input= {object.getFrom_City(),object.getTo_City(),object.getDuration_Time(),
					object.getDate(),object.getEconomy_Seat(),object.getBussiness_Seat(),};
				Ltable.addRow(input);
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 63, 571, 193);
		contentPane.add(scrollPane);
		table = new JTable(Ltable);
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton("Book");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			   //As user click on any flight message will be shown to him that his flight is booked 
				int line=table.getSelectedRow();
				JOptionPane.showMessageDialog(scrollPane, "Flight Booked");
			}
		});
		btnNewButton.setBounds(55, 267, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Payment");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Here price of the ticket will be shown to the passenger when he select his flight
				int dur=Integer.valueOf((String) table.getValueAt(table.getSelectedRow(), 2));
				int price=10000*dur;
				JOptionPane.showMessageDialog(null, "Total price of this flight is "+price);
				
			}
		});
		btnNewButton_1.setBounds(171, 267, 89, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Cancel");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//when passenger click on any flight and then click on the cancel button his flight will be cancelled
				int line=table.getSelectedRow();
				JOptionPane.showMessageDialog(scrollPane, "Flight Cacelled");
			}
		});
		btnNewButton_2.setBounds(282, 267, 89, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Back");
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//When user will click on back button he will be taken to the Passenger booking JFrame.
				Passenger_Booking obj=new Passenger_Booking();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(391, 267, 89, 23);
		contentPane.add(btnNewButton_3);
		
		lblNewLabel = new JLabel("Passenger Local Flight");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setForeground(new Color(204, 0, 0));
		lblNewLabel.setBounds(214, 11, 173, 23);
		contentPane.add(lblNewLabel);
		
	}
}
