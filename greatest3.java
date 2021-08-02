//Greatest among 3 numbers
import java.util.Scanner;
//import static java.lang.Math.*;
class Greatest3{
	public static void main (String [] args){
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number number: ");
		num1 = sc.nextInt();
		System.out.print("Enter 2nd number number: ");
		num2 = sc.nextInt();
		System.out.print("Enter 3rd number number: ");
		num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3)
			System.out.print(num1+" is greatest.");
		else if(num2>num1 && num2>num3)
			System.out.print(num2+" is greatest.");
		else
			System.out.print(num3+" is greatest.");
	}
}