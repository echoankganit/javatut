class Pattern11{
	public static void main (String []args){
		int rows=5;
		int cols=rows;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=cols;j++){
				if(j==i || j==6-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
            System.out.println(" ");
		}
    }
}	
				   