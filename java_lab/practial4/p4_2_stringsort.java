import java.util.Scanner;
import java.util.Arrays;

public class p4_2_stringsort {

  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);

    String a[] = new String[5];

    int i,j;

    for(i=0;i<5;i++)
    {
      System.out.println("Enter the element for index [ " + i + " ] : " );
      a[i] = scan.next();
    }

    Arrays.sort(a);

    System.out.println("The Sorted elements are as : " );

    for(i=0;i<5;i++)
    {
      System.out .println ( a[i] );
    }
  }

}
