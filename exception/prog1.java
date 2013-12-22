import java.util.Scanner;

public class prog1{
 public static void main(String args[])
 {
 int a=20,b=0;
 int ans = 1;
 
 /*
 //arithematic exception
 
 ans = a/b;
 
 //this o/p gives : Exception in thread "main" java.lang.ArithmeticException: / by zero
 */
 
 //try catch mechanism to catch exceptions
 
 try{ 
 
  ans = a/b;
 
 System.out.println("The above division is done successful and the ans = " + ans );
 }
 
 catch(ArithmeticException e) {
 System.out.println("The division was not possible and hence the ans = " + ans );
 System.out.println("Kayu exception hatu? Ans : " + e);
 }
 
 try { System.out.println(" Array Index Print Karav vani try kariye : args[5]");
 System.out.println(args[5]);
 }
 
 catch(ArrayIndexOutOfBoundsException e) { 
 System.out.println("Hehehe atli badhi values aj nahi array ma ;) :D");
 System.out.println("Exception type : " + e );
 }
 
 Scanner scan = new Scanner(System.in);
 
 try { int kem;
 System.out.println("koi string enter kari jov int variable mate pachi joiye su thaaye!");
 System.out.println("Integer variable mate string? : ");
 kem = scan.nextInt();
 }
   
 catch(Exception e) { 
 System.out.println("Baki jetlA pan runtime exceptions hoye a aama catch thai jase :) Generally");
 System.out.println("So aa hamna kayu catch thayu? Ans = " + e);
 }
 
 }
}
