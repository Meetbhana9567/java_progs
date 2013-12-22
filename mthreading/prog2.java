//thread banav vani 2 methods : 
	//1. Implementing the 'Runnable' Interface  <-- Illustrated in this program
	//2. Extending the 'Thread' class
	
    //1. Implementing 'Runnable' interface
      //aa interface ni abstract methods implement karvani
        // methods : 
          // public void run() : aama a code lakhvano je execute karvu hoye
          	//thread end thai jaaye jyare run method mathi return thaavo
        // create thread : object Banav vano thread no as...
        	//Thread(Runnable threadOb, String threadname);
        // run karav va maate : 
        	//Thread ni start method call karav vi pade
        	//threadOb.start();
        	//je in short run() nu execution start kare
        	
class mythread implements Runnable { 

	Thread curr;

	public void run()
	{
	//place line by line the executable code
	System.out.println("Getting thread name!");
	
	try {
	Thread.sleep(200);
	curr = Thread.currentThread();
	}
	catch(InterruptedException e) {
	//blank 
	}
	
	System.out.println("This is the run() begin of thread " + curr.getName() );
	
	System.out.println("Now here kaik kaam kariye!");
	
	System.out.println("Lets print 1 -> 5 : ");
	try{
	int i=1;
	for(;i<=5;i+=1)
	{
	  Thread.sleep(1000);
	  curr = Thread.currentThread();
	  System.out.println("Printing thread : " + curr.getName() + "\tNumber : " + i);
	}
	}
	catch(InterruptedException e) {
	//blank }
	
	System.out.println("Finally thread : " + curr.getName() + " ends its execution!");
	}
	
	System.out.println("Kaam puru now Bye End kariye! ;)");
	}
}

public class prog2 { 
  public static void main(String args[])
  {
    mythread object = new mythread();
    Thread t1 = new Thread(object,a"jdthread");
    
    t1.start();
    
    //bijo ek thread banaviye : mulithreading che ne! :O ;)
    
    Thread t2 = new Thread(object,"jepanhoye");
    
    t2.start();
    
   }
   
}
