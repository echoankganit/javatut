import java.util.Scanner;
//import static java.lang.Math.*;
class ExPg11{
	public static void main (String [] args){
		int num1, num2, num3, cubes;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		num1 = sc.nextInt();
		System.out.print("Enter Second Number: ");
		num2 = sc.nextInt();
		System.out.print("Enter Third Number: ");
		num3 = sc.nextInt();
		cubes = (num1*num1*num1)+(num2*num2*num2)+(num3*num3*num3);
		//cubes = pow(num1,3)+pow(num2,3)+pow(num3,3);
		System.out.print("The sum of "+num1+", "+num2+" and "+num3+" is : "+cubes);
	}
}