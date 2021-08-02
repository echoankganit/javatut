/*
Enter any number: 1221
After reversing the digits: 1221
1221 is a palindrome number.
*/

import java.util.Scanner;
class Palindrome{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num, rem, num1=0, temp;
        System.out.print("Enter any number: ");
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