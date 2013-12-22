
import java.applet.*;
import java.awt.*;

class myapplet extends Frame { 
public void paint(Graphics g) {
	g.drawString("hello jd",3,7);
}
public void stop() { 
System.exit(0);
}

public static void main(String args[]) {
  myapplet k = new myapplet();
  k.setSize(450,450);
  k.setTitle("hie jd :) ");  
  k.setVisible(true);
  k.paint(k.getGraphics());
}
}


