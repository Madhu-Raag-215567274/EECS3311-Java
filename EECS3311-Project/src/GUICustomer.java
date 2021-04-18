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
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Raag\\Downloads\\unnamed.png"));
		frame.setVisible(true);
		frame.setAlwaysOnTop(true);
		frame.setBackground(new Color(192, 192, 192));
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 11));
		frame.getContentPane().setBackground(new Color(65, 105, 225));
		frame.setBounds(100, 100, 450, 300);
		frame.setResizable(false);//Disable the Resize Button
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton regbutton = new JButton("Register");
		regbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==regbutton) {
					frame.dispose();
					GUIuser user=new GUIuser();
					}
				
			}
		});
		regbutton.setBackground(new Color(127, 255, 212));
		regbutton.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		regbutton.setForeground(new Color(0, 0, 0));
		regbutton.setBounds(39, 107, 162, 61);
		frame.getContentPane().add(regbutton);
		
		JLabel lblNewLabel = new JLabel("BOOK PARKING HERE");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 24));
		lblNewLabel.setBounds(24, 35, 369, 46);
		frame.getContentPane().add(lblNewLabel);
		
		JButton SignInbutton = new JButton("Sign in");
		SignInbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==SignInbutton) {
					frame.dispose();
					GuiSignIn signin=new GuiSignIn();
					}
				
			}
		});
		SignInbutton.setForeground(Color.BLACK);
		SignInbutton.setFont(new Font("Snap ITC", Font.PLAIN, 16));
		SignInbutton.setBackground(new Color(144, 238, 144));
		SignInbutton.setBounds(231, 107, 162, 61);
		frame.getContentPane().add(SignInbutton);
	}
}
