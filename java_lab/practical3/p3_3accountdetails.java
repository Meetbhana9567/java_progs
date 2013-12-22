package practical3;

import java.util.*;

class college{
	String cname,addrs;
	
	college(){}
	
	college(String name,String adrs)
	{
		cname = name;
		addrs = adrs;
	}
	
	public void showCollegeDetails()
	{
		System.out.println("College : Name : " + cname + " address : " + addrs);
	}
}

class department extends college
{
	String dname,hodname;
	
	department(){}
	
	department(String colname,String adrs,String name,String hod)
	{
		super(colname,adrs);
		dname=name;
		hodname=hod;
	}
	
	public void showDepartmentDetails()
	{
		System.out.println("The department is of College : ");
		super.showCollegeDetails();
		System.out.println("Deppartment Details : ");
		System.out.println(" Name : " + dname + " HOD : " + hodname);
	}
}

class facultyMember extends department{
	String name,qualif;
	int years;
	
	facultyMember(){}
	
	facultyMember(String col,String cadrs, String dept,String hod,String fname,String qual,int yrs)
	{
		super(col,cadrs,dept,hod);
		name=fname;
		qualif=qual;
		years=yrs;
	}
	
	public void showFacultyDetails()
	{
		System.out.println("The faculty College and dept details are as : ");
		super.showDepartmentDetails();
		
		System.out.println("The Faculty Details are : ");
		System.out.println("Name : " + name + " Qualification : " + qualif + " Experience : "+years);
	}
}


public class p3_3accountdetails {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter college name : ");
		String cnaam=scan.next();
		System.out.println("Address? : ");
		String cadrs=scan.next();
		System.out.println("Department? : ");
		String dept=scan.next();
		System.out.println("HOD? : ");
		String hod=scan.next();
		System.out.println("Your Name? : ");
		String name=scan.next();
		System.out.println("Qualification? : ");
		String qual=scan.next();
		System.out.println("Experience? : ");
		int yrs=scan.nextInt();
		facultyMember member = new facultyMember(cnaam,cadrs,dept,hod,name,qual,yrs);
		member.showFacultyDetails();
	}

}
