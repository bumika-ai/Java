
import java.util.*;
public class Game {
public static void main(String args[]){
Scanner in=new Scanner(System.in);
System.out.println("Welcome to Treasure Island.");
System.out.println("Your mission is to find the treasure.");
System.out.println("Enter  the direction u want to take ");
String direction=in.next();
String direct=direction.toLowerCase();
if (direct.equalsIgnoreCase("left")) {
	System.out.println("You want to swim or wait");
	String want_to_do=in.next();
	String want_to=want_to_do.toLowerCase();
	if (want_to.equalsIgnoreCase("wait")) 
	{
		System.out.println("Which color door");
		String col=in.next();
			String color=col.toLowerCase();
			if (color.equalsIgnoreCase("blue"))
				System.out.println("Eaten by beats game over");
				else if (color.equalsIgnoreCase("yellow"))
				System.out.println("You won");
				else if (color.equalsIgnoreCase("red"))
				System.out.println("Burned by fire.Game Over");
				else System.out.println("Game Over");
	}
	else System.out.println("Attacked by trout game over");}
else System.out.println("Fall into a hole.Game Over.");	
in.close();
}
}