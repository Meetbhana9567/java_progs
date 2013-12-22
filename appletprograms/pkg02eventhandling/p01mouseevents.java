 //package pkg02eventhandling;

/*
<applet code="p01mouseevents" width=300 height=100>
</applet>
*/


//packages to import
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class p01mouseevents extends Applet implements MouseListener,MouseMotionListener{
	//declaring applet specific variables here
	String msg = "";
	int mouseX;
	int mouseY;	
	
	//now first register and connect the sources to listener
	
	//this can be done in the init() of applet
	public void init() {
		addMouseListener(this);
		addMouseMotionListener(this);
start();
	}
	public void start() {
} 

	//now handle different mouse events as follows:
	
	//1. Mouse clicked event
	public void mouseClicked(MouseEvent k) { 
		mouseX = k.getX();
		mouseY = k.getY();
		msg = "Mouse Button Clicked!";
		repaint();
	}
	
	//2. Mouse Entered event
	public void mouseEntered(MouseEvent k) {
		msg = "Mouse Entered the screen!";
		repaint();
	}
	
	//3. Mouse Exited event
	public void mouseExited(MouseEvent k) { 
		msg = "Mouse exited the screen!";
		repaint();
	}
	
	//4. Mouse Pressed
	public void mousePressed(MouseEvent k) {
		msg = "Mouse Pressed! ";
		mouseX = k.getX();
		mouseY = k.getY();
		repaint();
	}
	
	//5. Mouse Dragged
	public void mouseDragged(MouseEvent k) {
		msg = "Mouse Dragged! ";
		mouseX = k.getX();
		mouseY = k.getY();
		repaint();
	}
	
	//6. Mouse Moved
	public void mouseMoved(MouseEvent k) { 
		showStatus("Mouse moved at x = " + k.getX() + " and y = " + k.getY() + " ....");
	}
	
	//7. Mouse Released
	public void mouseReleased(MouseEvent k) {
		msg = "Mouse Released! ";
		mouseX = k.getX();
		mouseY = k.getY();
		repaint();
	}
	
	public void paint(Graphics G) { 
		G.drawString(msg + "Position is ( " + mouseX + " , " + mouseY + " )...", 15 , 55);
	}
	
}
