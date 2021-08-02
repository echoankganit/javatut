//Enter any number: 12548796
//The sum of digits is: 42

import java.util.Scanner;
class SumDigits{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num, rem, sum=0;
        System.out.print("Enter any number: ");
        num = sc.nextInt();

        while(num>0){
            rem = num%10;
            sum = sum+rem;
            num = num/10;
        }
        System.out.print("The sum of digits is: "+sum);
    }
}