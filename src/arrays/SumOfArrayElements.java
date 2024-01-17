package arrays;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		int sum=0;
		
		for(int i:a) {
			sum=sum+i;
		}
		
//		for(int i=0;i<=a.length-1;i++) {
//			sum=sum+a[i];
//		}
		System.out.println("Sum of Elements : "+sum);

	}

}
