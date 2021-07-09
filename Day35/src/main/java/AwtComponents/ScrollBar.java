package AwtComponents;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ScrollBar extends Frame 
implements WindowListener, AdjustmentListener
{
//Sample 02: Class Members
Checkbox chkGrayScale;
Panel MidPanel;
Scrollbar RedBar;
Scrollbar BlueBar;
Scrollbar GreenBar;

public ScrollBar(String FrameTitle) {
	//Display the Frame Window
    super(FrameTitle);
    setSize(500, 250);
    setLocation(100,100); 
    addWindowListener(this);
    
    //Sample 03: Create Two Panels
    Panel TopPanel = new Panel();
    MidPanel = new Panel();
    
    //Sample 04: Create Scroll Bars
    RedBar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 255);
    RedBar.setBackground(Color.RED);
    BlueBar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 255);
    BlueBar.setBackground(Color.BLUE);
    GreenBar = new Scrollbar(Scrollbar.HORIZONTAL, 0, 5, 0, 255);
    GreenBar.setBackground(Color.GREEN);
    RedBar.setBlockIncrement(5);
    BlueBar.setBlockIncrement(5);
    GreenBar.setBlockIncrement(5);
    
    //Sample 04: Add Scrollbars to Top Panel
    TopPanel.setLayout(new GridLayout(3, 1));
    TopPanel.add(RedBar);
    TopPanel.add(BlueBar);
    TopPanel.add(GreenBar);
    
    //Sample 05: Add Controls to Frame Window
    chkGrayScale = new Checkbox("Gray Scale");
    add(BorderLayout.SOUTH, chkGrayScale);
    add(BorderLayout.NORTH, TopPanel);
    add(MidPanel);
    
    //Sample 06: Register to get adjustment event
    RedBar.addAdjustmentListener(this);
    BlueBar.addAdjustmentListener(this);
    GreenBar.addAdjustmentListener(this);
}

//Sample 07: Method to Set GrayScale Color Value
//For Grayscale RGB Component will hold same value
private void setGrayScale(int GrayScaleValue) {
	GreenBar.setValue(GrayScaleValue);
	RedBar.setValue(GrayScaleValue);
	BlueBar.setValue(GrayScaleValue);
}

public void windowOpened(WindowEvent e) {}
public void windowClosed(WindowEvent e) {}
public void windowIconified(WindowEvent e) {}
public void windowDeiconified(WindowEvent e) {}
public void windowActivated(WindowEvent e) {}
public void windowDeactivated(WindowEvent e) {}
public void windowClosing(WindowEvent e) {
	this.dispose();
}

//Sample 08: Change Panel Background
public void adjustmentValueChanged(AdjustmentEvent e) {
	//8.1: Initialize RGB Components
	int red, blue, green;
	red = green = blue = 0;
	
	//8.2: When Grey Scale is not set
	if (chkGrayScale.getState() != true)
	{
		red = RedBar.getValue();
		blue = BlueBar.getValue();
		green = GreenBar.getValue();			
	}
	else
	{
		//8.3: For Gray scale Maintain All RGB @ same value
		if (e.getAdjustable() == RedBar)
		{
			red = blue = green = RedBar.getValue();
			setGrayScale(red);
		}
		if (e.getAdjustable() == BlueBar)
		{
			blue = green = red = BlueBar.getValue();
			setGrayScale(blue);
		}
		if (e.getAdjustable() == GreenBar)
		{
			green = red = blue = GreenBar.getValue();
			setGrayScale(green);
		}
	}
	
	//8.4: Create Color Component and Set it to MidPanel
	Color rgbColor = new Color(red, green, blue);
	MidPanel.setBackground(rgbColor);
}
	
	public static void main(String[] args) {
		//Sample 03: Make the FrameWindow Visible
		ScrollBar fw = 
      new ScrollBar("JSplitPane Example");
    fw.setVisible(true);		
	}
}
