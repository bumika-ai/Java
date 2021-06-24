/*Programs using nested-if*/

/*program that works out whether if a given year is a leap year*/
import java.util.*;
public class Leap_year
{
public static void main(String args[])
{
	Scanner in=new Scanner(System.in);
	int year;
	System.out.println("Enter the year to check the leap year");
	year=in.nextInt();
	if (year%4==0) {
		if(year%100==0) {
			if(year%400==0){
				System.out.println("Leap year");}
			else System.out.println("Not leap year");}
		else System.out.println("Leap year");}
	else System.out.println("Not leap year");
	in.close();
	}
}