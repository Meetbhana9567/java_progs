/*
 * Multiple Path Inheritance A -> (B,C) -> D
 */

interface AA {
	public void methoda();
}

interface BB extends AA{
	public void methodb();
}

interface CC extends AA{
	public void methodc();
}

interface DD extends BB,CC{
	public void display();
}

class testa implements DD {
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


public class praac10 {
	public static void main(String args[])
	{
		testa t1=new testa();
		t1.display();
	}
}
