//Ques 42 Page 44
//Use decimal values of ASCII table.
import java.util.Scanner;
class Ques142{
	public static void main(String[] args){
		char ch;
		int ch_num;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter any character: ");
		ch = sc.next().charAt(0);
		ch_num = ch;
		
		if((ch_num>=65 && ch_num<=90) || (ch_num>=97 && ch_num<=122))
			System.out.print(ch+" a alphabet.");
		else if(ch_num>=48 && ch_num<=57)
			System.out.print(ch+" a digit.");
		else
			System.out.print(ch+" is a special character.");
		
	}
}