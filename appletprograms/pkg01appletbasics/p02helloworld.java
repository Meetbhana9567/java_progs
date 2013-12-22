import java.applet.*;
import java.awt.*;

/*
<applet code="p02helloworld" width=300 height=50>
</applet>
*/


public class p02helloworld extends Applet {
	
	Color bclr,fclr;
	String msg;
	boolean done =false;

	public void init() {
		//here every thing that needs to be initialized 
		
		bclr = Color.red;
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
		G.drawString(msg,10, 55);
		
		//have update function try karva maate msg ni value change kariye
		msg = "updated string!";
		
		//5 second pachi change thavi joiye value...
		
		if(!done) { 
			try {
				Thread.sleep(5000);
				done = true;
				update(G);
			} catch (InterruptedException e) {
				//do nothing
			}
		}
	}
	
	public void stop() { 
		//atiyaare aahiya kai karvani jarur nathi....
	}
	
	public void destroy() { 
		//atiyaare aahiya kai karvani jarur nathi....
	}
	
}
