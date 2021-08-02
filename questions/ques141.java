//Ques 41 Page 44

import java.util.Scanner;
class Ques141{
	public static void main(String[] args){
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter any character: ");
		ch = sc.next().charAt(0);
		
		if(ch>='A' && ch<='Z')
			System.out.print(ch+" is in uppercase");
		else if(ch>='a' && ch<='z')
			System.out.print(ch+" is in lowecase");
		else
			System.out.print("Invalid character");
	}
}