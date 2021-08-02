/*
if else program
To check for even and odd.
*/
import java.util.Scanner;
class EvenOdd{
	public static void main (String [] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number to check for even/odd: ");
		num = sc.nextInt();
		if(num%2==0)
			System.out.println(num+" is even number.");
		else
			System.out.println(num+" is odd number.");
	}
}