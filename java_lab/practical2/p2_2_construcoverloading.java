package practical2;
import java.util.Scanner;

class shape {
	
	shape(int r)
	{
		System.out.println("The are of the circle is " + 3.14*r*r);
	}
	shape(int len,int breath)
	{
		System.out.println("The are of the figure is " + len*breath);
	}
	
}

public class p2_2_construcoverloading {
	
	public static void main(String[] args)
	{
		System.out.println("Enter the circle radius : ");
		
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		
	shape k = new shape(r);
		System.out.println("Enter the side of the square : ");
		int len = scan.nextInt();
		shape l = new shape(len,len);
	
	}
	
}
