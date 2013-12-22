/* 

interface : a collection of constant final members and method declarations
	a class can "implement" a interface as : 
	
		<access modif> class class-name implements interface-name {
		.....
		implementation of all the member methods declared in interface
		+ class variables and methds
		.....
		}
		
	a class can implement a interface
	
	a interface can extend from another interface and also multiple interfaces wihich is not the same with class
		i.e. a class can only extend from one single clas but interface from multiple interfaces
		
*/

interface i1 extends i2{

public void printpi();

}

interface i3 extends i2 {

public void area_circle(int radius);

}

interface i2 { 

double pi = 3.142857143;

}

class testi1 implements i1,i3 {

public void printpi() {
System.out.println( pi );
}

public void area_circle(int r) { 
double area = pi * r * r;

System.out.println( "Area of circle is : " + area );
}

}

public class interf { 

 public static void main(String args[])
 {
 testi1 t = new testi1();
 t.printpi();
 t.area_circle(10);
 
 }
 
}











