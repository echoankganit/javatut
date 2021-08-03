//HCF by for loop
/*
Enter first number: 25
Enter second number: 35
HCF of 25 and 35 is: 5
*/
import java.util.Scanner;
class HCF{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1, num2, hcf=1;
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        for(int i=1;i<=num1 && i<=num2;i++){
            if(num1%i==0 && num2%i==0)
                hcf = i;
        }
        System.out.print("HCF of "+num1+" and "+num2+" is: "+hcf);
    }
}