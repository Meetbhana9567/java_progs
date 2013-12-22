package practical2;
class person {
	String name;
	
	person()
	{
		
	}
	
	person(String namem)
	{
		name = namem;
	}
	
	void display()
	{
		System.out.print(this.name);
	}
	
}

class businessman extends person
{
	businessman(String args)
	{
		super(args);
	}
	void display()
	{
		System.out.print("Hello I'm businessman and my name is ");
		super.display();
	}
	
}
public class p2_5_thiskeyword {
	
	public static void main(String[] args)
	{
		person p1 = new person("JayD");
		p1.display();
		System.out.println();
		
		businessman p2 = new businessman("Jay");
		p2.display();
	}

}
