
import java.applet.*;
import java.awt.*;

/*
<applet code="p03updatedhelloworld" width=300 height=50>
</applet>
*/

public class p03updatedhelloworld extends Applet {
	
	Color bclr,fclr;
	String msg;
	boolean done =false;

	public void init() {
		//here every thing that needs to be initialized 
		
		bclr = Color.gray;
		fclr = Color.blue;
		
		msg = "hello this is my applet - jd";
		
		//so finally initialization thai gayu have...
	}
	
	public void start() { 
		//atiyaare aahiya kai karvani jarur nathi....
	}
	
	public void paint(Graphics G) {
		//the paint method k jya thi badha elements display thaaye applet ma...
		setBackground(bclr);
		setForeground(fclr);
		
		//kaik msg print kariye
		G.drawString(msg, 55, 55);
		
		//5 second pachi change thavi joiye value...
		repaint(100000);
		//!Note : problem here is it will update before 5 seconds whenever
		//possible and hence 
		
		msg = "Hello How R U . . . :) !";
	}
	
	public void stop() { 
		//atiyaare aahiya kai karvani jarur nathi....
	}
	
	public void destroy() { 
		//atiyaare aahiya kai karvani jarur nathi....
	}	
}
