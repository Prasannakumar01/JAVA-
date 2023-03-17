package module4;

public class PrintnoOFpalindrstrinInStr {

	public static void main(String[] args) {
		String str = new String("am good madam in high level");
		String c[] = str.split(" ");

		int count = 0;
		for (int i = 0; i < c.length; i++) {
			String rev = "";
			for (int j = c[i].length() - 1; j >= 0; j--) {
				char ch = c[i].charAt(j);
				rev = rev + ch;
			}
			if(rev.equalsIgnoreCase(c[i]))
			{
				System.out.println(rev);
				count++;
			}

		}

		System.out.println(count);

	}

}
