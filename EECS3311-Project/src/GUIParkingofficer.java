import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;

import com.csvreader.CsvReader;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class GUIParkingofficer {
	
	private JFrame frame;
	private JTextField slottext;
	public ArrayList<Users> users = new ArrayList<Users>();
	public String path="user.csv";

	int flag=0;


	
	public GUIParkingofficer() {
		

		
		
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("unnamed.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(554, 350);
		frame.getContentPane().setLayout(null);
		
		
		
		
		JLabel lblNewLabel = new JLabel("Enter Slot:");
		lblNewLabel.setBounds(69, 79, 115, 14);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 17));
		lblNewLabel.setBackground(Color.WHITE);
		frame.getContentPane().add(lblNewLabel);
		
		slottext = new JTextField();
		slottext.setBounds(194, 76, 194, 20);
		slottext.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		frame.getContentPane().add(slottext);
		slottext.setColumns(10);
		
		
		JLabel lblSelectAction = new JLabel("Select action: ");
		lblSelectAction.setBounds(69, 153, 147, 14);
		lblSelectAction.setForeground(Color.WHITE);
		lblSelectAction.setFont(new Font("Stencil", Font.PLAIN, 17));
		lblSelectAction.setBackground(Color.WHITE);
		frame.getContentPane().add(lblSelectAction);
		
		JLabel lblNewLabel_1 = new JLabel("Parking Officer");
		lblNewLabel_1.setBounds(209, 11, 169, 29);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Snap ITC", Font.PLAIN, 18));
		frame.getContentPane().add(lblNewLabel_1);
		
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


		
		
		JButton addButton = new JButton("Add slot");
		addButton.setBounds(106, 205, 156, 73);
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for(Users aa: users) {
					if(aa.getSlot1().equals(slottext.getText())) {
						aa.setSlot1(null);
					

						//JOptionPane.showMessageDialog(null, "Slot "+slottext.getText()+  " is taken","Error",JOptionPane.ERROR_MESSAGE);
						//flag=1;
						break;						
					}
					else if( aa.getSlot2().equals(slottext.getText())) {
						aa.setSlot2(null);
						break;
					}
					else if (aa.getSlot3().equals(slottext.getText())) {
						aa.setSlot3(null);
						break;
						
					}

				}
				UserManagement lp = new UserManagement(users);
				JOptionPane.showMessageDialog(null, "Slot "+slottext.getText()+  " is added.","Message",JOptionPane.INFORMATION_MESSAGE);
				frame.dispose();
				GUIParkingofficer pc = new GUIParkingofficer();
				users.clear();
				
				
			}
		});
		
		addButton.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		frame.getContentPane().add(addButton);
		
		
		
		JButton btnRemoveSlot = new JButton("Remove slot");
		btnRemoveSlot.setBounds(290, 205, 162, 73);
		btnRemoveSlot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				flag=0;
				for(Users aa: users) {
					if(aa.getSlot1().equals(slottext.getText())|| aa.getSlot2().equals(slottext.getText())|| aa.getSlot3().equals(slottext.getText())) {
						
						JOptionPane.showMessageDialog(null, "Slot "+slottext.getText()+  " is taken","Error",JOptionPane.ERROR_MESSAGE);
						flag=1;
						break;						
					}
				}
				if(flag==1) {
					//do nothing
				}else {
					try {
						UserManagement ss = new UserManagement("Parking","Officer", 0, null, null, slottext.getText(), null, null, 0, 0, null, null, null, null, null, users);
						frame.dispose();
						JOptionPane.showMessageDialog(null, "Slot "+slottext.getText()+  " has been removed.","Message",JOptionPane.INFORMATION_MESSAGE);
						GUIParkingofficer fp = new GUIParkingofficer();
						users.clear();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
				
				
			}
		});
		btnRemoveSlot.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		frame.getContentPane().add(btnRemoveSlot);
	}
}
