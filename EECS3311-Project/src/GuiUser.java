import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import com.csvreader.CsvReader;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;

public class GUIuser {
	
	JFrame frame =new JFrame();
	private JTextField firstName;
	private JTextField lastName;
	private JTextField email;
	static int id=0;
	public ArrayList<Users> users = new ArrayList<Users>();
	public String path="C:\\Users\\Raag\\Downloads\\user.csv";
	int flag=0;
	private JPasswordField password;

	GUIuser(){
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Raag\\Downloads\\unnamed.png"));
		frame.setResizable(false);
		frame.setVisible(true);
		
		frame.setAlwaysOnTop(true);
		frame.setBackground(new Color(192, 192, 192));
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().setBackground(new Color(0, 191, 255));
		frame.getContentPane().setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name :");
		lblFirstName.setFont(new Font("Stencil", Font.PLAIN, 18));
		lblFirstName.setForeground(new Color(255, 255, 255));
		lblFirstName.setBackground(new Color(128, 0, 0));
		lblFirstName.setBounds(34, 144, 166, 41);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name :");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Stencil", Font.PLAIN, 18));
		lblLastName.setBackground(new Color(128, 0, 0));
		lblLastName.setBounds(45, 215, 166, 41);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Stencil", Font.PLAIN, 18));
		lblEmail.setBackground(new Color(128, 0, 0));
		lblEmail.setBounds(86, 294, 166, 41);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Stencil", Font.PLAIN, 18));
		lblPassword.setBackground(new Color(128, 0, 0));
		lblPassword.setBounds(45, 370, 166, 41);
		frame.getContentPane().add(lblPassword);
		
		JLabel lbEnter = new JLabel("Enter your information");
		lbEnter.setHorizontalAlignment(SwingConstants.CENTER);
		lbEnter.setForeground(Color.WHITE);
		lbEnter.setFont(new Font("Stencil", Font.PLAIN, 24));
		lbEnter.setBackground(new Color(128, 0, 0));
		lbEnter.setBounds(104, 54, 334, 53);
		frame.getContentPane().add(lbEnter);
		
		firstName = new JTextField();
		firstName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		firstName.setBounds(166, 149, 272, 31);
		frame.getContentPane().add(firstName);
		firstName.setColumns(10);
		
		lastName = new JTextField();
		lastName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lastName.setColumns(10);
		lastName.setBounds(166, 220, 272, 31);
		frame.getContentPane().add(lastName);
		
		email = new JTextField();
		email.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		email.setColumns(10);
		email.setBounds(166, 299, 272, 31);
		frame.getContentPane().add(email);
		
		JButton SignInbutton = new JButton("Register Now");
		SignInbutton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
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
							
							user.setSlot1(reader.get("slot1"));
							user.setSlot2(reader.get("slot2"));
							user.setSlot3(reader.get("slot3"));
							user.setStime(Integer.valueOf(reader.get("stime")));
							user.setEtime(Integer.valueOf(reader.get("etime")));
							user.setL1(reader.get("l1"));
							user.setL2(reader.get("l2"));
							user.setL3(reader.get("l3"));
							user.setStatus(reader.get("status"));
							user.setParkingid(reader.get("parkingid"));
							
							id=Integer.valueOf(reader.get("id"));
							
							if(email.getText().equals( reader.get("email"))) {
								JOptionPane.showMessageDialog(SignInbutton,"Already registered with this email address, try again with different email","Error",JOptionPane.ERROR_MESSAGE);
								firstName.setText(null);
								lastName.setText(null);					
								email.setText(null);
								password.setText(null);
								flag=1;
								break;
							}
							
							users.add(user);
						}
					
					if(flag==1) {
						users.clear();
						flag=0;
					}
					else {
						
						if(firstName.getText().isEmpty() ||lastName.getText().isEmpty() ||email.getText().isEmpty()||password.getText().isEmpty()) {
							JOptionPane.showMessageDialog(SignInbutton,"Field is empty ","Error",JOptionPane.ERROR_MESSAGE);
						}
						else {
							
							flag=0;
							id++;
						
							UserManagement use = new UserManagement(firstName.getText(), lastName.getText(), id, email.getText(), password.getText(),null,null,null,0,0,null,null,null,null,null,users);
									
							users.clear();
						
							frame.dispose();

							//here
							GUICustomer cus =new GUICustomer();
							
							
						}
				
					}
				} catch (Exception e1) {
					
					e1.printStackTrace();
				}
			}
		});
		SignInbutton.setForeground(Color.BLACK);
		SignInbutton.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		SignInbutton.setBackground(new Color(255, 255, 0));
		SignInbutton.setBounds(166, 458, 184, 69);
		frame.getContentPane().add(SignInbutton);
		
		password = new JPasswordField();
		password.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		password.setEchoChar('*');
		password.setBounds(166, 371, 272, 31);
		frame.getContentPane().add(password);
		frame.setBounds(100, 100, 526, 594);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
		chckbxNewCheckBox.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 12));
		chckbxNewCheckBox.setBackground(new Color(0, 191, 255));
		chckbxNewCheckBox.setBounds(166, 403, 161, 33);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		
		
	}
}
