
/*Program to check whether the number entered by the user is even or odd*/
import java.util.Scanner;
public class EvenOdd {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a num ");
		int num=in.nextInt();
		if(num%2==0) {
			System.out.println(num+" is Even");
			}
		else {
			System.out.println(num+" is Odd");
		}
		in.close();
	}
	

}