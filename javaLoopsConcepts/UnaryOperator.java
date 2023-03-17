package javaprogramsexercise;

public class UnaryOperator {

	public static void main(String[] args) {
		int a=10;
		int b=15;
		System.out.println(a + b);//25
		System.out.println( a++ + a);// 10 11  +11 =21
		System.out.println( a++ + a++);//11 12  +12 =23
		System.out.println(a++ + b++);//13 14 +15=28
		System.out.println(++a + a);// 15+ 15 =30
		System.out.println(++a + ++a);//16 +17=33
		System.out.println(++a +a++);//18 +18 =36
		System.out.println(++a + b++);//20+ 16=36
		System.out.println( ++a + --b);//21 + 16=37
		
		System.out.println(a);
		System.out.println(b);

	}

}
