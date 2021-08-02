import java.util.Scanner;
class PrimeNum{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num, flag=0;
        System.out.print("Enter any number to check for prime: ");
        num = sc.nextInt();
        for(int i=2 ; i<num ; i++){
            if(num%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.print(num+" is a prime number.");
        else
            System.out.print(num+" is not a prime number.");
    }
}