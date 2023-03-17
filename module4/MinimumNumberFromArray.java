package module4;

public class MinimumNumberFromArray {

	public static void main(String[] args) {
		int a[]= {20,12,1,45,35};
		int size =a.length;
		int min=a[0];
		for (int i=0;i<size;i++) {
			if(a[i]<min) {
				
				min=a[i];	
			}
		}
		System.out.println("miniumum number in the array"+" "+min);
	}

}
