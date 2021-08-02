//Ques 40 Page 44

import java.util.Scanner;
class Ques140{
	public static void main(String[] args){
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter any number: ");
		num = sc.nextInt();
		
		if(num%3==0 && num%5==0)
			System.out.print(num+" is multiple of 3 and 5.");
		else
			System.out.print(num+" is not a multiple of 3 and 5.");
	}
}