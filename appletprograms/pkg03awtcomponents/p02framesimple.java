/*
<applet code="p02framesimple" width=300 height=100>
</applet>
*/


import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import myawt.*;

public class p02framesimple extends Applet{
		
	Frame f;
	
	public void init() { 
		f = new jdframe("jdframe");
		f.setSize(450, 450);
		f.setVisible(true);
	}
	public void stop() { 
		f.setVisible(false);
	}
	
	public void paint(Graphics G) { 
		G.drawString("This is applet windows...",25,55);
	}
	
}
