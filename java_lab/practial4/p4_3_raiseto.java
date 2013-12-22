import java.util.Scanner;

import java.Exception.*;

public class p4_3_raiseto { 

  public static void main(String args[])
    {
      int a,b;
      int ans;

      Scanner scan = new Scanner(System.in);

      try { 
      System.out.println("Enter base : " );
      a=scan.nextInt();

      System.out.println("Enter power : " );
      b=scan.nextInt();

      }

      catch(InputMiscmatchException e)
      {
	System.out.println("The input is not valid! Exiting!");
      }

      ans=1;

      int t=b;

      for(t=1;t<=b;t++)
      {
	ans = ans*a;
      }

    System.out.println("The answer is : " + ans );

    }

 }
