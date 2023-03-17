package javaprograms;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		
//after knowing the size of the array inserting the new elements in the array
	int a[]=new int[5];
	a[0]=120;
	a[1]=112;
	a[2]=120;
	a[3]=123;
	a[4]=112;
	
	
	
	//without knowing the size inserting the elements in the array -dynamic array
	int b[]= {100,200,300,400,500,600};
	//size of the array
	System.out.println(b.length);
	//specific value by giving the index number in the element
	System.out.println(b[4]);
	
	//classic
	for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
		
	}
	System.out.println();
	
	//Enhanced for each loop .We can use this method frequently in data structure;
	for(int i:a){
		System.out.println("element:"+i);
	}
	}

}
