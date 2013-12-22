//thread banav vani 2 methods : 
	//1. Implementing the 'Runnable' Interface
	//2. Extending the 'Thread' class  <-- Illustrated in this program
	
    //2. Extending the 'Thread' class
    	//create a new class that extends the 'Thread' class
    	//override the run()
    	//instantiate and call start()
    	
class mythread extends Thread {

	public void run()
	{
	
	char a[] = {'h','e','l','l','o',' ','w','o','r','l','d',' ','-','>',' ','j','d'} ;
	
	System.out.println("Lets print something.. nicely! :)");
	System.out.print("Our string goes here : ");
	
	try{
	int i;
	for(i=0;i<a.length;i++)
	{
	System.out.print(a[i]);
	Thread.sleep(250);
	}
	}
	
	catch(InterruptedException e)
	{
	//blank
	}
	
	System.out.println();
	
	}
}

public class prog3 { 
  public static void main(String args[])
  {
    Thread t1 = new mythread();
    
    t1.start();
  }
   
}
