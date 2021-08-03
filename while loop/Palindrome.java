/*
Enter the number: 12569
After reversing the digits: 96521
12569 is not a palindrome number.
*/

import java.util.Scanner;
class Palindrome{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num, rem, num1=0, temp;
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        temp=num;

        while(num>0){
            rem = num%10;
            num1 = num1*10 + rem;
            num = num/10;
        }
        System.out.println("After reversing the digits: "+num1);

        if(temp == num1)
            System.out.print(temp+" is a palindrome number.");
        else
            System.out.print(temp+" is not a palindrome number.");
    }
}