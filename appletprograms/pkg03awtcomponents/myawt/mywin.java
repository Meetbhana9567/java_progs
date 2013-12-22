package myawt;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class mywin extends jdframe { 

public mywin(String title) { 
super(title);
adap ada = new adap(this);
addWindowListener(ada);
}

public mywin() {
super("hello");
adap ada = new adap(this);
addWindowListener(ada);
}


}
