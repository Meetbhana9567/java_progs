/*
 * Write a program that illustrates interface inheritance. Interface P is extended by P1
and P2. Interface P12 inherits from both P1 and P2.Each interface declares one
constant and one method. class Q implements P12.Instantiate Q and invoke each of its
methods. Each method displays one of the constants
 */

interface p{
	int a=8;
	public void displaya();
}

interface p1 extends p {
	int k=6;
	public void displayhi();
}

interface p2 extends p{
	int m=7;
	public void displaybye();
}

interface p12 extends p1,p2 {}

class Q implements p12{

	public void displayhi() {
		System.out.println("Hie..");		
	}

	public void displaya() {
		System.out.println("The value of a k and m are : " + a + "  " + k + "  "  + m);
	}

	public void displaybye() {
		System.out.println("Bye..");
	}
	
	public void display(){
		this.displayhi();
		this.displaya();
		this.displaybye();
	}
	
}

public class prac8 {
	public static void main(String[] args) {
		Q obj1 = new Q();
		obj1.display();
	}

}
