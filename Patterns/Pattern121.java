/*
Different for n=7 and n=8.
*
**
***
****
****
***
**
*
*/
class Pattern121{
    public static void main(String args[]){
        int rows=8, k=0;
		int cols=(rows+1)/2;
		
        for(int i=1; i<=rows; i++){
			if(rows%2==0){
				if(i<=cols)
					k++;
				else if(i>cols+1)
					k--;
			}
			else{
				if(i<=cols)
					k++;
				else
					k--;
			}
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