package javaLoopsConcepts;

public class FrequencyofChar {

	public static void main(String[] args) {

		String s = new String("Automation Engineer");

		char ch[] = s.toCharArray();

		for (char w = 'a'; w <= 'z'; w++) {
			int count = 0;
			for (char chr : ch) {
				if (w == chr) {
					count++;
				}
			}
			if (count > 0)

				System.out.println(w+ "-" + count); 
		}
	}

}
