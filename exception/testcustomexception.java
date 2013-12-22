class jdexception extends Exception
{
  int value;

jdexception(int val) { 
value = val;
}
  
  public String toString(){ 
return ("jdException Caught for value " + value + " !");
}

}

public class testcustomexception { 

static void checkval(int val) throws jdexception
{
  if(val<=9 && val>=0) { 
    System.out.println("Normal Exit!");
}
else { 
  throw new jdexception(val);
}
}

public static void main(String args[])
{
int a1 = 5;
int a2 = 25;
try{
checkval(a1);
checkval(a2);
}

catch(jdexception e) { 
System.out.println("Caught exception : " + e);
}

}

}
