
/*Programs using if-else-if ladder*/
/*program that interprets the Body Mass Index (BMI) based on a user's weight and height.*/
import java.util.*;
public class Bmi_calculator {
	public static void main(String args[]) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter your height in m:");
	float height=in.nextFloat();
	System.out.println("Enter your weight in kg: ");
	float weight=in.nextFloat();
	float BMI_weight=(float) (weight/(Math.pow(height, 2)));
	double BMI=Math.ceil(BMI_weight);
	if (BMI<18.5){
		System.out.println("Your BMI is" +BMI +", you are underweight.");}
	else if (BMI>18.5 && BMI<25){
		System.out.println("Your BMI is" +BMI+ ", you have a normal weight.");}
	else if (BMI>25 && BMI<30){
		System.out.println("Your BMI is" +BMI+ ", you are slightly overweight.");}
	else if (BMI>30 && BMI<35){
		System.out.println("Your BMI is" +BMI +", you are obese.");}
	else {
		System.out.println("Your BMI is" +BMI+ ", you are clinically obese.");
	}
	in.close();

}
}