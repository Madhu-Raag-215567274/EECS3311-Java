import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Button;
import javax.swing.JProgressBar;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.List;
import javax.swing.JTree;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIPayment {
	
	
	public ArrayList<Users> users = new ArrayList<Users>();
	public Users user=new Users();
	private JFrame frame;
	private JTextField l1text;
	private JTextField l2text;
	private JTextField l3text;
	private JTextField cardhorlder;
	private JTextField cardnumber;
	private JTextField exp;
	private JTextField cvv;

	
	
	GUIPayment(Users user, ArrayList<Users> users){
		this.user=user;
		this.users=users;
		
		frame = new JFrame();		
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("unnamed.png"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(128, 128, 0));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("License plate number(s):");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Snap ITC", Font.PLAIN, 17));
		lblNewLabel.setBounds(10, 25, 261, 40);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("License Plate 1: ");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 96, 146, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setBounds(11, 57, 234, 2);
		frame.getContentPane().add(separator);
		
		l1text = new JTextField();
		l1text.setBounds(153, 96, 208, 26);
		frame.getContentPane().add(l1text);
		l1text.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("License Plate 2: ");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(10, 155, 146, 26);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		l2text = new JTextField();
		l2text.setColumns(10);
		l2text.setBounds(153, 153, 208, 26);
		frame.getContentPane().add(l2text);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("License Plate 3: ");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Stencil", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(10, 217, 146, 26);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		l3text = new JTextField();
		l3text.setColumns(10);
		l3text.setBounds(153, 214, 208, 26);
		frame.getContentPane().add(l3text);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 0));
		panel.setForeground(new Color(128, 128, 0));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Payment", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel.setBounds(10, 254, 404, 286);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JCheckBox chckbxDebit = new JCheckBox("Debit");
		chckbxDebit.setBounds(20, 26, 65, 23);
		chckbxDebit.setForeground(Color.WHITE);
		chckbxDebit.setFont(new Font("Stencil", Font.PLAIN, 14));
		chckbxDebit.setBackground(new Color(128, 128, 0));
		panel.add(chckbxDebit);
		
		JCheckBox chckbxCredit = new JCheckBox("Credit");
		chckbxCredit.setForeground(Color.WHITE);
		chckbxCredit.setFont(new Font("Stencil", Font.PLAIN, 14));
		chckbxCredit.setBackground(new Color(128, 128, 0));
		chckbxCredit.setBounds(110, 26, 85, 23);
		panel.add(chckbxCredit);
		
		JCheckBox chckbxPaypal = new JCheckBox("Paypal");
		chckbxPaypal.setForeground(Color.WHITE);
		chckbxPaypal.setFont(new Font("Stencil", Font.PLAIN, 14));
		chckbxPaypal.setBackground(new Color(128, 128, 0));
		chckbxPaypal.setBounds(197, 26, 104, 23);
		panel.add(chckbxPaypal);
		
		JLabel lblNewLabel_2 = new JLabel("Card holder name: ");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(20, 58, 175, 33);
		panel.add(lblNewLabel_2);
		
		cardhorlder = new JTextField();
		cardhorlder.setBounds(169, 59, 207, 26);
		panel.add(cardhorlder);
		cardhorlder.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Card number: ");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(20, 102, 118, 33);
		panel.add(lblNewLabel_2_1);
		
		cardnumber = new JTextField();
		cardnumber.setColumns(10);
		cardnumber.setBounds(128, 105, 248, 26);
		panel.add(cardnumber);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Expiry: ");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(20, 149, 118, 33);
		panel.add(lblNewLabel_2_1_1);
		
		exp = new JTextField();
		exp.setColumns(10);
		exp.setBounds(84, 150, 69, 26);
		panel.add(exp);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("CVV: ");
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Stencil", Font.PLAIN, 14));
		lblNewLabel_2_1_1_1.setBounds(188, 149, 45, 33);
		panel.add(lblNewLabel_2_1_1_1);
		
		cvv = new JTextField();
		cvv.setColumns(10);
		cvv.setBounds(230, 150, 69, 26);
		panel.add(cvv);
		
		JButton paynow = new JButton("Pay Now");
		paynow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Users pp=new Users();
				int dialogButton = JOptionPane.YES_NO_OPTION;
				int dialogResult = JOptionPane.showConfirmDialog (null, "Would You Like to grant " +user.getName()+" with email "+ user.getEmail()+ " parking slots?","Authority officer",dialogButton);
				if(dialogResult == JOptionPane.YES_OPTION){
					if(l1text.getText().isEmpty()||l1text.getText().isEmpty() && l2text.getText().isEmpty() && l3text.getText().isEmpty() || (!chckbxCredit.isSelected()
							&& !chckbxDebit.isSelected() && !chckbxPaypal.isSelected()) || (chckbxCredit.isSelected()
									&& chckbxDebit.isSelected() && chckbxPaypal.isSelected())||chckbxDebit.isSelected() && chckbxPaypal.isSelected()||chckbxCredit.isSelected() && chckbxPaypal.isSelected()
							|| chckbxDebit.isSelected() && chckbxCredit.isSelected()|| cardhorlder.getText().isEmpty() || cardnumber.getText().isEmpty()|| exp.getText().isEmpty()|| cvv.getText().isEmpty()) {
						
						JOptionPane.showMessageDialog(paynow,"Field is empty or more than one payment method is selected","Error",JOptionPane.ERROR_MESSAGE);		
						
						
					}
					else {
						for(Users aa: users) {
							if(user.getEmail().equals(aa.getEmail())) {
								aa.setL1(l1text.getText());
								
								if(!l2text.getText().isEmpty()) {
									aa.setL2(l2text.getText());
								}
								if(!l3text.getText().isEmpty()) {
									aa.setL3(l3text.getText());
								}
								
								Random r = new Random( System.currentTimeMillis() );
							    int rand= ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
							    aa.setParkingid("#"+rand);
							    aa.setStatus("Pending");
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
						
						GUIbookinginfo dd =new GUIbookinginfo(pp,users);
						frame.dispose();
						
					}
				
				}
				
		
			
			
				
			}
		});
		paynow.setBackground(new Color(127, 255, 0));
		paynow.setForeground(new Color(0, 0, 0));
		paynow.setFont(new Font("Snap ITC", Font.PLAIN, 15));
		paynow.setBounds(110, 193, 175, 66);
		panel.add(paynow);
		frame.setVisible(true);
		frame.setResizable(false);



		frame.setSize(442, 580);
		
	}
}
