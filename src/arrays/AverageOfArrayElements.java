package arrays;

public class AverageOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50,60};
		int sum=0,avg=0;
		for(int i:a) {
			sum=sum+i;
		}
		avg=sum/a.length;
		System.out.println("Average of elements in array:"+avg);

	}

}
