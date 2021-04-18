import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
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
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
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
	 
	
	
	 GUIBookParking() {
		 frame = new JFrame();		
		 frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Raag\\Downloads\\unnamed.png"));
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.getContentPane().setBackground(new Color(192, 192, 192));
		 frame.setVisible(true);
		 frame.setResizable(false);

	 
	    
	        frame.setSize(367, 756);
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
	        	
	        	}
	        });
	        slotCheckBox.setFont(new Font("Stencil", Font.PLAIN, 14));
	        slotCheckBox.setBackground(new Color(50, 205, 50));
	        slotCheckBox.setBounds(30, 75, 97, 23);
	        slotCheckBox.setBorderPainted(true);
	        panel.add(slotCheckBox);
	        
	        JCheckBox slotCheckBox_1 = new JCheckBox("     B 1");
	        slotCheckBox_1.setForeground(new Color(255, 255, 255));
	        slotCheckBox_1.setFont(new Font("Stencil", Font.PLAIN, 14));
	        slotCheckBox_1.setBackground(new Color(50, 205, 50));
	        slotCheckBox_1.setBounds(240, 75, 97, 23);
	        slotCheckBox_1.setBorderPainted(true);

	        panel.add(slotCheckBox_1);
	        
	        JCheckBox slotCheckBox_2 = new JCheckBox("     A 2");
	        slotCheckBox_2.setForeground(new Color(255, 255, 255));
	        slotCheckBox_2.setFont(new Font("Stencil", Font.PLAIN, 14));
	        slotCheckBox_2.setBackground(new Color(50, 205, 50));
	        slotCheckBox_2.setBounds(30, 120, 97, 23);
	        slotCheckBox_2.setBorderPainted(true);
	        panel.add(slotCheckBox_2);
	        
	        JCheckBox slotCheckBox_2_1 = new JCheckBox("     B 2");
	        slotCheckBox_2_1.setForeground(new Color(255, 255, 255));
	        slotCheckBox_2_1.setFont(new Font("Stencil", Font.PLAIN, 14));
	        slotCheckBox_2_1.setBorderPainted(true);
	        slotCheckBox_2_1.setBackground(new Color(50, 205, 50));
	        slotCheckBox_2_1.setBounds(240, 120, 97, 23);
	        panel.add(slotCheckBox_2_1);
	        
	        JCheckBox slotCheckBox_2_2 = new JCheckBox("     A 3");
	        slotCheckBox_2_2.setForeground(new Color(255, 255, 255));
	        slotCheckBox_2_2.setFont(new Font("Stencil", Font.PLAIN, 14));
	        slotCheckBox_2_2.setBorderPainted(true);
	        slotCheckBox_2_2.setBackground(new Color(50, 205, 50));
	        slotCheckBox_2_2.setBounds(30, 165, 97, 23);
	        panel.add(slotCheckBox_2_2);
	        
	        JCheckBox slotCheckBox_2_3 = new JCheckBox("     B 3");
	        slotCheckBox_2_3.setForeground(new Color(255, 255, 255));
	        slotCheckBox_2_3.setFont(new Font("Stencil", Font.PLAIN, 14));
	        slotCheckBox_2_3.setBorderPainted(true);
	        slotCheckBox_2_3.setBackground(new Color(50, 205, 50));
	        slotCheckBox_2_3.setBounds(240, 165, 97, 23);
	        panel.add(slotCheckBox_2_3);
	        
	        JCheckBox slotCheckBox_2_4 = new JCheckBox("     A 4");
	        slotCheckBox_2_4.setForeground(new Color(255, 255, 255));
	        slotCheckBox_2_4.setFont(new Font("Stencil", Font.PLAIN, 14));
	        slotCheckBox_2_4.setBorderPainted(true);
	        slotCheckBox_2_4.setBackground(new Color(50, 205, 50));
	        slotCheckBox_2_4.setBounds(30, 206, 97, 23);
	        panel.add(slotCheckBox_2_4);
	        
	        JCheckBox slotCheckBox_2_5 = new JCheckBox("     B 4");
	        slotCheckBox_2_5.setForeground(new Color(255, 255, 255));
	        slotCheckBox_2_5.setFont(new Font("Stencil", Font.PLAIN, 14));
	        slotCheckBox_2_5.setBorderPainted(true);
	        slotCheckBox_2_5.setBackground(new Color(50, 205, 50));
	        slotCheckBox_2_5.setBounds(240, 206, 97, 23);
	        panel.add(slotCheckBox_2_5);
	        
	        JCheckBox slotCheckBox_2_6 = new JCheckBox("     A 5");
	        slotCheckBox_2_6.setForeground(new Color(255, 255, 255));
	        slotCheckBox_2_6.setFont(new Font("Stencil", Font.PLAIN, 14));
	        slotCheckBox_2_6.setBorderPainted(true);
	        slotCheckBox_2_6.setBackground(new Color(50, 205, 50));
	        slotCheckBox_2_6.setBounds(30, 248, 97, 23);
	        panel.add(slotCheckBox_2_6);
	        
	        JCheckBox slotCheckBox_2_7 = new JCheckBox("     B 5");
	        slotCheckBox_2_7.setForeground(new Color(255, 255, 255));
	        slotCheckBox_2_7.setFont(new Font("Stencil", Font.PLAIN, 14));
	        slotCheckBox_2_7.setBorderPainted(true);
	        slotCheckBox_2_7.setBackground(new Color(50, 205, 50));
	        slotCheckBox_2_7.setBounds(240, 248, 97, 23);
	        panel.add(slotCheckBox_2_7);
	        
	        JCheckBox slotCheckBox_2_8 = new JCheckBox("     A 6");
	        slotCheckBox_2_8.setForeground(new Color(255, 255, 255));
	        slotCheckBox_2_8.setFont(new Font("Stencil", Font.PLAIN, 14));
	        slotCheckBox_2_8.setBorderPainted(true);
	        slotCheckBox_2_8.setBackground(new Color(50, 205, 50));
	        slotCheckBox_2_8.setBounds(30, 288, 97, 23);
	        panel.add(slotCheckBox_2_8);
	        
	        JCheckBox slotCheckBox_2_9 = new JCheckBox("     B 6");
	        slotCheckBox_2_9.setForeground(new Color(255, 255, 255));
	        slotCheckBox_2_9.setFont(new Font("Stencil", Font.PLAIN, 14));
	        slotCheckBox_2_9.setBorderPainted(true);
	        slotCheckBox_2_9.setBackground(new Color(50, 205, 50));
	        slotCheckBox_2_9.setBounds(240, 288, 97, 23);
	        panel.add(slotCheckBox_2_9);
	        
	        JButton BookNowButton = new JButton("Select");
	        BookNowButton.setFont(new Font("Snap ITC", Font.PLAIN, 18));
	        BookNowButton.setBackground(new Color(255, 215, 0));
	        BookNowButton.setBounds(101, 427, 159, 33);
	        panel.add(BookNowButton);
	        
	        JCheckBox slotCheckBox_2_9_1 = new JCheckBox("     A 7");
	        slotCheckBox_2_9_1.setForeground(new Color(255, 255, 255));
	        slotCheckBox_2_9_1.setFont(new Font("Stencil", Font.PLAIN, 14));
	        slotCheckBox_2_9_1.setBorderPainted(true);
	        slotCheckBox_2_9_1.setBackground(new Color(50, 205, 50));
	        slotCheckBox_2_9_1.setBounds(30, 333, 97, 23);
	        panel.add(slotCheckBox_2_9_1);
	        
	        JCheckBox slotCheckBox_2_9_2 = new JCheckBox("     B 7");
	        slotCheckBox_2_9_2.setForeground(new Color(255, 255, 255));
	        slotCheckBox_2_9_2.setFont(new Font("Stencil", Font.PLAIN, 14));
	        slotCheckBox_2_9_2.setBorderPainted(true);
	        slotCheckBox_2_9_2.setBackground(new Color(50, 205, 50));
	        slotCheckBox_2_9_2.setBounds(240, 333, 97, 23);
	        panel.add(slotCheckBox_2_9_2);
	        
	        JCheckBox slotCheckBox_2_9_3 = new JCheckBox("     A 8");
	        slotCheckBox_2_9_3.setForeground(new Color(255, 255, 255));
	        slotCheckBox_2_9_3.setFont(new Font("Stencil", Font.PLAIN, 14));
	        slotCheckBox_2_9_3.setBorderPainted(true);
	        slotCheckBox_2_9_3.setBackground(new Color(50, 205, 50));
	        slotCheckBox_2_9_3.setBounds(30, 378, 97, 23);
	        panel.add(slotCheckBox_2_9_3);
	        
	        JCheckBox slotCheckBox_2_9_4 = new JCheckBox("     B 8");
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
	        
	        JButton btnNewButton = new JButton("Confirm\r\n");
	        btnNewButton.setForeground(new Color(255, 255, 255));
	        btnNewButton.setBackground(new Color(128, 0, 128));
	        btnNewButton.setFont(new Font("Snap ITC", Font.PLAIN, 11));
	        btnNewButton.setBounds(226, 504, 116, 40);
	        panel.add(btnNewButton);
	        
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
	        
	        JPanel panel_1 = new JPanel();
	        panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "View Booking", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	        panel_1.setBackground(new Color(50, 205, 50));
	        panel_1.setBounds(0, 578, 361, 149);
	        frame.getContentPane().add(panel_1);
	        panel_1.setLayout(null);
	        
	        JButton btnViewBookings = new JButton("View Booking");
	        btnViewBookings.setBorderPainted(true);
	        btnViewBookings.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
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
	        
	        
	 
	        
			
			
		
	}
}
