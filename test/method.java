/*
method : a group of procedures/statements

syntAX : <privilage> <return type> method-name ( parameters ) { .... }

class : data members and method binded into a single unit | collection of objects

---------------------------------------

syntax for defining a class :- ---->

<privilage> class class-name { 

.... data members ....

....methods .....

}

---------------------------------------

static and non static members of a class :-

-> static members : these members can be called without creation of objects of the class as..
	"class-name.member-name;"
-> non-static members : these members can be called only through instances | objects as...
	"object-name.member-name;"
	
-----------------------------------------

method overloading : this is the concept of using the same method name but with different number of parameters and 
	different definations as...
	void add() | int add() | int add(int a,int b) | int add(int a) : can be all overloaded "add" methods

-------------------------------------------

constructor : specialized method invoked on creation of object
	-> it has the same name as the class name
	-> has no return type
	-> can be overloaded
	
---------------------------------------------

constructor overloading : mutliple constructors of the same class with different parameter lists


*/

class container { 
	public String data;
	
	//default constructor
	container() { 
	data = "HelloWorld";
	}
	
	//parameterized constructor
	container(String m) {
	data = m;
	}

	public void print(String data)
	{
	System.out.println( this.data );
	}
	
	public void print(int m)
	{
	System.out.println("Integer : " + m );
	}
	
	protected void finalize()
	{
	System.out.println("This is the distructor call");
	}
}

public class method { 

	public static void main(String a[])
	{
	container object = new container("JayDihenkar");
	object.print("JD");
	}

}
