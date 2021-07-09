package AwtComponents;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class WindowEvents extends JFrame implements WindowListener 
{ 
	WindowEvents() 
    {   
       addWindowListener(this); 
    } 
    public void windowClosing(WindowEvent e) 
    { 
       System.out.println("Window Closing"); 
       dispose(); 
       System.exit(0); 
    } 
    public void windowOpened(WindowEvent e) 
       { System.out.println("Window Open"); } 
    public void windowClosed(WindowEvent e) 
       { System.out.println("Window Closed");} 
    public void windowActivated(WindowEvent e) 
       { System.out.println("Window Activated"); } 
    public void windowDeactivated(WindowEvent e) 
       { System.out.println("Window Deactivated"); } 
    public void windowIconified(WindowEvent e) 
       { System.out.println("window Iconified"); } 
    public void windowDeiconified(WindowEvent e) 
       { System.out.println("Window Deiconified"); } 
  } 
  class WindowListenerJavaExample 
 { 
    public static void main(String[] args) 
    { 
    	WindowEvents frame = new WindowEvents(); 
      frame.setTitle("Window Listener Java Example"); 
      frame.setBounds(100,200,200,200); 
      frame.setVisible(true); 
    } 
} 
