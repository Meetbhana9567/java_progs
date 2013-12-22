import java.applet.*;
import java.awt.*;

/*
<applet code="p04bannerme" width=300 height=50>
</applet>
*/

public class p04bannerme extends Applet implements Runnable{
	//firstly declare applet specific variables
	String msg = "hi jd how are u? ";
	Thread t = null;	//thread of this applet that moves text
	int state;
	boolean stopflag = false;
	
	//now firstly we'll initialize the applet parameters
	public void init() { 
		//applet init function
		setBackground(Color.cyan);
		setForeground(Color.red);
	}
	
	//now start thread
	public void start() {
		//in start method of applet we'll start the execution of the thread
		t = new Thread(this); //take this runnable interface implementation as thread
		stopflag = false;
		t.start(); //start the thread
	}
	
	//hence thread will start so the run method? yea here it is
	//thread functionality in run method
	public void run() { 
		char ch;  //local variable for cutting the string 
		
		//infinite loop untill stops...
		for( ; ; ) { 
			try { 
				repaint();
				Thread.sleep(250);
				ch = msg.charAt(0);
				msg = msg.substring(1,msg.length());
				msg += ch;
				if(stopflag) { 
					break;
					//if the stop signal is applied then break this infinite loop
				}
			} catch(Exception e) { 
				//do nothing
			}//try-catch ends
		}//loop block ends
	}//run method ends
	
	//now what to display on screen is only to be included in paint method
	public void paint(Graphics G) {
		G.drawString(msg, 25 , 50);
	}
	
}
