//Enter any number: 12548
//After reversing the digits: 84521

import java.util.Scanner;
class ReverseDigits{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num, rem, num1=0;
        System.out.print("Enter any number: ");
        num = sc.nextInt();

        while(num>0){
            rem = num%10;
            num1 = num1*10 + rem;
            num = num/10;
        }
        System.out.print("After reversing the digits: "+num1);
    }
}