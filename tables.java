//Table of any number.
import java.util.Scanner;
class Tables{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter any number: ");
		num = sc.nextInt();
		for(int i=1; i<=20; i++){
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
}