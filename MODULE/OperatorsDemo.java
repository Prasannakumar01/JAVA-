package javaprograms;

/**
 * @author kasir
 *
 */
public class OperatorsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a =100;
		int b =29;
		// arithmetic operators  +-*/%
		
		System.out.println( "sum of a and b:" +(a+b) );
		System.out.println( "Diff of a and b:" +(a-b) );
		System.out.println( "Multiply of a and b:" +(a*b) );
		System.out.println( "Modulus of a and b:" +(a%b) );
		System.out.println( "Div of a and b:" +(a/b) );
		
      //relational operators/comparison operator=>returns always boolean
		// relational operator <= >= > < ! = != 
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a=b);
		System.out.println(a!=b);
	
		//Logical operators && || ! ( It is used when there are multiple conditions)
		 
		boolean x= true;
		boolean y= false;
		
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		//increment operators
		
		//a++ ; => post increment
		//a-- ; => pre increment
		
		a=120;
	//	int result=a++;
		
        System.out.println(++a);
        System.out.println(a);
        
        System.out.println(a++);
		
		 
		//Decrement operator
        // b-- =>post decrement operator
        // --b =>pre decrement operator
        
        b=10;
        System.out.println(b);
        System.out.println(b--);
        System.out.println(--b);
		
		
	}

}
