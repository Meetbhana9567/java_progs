package practical1;
import java.util.Scanner;


public class p7matrixoperations {
	
	public static void main(String[] args)
	{
		
		Scanner accept = new Scanner(System.in);
	
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int sum[][] = new int[3][3];
	
	int i,j;
	
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]=accept.nextInt();
		}
	}
	
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			b[i][j]=accept.nextInt();
		}
	}
	System.out.println(" Menu : - ");
	System.out.println("1. Addition..\n2. Subtraction\n3. Multiplication");
	System.out.println("Enter your choice : ");
	
	int choice = accept.nextInt();
	 
	if(choice == 1 || choice == 2)
	{
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			if(choice==1)
			{
			sum[i][j]=a[i][j]+b[i][j];
			}
			else if (choice == 2)
			{
				sum[i][j]=a[i][j]-b[i][j];
			}
		}
	}
	}
	else if(choice == 3)
	{ int tsum,k;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				tsum=0;
				for(k=0;k<3;k++)
				{
					tsum+=a[i][k]*b[k][j];
				}
				sum[i][j]=tsum;
			}
		}
	}
	else
	{
		return;
	}
	System.out.println("The ans is :- ");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			System.out.print(sum[i][j]+"\t");
		}
		System.out.println();
	}
	}

}
