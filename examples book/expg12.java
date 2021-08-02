/*Program 1.2 
Page 15 
if and else program
WAP that accepts a number in the range of 1-99 and then display if the entered number is single digit or double digit. */
import java.util.Scanner;
class ExPg12{
	public static void main (String [] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number between 1 and 99: ");
		num = sc.nextInt();
		if(num>0 && num<10){
			System.out.print("The number is single digit.");
		}
		else{
			System.out.print("The number is double digit.");
		}
	}
}