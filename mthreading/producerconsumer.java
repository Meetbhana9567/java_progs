//implementation of producer consumer problem : JAVA

class Q {
  int n;
  boolean valueSet = false;
  
  synchronized int get() { 
    while(!valueSet)
      try{
        wait();
      } catch(Exception e) {}
    System.out.println("Got : " + n );
    valueSet = false;
    notify();
    return n;
  }
  
  synchronized void put(int n) { 
    while(valueSet)
      try{
        wait();
      } catch(Exception e) {}
    this.n = n;
    valueSet = true;
    System.out.println("Put : " + n );
    notify();
  }
  
}

class producer implements Runnable { 
  Q q;
  producer(Q q) { 
    this.q = q;
    new Thread(this,"producer").start();
  }
  
  public void run() { 
    int i=0;
    while(true) { 
      q.put(i++); 
        try{ 
      Thread.sleep(1000); } catch(InterruptedException e) {}
    }
  }
}

class consumer implements Runnable { 
  Q q;
  consumer(Q q) { 
    this.q = q;
    new Thread(this,"consumer").start();
  }
  
  public void run() { 
    while(true)
    {
      q.get();
      try{ 
      Thread.sleep(1000); } catch(InterruptedException e) {}
    }
  }
}

class producerconsumer { 
  public static void main(String args[])
    {
    Q q = new Q();
    
    new producer(q);
    new consumer(q);
    
    System.out.println("Press Ctrl-c to exit");
    }
  }
  
  
  
  
  
  
