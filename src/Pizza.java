
/*program to using switch*/
/*automatic pizza order program*/
import java.util.*;
public class Pizza {
public static void main(String args[]) {
Scanner in=new Scanner(System.in);
System.out.println("Welcome to Python Pizza Deliveries!");
System.out.println("What size pizza do you want? 1.Small, 2.Medium or 3.Large");
int size = in.nextInt();
int bill=0;
switch(size)
{
case 1:
	bill=15;
	break;
case 2:
	bill=20;
	break;
case 3:
	bill=25;
	break;
default:
System.out.println("Enter the correct choice");
}
System.out.println("Your final bill is: $"+bill);
in.close();
}
}