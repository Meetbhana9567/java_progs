
import java.awt.Graphics;
import java.applet.Applet;

/*
<applet code="p06illusStatus" width=300 height=50>
</applet>
*/

public class p06illusStatus extends Applet{
	
	String mainwindow = "This is shown in main applet window!";
	String statuswindow = "This is shown in status window";
	
	public void paint(Graphics G) { 
		G.drawString(mainwindow, 15, 45);
		showStatus(statuswindow);
		this.setSize(450, 450);
	}

}
