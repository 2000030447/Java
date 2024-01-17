package arrays;

public class EvenNumbersinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,20,25,30,35,40,45,50,57,60};
		
		//filter only even numbers
		
		for(int i:a) {
			if(i%2==0) {//to print Even numbers
				System.out.print(i+" ");
			}
		}
		System.out.println( );
		for(int i:a) {
			if(i%2!=0) {//to print Odd numbers
				System.out.print(i+" ");
			}
		}

	}

}
