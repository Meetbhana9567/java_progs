package practical1;

public class p5arrayduplicateelem {
	
	public static void main(String[] args)
	{
		int a[] = { 22, 63, 74, 28, 31, 22};
		int i,j;
		for(i=0;i<(a.length)-1;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print("Duplicate Exists!");
					return;
				}
			}
		}
			System.out.print("no Duplicates!");
	}	
}
