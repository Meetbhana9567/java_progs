/* 

abstract class : this is the class with only partial implementations of its member methods
	this class can not have instances
	it can have reference variables of its type pointing to the subclass objects
	it's all abstract member methods must be implemented in the concrete subclass
	
*/

abstract class person { 

String work;

abstract public void showwork();

}

class businessman extends person {

businessman() {
work = "I'm a businessman and I work in Enterprise";
}

public void showwork() {
System.out.println(work);
}

}

class electrician extends person {

electrician() { 
work = "I work with wires and circuits";
}

public void showwork() {
System.out.println(work);
}

}

public class abclass {
	public static void main(String args[])
	{
	person b = new businessman();
	b.showwork();	
	}
	
}
