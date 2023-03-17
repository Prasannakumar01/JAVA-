package javaprogramsexercise;

public class Prime {

	public static void main(String[] args) {

		int n1 = 6, count = 0;
		for (int i = 1; i <= n1; i++) {
			if (n1 % i == 0)

				count++;
			if (count == 2)
				System.out.println(n1 + "is prime number");
		}
/*if (count == 2)
			System.out.println(n1 + "is prime number");

		else
			System.out.println(n1 + "is composite number");*/

	}

}
