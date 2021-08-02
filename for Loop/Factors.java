//Factors by for loop
import java.util.Scanner;
class Factors{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n, fact=1;
		System.out.print("Enter any number: ");
		n = sc.nextInt();
		
		System.out.print("Factors of "+n+" are: ");
		for(int i=1; i<=n; i++){
			if(n%i==0){
				System.out.print(i+" ");
			}
		}
	}
}