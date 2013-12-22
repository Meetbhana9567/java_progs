package myawt;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class jdframe extends Frame { 
		public jdframe(String title) { 
			super(title);
			jdwindowadapter adapter = new jdwindowadapter(this);
			addWindowListener(adapter);
		}
		public jdframe() {}
		public void paint(Graphics G) {
			G.drawString("this is in frame!", 15, 55);
		}
	}
