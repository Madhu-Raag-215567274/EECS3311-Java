import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JFormattedTextField;
import javax.swing.border.LineBorder;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;

import com.csvreader.CsvReader;

import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.CompoundBorder;

public class GUIBookParking {
	private JFrame frame;
	public Users us=new Users();
	int counter=0;
	public String path="C:\\Users\\Raag\\Downloads\\user.csv";
	int flag=0;
	public ArrayList<Users> users = new ArrayList<Users>();
	public ArrayList<String> slots = new ArrayList<String>();


	

	GUIBookParking(Users use) {
		this.us=use;
		/////////////////
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
		
		
		
		/////////////////
		frame = new JFrame();		
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Raag\\Downloads\\unnamed.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setVisible(true);
		frame.setResizable(false);



		frame.setSize(367, 804);
		frame.getContentPane().setLayout(null);

		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(469, 17, 1, 1);
		frame.getContentPane().add(desktopPane);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 191, 255));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Parking Slots", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(0, 0, 361, 567);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JCheckBox slotCheckBox = new JCheckBox("     A 1");
		slotCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
		slotCheckBox.setForeground(new Color(255, 255, 255));
		slotCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(slotCheckBox.isSelected()) {
					try {
						flag=0;
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

							if("A1".equals(reader.get("slot1")) ||  "A1".equals(reader.get("slot2")) || "A1".equals(reader.get("slot3")) ) {
								JOptionPane.showMessageDialog(null, "Slot A1 is taken","Error",JOptionPane.ERROR_MESSAGE);
								slotCheckBox.setSelected(false);
								flag=1;		
								

								break;
							}

						}

						if(flag!=1) {
							counter++;
							slots.add("A1");
						}

					}
					catch(Exception e1) {
						e1.printStackTrace();
					}



				}else {
					counter--;
					slots.remove("A1");
				}

			}
		});
		slotCheckBox.setFont(new Font("Stencil", Font.PLAIN, 14));
		slotCheckBox.setBackground(new Color(50, 205, 50));
		slotCheckBox.setBounds(30, 75, 97, 23);
		slotCheckBox.setBorderPainted(true);
		panel.add(slotCheckBox);

		JCheckBox slotCheckBox_1 = new JCheckBox("     B 1");
		slotCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(slotCheckBox_1.isSelected()) {
					try {
						flag=0;
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

							if("B1".equals(reader.get("slot1")) ||  "B1".equals(reader.get("slot2")) || "B1".equals(reader.get("slot3")) ) {
								JOptionPane.showMessageDialog(null, "Slot B1 is taken","Error",JOptionPane.ERROR_MESSAGE);
								slotCheckBox_1.setSelected(false);
								flag=1;		
								

								break;
							}

						}

						if(flag!=1) {
							counter++;
							slots.add("B1");
						}

					}
					catch(Exception e1) {
						e1.printStackTrace();
					}



				}else {
					counter--;
					slots.remove("B1");
				}
			}
		});
		slotCheckBox_1.setForeground(new Color(255, 255, 255));
		slotCheckBox_1.setFont(new Font("Stencil", Font.PLAIN, 14));
		slotCheckBox_1.setBackground(new Color(50, 205, 50));
		slotCheckBox_1.setBounds(240, 75, 97, 23);
		slotCheckBox_1.setBorderPainted(true);

		panel.add(slotCheckBox_1);

		JCheckBox slotCheckBox_2 = new JCheckBox("     A 2");
		slotCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(slotCheckBox_2.isSelected()) {
					try {
						flag=0;
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

							if("A2".equals(reader.get("slot1")) ||  "A2".equals(reader.get("slot2")) || "A2".equals(reader.get("slot3")) ) {
								JOptionPane.showMessageDialog(null, "Slot A2 is taken","Error",JOptionPane.ERROR_MESSAGE);
								slotCheckBox_2.setSelected(false);
								flag=1;		
								

								break;
							}

						}

						if(flag!=1) {
							counter++;
							slots.add("A2");
							
						}

					}
					catch(Exception e1) {
						e1.printStackTrace();
					}



				}else {
					counter--;
					slots.remove("A2");
				}
			}
		});
		slotCheckBox_2.setForeground(new Color(255, 255, 255));
		slotCheckBox_2.setFont(new Font("Stencil", Font.PLAIN, 14));
		slotCheckBox_2.setBackground(new Color(50, 205, 50));
		slotCheckBox_2.setBounds(30, 120, 97, 23);
		slotCheckBox_2.setBorderPainted(true);
		panel.add(slotCheckBox_2);

		JCheckBox slotCheckBox_2_1 = new JCheckBox("     B 2");
		slotCheckBox_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(slotCheckBox_2_1.isSelected()) {
					try {
						flag=0;
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

							if("B2".equals(reader.get("slot1")) ||  "B2".equals(reader.get("slot2")) || "B2".equals(reader.get("slot3")) ) {
								JOptionPane.showMessageDialog(null, "Slot B2 is taken","Error",JOptionPane.ERROR_MESSAGE);
								slotCheckBox_2_1.setSelected(false);
								flag=1;		
								

								break;
							}

						}

						if(flag!=1) {
							counter++;
							slots.add("B2");
						}

					}
					catch(Exception e1) {
						e1.printStackTrace();
					}



				}else {
					counter--;
					slots.remove("B2");
				}

			}
		});
		slotCheckBox_2_1.setForeground(new Color(255, 255, 255));
		slotCheckBox_2_1.setFont(new Font("Stencil", Font.PLAIN, 14));
		slotCheckBox_2_1.setBorderPainted(true);
		slotCheckBox_2_1.setBackground(new Color(50, 205, 50));
		slotCheckBox_2_1.setBounds(240, 120, 97, 23);
		panel.add(slotCheckBox_2_1);

		JCheckBox slotCheckBox_2_2 = new JCheckBox("     A 3");
		slotCheckBox_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(slotCheckBox_2_2.isSelected()) {
					try {
						flag=0;
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

							if("A3".equals(reader.get("slot1")) ||  "A3".equals(reader.get("slot2")) || "A3".equals(reader.get("slot3")) ) {
								JOptionPane.showMessageDialog(null, "Slot A3 is taken","Error",JOptionPane.ERROR_MESSAGE);
								slotCheckBox_2_2.setSelected(false);
								flag=1;		
								

								break;
							}

						}

						if(flag!=1) {
							counter++;
							slots.add("A3");
						}

					}
					catch(Exception e1) {
						e1.printStackTrace();
					}



				}else {
					counter--;
					slots.remove("A3");
				}
			}
		});
		slotCheckBox_2_2.setForeground(new Color(255, 255, 255));
		slotCheckBox_2_2.setFont(new Font("Stencil", Font.PLAIN, 14));
		slotCheckBox_2_2.setBorderPainted(true);
		slotCheckBox_2_2.setBackground(new Color(50, 205, 50));
		slotCheckBox_2_2.setBounds(30, 165, 97, 23);
		panel.add(slotCheckBox_2_2);

		JCheckBox slotCheckBox_2_3 = new JCheckBox("     B 3");
		slotCheckBox_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(slotCheckBox_2_3.isSelected()) {
					try {
						flag=0;
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

							if("B3".equals(reader.get("slot1")) ||  "B3".equals(reader.get("slot2")) || "B3".equals(reader.get("slot3")) ) {
								JOptionPane.showMessageDialog(null, "Slot B3 is taken","Error",JOptionPane.ERROR_MESSAGE);
								slotCheckBox_2_3.setSelected(false);
								flag=1;		
								

								break;
							}

						}

						if(flag!=1) {
							counter++;
							slots.add("B3");
						}

					}
					catch(Exception e1) {
						e1.printStackTrace();
					}



				}else {
					counter--;
					slots.remove("B3");
				}

			}
		});
		slotCheckBox_2_3.setForeground(new Color(255, 255, 255));
		slotCheckBox_2_3.setFont(new Font("Stencil", Font.PLAIN, 14));
		slotCheckBox_2_3.setBorderPainted(true);
		slotCheckBox_2_3.setBackground(new Color(50, 205, 50));
		slotCheckBox_2_3.setBounds(240, 165, 97, 23);
		panel.add(slotCheckBox_2_3);

		JCheckBox slotCheckBox_2_4 = new JCheckBox("     A 4");
		slotCheckBox_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(slotCheckBox_2_4.isSelected()) {
					try {
						flag=0;
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

							if("A4".equals(reader.get("slot1")) ||  "A4".equals(reader.get("slot2")) || "A4".equals(reader.get("slot3")) ) {
								JOptionPane.showMessageDialog(null, "Slot A4 is taken","Error",JOptionPane.ERROR_MESSAGE);
								slotCheckBox_2_4.setSelected(false);
								flag=1;		
								

								break;
							}

						}

						if(flag!=1) {
							counter++;
							slots.add("A4");
						}

					}
					catch(Exception e1) {
						e1.printStackTrace();
					}



				}else {
					counter--;
					slots.remove("A4");
				}

			}
		});
		slotCheckBox_2_4.setForeground(new Color(255, 255, 255));
		slotCheckBox_2_4.setFont(new Font("Stencil", Font.PLAIN, 14));
		slotCheckBox_2_4.setBorderPainted(true);
		slotCheckBox_2_4.setBackground(new Color(50, 205, 50));
		slotCheckBox_2_4.setBounds(30, 206, 97, 23);
		panel.add(slotCheckBox_2_4);

		JCheckBox slotCheckBox_2_5 = new JCheckBox("     B 4");
		slotCheckBox_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(slotCheckBox_2_5.isSelected()) {
					try {
						flag=0;
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

							if("B4".equals(reader.get("slot1")) ||  "B4".equals(reader.get("slot2")) || "B4".equals(reader.get("slot3")) ) {
								JOptionPane.showMessageDialog(null, "Slot B4 is taken","Error",JOptionPane.ERROR_MESSAGE);
								slotCheckBox_2_5.setSelected(false);
								flag=1;		
								

								break;
							}

						}

						if(flag!=1) {
							counter++;
							slots.add("B4");
						}

					}
					catch(Exception e1) {
						e1.printStackTrace();
					}



				}else {
					counter--;
					slots.remove("B4");
				}

			}
		});
		slotCheckBox_2_5.setForeground(new Color(255, 255, 255));
		slotCheckBox_2_5.setFont(new Font("Stencil", Font.PLAIN, 14));
		slotCheckBox_2_5.setBorderPainted(true);
		slotCheckBox_2_5.setBackground(new Color(50, 205, 50));
		slotCheckBox_2_5.setBounds(240, 206, 97, 23);
		panel.add(slotCheckBox_2_5);

		JCheckBox slotCheckBox_2_6 = new JCheckBox("     A 5");
		slotCheckBox_2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(slotCheckBox_2_6.isSelected()) {
					try {
						flag=0;
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

							if("A5".equals(reader.get("slot1")) ||  "A5".equals(reader.get("slot2")) || "A5".equals(reader.get("slot3")) ) {
								JOptionPane.showMessageDialog(null, "Slot A5 is taken","Error",JOptionPane.ERROR_MESSAGE);
								slotCheckBox_2_6.setSelected(false);
								flag=1;		
								

								break;
							}

						}

						if(flag!=1) {
							counter++;
							slots.add("A5");
						}

					}
					catch(Exception e1) {
						e1.printStackTrace();
					}



				}else {
					counter--;
					slots.remove("A5");
				}

			}
		});
		slotCheckBox_2_6.setForeground(new Color(255, 255, 255));
		slotCheckBox_2_6.setFont(new Font("Stencil", Font.PLAIN, 14));
		slotCheckBox_2_6.setBorderPainted(true);
		slotCheckBox_2_6.setBackground(new Color(50, 205, 50));
		slotCheckBox_2_6.setBounds(30, 248, 97, 23);
		panel.add(slotCheckBox_2_6);

		JCheckBox slotCheckBox_2_7 = new JCheckBox("     B 5");
		slotCheckBox_2_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(slotCheckBox_2_7.isSelected()) {
					try {
						flag=0;
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

							if("B5".equals(reader.get("slot1")) ||  "B5".equals(reader.get("slot2")) || "B5".equals(reader.get("slot3")) ) {
								JOptionPane.showMessageDialog(null, "Slot B5 is taken","Error",JOptionPane.ERROR_MESSAGE);
								slotCheckBox_2_7.setSelected(false);
								flag=1;		
								

								break;
							}

						}

						if(flag!=1) {
							counter++;
							slots.add("B5");
						}

					}
					catch(Exception e1) {
						e1.printStackTrace();
					}



				}else {
					counter--;
					slots.remove("B5");
				}
			}
		});
		slotCheckBox_2_7.setForeground(new Color(255, 255, 255));
		slotCheckBox_2_7.setFont(new Font("Stencil", Font.PLAIN, 14));
		slotCheckBox_2_7.setBorderPainted(true);
		slotCheckBox_2_7.setBackground(new Color(50, 205, 50));
		slotCheckBox_2_7.setBounds(240, 248, 97, 23);
		panel.add(slotCheckBox_2_7);

		JCheckBox slotCheckBox_2_8 = new JCheckBox("     A 6");
		slotCheckBox_2_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(slotCheckBox_2_8.isSelected()) {
					try {
						flag=0;
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

							if("A6".equals(reader.get("slot1")) ||  "A6".equals(reader.get("slot2")) || "A6".equals(reader.get("slot3")) ) {
								JOptionPane.showMessageDialog(null, "Slot A6 is taken","Error",JOptionPane.ERROR_MESSAGE);
								slotCheckBox_2_8.setSelected(false);
								flag=1;		
								

								break;
							}

						}

						if(flag!=1) {
							counter++;
							slots.add("A6");
						}

					}
					catch(Exception e1) {
						e1.printStackTrace();
					}



				}else {
					counter--;
					slots.remove("A6");
				}

			}
		});
		slotCheckBox_2_8.setForeground(new Color(255, 255, 255));
		slotCheckBox_2_8.setFont(new Font("Stencil", Font.PLAIN, 14));
		slotCheckBox_2_8.setBorderPainted(true);
		slotCheckBox_2_8.setBackground(new Color(50, 205, 50));
		slotCheckBox_2_8.setBounds(30, 288, 97, 23);
		panel.add(slotCheckBox_2_8);

		JCheckBox slotCheckBox_2_9 = new JCheckBox("     B 6");
		slotCheckBox_2_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(slotCheckBox_2_9.isSelected()) {
					try {
						flag=0;
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

							if("B6".equals(reader.get("slot1")) ||  "B6".equals(reader.get("slot2")) || "B6".equals(reader.get("slot3")) ) {
								JOptionPane.showMessageDialog(null, "Slot B6 is taken","Error",JOptionPane.ERROR_MESSAGE);
								slotCheckBox_2_9.setSelected(false);
								flag=1;		
								

								break;
							}

						}

						if(flag!=1) {
							counter++;
							slots.add("B6");
						}

					}
					catch(Exception e1) {
						e1.printStackTrace();
					}



				}else {
					counter--;
					slots.remove("B6");
				}

			}
		});
		slotCheckBox_2_9.setForeground(new Color(255, 255, 255));
		slotCheckBox_2_9.setFont(new Font("Stencil", Font.PLAIN, 14));
		slotCheckBox_2_9.setBorderPainted(true);
		slotCheckBox_2_9.setBackground(new Color(50, 205, 50));
		slotCheckBox_2_9.setBounds(240, 288, 97, 23);
		panel.add(slotCheckBox_2_9);

		JButton SelectButton = new JButton("Select");
		SelectButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(counter >3) {
					JOptionPane.showMessageDialog(SelectButton,"Selected more than 3 slots","Error",JOptionPane.ERROR_MESSAGE);
				}
				else {
							for (Users aa:users) {
								if(use.getEmail().equals(aa.getEmail())) {
									if(slots.size()==1) {
										aa.setSlot1(slots.get(0));
									}
									else if (slots.size()==2){
										aa.setSlot1(slots.get(0));
										aa.setSlot2(slots.get(1));
									}
									
									else if(slots.size()==3) {
										aa.setSlot1(slots.get(0));
										aa.setSlot2(slots.get(1));
										aa.setSlot3(slots.get(2));
									}
								try {
									UserManagement pp = new UserManagement( users);
								
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
									}
									break;
								
								}
							}
							
				}
			}
		});
		SelectButton.setFont(new Font("Snap ITC", Font.PLAIN, 18));
		SelectButton.setBackground(new Color(255, 215, 0));
		SelectButton.setBounds(101, 427, 159, 33);
		panel.add(SelectButton);

		JCheckBox slotCheckBox_2_9_1 = new JCheckBox("     A 7");
		slotCheckBox_2_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(slotCheckBox_2_9_1.isSelected()) {
					try {
						flag=0;
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

							if("A7".equals(reader.get("slot1")) ||  "A7".equals(reader.get("slot2")) || "A7".equals(reader.get("slot3")) ) {
								JOptionPane.showMessageDialog(null, "Slot A7 is taken","Error",JOptionPane.ERROR_MESSAGE);
								slotCheckBox_2_9_1.setSelected(false);
								flag=1;		
								

								break;
							}

						}

						if(flag!=1) {
							counter++;
							slots.add("A7");
						}

					}
					catch(Exception e1) {
						e1.printStackTrace();
					}



				}else {
					counter--;
					slots.remove("A7");
				}

			}
		});
		slotCheckBox_2_9_1.setForeground(new Color(255, 255, 255));
		slotCheckBox_2_9_1.setFont(new Font("Stencil", Font.PLAIN, 14));
		slotCheckBox_2_9_1.setBorderPainted(true);
		slotCheckBox_2_9_1.setBackground(new Color(50, 205, 50));
		slotCheckBox_2_9_1.setBounds(30, 333, 97, 23);
		panel.add(slotCheckBox_2_9_1);

		JCheckBox slotCheckBox_2_9_2 = new JCheckBox("     B 7");
		slotCheckBox_2_9_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(slotCheckBox_2_9_2.isSelected()) {
					try {
						flag=0;
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

							if("B7".equals(reader.get("slot1")) ||  "B7".equals(reader.get("slot2")) || "B7".equals(reader.get("slot3")) ) {
								JOptionPane.showMessageDialog(null, "Slot B7 is taken","Error",JOptionPane.ERROR_MESSAGE);
								slotCheckBox_2_9_2.setSelected(false);
								flag=1;		
								

								break;
							}

						}

						if(flag!=1) {
							counter++;
							slots.add("B7");
						}

					}
					catch(Exception e1) {
						e1.printStackTrace();
					}



				}else {
					counter--;
					slots.remove("B7");
				}

			}
		});
		slotCheckBox_2_9_2.setForeground(new Color(255, 255, 255));
		slotCheckBox_2_9_2.setFont(new Font("Stencil", Font.PLAIN, 14));
		slotCheckBox_2_9_2.setBorderPainted(true);
		slotCheckBox_2_9_2.setBackground(new Color(50, 205, 50));
		slotCheckBox_2_9_2.setBounds(240, 333, 97, 23);
		panel.add(slotCheckBox_2_9_2);

		JCheckBox slotCheckBox_2_9_3 = new JCheckBox("     A 8");
		slotCheckBox_2_9_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(slotCheckBox_2_9_3.isSelected()) {
					try {
						flag=0;
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

							if("A8".equals(reader.get("slot1")) ||  "A8".equals(reader.get("slot2")) || "A8".equals(reader.get("slot3")) ) {
								JOptionPane.showMessageDialog(null, "Slot A8 is taken","Error",JOptionPane.ERROR_MESSAGE);
								slotCheckBox_2_9_3.setSelected(false);
								flag=1;		
								

								break;
							}

						}

						if(flag!=1) {
							counter++;
							slots.add("A8");
						}

					}
					catch(Exception e1) {
						e1.printStackTrace();
					}



				}else {
					counter--;
					slots.remove("A8");
				}

			}
		});
		slotCheckBox_2_9_3.setForeground(new Color(255, 255, 255));
		slotCheckBox_2_9_3.setFont(new Font("Stencil", Font.PLAIN, 14));
		slotCheckBox_2_9_3.setBorderPainted(true);
		slotCheckBox_2_9_3.setBackground(new Color(50, 205, 50));
		slotCheckBox_2_9_3.setBounds(30, 378, 97, 23);
		panel.add(slotCheckBox_2_9_3);

		JCheckBox slotCheckBox_2_9_4 = new JCheckBox("     B 8");
		slotCheckBox_2_9_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(slotCheckBox_2_9_4.isSelected()) {
					try {
						flag=0;
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

							if("B8".equals(reader.get("slot1")) ||  "B8".equals(reader.get("slot2")) || "B8".equals(reader.get("slot3")) ) {
								JOptionPane.showMessageDialog(null, "Slot B8 is taken","Error",JOptionPane.ERROR_MESSAGE);
								slotCheckBox_2_9_4.setSelected(false);
								flag=1;		
								

								break;
							}

						}

						if(flag!=1) {
							counter++;
							slots.add("B8");
						}

					}
					catch(Exception e1) {
						e1.printStackTrace();
					}



				}else {
					counter--;
					slots.remove("B8");
				}

			}

		});
		slotCheckBox_2_9_4.setForeground(new Color(255, 255, 255));
		slotCheckBox_2_9_4.setFont(new Font("Stencil", Font.PLAIN, 14));
		slotCheckBox_2_9_4.setBorderPainted(true);
		slotCheckBox_2_9_4.setBackground(new Color(50, 205, 50));
		slotCheckBox_2_9_4.setBounds(240, 378, 97, 23);
		panel.add(slotCheckBox_2_9_4);

		JLabel lblNewLabel = new JLabel("Select Slots - Choose Up To 3");
		lblNewLabel.setFont(new Font("Snap ITC", Font.PLAIN, 18));
		lblNewLabel.setBounds(30, 11, 350, 53);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("To ");
		lblNewLabel_1.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(99, 509, 26, 33);
		panel.add(lblNewLabel_1);

		

		JLabel lblNewLabel_2 = new JLabel("Select timing [24 Hour format]:");
		lblNewLabel_2.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(17, 477, 255, 23);
		panel.add(lblNewLabel_2);

		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 24, 1));
		spinner.setBounds(19, 513, 72, 23);
		panel.add(spinner);

		JSpinner spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 24, 1));
		spinner_1.setBounds(122, 513, 72, 23);
		panel.add(spinner_1);
		
		JButton btnNewButton = new JButton("Confirm\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Users pp=new Users();
				int time1=(Integer)spinner.getValue();
				int time2=(Integer)spinner_1.getValue();

				for (Users aa:users) {

					if(use.getEmail().equals(aa.getEmail())) {
						aa.setStime(time1);
						aa.setEtime(time2);
						pp=aa;



						try {
							UserManagement qq = new UserManagement( users);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						break;
					}


				}
				
				GUIPayment as = new GUIPayment(pp, users);
				frame.dispose();
				
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(128, 0, 128));
		btnNewButton.setFont(new Font("Snap ITC", Font.PLAIN, 11));
		btnNewButton.setBounds(226, 504, 116, 40);
		panel.add(btnNewButton);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "View Booking", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBackground(new Color(50, 205, 50));
		panel_1.setBounds(0, 626, 361, 149);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JButton btnViewBookings = new JButton("View Booking");
		btnViewBookings.setBorderPainted(true);
		btnViewBookings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIbookinginfo cc=new GUIbookinginfo(use, users);
				frame.dispose();
				
			}
		});
		btnViewBookings.setFont(new Font("Snap ITC", Font.PLAIN, 14));
		btnViewBookings.setBackground(new Color(0, 191, 255));
		btnViewBookings.setBounds(102, 66, 147, 37);
		panel_1.add(btnViewBookings);

		JLabel lblNewLabel_2_1 = new JLabel("Have a existing booking?");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Snap ITC", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(55, 36, 296, 24);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("OR");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Snap ITC", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(153, 567, 51, 62);
		frame.getContentPane().add(lblNewLabel_3);







	}
}
