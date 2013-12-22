class A implements Runnable
{
	public void run()
	{
	for(int i=0;i<3;i++)
	System.out.println("run() function\n");
	}
}

class B
{
public static void main(String ar[])
{
A a1=new A();
Thread t=new Thread(a1);
t.start();
}
}
