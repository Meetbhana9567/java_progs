//illustration to write to files using streams...

import java.util.*;
import java.io.*;

public class write_streams { 

  public static void main(String args[]) throws IOException {
  
    File myfile = new File("hello.txt");
    
    FileOutputStream out = new FileOutputStream(myfile);
    
    String myline = "hello world...! :) ";
    
    byte buffer[] = myline.getBytes();
    
    out.write(buffer);
    
    out.close();
    
  }
}
    
    
