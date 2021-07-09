package AwtOperations;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Welcomeframe extends JFrame {
	public static void main(String[] args) {
		Welcomeframe frameTabel = new Welcomeframe();
		}

		JLabel welcome = new JLabel("Welcome to My Frame");
		JPanel panel = new JPanel();

		Welcomeframe(){
		super("Welcome");
		setSize(300,200);
		setLocation(500,280);
		panel.setLayout (null);

		welcome.setBounds(70,50,150,60);

		panel.add(welcome);

		getContentPane().add(panel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		}

		}


