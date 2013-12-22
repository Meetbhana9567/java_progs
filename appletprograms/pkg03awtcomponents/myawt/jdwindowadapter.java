package myawt;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class jdwindowadapter extends WindowAdapter {
		public jdframe myframe;
		public jdwindowadapter(jdframe f) {
			myframe = f;
		}
		public void windowClosing(WindowEvent we) {
			myframe.setVisible(false);
		}
	}
