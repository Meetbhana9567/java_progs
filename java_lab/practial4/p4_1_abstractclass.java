abstract class vegetable{
String name,color;

abstract public String toString();
abstract public void printname();

}

class tomato extends vegetable {

tomato() { 
name="tomato";
color="red";
}

public String toString()
{
return color;
}

public void printname()
{
System.out.println("This is : " + name);
}

}

class brinjal extends vegetable {

brinjal() {
name="brinjal";
color="violet";
}

public String toString()
{
return color;
}

public void printname()
{
System.out.println("This is : " + name);
}

}

class potato extends vegetable { 

potato() { 
name="potato";
color="yellow";
}

public String toString()
{
return color;
}

public void printname()
{
System.out.println("This is : " + name);
}

}


public class p4_1_abstractclass { 

  public static void main(String args[])

  {
    vegetable v = new potato();

    v.printname();
    System.out.println("The color is : " + v.toString() );

    v = new brinjal();
    v.printname();
    System.out.println("The color is : " + v.toString() );

    v = new tomato();
    v.printname();
    System.out.println("The color is : " + v.toString() );

  }


}
