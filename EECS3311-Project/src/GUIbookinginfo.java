import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIbookinginfo {
	private JFrame frame;
	
	public GUIbookinginfo(Users user, ArrayList<Users> users) {
		
		
		frame = new JFrame();	
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setSize(542, 527);
		
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Raag\\Downloads\\unnamed.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 51));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Booking information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 204, 51)));
		panel.setBounds(0, 0, 538, 498);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Parking Details");
		lblNewLabel.setBounds(189, 23, 153, 23);
		lblNewLabel.setFont(new Font("Snap ITC", Font.PLAIN, 17));
		lblNewLabel.setForeground(Color.WHITE);
		panel.add(lblNewLabel);
		
		JLabel lblParkingId = new JLabel("Parking ID:");
		lblParkingId.setForeground(Color.WHITE);
		lblParkingId.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblParkingId.setBounds(50, 75, 96, 23);
		panel.add(lblParkingId);
		
		JTextPane textPane = new JTextPane();
		////////////////////////////////////
		textPane.setText(user.getParkingid());
		textPane.setEditable(false); 
		
		textPane.setBounds(170, 75, 183, 20);
		panel.add(textPane);
		
		JLabel lblParkingId_1 = new JLabel("Name:");
		lblParkingId_1.setForeground(Color.WHITE);
		lblParkingId_1.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblParkingId_1.setBounds(50, 127, 96, 23);
		panel.add(lblParkingId_1);
		
		JLabel lblParkingId_1_1 = new JLabel("Slot 1:");
		lblParkingId_1_1.setForeground(Color.WHITE);
		lblParkingId_1_1.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblParkingId_1_1.setBounds(50, 179, 58, 23);
		panel.add(lblParkingId_1_1);
		
		JLabel lblParkingId_1_1_1 = new JLabel("Slot 2:");
		lblParkingId_1_1_1.setForeground(Color.WHITE);
		lblParkingId_1_1_1.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblParkingId_1_1_1.setBounds(50, 229, 58, 23);
		panel.add(lblParkingId_1_1_1);
		
		JLabel lblParkingId_1_1_2 = new JLabel("Slot 3:");
		lblParkingId_1_1_2.setForeground(Color.WHITE);
		lblParkingId_1_1_2.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblParkingId_1_1_2.setBounds(50, 274, 58, 23);
		panel.add(lblParkingId_1_1_2);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText(user.getName()+ " "+ user.getlastName());
		textPane_1.setEditable(false); 
		textPane_1.setBounds(170, 130, 183, 20);
		panel.add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setText(user.getSlot1());
		textPane_2.setEditable(false); 
		textPane.getSelectedText();
		textPane_2.setBounds(118, 179, 101, 20);
		panel.add(textPane_2);
		
		JLabel lblParkingId_1_1_3 = new JLabel("License plate #:");
		lblParkingId_1_1_3.setForeground(Color.WHITE);
		lblParkingId_1_1_3.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblParkingId_1_1_3.setBounds(243, 181, 178, 23);
		panel.add(lblParkingId_1_1_3);
		
		JTextPane textPane_2_1 = new JTextPane();
		textPane_2_1.setText(user.getL1());
		textPane_2_1.setEditable(false); 

		textPane_2_1.setBounds(383, 179, 121, 20);
		panel.add(textPane_2_1);
		
		JTextPane textPane_2_2 = new JTextPane();
		textPane_2_2.setText(user.getSlot2());
		textPane_2_2.setEditable(false); 

		textPane_2_2.setBounds(118, 232, 101, 20);
		panel.add(textPane_2_2);
		
		JTextPane textPane_2_2_1 = new JTextPane();

		textPane_2_2_1.setText(user.getSlot3());
		textPane_2_2_1.setEditable(false); 

		textPane_2_2_1.setBounds(118, 277, 101, 20);
		panel.add(textPane_2_2_1);
		
		JTextPane textPane_2_1_1 = new JTextPane();
		textPane_2_1_1.setText(user.getL2());
		textPane_2_1_1.setEditable(false); 

		textPane_2_1_1.setBounds(383, 232, 121, 20);
		panel.add(textPane_2_1_1);
		
		JTextPane textPane_2_1_2 = new JTextPane();
		textPane_2_1_2.setText(user.getL3());
		textPane_2_1_2.setEditable(false); 

		textPane_2_1_2.setBounds(383, 277, 121, 20);
		panel.add(textPane_2_1_2);
		
		JLabel lblParkingId_1_1_3_3 = new JLabel("License plate #:");
		lblParkingId_1_1_3_3.setForeground(Color.WHITE);
		lblParkingId_1_1_3_3.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblParkingId_1_1_3_3.setBounds(243, 229, 178, 23);
		panel.add(lblParkingId_1_1_3_3);
		
		JLabel lblParkingId_1_1_3_1 = new JLabel("License plate #:");
		lblParkingId_1_1_3_1.setForeground(Color.WHITE);
		lblParkingId_1_1_3_1.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblParkingId_1_1_3_1.setBounds(243, 277, 178, 23);
		panel.add(lblParkingId_1_1_3_1);
		
		JLabel lblParkingId_1_1_2_1 = new JLabel("Timing:");
		lblParkingId_1_1_2_1.setForeground(Color.WHITE);
		lblParkingId_1_1_2_1.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblParkingId_1_1_2_1.setBounds(50, 326, 58, 23);
		panel.add(lblParkingId_1_1_2_1);
		
		JLabel lblParkingId_1_1_2_2 = new JLabel("From:");
		lblParkingId_1_1_2_2.setForeground(Color.WHITE);
		lblParkingId_1_1_2_2.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblParkingId_1_1_2_2.setBounds(50, 384, 58, 23);
		panel.add(lblParkingId_1_1_2_2);
		
		JLabel lblParkingId_1_1_2_3 = new JLabel("To:");
		lblParkingId_1_1_2_3.setForeground(Color.WHITE);
		lblParkingId_1_1_2_3.setFont(new Font("Stencil", Font.PLAIN, 15));
		lblParkingId_1_1_2_3.setBounds(262, 384, 58, 23);
		panel.add(lblParkingId_1_1_2_3);
		
		JTextPane textPane_2_2_1_1 = new JTextPane();
		textPane_2_2_1_1.setText(String.valueOf(user.getStime()));
		textPane_2_2_1_1.setEditable(false); 

		textPane_2_2_1_1.setBounds(118, 384, 101, 20);
		panel.add(textPane_2_2_1_1);
		
		JTextPane textPane_2_2_1_2 = new JTextPane();
		textPane_2_2_1_2.setText(String.valueOf(user.getEtime()));
		textPane_2_2_1_2.setEditable(false); 

		textPane_2_2_1_2.setBounds(302, 383, 101, 20);
		panel.add(textPane_2_2_1_2);
		
		JButton cancelButton = new JButton("Cancel Parking");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Users tem=new Users();
				for(Users aa : users) {
					if(aa.getEmail().equals(user.getEmail())) {
						aa.setSlot1(null);
						aa.setSlot2(null);
						aa.setSlot3(null);
						aa.setStime(0);
						aa.setEtime(0);
						aa.setL1(null);
						aa.setL2(null);
						aa.setL3(null);
						aa.setParkingid(null);
						tem=aa;
						break;
						
					}
				}
				UserManagement cc =new UserManagement(users);
				GUIBookParking pp = new GUIBookParking(tem);
				frame.dispose();
			}
		});
		cancelButton.setBackground(new Color(255, 69, 0));
		cancelButton.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		cancelButton.setBounds(157, 419, 196, 48);
		panel.add(cancelButton);
	}
}
