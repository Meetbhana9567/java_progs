//throw kai rite karvu eni illustration
	//throw , rethrow and nested try-catch illustration with finally!!

//je throw karvu hoye eni type Throwable hovi joiye...
	//eno ek throwable instance banavi ne throw karvanu and a catch thai jaaye

public class prog2 {
 public static void main(String args[])
 {
 
 try { 
 throw new ArithmeticException("ArithExcep");
 }
 
 catch(ArithmeticException e) {
 System.out.println("Arithmetic Exception tame generate k throw karyu?\nAns : " + e );
 System.out.println("Have ej exception ne fari throw kariye ;) and...");
 System.out.println("General exception ma catch karaviye.. kem? : Maja ave atle! hahaha :D");
  try { throw e;
  }
  catch(Exception e1) { 
 System.out.println("Pakdaai gayu second time phekhyu ema b");
 System.out.println("Exception : " + e1);
 }
 finally { 
 System.out.println("Aa bracket na aandar nu nested nu finally che...");
 System.out.println("... jo exception rethrow thayu hase toj print thase!");
 }
 
 }
 
 finally { 
 System.out.println("Aaa to Darr wakhate print thasej tame kai pan karo! ");
 }
 
 
 }
}
