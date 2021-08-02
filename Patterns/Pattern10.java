/*
   *****
  *****
 *****
*****
*/
class Pattern10{
	public static void main (String []args){
		int rows=4;
		int cols=2*rows;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=cols;j++){
				if(j>=rows-i+1&&j<=cols+1-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
            System.out.println(" ");
		}
    }
}	
				   