// throws su che ane shena maate use thaaye
	//throws jyare koi method exception throw kari shaktu hoye..
	//..to pehla thij specify karvu pade k aa specific method exception throw karse
	
	//ena maate "throws" use thaaye!
	
//use kai rite karvu... 
	//method declaration wakhate specify karvu pade k a kayu exception generate kari sake che
	//...ane then jo a throw kare to catch kari shakai che using the mechanism of throws!
	
class myclass { 

static void problem(int param) throws ArithmeticException,NullPointerException,IllegalAccessException {
	if(param == 1)
	{
	throw new ArithmeticException("ArithExcep");
	}
	if(param == 2)
	{
	throw new NullPointerException("NullPointExcep");
	}
	if(param == 3)
	{
	throw new IllegalAccessException("IllegExcep");
	}

}

}

public class prog3 { 
 public static void main(String args[])
 {
 try {
  myclass.problem(2);
  }
  
  catch(Exception e)
  {
  System.out.println("You Have generated an : " + e);
  }
  
  finally { 
  System.out.println("Bas have bou thayi Ramat karo cho kyaar na exception ni!");
  System.out.println("Topic Closed ------------------");
  }
  
  }
  
 }
  









