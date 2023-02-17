import javax.swing.*;

import com.toedter.calendar.JDateChooser;
import java.util.*;

public class Signup_One extends JFrame implements ActionListner{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	JRadioButton r1,r2,r3,r4,r5;
	JButton b;
	JDateChooser dateChooser;

	Random ran = new Random();
	long first4 = (ran.nextLong() % 9000L)+ 1000L;
	String first = "" +Math.abs(first4);

	Signup_One()
	{

	}

	public static void main(String[] args) {


	}

}
