import java.util.*; // for the Scanner class...

public class direct { //public class so can be assesible everywhere

Scanner scan = null;
//its a neat practice to first declare the reference as null
//and then to allocate the memory at the time object is created
//i.e. in the constructor call....


public direct() { //constructor public so can be called when creating object
scan = new Scanner(System.in);
//here is the memory allocation done...
}

public void print(String all) { 
System.out.print(all);
//printing function...
}

public int geti() { 
return scan.nextInt();
//integer fetching function...
}

}
