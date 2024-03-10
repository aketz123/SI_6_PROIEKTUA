package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import businessLogic.BLFacade;
import dataAccess.DataAccess;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
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
	public LoginGUI() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("USER");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 26));
		lblNewLabel.setBounds(58, 61, 70, 38);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(26, 115, 177, 51);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		textField.setBounds(194, 61, 204, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		BLFacade facade = StartGUI.getBusinessLogic();
		
		JButton btnNewButton = new JButton("ACCEPT");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				
				int IAS = facade.isAUser(textField.getText(), passwordField.getText());
				
				if(IAS != 0) {
					
					System.out.println("ona");
					
				}
				
				System.out.println("txarra");
				
			}
		});
		btnNewButton.setFont(new Font("Source Serif Pro Semibold", Font.PLAIN, 14));
		btnNewButton.setBounds(87, 191, 263, 23);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		passwordField.setBounds(194, 128, 204, 20);
		contentPane.add(passwordField);
	}
}
