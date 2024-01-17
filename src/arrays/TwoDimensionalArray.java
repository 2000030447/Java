package arrays;

/*1) Declare an array
2) insert values into array
3) Find size of an array
4) read values from an array--this can be done in two ways 1)classic i.e simple for loop 2)Enhanced for loop*/

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*all are right syntaxes and valid*/
		
		//1.static array type fixed size
		int a[][]=new int[3][2]; //int [][]a=new int[3][2];	int []a[]=new int[3][2];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		//2.dynamic array
		
		int b[][]= {{100,200},{300,400},{500,600}};
		
		System.out.println("Number of rows:"+a.length);
		System.out.println("Number of columns:"+a[0].length);
		
		//classic -- simple for loop
		
		for(int i=0;i<a.length;i++) //i represents row index
		{
			for(int j=0;j<a[i].length;j++) //j represents column index
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println( );
		}
		
		
		//enhanced for loop
		
		for(int r[]:a ) {
			for(int i:r) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
