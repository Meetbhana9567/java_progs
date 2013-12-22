import mypackage.*;
//as we have created a file and placed it into a package 
//name so... we need to import it to use it...

public class test { 
  public static void main(String args[])
{
mypack hi = new mypack();
//non-static members so needs for creation of object...

//observe the member-function calls... below...

hi.print("Enter an Integer : ");
int a = hi.accepti();

hi.print("Enter a Float : ");
float b = hi.acceptf();

hi.print("Enter a String : ");
String c = hi.accepts();
//note here it'll accept only the continious string and 
//when separated by white spaces it will ignore the rest
//eg. try with inputs "helloworld" and "hello world"

hi.print("The Integer is " + a + " float is : " + b + " and String is : " + c);

return;

}

}

