package AwtOperations;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.TextArea;

public class JavaFrame {
	public static void main(String[] args) {
	      Frame f = new Frame("Frames");
	      Component text = new TextArea("RSC JAVA TRAINING");
	      Component button = new Button("Click");
	      f.add(text, BorderLayout.NORTH);
	      f.add(button, BorderLayout.SOUTH);
	      int width = 300;
	      int height = 300;
	      f.setSize(width, height);
	      f.setVisible(true);
	     
	   } 
}
