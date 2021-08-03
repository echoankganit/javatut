import java.util.Scanner;
class Factors{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1, i=1;
        System.out.print("Enter any number: ");
        num1 = sc.nextInt();

        while(i<=num1){
            if(num1%i==0){
                System.out.println(i);
            }
            i++;
        }
    }
}