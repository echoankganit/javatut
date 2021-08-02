//Print even number less than given number.
import java.util.Scanner;
class Even{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter any number: ");
		num = sc.nextInt();
		System.out.println("Even Numbers: ");
		for(int i=2; i<=num; i=i+2){
			System.out.print(i+" ");
		}
		System.out.println("\nOdd Numbers: ");
		for(int i=1; i<=num; i=i+2){
			System.out.print(i+" ");
		}
	}
}