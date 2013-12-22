package practical3;

class aclass
{
	int k;
	
	aclass()
	{
		k=7;
	}
	public void showvalue()
	{
		System.out.println("The value of k is " + k);
	}
}

class bclass extends aclass
{
	int m;
	
	bclass()
	{
		m=13;
	}
	
	public void showvalue()
	{
		super.showvalue();
		System.out.println("The value of m is " + m);
	}
}

public class p3_1superkeyword {
	
	public static void main(String args[])
	{
		bclass obj1 = new bclass();
		obj1.showvalue();
	}
}
