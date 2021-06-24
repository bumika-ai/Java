/*programs using for loop*/
/*program that calculates the average student height from an array of heights.*/
import java.util.Scanner;
public class Avg_height {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("Enter the num of students");
int size=in.nextInt();
int arr[]=new int[size];
int sum=0;
System.out.println("Enter the height of "+size+" Students");
for(int i=0;i<size;i++) {
	arr[i]=in.nextInt();
}
for(int i=0;i<size;i++) {
	sum=sum+arr[i];
}
float avg=sum/size;
System.out.println("The average student height from a array of heights: "+avg);
in.close();	

	}

}