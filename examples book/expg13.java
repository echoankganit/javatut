/*Program 1.3
Page 16 
if, else if else program
WAP that accepts a number in the range of 1-99 and then display if the entered number is single digit or double digit. */
import java.util.Scanner;
class ExPg13{
	public static void main (String [] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number between 1 and 99: ");
		num = sc.nextInt();
		if(num>0 && num<10){
			System.out.print("The number is single digit.");
		}
		else if(num>=10 && num<100){
			System.out.print("The number is double digit.");
		}
		else{
			System.out.print("Out of limit.");
		}
	}
}