//now concept of synchronization
  //atle k je pan badha common elements hoy amuk threads na maate
  //...ene kai rite access karav va mutually exclusively?!
  
//Solution : 'synchronized' keyword in JAVA
	// Two methods : 
	   // 1. Block Synchronization
	   // 2. Method Synchronization
	   
class worker { 

	synchronized static void printmsg(char a[])	//synchronized method
	{
	try {
	  for(int i=0;i<a.length;i++)
	  {
	  Thread.sleep(250);
	  System.out.print(a[i]);
	  }
	} catch(InterruptedException e) {
	/* blank */ }
	System.out.println();
	}
	
}

class worker1 { 

	void printmsg(char a[])	//synchronized method
	{
	try {
	  for(int i=0;i<a.length;i++)
	  {
	  Thread.sleep(250);
	  System.out.print(a[i]);
	  }
	} catch(InterruptedException e) {
	/* blank */ }
	System.out.println();
	}
	
}

class mythread extends Thread {

char msg[] = {'h','e','l','l','o',' ','w','o','r','l','d',' ','t','h','i','s',' ','i','s',' ','j','d'};
static worker1 w1ob = new worker1();

//worker wrk = new worker();

public void run() {
System.out.println("This is thread : " + this.getName() );
synchronized(w1ob) {
w1ob.printmsg(msg);
}

//wrk.printmsg(msg);

}

}

public class prog4 {
  public static void main(String args[])
  {
    mythread t1 = new mythread();
    mythread t2 = new mythread();
    
    t1.start();
    t2.start();
  }
}







