//Step by step program Factorial by for loop
import java.util.Scanner;
class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, fact=1;
		System.out.print("Enter any number: ");
		n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
		//for(int i=n; i>=1; i--){
			System.out.print("Step "+i);
			fact=fact*i;
			System.out.println(" Factorial Value: "+fact);
		}
		System.out.print("The factorial of "+n+" is: "+fact); 
	}
}