import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.csvreader.CsvReader;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class GUIAdmin {
	
	private JFrame frame;
	public ArrayList<Users> users = new ArrayList<Users>();
	public String path="user.csv";
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	int flag=0;

	public GUIAdmin() {
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
		frame.getContentPane().setBackground(new Color(128, 0, 128));
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setSize(432, 620);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Administrator");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Snap ITC", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(128, 25, 169, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField.setBounds(175, 93, 125, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("First name:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblNewLabel.setBounds(28, 93, 137, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last name:");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblLastName.setBounds(28, 133, 137, 20);
		frame.getContentPane().add(lblLastName);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(175, 132, 125, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblEmail.setBounds(28, 172, 137, 20);
		frame.getContentPane().add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(175, 171, 125, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblParkingSpace = new JLabel("Parking space:");
		lblParkingSpace.setForeground(Color.WHITE);
		lblParkingSpace.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblParkingSpace.setBounds(28, 214, 137, 20);
		frame.getContentPane().add(lblParkingSpace);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBounds(175, 213, 125, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblChangePaymentStatus = new JLabel("Change payment status:");
		lblChangePaymentStatus.setForeground(Color.WHITE);
		lblChangePaymentStatus.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblChangePaymentStatus.setBounds(28, 256, 228, 20);
		frame.getContentPane().add(lblChangePaymentStatus);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(244, 251, 148, 29);
		frame.getContentPane().add(textField_4);
		
		JButton btnNewButton = new JButton("Change");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 flag=0;
				if(textField.getText().isEmpty() || textField_1.getText().isEmpty() || textField_2.getText().isEmpty()||textField_3.getText().isEmpty() || textField_4.getText().isEmpty()) {
					JOptionPane.showMessageDialog(btnNewButton,"Field is empty ","Error",JOptionPane.ERROR_MESSAGE);		
				}
				else {

					for(Users aa: users) {
						if(aa.getEmail().equals(textField_2.getText())) {
							aa.setStatus(textField_4.getText());
							flag=1;
							break;
						}
					}
					if(flag==1) {
						UserManagement lp = new UserManagement(users);
						JOptionPane.showMessageDialog(btnNewButton,"Payment status updated ","Message",JOptionPane.INFORMATION_MESSAGE);		
						frame.dispose();
						GUIAdmin pc = new GUIAdmin();
						users.clear();

					}
					else {
						JOptionPane.showMessageDialog(btnNewButton,"User not registered","Error",JOptionPane.ERROR_MESSAGE);		

					}
					
					
					
					
				}
			}
		});
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		btnNewButton.setBounds(142, 294, 155, 42);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(128, 0, 128));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Change Payment Status", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel.setBounds(10, 65, 393, 304);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Add Parking Officer", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel_1.setBackground(new Color(128, 0, 128));
		panel_1.setBounds(10, 390, 393, 179);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Add Officer");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Stencil", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIuser nn= new GUIuser(1);
				
			}
		});
		btnNewButton_1.setBackground(new Color(0, 128, 0));
		btnNewButton_1.setBounds(39, 74, 151, 34);
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Remove Officer");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//GuiSignIn lp = new GuiSignIn(1);
				GUIRemoveOfficer mm= new GUIRemoveOfficer();
				
			}
		});
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setFont(new Font("Stencil", Font.PLAIN, 14));
		btnNewButton_1_1.setBackground(new Color(0, 128, 0));
		btnNewButton_1_1.setBounds(226, 74, 151, 34);
		panel_1.add(btnNewButton_1_1);
		
		
		
		
	}
}
