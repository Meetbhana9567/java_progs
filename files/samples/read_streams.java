//iilustration to read from the file : using streams

import java.io.*;

public class read_streams { 
  public static void main(String args[]) throws IOException {
  
    File myfile = new File("hello.txt");
    
    FileInputStream in = new FileInputStream(myfile);
    
    //find the available bytes...
    int size;
    
    size = in.available();
    
    //allocate the number of bytes as the size of buffer...
    
    byte buffer[] = new byte[size];
    
    //read from file to the buffer from the input stream...
    in.read(buffer);
    
    //convert the read bytes to the String...
    String text = new String(buffer);
    
    //output on console...
    System.out.println(text);
    
    }
    
  }