/*
<applet code="p01frames" width=300 height=100>
</applet>
*/


import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class p01frames extends Applet{
	
	class sampleframe extends Frame { 
		sampleframe(String title) { 
			super(title);
			MyWindowAdapter adapter = new MyWindowAdapter(this);
			addWindowListener(adapter);
		}
		public void paint(Graphics G) {
			G.drawString("this is in frame!", 15, 55);
		}
	}
	
	class MyWindowAdapter extends WindowAdapter {
		sampleframe myframe;
		public MyWindowAdapter(sampleframe f) {
			myframe = f;
		}
		public void windowClosing(WindowEvent we) {
			myframe.setVisible(false);
		}
	}
	
	Frame f;
	
	public void init() { 
		f = new sampleframe("jdframe");
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
