import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class GuiUser {
	
	JFrame frame =new JFrame();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	GuiUser(){
		frame.setResizable(false);
		frame.setVisible(true);
		
		frame.setAlwaysOnTop(true);
		frame.setBackground(new Color(192, 192, 192));
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().setBackground(new Color(128, 0, 0));
		frame.getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblFirstName.setForeground(new Color(255, 255, 255));
		lblFirstName.setBackground(new Color(128, 0, 0));
		lblFirstName.setBounds(45, 131, 166, 41);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblLastName.setBackground(new Color(128, 0, 0));
		lblLastName.setBounds(45, 220, 166, 41);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblEmail.setBackground(new Color(128, 0, 0));
		lblEmail.setBounds(45, 299, 166, 41);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblPassword.setBackground(new Color(128, 0, 0));
		lblPassword.setBounds(45, 375, 166, 41);
		frame.getContentPane().add(lblPassword);
		
		JLabel lbEnter = new JLabel("Enter your information");
		lbEnter.setHorizontalAlignment(SwingConstants.CENTER);
		lbEnter.setForeground(Color.WHITE);
		lbEnter.setFont(new Font("Stencil", Font.PLAIN, 20));
		lbEnter.setBackground(new Color(128, 0, 0));
		lbEnter.setBounds(120, 38, 285, 41);
		frame.getContentPane().add(lbEnter);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField.setBounds(166, 131, 272, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(166, 220, 272, 31);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(166, 299, 272, 31);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(166, 375, 272, 31);
		frame.getContentPane().add(textField_3);
		frame.setBounds(100, 100, 526, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
