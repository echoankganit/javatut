/*Program 1.4
Page 16 
if else program
WAP that accepts a number in the range of 1-99 and then display if the entered number is single digit or double digit. */
import java.util.Scanner;
class ExPg14{
	public static void main (String [] args){
		int total_classes, attended;
		float attendance;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter total number of classes: ");
		total_classes = sc.nextInt();
		System.out.print("Please enter number of days student took class: ");
		attended = sc.nextInt();
		attendance = ((float)attended/total_classes)*100;
		System.out.println("Total number of days student came in Percentage: "+attendance+"%");
		
		if(attendance >= 75.0){
			System.out.print("Yes. He/She can gave the exam.");
		}
		else{
			System.out.print("No. He/She can't gave the exam.");
		}
	}
}