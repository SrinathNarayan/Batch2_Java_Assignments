package SwingComponents;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

public class JComboBoxExample {
	public static void main(String... ar)
	{
	SwingUtilities.invokeLater(new Runnable() {
	public void run()
	{
	new A();
	}
	});

	}//Closing the main method
	}//Closing the class Combo


	class A //implements ActionListener
	{
	String [] BRICS;
	JFrame jf;

	JComboBox<String> combo;

	A()
	{
	BRICS = new String[]{"Russia", "India", "South Africa", "Brazil", "China"};


	 
	jf= new JFrame("JComboBox");
	combo= new JComboBox<String>(BRICS);

	jf.add(combo);

	jf.setLayout(new FlowLayout());
	jf.setSize(300,200);
	jf.setVisible(true);
	}

}
