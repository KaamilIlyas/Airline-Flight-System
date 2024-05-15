package project;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class Admin_Add_Int_Entries extends JFrame {

	private JPanel contentPane;
	private JTextField txtFromCity;
	private JTextField txtToCity;
	private JTextField txtDepartureTime;
	private JTextField txtDate;
	private JTextField txtEconomySeat;
	private JTextField txtBussinessSeat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Add_Int_Entries frame = new Admin_Add_Int_Entries();
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
	public Admin_Add_Int_Entries() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 431);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtFromCity = new JTextField();
		txtFromCity.setBounds(187, 108, 86, 20);
		contentPane.add(txtFromCity);
		txtFromCity.setColumns(10);
		
		txtToCity = new JTextField();
		txtToCity.setBounds(187, 139, 86, 20);
		contentPane.add(txtToCity);
		txtToCity.setColumns(10);
		
		txtDepartureTime = new JTextField();
		txtDepartureTime.setBounds(187, 170, 86, 20);
		contentPane.add(txtDepartureTime);
		txtDepartureTime.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setBounds(187, 201, 86, 20);
		contentPane.add(txtDate);
		txtDate.setColumns(10);
		
		txtEconomySeat = new JTextField();
		txtEconomySeat.setBounds(187, 232, 86, 20);
		contentPane.add(txtEconomySeat);
		txtEconomySeat.setColumns(10);
		
		txtBussinessSeat = new JTextField();
		txtBussinessSeat.setBounds(187, 263, 86, 20);
		contentPane.add(txtBussinessSeat);
		txtBussinessSeat.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//As admin click on the add button the information will be stored in the Admin international flight.
				International_Flights obj=new International_Flights(txtFromCity.getText(),txtToCity.getText(),txtDepartureTime.getText(),
						txtDate.getText(),txtEconomySeat.getText(),txtBussinessSeat.getText());
				Admin_Int_Flight.Ilist.add(obj);
			}
		});
		btnNewButton.setBounds(277, 289, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("View");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//When admin will click on the view button he will be taken to the admin international JFrame and all the information that
				//admin had added will be displayed there
				Admin_Int_Flight obj=new Admin_Int_Flight();
				obj.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(277, 323, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("From City");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(66, 111, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("To City");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(66, 142, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Duration Time");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(66, 173, 86, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Date");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(66, 204, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Economy Seat");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(66, 235, 86, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Bussiness Seat");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(66, 266, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Admin Adding Entries\r\n for");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(new Color(255, 0, 0));
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(167, 11, 215, 31);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("International Flight");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setForeground(new Color(255, 0, 0));
		lblNewLabel_7.setBounds(208, 41, 148, 20);
		contentPane.add(lblNewLabel_7);
	}
}
