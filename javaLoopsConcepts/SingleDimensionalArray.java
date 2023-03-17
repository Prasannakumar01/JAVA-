package javaLoopsConcepts;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// static array : size is fixed
		
// if we use the arraysize n= 5 it means that the starting index starts with 0 and ending index with n-1
		 int a[]=new int [5];
		 
 /*inserting values into array and it is fixed we can have less than the size but we cant include more than 
		 the size of the array*/
		 
		 a[0]=100;
		 a[1]=200;
		 a[2]=300;
		 a[3]=400;
		 a[4]=500;
		 
//Dynamic array : we can include as many elements in the array as the size is not mandatory
		 
		 int b[]= {100,200,300,400};
		 
		 //array .length will provide the length of the array
		System.out.println("Size of the a array: " +a.length);
		System.out.println("size of the b array :" + b.length);
		
		System.out.println();
		
		//array[]with the index inside them will give the value of the index
		System.out.println("value of the given index : " + a[2]);
		System.out.println("value of the given index : " + a[4]);
		System.out.println("value of the given index : " + b[0]);
		System.out.println("value of the given index : " + b[3]);
		
		
		// extract multiple values using classic forloop
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println("Array values:"+a[i]);
		}
		
		
		 
	}

}
