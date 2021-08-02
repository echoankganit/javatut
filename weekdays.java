//Weekdays
//if, else-if, else
import java.util.Scanner;
//import static java.lang.Math.*;
class WeekDays{
	public static void main (String [] args){
		int weeknum;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number (1 to 7): ");
		weeknum = sc.nextInt();
		if(weeknum==1)
			System.out.print("Monday");
		else if(weeknum==2)
			System.out.print("Tuesday");
		else if(weeknum==3)
			System.out.print("Wednesday");
		else if(weeknum==4)
			System.out.print("Thursday");
		else if(weeknum==5)
			System.out.print("Friday");
		else if(weeknum==6)
			System.out.print("Saturday");
		else if(weeknum==7)
			System.out.print("Sunday");
		else
			System.out.print("Wrong input");
	}
}