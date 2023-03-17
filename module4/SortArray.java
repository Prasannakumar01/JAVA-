package module4;

public class SortArray {

	public static void main(String[] args) {
		int a[]={13,5,3,7,94};
		for (int i=0;i<a.length;i++) {
			int temp;
			for (int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}	
		}
		
    System.out.println("maxi number :"+a[a.length-1]);
    System.out.println("mini number:"+a[a.length-a.length]);
    System.out.println("second maxi;"+a[a.length-2]);
    System.out.println("second min ;"+a[a.length-(a.length-1)]);

}}
