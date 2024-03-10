package gui;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PutTakeoutMoneyGUI extends JFrame  {

	private JRadioButton rdbtnPut;

	public PutTakeoutMoneyGUI() {
		this.getContentPane().setLayout(null);
		this.setSize(new Dimension(604, 370));
		
		rdbtnPut = new JRadioButton("Put money");
		rdbtnPut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rdbtnPut.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnPut.setHorizontalAlignment(SwingConstants.LEFT);
		rdbtnPut.setBounds(81, 213, 168, 79);
		getContentPane().add(rdbtnPut, BorderLayout.SOUTH);
		
		JRadioButton rdbtnTakeOut = new JRadioButton("Take out money");
		rdbtnTakeOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rdbtnTakeOut.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnTakeOut.setBounds(310, 204, 215, 96);
		getContentPane().add(rdbtnTakeOut);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(178, 139, 199, 51);
		getContentPane().add(textArea);
		
		JLabel lblMoney = new JLabel("Money quantity:");
		lblMoney.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMoney.setBounds(204, 85, 153, 41);
		getContentPane().add(lblMoney);
		// TODO Auto-generated constructor stub
	}
}
