import java.util.Scanner;
class SumNatural{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num, sum1=0;
        System.out.print("Enter any number: ");
        num = sc.nextInt();
        for(int i=1; i<=num; i++){
            sum1=sum1+i;
        }
        System.out.print("The final sum is: "+sum1);
    }
}