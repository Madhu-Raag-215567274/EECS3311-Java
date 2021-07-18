import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.csvreader.CsvReader;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class GUIRemoveOfficer {
	
	private JFrame frame;

	public String path="user.csv";
	int flag=0;
	private JTextField email;
	public ArrayList<Users> users = new ArrayList<Users>();
	
		public GUIRemoveOfficer() {
			try {
				CsvReader reader = new CsvReader(path); 
				reader.readHeaders();

				while(reader.readRecord()){ 
					Users user1 = new Users();
					//name,lastname,id,email,password
					user1.setName(reader.get("name"));
					user1.setlastName(reader.get("lastname"));
					user1.setId(Integer.valueOf(reader.get("id")));
					user1.setEmail(reader.get("email"));
					user1.setPassword(reader.get("password"));
					user1.setSlot1(reader.get("slot1"));
					user1.setSlot2(reader.get("slot2"));
					user1.setSlot3(reader.get("slot3"));
					user1.setStime(Integer.valueOf(reader.get("stime")));
					user1.setEtime(Integer.valueOf(reader.get("etime")));
					user1.setL1(reader.get("l1"));
					user1.setL2(reader.get("l2"));
					user1.setL3(reader.get("l3"));
					user1.setStatus(reader.get("status"));
					user1.setParkingid(reader.get("parkingid"));
					users.add(user1);
				}
				
				
			}
			catch(Exception e1) {
				e1.printStackTrace();
			}
			
			frame = new JFrame();
			frame.setAlwaysOnTop(true);
			frame.setIconImage(Toolkit.getDefaultToolkit().getImage("unnamed.png"));
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setBackground(new Color(128, 0, 0));
			frame.getContentPane().setLayout(null);
			
			JLabel emailLabel = new JLabel("Email :");
			emailLabel.setForeground(Color.WHITE);
			emailLabel.setFont(new Font("Stencil", Font.PLAIN, 18));
			emailLabel.setBackground(new Color(128, 0, 0));
			emailLabel.setBounds(63, 63, 166, 41);
			frame.getContentPane().add(emailLabel);
			
			email = new JTextField();
			email.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			email.setColumns(10);
			email.setBounds(139, 68, 272, 31);
			frame.getContentPane().add(email);
			
			JButton SignInbutton = new JButton("Remove Now");
			SignInbutton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					flag=0;
					
					if(email.getText().isEmpty()) {
						JOptionPane.showMessageDialog(SignInbutton,"Field is empty ","Error",JOptionPane.ERROR_MESSAGE);

					}
					else {

						try {

							CsvReader reader = new CsvReader(path); 
							reader.readHeaders();

								for(Users aa:users) {
									if(email.getText().equals( aa.getEmail())) {
										flag =1;
										aa.setName(null);
										aa.setlastName(null);
										aa.setId(0);
										aa.setEmail(null);
										aa.setPassword(null);
										aa.setSlot1(null);
										aa.setSlot2(null);
										aa.setSlot3(null);
										aa.setStime(0);
										aa.setEtime(0);
										aa.setL1(null);
										aa.setL2(null);
										aa.setL3(null);
										aa.setStatus(null);
										aa.setParkingid(null);
										
										break;
									}
								}
								

								

							
							
							if(flag!=1){
								JOptionPane.showMessageDialog(SignInbutton,"Incorrect Email","Error",JOptionPane.ERROR_MESSAGE);
								email.setText(null);
							

								
							}
							else {
								UserManagement pp= new UserManagement(users);
								JOptionPane.showMessageDialog(SignInbutton,"Officer removed","Message",JOptionPane.INFORMATION_MESSAGE);
								//frame.dispose();
							}
							
							


						} catch (Exception e1) {

							e1.printStackTrace();
						}
					}
				}
			});
			SignInbutton.setForeground(Color.BLACK);
			SignInbutton.setFont(new Font("Snap ITC", Font.PLAIN, 16));
			SignInbutton.setBackground(Color.YELLOW);
			SignInbutton.setBounds(139, 135, 184, 69);
			frame.getContentPane().add(SignInbutton);
			frame.setVisible(true);
			frame.setResizable(false);
			frame.setSize(483, 278);
		
	}
}
