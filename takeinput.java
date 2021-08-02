import java.util.Scanner; //
class TakeInput{
	public static void main (String [] args){
		int a,b,c;
		Scanner sc = new Scanner(System.in); //
		System.out.print("Enter the first number: ");
		a = sc.nextInt(); //
		System.out.print("Enter the second number: ");
		b = sc.nextInt();
		c=a+b;
		System.out.println("The sum is: "+c);
	}
}