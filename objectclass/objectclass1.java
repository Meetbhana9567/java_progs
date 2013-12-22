//this program is used to illustrated the Object Class in JAVA

class objecta { 

int data;

objecta() { data =0;
}

void setdata(int m) { data = m;
}

void display() { 
System.out.println("The data of A is : " + data);
}

}

class objectb extends objecta { 

  boolean equals(objectb ob)
  {
  return ((data == ob.data) ? true : false) ;
  }

}

class objectclass1 { 
  public static void main(String args[])
  {
    objecta ob1 = new objecta();
    ob1.setdata(32);
    ob1.display();
    
    objecta ob2 = new objecta();
    
    
    //the toString() method of the Object Class
    System.out.println(ob1.toString());
    
    //using equals() method
    System.out.println("Are ob1 and ob2 equal (using equals() )? : " + ob1.equals(ob2) );
    System.out.println("Are ob1 and ob2 equal (using operator )? : " + (ob1==ob2) );
    
    ob2=ob1;
    
    System.out.println("And now after setting value? " + ob1.equals(ob2) );
    System.out.println("Are ob1 and ob2 equal (using operator )? : " + (ob1==ob2) );
    
    //hence need to overwrite the equals() method...
      //this overriding is done in objectb class
      
      objectb ob3 = new objectb();
      ob3.setdata(33);
      
      objectb ob4 = new objectb();
      ob4.setdata(32);
      
      System.out.println("Are ob3 and ob4 equal (using equals() )? : " + ob3.equals(ob4) );
      System.out.println("Are ob3 and ob4 equal (using operator )? : " + (ob3==ob4) );
      
      //after setting the similar values : 
      ob4.setdata(33);
      
      System.out.println("And now after setting value? " + ob3.equals(ob4) );
      System.out.println("Are ob3 and ob4 equal (using operator )? : " + (ob3==ob4) );
    
    
  }
}





