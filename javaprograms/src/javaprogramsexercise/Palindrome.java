package javaprogramsexercise;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s=new String("Madam");
int len=s.length();
String rev=" ";
for(int i=len-1;i>=0;i--)
{
	char ch=s.charAt(i);
	rev=rev+ch;
	
	
}
System.out.println("reverse of string");
if(rev.equalsIgnoreCase(s))
	System.out.println("palindrome ");
else
	System.out.println("not palindrome");
	}

}
