package practical1;
import java.util.*;
public class p8keybscanner {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Enter an int : ");
		int a = scan.nextInt();
		System.out.println(" Enter a double : ");
		double b = scan.nextDouble();
		System.out.println(" ENter an String : ");
		String c = scan.next();
		
		System.out.println(" The entered parameters are : ");
		System.out.println( "int : " + a + " double : " + b + " String : " + c );
		
		
	}

}
