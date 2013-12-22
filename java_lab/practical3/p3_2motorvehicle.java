package practical3;

import java.util.*;

class motorVehicle {
	int modelNum,modelPrice;
	String modelName;
	
	motorVehicle(){}
	
	motorVehicle(int num,String name,int price)
	{
		modelNum=num;
		modelName=name;
		modelPrice=price;
	}
	
	public void display()
	{
		System.out.println("The model details : No : "+ modelNum + " Name : " + modelName + " Price : " + modelPrice);
	}
}

class car extends motorVehicle{
	
	int discountRate;
	
	car(){}
	
	car(int num,String name,int price,int disc)
	{
		modelNum=num;
		modelName=name;
		modelPrice=price;
		discountRate=disc;
	}
	
	public void display()
	{
		super.display();
		System.out.println("The discount rate is : " + discountRate);		
	}
	
	public void discount()
	{
		System.out.println("The discount is : " + (modelPrice*discountRate/100) );
	}
	
}

public class p3_2motorvehicle {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the car model number : ");
		int num=scan.nextInt();
		
		System.out.print("Enter the car model name : ");
		String name=scan.next();
		
		System.out.print("Enter the car model price : ");
		int price=scan.nextInt();
		
		System.out.print("Enter the discount rate : ");
		int disc=scan.nextInt();
		
		car c1 = new car(num,name,price,disc);
		
		c1.display();
		c1.discount();
	}

}
