import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.SpringLayout;

import com.csvreader.CsvReader;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import java.awt.Toolkit;

public class GuiSignIn {
	
	private JFrame frame;
	private JTextField email;
	public String path="C:\\Users\\Raag\\Downloads\\user.csv";
	int flag=0;
	private JPasswordField password;
	
	public GuiSignIn() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Raag\\Downloads\\unnamed.png"));
		frame.setAlwaysOnTop(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
	
		
		frame.setSize(373, 315);
		
		frame.setBackground(new Color(192, 192, 192));
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.getContentPane().setLayout(null);
		
		JLabel EmailLabel = new JLabel("Email :");
		EmailLabel.setFont(new Font("Stencil", Font.PLAIN, 15));
		EmailLabel.setBounds(62, 63, 53, 14);
		EmailLabel.setForeground(Color.DARK_GRAY);
		frame.getContentPane().add(EmailLabel);
		
		email = new JTextField();
		email.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		email.setBounds(125, 56, 210, 26);
		frame.getContentPane().add(email);
		email.setColumns(10);
		
		JLabel PasswordLabel = new JLabel("Password :");
		PasswordLabel.setForeground(Color.DARK_GRAY);
		PasswordLabel.setFont(new Font("Stencil", Font.PLAIN, 15));
		PasswordLabel.setBounds(29, 112, 98, 14);
		frame.getContentPane().add(PasswordLabel);
		
		JButton SignInbutton = new JButton("Sign in");
		SignInbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(email.getText().isEmpty()||password.getText().isEmpty()) {
					JOptionPane.showMessageDialog(SignInbutton,"Field is empty ","Error",JOptionPane.ERROR_MESSAGE);

				}
				else {

					try {

						CsvReader reader = new CsvReader(path); 
						reader.readHeaders();

						while(reader.readRecord()){ 

							Users user = new Users();
							//name,lastname,id,email,password
							user.setName(reader.get("name"));
							user.setlastName(reader.get("lastname"));
							user.setId(Integer.valueOf(reader.get("id")));
							user.setEmail(reader.get("email"));
							user.setPassword(reader.get("password"));

							if(email.getText().equals( reader.get("email")) && password.getText().equals(reader.get("password")) ) {
								flag=1;
								GUIBookParking book =new GUIBookParking();	
								frame.dispose();

								break;
							}

						}
						
						if(flag!=1){
							JOptionPane.showMessageDialog(SignInbutton,"Incorrect Email or Password","Error",JOptionPane.ERROR_MESSAGE);
							email.setText(null);
							password.setText(null);

							
						}
						
						


					} catch (Exception e1) {

						e1.printStackTrace();
					}
				}

				
			}
		});
		SignInbutton.setForeground(Color.BLACK);
		SignInbutton.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		SignInbutton.setBackground(new Color(144, 238, 144));
		SignInbutton.setBounds(104, 184, 135, 67);
		frame.getContentPane().add(SignInbutton);
		
		password = new JPasswordField();
		password.setEchoChar('*');
		password.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		password.setBounds(125, 105, 210, 26);
		frame.getContentPane().add(password);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show password");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					password.setEchoChar((char)0);
				}else {
					password.setEchoChar('*');
				}
			}
		});
		chckbxNewCheckBox.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 12));
		chckbxNewCheckBox.setBackground(Color.ORANGE);
		chckbxNewCheckBox.setBounds(127, 129, 161, 33);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		
		
	}
}
