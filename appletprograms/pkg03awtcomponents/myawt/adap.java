package myawt;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class adap extends jdwindowadapter { 
  public adap(jdframe k) { 
  super(k);
  }
  public void windowClosing(WindowEvent k)
    {
    System.exit(0);
    }
}
