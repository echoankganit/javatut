//Enter any number: 12548796
//The number of digits are: 8

import java.util.Scanner;
class CountDigits{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num, c=0, rem;
        System.out.print("Enter any number: ");
        num = sc.nextInt();

        while(num>0){
            rem = num%10;
            c++;
            num = num/10;
        }
        System.out.println("The number of digits are: "+c);
    }
}