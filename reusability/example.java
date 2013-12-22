//nothing to import...
//as it is the public class and present in the directory in which 
//we're to compile the code...

public class example { 
public static void main(String args[]) { 

int a;
String mystr;

direct hi = new direct();
//as all the member-functions of the class are 
//non-static we need to create an object to use it's members

hi.print("heii... Hie\n"); //print function of the class called...
hi.print("\nEnter an Integer : ");
a = hi.geti(); //function for accepting the int is called

hi.print("The integer you entered is : " + a + "\n");

}

}
