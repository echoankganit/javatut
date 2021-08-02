/*
Same for n=7 and n=8.
*
**
***
****
***
**
*
*/
class Pattern12{
    public static void main(String args[]){
        int rows=7, k=0;
		int cols=(rows+1)/2;
		
        for(int i=1; i<=rows; i++){
			if(i<=cols)
				k++;
			else
				k--;
			for(int j=1; j<=cols; j++){
				if(j<=k)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println(" ");
        }
    }
}