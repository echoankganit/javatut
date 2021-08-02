/*Program 1.5
Page 18
switch program
Area Calculation*/
import java.util.Scanner;
class ExPg15{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		int choice;
		System.out.println("Area Calculation");
		System.out.println("1. Triangle");
		System.out.println("2. Rectangle");
		System.out.println("3. Parallelogram");
		System.out.println("4. Circle");
		System.out.println("5. Exit");
		System.out.print("Enter your choice (1-5): ");
		
		choice = sc.nextInt();
		double base, height, length, breadth, radius, area;
		
		switch(choice){
			case 1: System.out.print("Enter value of base of triangle: ");
					base = sc.nextDouble(); 
					System.out.print("Enter value of height of triangle: ");
					height = sc.nextDouble();
					area = 0.2*base*height;
					System.out.print("The area of triangle is: "+area);
					break;
			case 2:
			case 3:
			case 4:
			case 5: System.out.print("Exiting....");
					break;
			default: System.out.print("Wrong choice.");
		}
	}
}