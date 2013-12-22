//generic data type | generic class | generic method | generic construtor | generic interface

interface myinterf<t> { 

public void getType();
public void setValue(t val);

}

class myclass<t> implements myinterf<t> { 
	t data;
	
	myclass() { }
	myclass(t ob) { 
	data = ob;
	}

	public void getType() { 
	System.out.println( data.getClass().getName() );
	}
		
	public void displayValue() {  
	System.out.println( data ) ;
	}
	
	public void display() { 
	displayValue();
	getType();
	}
	
	public void setValue(t val) { 
	data = val;
	}
	
}
	
public class prog1 { 

	public static void main(String s[]) { 
	
	myclass<Integer> obj = new myclass<Integer>();
	
	obj.setValue(23);
	
	myclass<Double> obj2 = new myclass<Double>(28.774);
	
	obj.display();
	obj2.display();
	
	}
}
