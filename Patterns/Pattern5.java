/*
    *
   ***    
  *****   
 *******  
********* 
*/
class Pattern5{
    public static void main(String args[]){
        int rows=5;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=(2*rows-1); j++){
                if(rows+1-i<=j && j<=rows-1+i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}