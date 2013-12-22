//variable length arguements in JAVA : an Illustration

class myclass { 

static void printall( String ... k )
  {
  for(int i=0 ; i < k.length ; i++)
  {
    System.out.println(k[i]);
  }
}

}

public class varargs { 

  public static void main(String args[])
  {
    myclass.printall("Jd","kbjz12");
    return ;
  }
}
