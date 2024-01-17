package arrays;

/*1) Declare an array
2) insert values into array
3) Find size of an array
4) read values from an array--this can be done in two ways 1)classic i.e simple for loop 2)Enhanced for loop*/


public class SingleDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];  //declaration;
		
		int b[]= {100,200,300,400,500,600,700};//this is dynamic array based on input values internally the memory 
		//will be allocated
		
		//inserting values into array 
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;//this is called static array fixed size 
		
		System.out.println(a.length); //size of an array
		
		System.out.println(b.length);
		
		
		System.out.println(a[2]);
		
		
		//simple classic for loop
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]); //100 200 300 400 500
		}
		
		//for each loop ---->Enhanced for loop
		
		for(int i:b) {     //column works as assignment operator
			System.out.println(i);
		}
		
	}

}
