import java.util.Scanner;
class EvenNum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter any number: ");
		n = sc.nextInt();
		
		for(int i=n; i<n+20; i+=2)
			System.out.println(i+2);
	}
}