//HCF by While loop
/*
Enter first number: 36
Enter second number: 24
HCF of 36 and 24 is: 12
*/
import java.util.Scanner;
class HCF{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1, num2, i=1, hcf=1;
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        while(i<=num1 && i<=num2){
            if(num1%i==0 && num2%i==0){
                hcf = i;
            }
            i++;
        }
        System.out.print("HCF of "+num1+" and "+num2+" is: "+hcf);
    }
}