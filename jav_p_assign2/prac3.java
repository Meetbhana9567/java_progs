import java.util.Scanner;

/*
 * Declare a class called employee having employee_id and employee_name as members. Extend
class employee to have a subclass called salary having designation and monthly_salary as
members. Define following:
- Required constructors
- A method to find and display all details of employees drawing salary more than Rs. 20000/-
- Method main for creating an array for storing these details given as command line
arguments and showing usage of above methods.
 */

abstract class employee {
	int emp_id;
	String emp_name;
	
}

class salary extends employee
{
	String designation;
	double msalary;
	
	salary(){}
	
	salary(int id,String name,String desig,double sal)
	{
		this.emp_id=id;
		this.emp_name=name;
		this.designation=desig;
		this.msalary=sal;
	}
	
	void display()
	{
		System.out.println("The employee details are as : ");
		System.out.println("ID : " + emp_id);
		System.out.println("NAME : " + emp_name);
		System.out.println("Designation : " + designation);
		System.out.println("Salary : " + msalary);
	}
}

public class prac3 {
	
	public static void main(String args[])
	{
		int count = Integer.parseInt(args[0]);
		
		salary s[] = new salary[count];
		
		int i;
		int id;
		String n,d;
		double sal;
		
		Scanner scan = new Scanner(System.in);
		
		for(i=0;i<count;i++)
		{
			System.out.println("Entering Details for employee# " + (i+1) );
			System.out.print("Enter ID : ");
			id=scan.nextInt();
			System.out.print("Enter Name : ");
			n=scan.next();
			System.out.print("Enter Designation : ");
			d=scan.next();
			System.out.print("Enter Salary : ");
			sal=scan.nextDouble();
			
			s[i]=new salary(id,n,d,sal);
			
		}
		
		System.out.println("The Employees with salary >20000 are as follows :  ");
		
		for(i=0;i<count;i++)
		{
			if(s[i].msalary >= 20000)
			{
				s[i].display();
			}
		}
		
		
	}

}





