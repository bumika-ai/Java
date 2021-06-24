/*Program to find greatest of two numbers*/
import java.util.*;
public class Greatest_of_Two {
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the two numbers to find greatest of two");
		int a=in.nextInt();
		int b=in.nextInt();
		if (a>b)
			System.out.println(a+ " is greater");
		else
			System.out.println(b+" is greater");
		in.close();
	}

}
