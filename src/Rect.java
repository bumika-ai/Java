/*To display area, perimeter or diagonal of a rectangle as per User's choice*/
import java.util.*;
public class Rect {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1 for Area");
		System.out.println("2 for Perimeter");
		System.out.println("3 for Diagonal");
		int ch=in.nextInt();
		System.out.println("Enter the length and breadth of rectangle");
		int a=in.nextInt();
		int b=in.nextInt();
		int ar,per;
		double dia;
		switch(ch) {
		case 1:ar=a*b;
		System.out.println("The area of rectangle of length "+a+"and breadth "+b+"is "+ar);
		break;
		case 2:per=2*(a+b);
		System.out.println("The perimeter of rectangle of length "+a+"and breadth "+b+"is "+per);
		break;
		case 3:dia=Math.sqrt(a*a+b*b);
		System.out.println("The diagonal of rectangle of length "+a+"and breadth "+b+"is "+dia);
		break;
		default:
			System.out.println("Enter correct choice");
		}
		in.close();
	}
}