//introduction to swing and GUIs... 

import javax.swing.*;
import java.awt.*;	//for FlowLayout
import java.awt.event.*;
import java.util.*;

public class swingme1 { 

  JLabel message;

  //constructor -- do whatever u want here and then... Start a new thread!
  swingme1() { 
  
  JFrame frame = new JFrame("Hello Swing :)");
  frame.setSize(400,450);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  JLabel label[] = new JLabel[4];
  
  label[0] = new JLabel("Hie.. :)");
  label[1] = new JLabel("Hello..");
  label[2] = new JLabel("Howz..");
  label[3] = new JLabel("U..");
  
  frame.setLayout(new FlowLayout());
  
  frame.add(label[0]);
  frame.add(label[1]);
  frame.add(label[2]);
  frame.add(label[3]);
  
  frame.setVisible(true);
  
  }
  
  swingme1(int k) { 
  
  //this is another illustration program...
  
  JFrame frame = new JFrame("Hello Swing Second :)");
  frame.setSize(400,450);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  JButton button[] = new JButton[4];
  
  button[0] = new JButton("Hie.. :)");
  button[1] = new JButton("Show Message 1 !");
  button[2] = new JButton("Show Message 2 !");
  button[3] = new JButton("Exit");
  
  message = new JLabel("Select a Button...");
  
  frame.setLayout(new FlowLayout());
  
  frame.add(button[0]);
  frame.add(button[1]);
  frame.add(button[2]);
  frame.add(button[3]);
  
  frame.add(message);
  
  button[0].addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent ae) { 
    message.setText("You Clicked Hie.. Hi User.. Welcome to Swing!");
    }});
  button[1].addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent ae) { 
    message.setText("msg1 : First message for u is Feb comes after Jan... :) ");
    }});
  button[2].addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent ae) { 
    message.setText("msg2 : Second message for u is Jan comes before Feb... :D ");
    }});
  button[3].addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent ae) { 
    System.exit(0);
    }});
  
  frame.setVisible(true);
  
  
  }
  
  public static void main(String args[]) { 
  
  //new swingme1(); --this will run the program directly under main thread
   
   System.out.println("Hello Console to console...!");
   
   int choice;
   
   System.out.println("This program contains 2 Swing Programs...");
   System.out.println("Which Program do u want to run? : ");
   System.out.println("Choices : 1 = Program1 ; 2 = Program2 ; 3 = Both ; 4 = Exit!");
   System.out.print("Enter your choice : ");
   
   Scanner scan = new Scanner(System.in);
   
   choice = 0;
   
   try{
   choice = scan.nextInt();
   } catch ( Exception e ) { 
   System.out.println("Your choice is HORRIBLE...!");
   System.exit(0);
   }
   
   switch(choice) { 
   case 1 : { 
   
   SwingUtilities.invokeLater( new Runnable() {
    public void run() { 
      new swingme1();
    }
   });
   
   break;
   
   }
   
   case 2 : { 
   
   SwingUtilities.invokeLater( new Runnable() {
    public void run() { 
      new swingme1(1);
    }
   });
   
   break;
   
   }
   
   case 3 : { 
   
   SwingUtilities.invokeLater( new Runnable() {
    public void run() { 
      new swingme1();
    }
   });
   
   SwingUtilities.invokeLater( new Runnable() {
    public void run() { 
      new swingme1(1);
    }
   });
   
   break;
   
   }
   
   case 4 : { 
   
   System.exit(0);
   
   }
   
   default : { 
   
   System.out.println("Invalid Choice...!");
   
   }
   
   }

  }
}
  
  
  
  
  
    