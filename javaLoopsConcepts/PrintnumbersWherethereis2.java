package javaLoopsConcepts;

public class PrintnumbersWherethereis2 {

	public static void main(String[] args) {
		int num=30;
		int count=0;
		for(int i=0;i<num;i++)
		{ 
		
			
			if (i%10==2) {
				count++;
				System.out.println(i+" "+count);
				
			}
			if(i/10==2) {
				count++;
				System.out.println(i+ " "+count);
			}
		
		
			}
		}

	
}

