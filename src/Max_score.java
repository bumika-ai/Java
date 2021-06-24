

/*program that calculates the highest score from an array of scores.*/
import java.util.*;
public class Max_score {
	public static void main(String args[]) {
		Scanner in=new Scanner(System.in);
		int max=0;
		System.out.println("Enter the num of students");
		int size=in.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the score of "+size+" Students");
		for(int i=0;i<size;i++) {
			arr[i]=in.nextInt();
			if (arr[i]>max)
			max=arr[i];
		}
		System.out.println("The maximum score: "+max);
		in.close();
	}
}