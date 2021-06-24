/* a program that automatically prints the solution to the FizzBuzz game*/
import java.util.Scanner;
public class FizzBuzz {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter where the number to be printed ");
		int size=in.nextInt();
		for(int i=1;i<=size;i++) {
			if(i%3==0  && i%5==0)
				System.out.print("FizzBuzz");
				else if (i%3==0)
					System.out.println("Fizz");
				else if (i%5==0)
					System.out.println("Buzz");
			else System.out.println(i);}
		in.close();
	}
}

