import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JLabel;

public class GUICustomer {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public GUICustomer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setAlwaysOnTop(true);
		frame.setBackground(new Color(192, 192, 192));
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 11));
		frame.getContentPane().setBackground(new Color(255, 215, 0));
		frame.setBounds(100, 100, 450, 300);
		frame.setResizable(false);//Disable the Resize Button
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton regbutton = new JButton("Register");
		regbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==regbutton) {
					frame.dispose();
					GuiUser user=new GuiUser();
					}
				
			}
		});
		regbutton.setBackground(new Color(50, 205, 50));
		regbutton.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		regbutton.setForeground(new Color(0, 0, 0));
		regbutton.setBounds(122, 84, 184, 69);
		frame.getContentPane().add(regbutton);
		
		JLabel lblNewLabel = new JLabel("Book parking here: ");
		lblNewLabel.setFont(new Font("Snap ITC", Font.PLAIN, 14));
		lblNewLabel.setBounds(24, 31, 164, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JButton SignInbutton = new JButton("Sign in");
		SignInbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		SignInbutton.setForeground(Color.BLACK);
		SignInbutton.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		SignInbutton.setBackground(new Color(50, 205, 50));
		SignInbutton.setBounds(122, 176, 184, 69);
		frame.getContentPane().add(SignInbutton);
	}
}
