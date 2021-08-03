import java.util.Scanner;
class Armstrong{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num, rem, sum=0, temp;
        System.out.print("Enter any number: ");
        num = sc.nextInt();
        temp=num;

        while(num>0){
            rem = num%10;
            sum = sum+rem*rem*rem;
            num = num/10;
        }
        if(temp == sum)
            System.out.print(temp+" is an Armstrong number.");
        else
            System.out.print(temp+" is not an Armstrong number.");
    }
}