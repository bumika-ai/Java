/*Adding Evens*/
		import java.util.Scanner;
public class Adding_evens {
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
int num,sum=0,i=1;
System.out.println("Enter until where the even number should summed up");
		num=in.nextInt();
		while(i<=num) {
			if(i%2==0) {
					sum=sum+i;}
		i++;}
System.out.println("The sum of "+num+" Even numbers is: "+sum);
in.close();
}
}