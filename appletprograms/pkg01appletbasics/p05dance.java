
//only include specific packages that u use...
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*
<applet code="p05dance" width=300 height=50>
</applet>
*/

public class p05dance extends Applet implements Runnable{
	//firstly declare applet specific variables
	String msg = " jd ";
	Thread t = null;	//thread of this applet that moves text
	int xpos,ypos;
	boolean stopflag = false;
	int turn;
	
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
		xpos=15;
		ypos=55;
		turn = 1;
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
				Thread.sleep(25);
				if(turn == 1) {
					xpos+=2;
					ypos-=2;
					if(ypos==15)
						turn=2;
				}
				if(turn == 2) {
					ypos+=2;
					if(ypos==95)
						turn=3;
				}
				if(turn==3) {
					ypos-=2;
					xpos+=2;
					if(ypos==55)
						turn=4;
				}
				if(turn==4) {
					xpos-=2;
					if(xpos==15)
						turn=1;
				}
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
		G.drawString(msg, xpos , ypos);
	}
	
}
