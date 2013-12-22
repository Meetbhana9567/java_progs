package practical1;

public class p4cmdlinearg {
	
	public static void main(String[] args)
	{
		int k = Integer.parseInt(args[0]);
		if(k<50)
		{
			System.out.print("the number is less than 50");
		}
		else
		{
			System.out.print("the number is greater or equal to 50");
		}
	}

}
