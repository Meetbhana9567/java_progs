/* 

	inheritance : intro -> method overriding -> 'final' keyword -> reference objects -> 'super' keyword

	polymorphism : dynamic method dispatch
	
*/

class piece { 

public String mov;

piece() { 
mov="No move defined";
}

public void move() {
 System.out.println(mov);
 }
 
protected void printhi()
{
System.out.println("Hi");
}
 
}

class pawn extends piece {

pawn() { 
mov = "Move 1 or 2 blocks";
}

public void move() { 
System.out.println("I'm Pawn and I move 1 or 2 Blocks");
printhi();
super.printhi();
}

protected void printhi()
{
System.out.println("Hello");
}

}

class bishop extends piece { 
bishop() {
mov = "Moves diagonal only";
}

}

class queen extends piece { 

queen() { 
mov = "Every way the straight and diagnol";
}

}

public class inheritance{ 
  public static void main(String a[])
    {
    piece p1 = new pawn();
    p1.move();
    }
}





