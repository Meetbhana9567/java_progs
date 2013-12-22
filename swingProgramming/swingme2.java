import java.awt.*;

import javax.swing.*;

class myframe extends JFrame {

  mypanel pan;

  public myframe(mypanel pane) { 
    pan=pane;
    setSize(516,375);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(pan);
    setVisible(true);
  }
}

class mypanel extends JPanel { 

  Image loadme;
  
  mypanel() { 
    loadme = Toolkit.getDefaultToolkit().createImage("icon.png");
    prepareImage(loadme,this);
  }
  
  public void paintComponent(Graphics g) { 
    g.drawImage(loadme,0,0,null);
  }
}

public class swingme2 { 

  public static void main(String args[]) { 
new myframe(new mypanel());
}

}
