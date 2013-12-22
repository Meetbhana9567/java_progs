import java.io.*;
import java.util.*;


public class read_misc { 
  public static void main(String args[]) { 
    File myfile = new File("misc.txt");
    
    Scanner k;
    
    try { 
    k = new Scanner(myfile);
    
    while(k.hasNext()) { 
    System.out.print(k.next());
    }
    
    k.close();
    
    }
    
    catch(IOException e) { 
    System.out.println("Your file is not found anywhere! :O");
    }
    
  }
}
    
    