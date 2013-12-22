/*
<applet code="p02keyboardevents" width=300 height=100>
</applet>
*/


import java.awt.*;
import java.awt.event.*;
import java.applet.*;


public class p02keyboardevents extends Applet implements KeyListener {
	
	String msg = "";
	char key;
	String attrib = "";
	
	public void init() {
		addKeyListener(this);
	}
	
	public void keyPressed(KeyEvent arg0) {
		msg = "keypressed";
		key=arg0.getKeyChar();
		msg += ("    is it action key? " + arg0.isActionKey());
		
		repaint();
	}
	public void keyReleased(KeyEvent arg0) {
		msg = "keyreleased";
		key=arg0.getKeyChar();
		msg += ("    is it action key? " + arg0.isActionKey());
		

		
		//code to identify virtual keys
		int mykey = arg0.getKeyCode();
		
		switch(mykey) { 
		case KeyEvent.VK_F1 : {
			msg += "   F1 key pressed!  ";
			break;
		}
		case KeyEvent.VK_ALT : {
			msg += "   Left Alt key pressed!  ";
			break;
		}
		case KeyEvent.VK_BACK_SPACE : {
			msg += "   BackSpace key pressed!  ";
			break;
		}
		case KeyEvent.VK_CAPS_LOCK : {
			msg += "   CAPS key pressed!  ";
			break;
		}
		case KeyEvent.VK_NUM_LOCK : {
			msg += "   NumLOCK key pressed!  ";
			break;
		}
		case KeyEvent.VK_ESCAPE : {
			msg += "   Esc key pressed!  ";
			break;
		}
		case KeyEvent.VK_ENTER : {
			msg += "   Enter key pressed!  ";
			break;
		}
	}
		
		repaint();
		
		
	}
	public void keyTyped(KeyEvent arg0) {
		msg = "keytyped";
		key=arg0.getKeyChar();
		msg += ("    is it action key? " + arg0.isActionKey());
		repaint();
	}

	public void paint(Graphics g) { 
		g.drawString((msg+"  key is : "+key + "  "), 15, 55);
	}
	
}
