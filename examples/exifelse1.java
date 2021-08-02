//Positive negative number if else
import java.util.Scanner;
//import static java.lang.Math.*;
class ExIfElse1{
	public static void main (String [] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		num = sc.nextInt();
		
		if(num==0)
			System.out.print("Neither positive nor negative.");
		else if(num>0)
			System.out.print("Positive Number.");
		else
			System.out.print("Negative Number.");
	}
}