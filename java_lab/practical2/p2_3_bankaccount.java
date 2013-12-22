package practical2;
import java.util.Scanner;

class account {
	int number,balance;
	String type,name;
	
	account()
	{
		number = 0;
		balance = 500;
		type = "Svings";
		name = "XYZ";
	}
	
	void deposit()
	{
		System.out.print("Enter the amount : ");
		Scanner scan = new Scanner(System.in);
		int temp = scan.nextInt();
		balance+=temp;
		System.out.print("The latest acoount balance is : " + balance );
	}
	
	void withdraw()
	{
		System.out.print("Enter the amount : ");
		Scanner scan = new Scanner(System.in);
		int temp = scan.nextInt();
		balance-=temp;
		System.out.print("The latest acoount balance is : " + balance );
	}
	void display()
	{
		System.out.print("Name : " + name + "  Balance : " + balance);
	}
}
public class p2_3_bankaccount {
	
	public static void main(String[] args)
	{
		account ac = new account();
		System.out.print("Menu : - " );
		System.out.print("1. Make Deposit!\n2. Withdrawal!\n3. Display Detail!");
		System.out.print("Enter choice : ");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		
		switch(choice)
		{
			case 1 : { ac.deposit();
			}
			case 2 : { ac.withdraw();
			}
			case 3 : { ac.display();
			}
		}
	return;
	
		
	}
	

}
