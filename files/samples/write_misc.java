import java.util.*;
import java.io.*;

public class write_misc { 
  public static void main(String args[]) {
  
    File myfile = new File("misc.txt");
    
    Formatter out;
    
    try { 
    out = new Formatter(myfile);
    out.format("Hello how are u..?");
    
    String s = "hie..";
    int k = 27;
    
    out.format("\n"); //newline...
    
    out.format("%s  %d " , s , k );
    
    out.close();
    } 
    
    catch (Exception e) { System.out.println("NoFile..."); 
    System.exit(0);
    } //if file not found...
    

    
    }
  }