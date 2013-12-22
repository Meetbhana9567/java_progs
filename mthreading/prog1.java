//when a program starts a execution
  //sau thi pehla ek thread run thaaye : main thread
  //ane pachi user created jetla pan threads hoye a generate thaaye as achild thread 
  //so badha threads JAVA ma a main thread na childs hoye
  //main thread sau thi last end thavo joiye
  //coz a badhi shutdown processes kare!
  
//so sau thi pehla : controlling the main thread

public class prog1 { 

  public static void main(String args[])
  { 
    //currentThread() function
      //static function of the class Thread
      //..je current running thread nu reference return kare
      
      Thread t = Thread.currentThread();
      
      System.out.println("Hamna kayo thread run thaaye che : " + t);
      
      t.setName("jdThread");
      
      System.out.println("Main thread nu name change karya pachi : " + t);
      
      System.out.println("Now lets set priority to 10!");
      
      t.setPriority(10);
      
      System.out.println("So thread details : " + t);
      
      System.out.println("Sleep function of thread...");
      
      try { 
      	int i = 1;
      	System.out.print("Here it goes the 5 seconds : ");
      	for (;i<=5 ; i++)
      	{
      	System.out.print(" " + i);
      	Thread.sleep(1000);
      	}
      }
      catch(InterruptedException e)
      {
        //aa sleep() function maate try-catch exception mechanism lakhvuj pade 
        	//coz je thread supose interrupt thaaye to pachi ema sleep apply j na thaaye
        System.out.println("tamaro thread end thai gayo che ;)");
      }
      finally { System.out.println();
      }
      	
      
    }
    
  }
