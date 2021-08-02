//Increment/Decrement Operators
class IDOperators{
	public static void main (String [] args){
		System.out.println("POSTFIX");
		//POSTFIX
		int a=6, c=0;
		System.out.println("Original Value of a is: "+a);
		System.out.println("Original Value of c is: "+c);
		c = a++;
		System.out.println("Value of a is: "+a);
		System.out.println("Value of c is: "+c);
		System.out.println("------------------------------------------------");
		
		int b=10, d=0;
		System.out.println("Original Value of b is: "+b);
		System.out.println("Original Value of d is: "+d);
		d = b--;
		System.out.println("Value of b is: "+b);
		System.out.println("Value of d is: "+d);
		System.out.println("------------------------------------------------");
		
		System.out.println("PREFIX");
		//PREFIX
		a=6;
		c=0;
		System.out.println("Original Value of a is: "+a);
		System.out.println("Original Value of c is: "+c);
		c = ++a;
		System.out.println("Value of a is: "+a);
		System.out.println("Value of c is: "+c);
		System.out.println("------------------------------------------------");
		
		b=10;
		d=0;
		System.out.println("Original Value of b is: "+b);
		System.out.println("Original Value of d is: "+d);
		d = --b;
		System.out.println("Value of b is: "+b);
		System.out.println("Value of d is: "+d);
		System.out.println("------------------------------------------------");
	}
}