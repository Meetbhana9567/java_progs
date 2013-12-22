package practical3;

abstract class account{
	int balance,acNumber;
	String name,addrs;
	
	account(){}
	
	account(int bal,int num,String name,String adrs)
	{
		balance = bal;
		acNumber=num;
		this.name=name;
		addrs=adrs;
	}
	
	abstract public void withdraw(int amt);
	abstract public void deposit(int amt);
	
	public void display()
	{
		System.out.println("AcNumber : " + acNumber + " Balance : " + balance);
	}
}

class savingsAccount extends account{
	
	int rateofInterest;
	
	savingsAccount(int bal,int num,String name,String adrs,int roi)
	{
		super(bal,num,name,adrs);
		rateofInterest=roi;
	}
	
	void calculateAmount()
	{
		balance += ((balance*rateofInterest*1)/100);
	}
	
	public void display()
	{
		calculateAmount();
		super.display();
		System.out.println("Also the applied rate of Interest is : " + rateofInterest);
	}

	public void deposit(int amt) {
		balance += amt;
	}

	public void withdraw(int amt) {
		balance -= amt;
	}	
}

class currentAccount extends account{
	
	int overDraftLimit;
	
	currentAccount(int bal,int num,String name,String adrs,int odl)
	{
		super(bal,num,name,adrs);
		overDraftLimit=odl;
	}

	public void deposit(int amt) { balance+=amt; }
	public void withdraw(int amt) {balance-=amt; }
	
	public void display()
	{
		super.display();
		System.out.println("The OverDraft Limit is : " + overDraftLimit);
	}
}

public class p3_4abstractaccounts {
	
	public static void main(String args[])
	{
		savingsAccount s1 = new savingsAccount(12000,163,"JayDihenkar","Valsad",12);
		currentAccount c1 = new currentAccount(4500,164,"JayDihenkar","Valsad",8);
		
		s1.display();
		c1.display();
		
		s1.deposit(1000);
		c1.withdraw(1000);
		
		s1.display();
		c1.display();
		
		
	}

}
