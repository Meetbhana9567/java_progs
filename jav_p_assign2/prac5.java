import java.util.Scanner;

/*
 * Define the Rectangle class that contains:
Two double fields x and y that specify the center of the rectangle, the data field width and
height ,
A no-arg constructor that creates the default rectangle with (0,0) for (x,y) and 1 for both
width and height.
A parameterized constructor creates a rectangle with the specified x,y,height
and width.
A method getArea() that returns the area of the rectangle.
A method getPerimeter() that returns the perimeter of the rectangle.
A method contains(double x, double y) that returns true if the specified point\
(x,y) is inside this rectangle.
Write a test program that creates two rectangle objects. One with default values
and other with user specified values. Test all the methods of the class for both the objects.
 */

class rectangle {
	double x,y;
	double width,height;
	
	rectangle()
	{
		x=0;
		y=0;
		width=1;
		height=1;
	}
	
	rectangle(double a,double b,double w,double h)
	{
		x=a;
		y=b;
		width=w;
		height=h;
	}
	
	void getArea()
	{
		System.out.println("The area of the Rectangle is : " + (height*width));
	}
	
	void getPerimeter()
	{
		System.out.println("The Perimeter of the Rectangle is : " + (2*(height+width)) ); 
	}
	
	boolean checkPoint(double a,double b)
	{
		return ((a>x-width/2 && a<x+width/2) && (b>y-height/2 && b<y+height/2));
	}
	
	void display()
	{
		System.out.println("Parameters for rectangle are : Center = ("+x+","+y+") and width : "+width+ "height : "+height);
		getArea();
		getPerimeter();	
		check();
	}
	
	void check()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Co-ordinates of point to check for : ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		System.out.println("The point is "+ (checkPoint(a,b)?"INSIDE":"OUTSIDE") + " the given rectangle");
		
	}
}
public class prac5 {
	
	public static void main(String args[])
	{
		rectangle r1=new rectangle();
		rectangle r2=new rectangle(2,3,45,10);
		
		r1.display();
		r2.display();
	}

}
