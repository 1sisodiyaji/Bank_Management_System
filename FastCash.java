package src;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FastCash extends JFrame implements ActionListener{
	JLabel l1,l2 ;
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	JTextField t1;
	String pin;
	
	FastCash(String pin)
	{
		this.pin =pin;
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResources("Bank managemnt system/atm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1000, 1180, 1);
		ImageIcon i3 = new ImageIcon(i2);
		Jlabel l3 = new JLabel(i3);
		l3.setBounds(0,0,960,1000);
		
	}

	public static void main(String[] args) {


	}

}
