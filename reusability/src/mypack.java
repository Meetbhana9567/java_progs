package mypackage;
//the first is the package declaration....
//now that the class has package name "mypackage"...
//to use this file it needs to be present in only "mypackage" folder
//else there will be an error of misplacement of class file...

import java.util.Scanner;
//after declaration is done the task of importing...
//if you'll do it otherwise you'll get an error...

public class mypack{

Scanner scan = null;
//good practice to do so...as first creating the reference...

public mypack() { 
scan = new Scanner(System.in);
//allocating memory to the "scan"  object as soon as the 
//class object is created...
}

public void print(String var) { 
System.out.println(var);
//printing function with terminating with "\n" 
//if you dont want it to terminate then use "System.out.print()
}

public String accepts() {
return scan.next();
//string accepting function
}

public int accepti() { 
return scan.nextInt();
//integer accepting function
}

public float acceptf() { 
return scan.nextFloat();
//float accepting function
}

public double acceptd() { 
return scan.nextDouble();
//double accepting function
}

}

