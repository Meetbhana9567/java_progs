package practical1;
import java.util.*;
public class p6binsearch {
	
	public static void main(String[] args)
	{
		int a[]={22,31,40,62,82,99};
	    int i,j,length,t;
	    int low,high,key,mid;
	    length=a.length;
	    low=0;
	    high=length-1;
	    System.out.print("Enter the key :- ");
	    Scanner scan = new Scanner(System.in);
	    key=scan.nextInt();
	    while(low<=high)
	    {
	       mid=(low+high)/2;

	       if(a[mid]==key)
	       {
	           System.out.print("The value is fpund at location " + mid);
	           return;
	       }
	       if(a[mid]<key)
	       {
	           low=mid+1;
	       }
	       else{
	        high=mid-1;
	       }
	    }
	    System.out.println("Value not found!");
	    return;
	}

}
