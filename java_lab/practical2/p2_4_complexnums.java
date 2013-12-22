package practical2;
class complex {
	
	int real,img;
	
	complex()
	{
		real=0;
		img=0;
	}
	
	complex(int x,int y)
	{
		real=x;
		img=y;
	}
	
	void putdata(int x,int y)
	{
			real=x;
			img=y;
	}
	
	complex additn(complex b)
	{
		complex temp = new complex();
		temp.real=real+b.real;
		temp.img=img+b.img;
		return temp;
	}
	
	complex subn(complex b)
	{
		complex temp = new complex();
		temp.real=real-b.real;
		temp.img=img-b.img;
		return temp;
	}
	
	complex muln(complex b)
	{
		complex temp = new complex();
		temp.real=real*b.real;
		temp.img=img*b.img;
		return temp;
	}
	void display()
	{
		System.out.print("The number is : " + real + " + i ( " + img + " ) " );
	}
}
public class p2_4_complexnums {
	
	public static void main(String args[])
	{
		complex k1 = new complex();
		k1.putdata(2,3);
		complex k2 = new complex(4,5);
		
		complex k3 = k1.additn(k2);
		
		System.out.println("k1 is : ");
		k1.display();
		System.out.println("k2 is : ");
		k2.display();
		System.out.println("Addition : ");
		k3.display();
		System.out.println("Subtraction : ");
		k3 = k1.subn(k2);
		k3.display();
		System.out.println("Multiplication is : ");
		k3 = k1.muln(k2);
		k3.display();
		
	}
	
	

}
