package arrays;

public class PositiveNegativeNumsArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {10,-20,25,-30,35,-40,45,-50,57,60};
		
		//filter only positive numbers
		
		for(int i:a) {
			if(i>=0) {//to print Positive numbers
				System.out.print(i+" ");
			}
		}
		System.out.println( );
		for(int i:a) {
			if(i<0) {//to print Negative numbers
				System.out.print(i+" ");
			}
		}

	}

}
