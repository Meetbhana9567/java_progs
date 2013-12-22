/*
 * Hybrid Inheritance (A,B) -> C -> D
 */

interface A {
	public void methoda();
}

interface B {
	public void methodb();
}

interface C extends A,B{
	public void methodc();
}

interface D extends C{
	public void display();
}

class test implements D{

	public void display() {
		methoda();
		methodb();
		methodc();
	}

	public void methodc() {
		System.out.println("This is the METHOD C");
	}

	public void methoda() {
		System.out.println("This is the METHOD A");
	}

	public void methodb() {
		System.out.println("This is the METHOD B");
	}
	
}
public class prac9 {
	
	public static void main(String args[])
	{
		test t1=new test();
		t1.display();
	}

}
