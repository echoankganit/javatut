/*
if else program
Marksheet
*/
import java.util.Scanner;
class Grade{
	public static void main (String [] args){
		int marks1, marks2, marks3; //variables
		final int totmarks = 300; //constant
		float permarks;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Marks of 1st subject: ");
		marks1 = sc.nextInt();
		System.out.print("Enter Marks of 2nd subject: ");
		marks2 = sc.nextInt();
		System.out.print("Enter Marks of 3rd subject: ");
		marks3 = sc.nextInt();
		permarks = ((float)(marks1+marks2+marks3)/totmarks)*100;
		System.out.println("Your percentage is: "+permarks+"%");
		
		if(permarks>90)
			System.out.println("You got A Grade.");
		else if(permarks>80 && permarks<=90)
			System.out.println("You got B Grade.");
		else if(permarks>70 && permarks<=80)
			System.out.println("You got C Grade.");
		else if(permarks>60 && permarks<=70)
			System.out.println("You got D Grade.");
		else if(permarks>50 && permarks<=60)
			System.out.println("You got E Grade.");
		else{
			System.out.println("You got F Grade.");
			System.out.println("Failed.");
		}	
	}
}