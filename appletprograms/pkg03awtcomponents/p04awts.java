import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
  <applet code="p04awts" width=450 height=450 >
  </applet>
*/

public class p04awts extends Applet implements MouseListener,ActionListener { 
  
  Label somemore[];
  
  Button change;
  Button change2;
  CardLayout cl;
  Panel pan3;
  
  Panel pan;
  Panel pan2;
  
  public void init() { 
  
  somemore = new Label[5];
  
  somemore[0] = new Label("Hi..");
  somemore[1] = new Label("Hello...");
  somemore[2] = new Label("How..");
  somemore[3] = new Label("are...");
  somemore[4] = new Label("u..");
  
  change = new Button("Layout1...");
  change2 = new Button("Layout2...");
  
  BorderLayout bl = new BorderLayout();
  GridLayout gl = new GridLayout();
  FlowLayout fl = new FlowLayout();
  cl = new CardLayout();
  
  pan = new Panel();
  pan2 = new Panel();
  pan3 = new Panel();
  
  add(change);
  add(change2);
  
  pan3.setLayout(cl);
  
  	//pan has a grid layout....
  pan.setLayout(gl);
  pan.add(somemore[0]);
  pan.add(somemore[1]);
  
  	//pan2 has a flow layout...
  pan2.setLayout(fl);
  pan2.add(somemore[2]);
  pan2.add(somemore[3]);
  pan2.add(somemore[4]);
  
  
  pan3.add(pan,"Panel1");
  pan3.add(pan2,"Panel2");
  
  add(pan3);
  
  change.addActionListener(this);
  change2.addActionListener(this);
  
  addMouseListener(this);

  showStatus("Applet Initialized!");
  
  }
  
  public void mousePressed(MouseEvent me) {
  cl.next(pan3);
  }
  // Provide empty implementations for the other MouseListener methods.
  public void mouseClicked(MouseEvent me) {
  }
  public void mouseEntered(MouseEvent me) {
  }
  public void mouseExited(MouseEvent me) {
  }
  public void mouseReleased(MouseEvent me) {
  }

  public void actionPerformed(ActionEvent ae) {
  if(ae.getSource() == change) { 
  cl.show(pan3,"Panel1");
  }
  if(ae.getSource() == change2) { 
  cl.show(pan3,"Panel2");
  }
}
 
  
}
  