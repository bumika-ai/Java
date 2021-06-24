/*Programs using if-else statement*/
/*Program to check whether the man is eligible for driving*/
import java.util.*;
public class Driving {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your age ");
		int age=in.nextInt();
		if(age>18) {
			System.out.println("You are eligible for driving");
			}
		else {
			System.out.println("You are not eligible for driving");
		}
		in.close();
	}
	

}