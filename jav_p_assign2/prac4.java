/*
 * Design a class named Fan to represent a fan. The class contains:
- Three constants named SLOW, MEDIUM and FAST with values 1,2 and 3 to
denote the fan speed.
- An int data field named speed that specifies the speed of the fan (default SLOW).
- A boolean data field named f_on that specifies whether the fan is on(default false).
- A double data field named radius that specifies the radius of the fan (default 4).
- A data field named color that specifies the color of the fan (default blue).
- A no-arg constructor that creates a default fan.
- A parameterized constructor initializes the fan objects to given values.
- A method named display() will display description for the fan. If the fan is on,the display()
method displays speed, color and radius. If the fan is not on, the
method returns fan color and radius along with the message “fan is off”.
Write a test program that creates two Fan objects. One with default values and
the other with medium speed, radius 6, color brown, and turned on status true.
Display the descriptions for two created Fan objects.
 */


class fan {
	
	 int slow=1;
	 int medium=2;
	 int fast=3;
	 
	 int speed;
	 boolean f_on;
	 double radius;
	 String color;
	 
	 fan()
	 {
		 speed=slow;
		 f_on=false;
		 radius=4;
		 color="blue";
	 }
	 
	 fan(int sp,boolean on,double r,String col)
	 {
		 speed=sp;
		 f_on=on;
		 radius=r;
		 color=col;
	 }
	 
	 void display()
	 {
		 System.out.println("The Fan specifications : ");
		 System.out.println("FanSpeed : " + speed);
		 System.out.println("The fan is : " + ((f_on==false)?"OFF":"ON"));
		 System.out.println("The radius of the fan is " + radius );
		 System.out.println("The color of the fan is " + color);
	 }	
}

public class prac4 {
	
	public static void main(String args[])
	{
		
		fan f1=new fan();
		fan f2=new fan(2,true,6,"brown");
		
		f1.display();
		f2.display();
	}

}






