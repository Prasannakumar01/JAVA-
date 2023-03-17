package javaprograms;

public class TwoDimensionalArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	int a[][]=new int [5][2];//static two dimensional array
	
	a[0][0] =100;
	a[0][1]=102;
	a[1][0] =103;
	a[1][1]=105;
	a[2][0] =106;
	a[2][1]=107;
	a[3][0] =108;
	a[3][1]=109;
	a[4][0] =110;
	a[4][1]=111;
	
	System.out.println( "Number of rows"+ a.length);
	System.out.println("Number of columns"+ a[0].length);
	
	System.out.println();
	
	//Dynamic Two dimensional array 
	
	int b[][]= {{100,102},{103,105},{106,107},{108,109},{110,111}};
	System.out.println("Number of rows" +  b.length);
	System.out.println("Number of columns" +b[0].length);
	
	
	for (int i=0;i<b.length;i++) //i represents the row index
	{
		
	for(int j=0;j<b[i].length;j++)//j represents the column index 
			 {	
				
	System.out.println(b[i][j]+" ");	
				
			}
		
	}
	
	}

}
