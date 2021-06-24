import java.util.*;
public class Hello 
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=in.nextLine();
		if(name.equalsIgnoreCase("john"))
		{
				System.out.println("Hello John");
		}
				in.close();
	}
}

