package gui;

import java.text.DateFormat;
import java.util.*;
import java.util.List;

import javax.swing.*;

import com.toedter.calendar.JCalendar;

import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.Driver;

import businessLogic.BLFacade;
import configuration.UtilDate;
import domain.User;
import domain.Ride;
import domain.Traveler;
import exceptions.RideAlreadyExistException;
import exceptions.RideMustBeLaterThanTodayException;
import exceptions.UserAlreadyExistException;

public class RegisterGUI extends JFrame {

	private User user;
	private JTextField fieldName = new JTextField();

	private JTextField fieldEmail = new JTextField();
	private JTextField fieldPassword = new JPasswordField();
	private JTextField textName = new JTextField();
	private final JLabel jLabelPassword = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("RegisterGUI.Password"));
	private final JLabel jLabelEmail = new JLabel(ResourceBundle.getBundle("Etiquetas").getString("RegisterGUI.Email"));
	private JLabel jLabelName=new JLabel(ResourceBundle.getBundle("Etiquetas").getString("RegisterGUI.Name"));
	private JRadioButton rdbtnTraveler=new JRadioButton(ResourceBundle.getBundle("Etiquetas").getString("RegisterGUI.Traveler"));
	private JRadioButton rdbtDriver=new JRadioButton(ResourceBundle.getBundle("Etiquetas").getString("RegisterGUI.Driver"));
	private JButton btnContinue=new JButton(ResourceBundle.getBundle("Etiquetas").getString("RegisterGUI.Continue"));

	
	public RegisterGUI() {

		this.getContentPane().setLayout(null);
		this.setSize(new Dimension(604, 370));

		fieldName.setBounds(167, 107, 243, 26);
		getContentPane().add(fieldName);

		fieldPassword.setBounds(167, 157, 243, 26);
		getContentPane().add(fieldPassword);

		fieldEmail.setBounds(167, 55, 243, 26);
		getContentPane().add(fieldEmail);

		jLabelName = new JLabel("Name");
		jLabelName.setFont(new Font("Sylfaen", Font.PLAIN, 26));
		jLabelName.setBounds(49, 85, 76, 73);
		getContentPane().add(jLabelName);
		jLabelPassword.setFont(new Font("Sylfaen", Font.PLAIN, 26));
		jLabelPassword.setBounds(49, 143, 131, 56);

		getContentPane().add(jLabelPassword);
		jLabelEmail.setFont(new Font("Sylfaen", Font.PLAIN, 26));
		jLabelEmail.setBounds(49, 44, 76, 50);

		getContentPane().add(jLabelEmail);

		rdbtnTraveler = new JRadioButton("Traveler");
		rdbtnTraveler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtDriver.setEnabled(false);
			}
		});
		rdbtnTraveler.setFont(new Font("Sylfaen", Font.PLAIN, 26));
		rdbtnTraveler.setBounds(123, 205, 147, 33);
		getContentPane().add(rdbtnTraveler);

		rdbtDriver = new JRadioButton("Driver");
		rdbtDriver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rdbtnTraveler.setEnabled(false);

			}
		});
		rdbtDriver.setFont(new Font("Tahoma", Font.PLAIN, 26));
		rdbtDriver.setBounds(301, 202, 109, 23);
		getContentPane().add(rdbtDriver);

		btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					BLFacade facade = MainGUI.getBusinessLogic();
					User u = facade.createUser(fieldEmail.getText(), fieldPassword.getText(), fieldName.getText());
		

				} catch (UserAlreadyExistException e1) {
					// TODO Auto-generated catch block
					e1.getMessage();
				}
				if (rdbtnTraveler.isSelected()) {
					JFrame a=new MainTravelerGUI((Traveler)user);
					a.setVisible(true);

				}
				if (rdbtDriver.isSelected()) {
					JFrame b=new MainDriverGUI((domain.Driver)user);
					b.setVisible(true);
				}
			}
		});
		btnContinue.setFont(new Font("Sylfaen", Font.PLAIN, 26));
		btnContinue.setBounds(207, 273, 170, 50);
		getContentPane().add(btnContinue);
	}
	
}