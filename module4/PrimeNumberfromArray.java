package module4;

public class PrimeNumberfromArray {
	public static void main(String[] args)
	{
		int a[] = {10,11,12,13,14};
		        
		        for (int i=0;i<a.length;i++)
		        { 
		        	int count=0;
		        
		       for(int j=1;j<=i;j++) {
		        	if(a[i]%j==0) {
		        		count++;
		        	}
		       	
		        if(count==2)
		       
		        	System.out.println(a[j]+"Primenumbers");
		        }}    
		        
		        	}}
