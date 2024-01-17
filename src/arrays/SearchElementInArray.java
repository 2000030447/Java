package arrays;

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,200,100,50,70,30};
		
		int num=100;
		boolean flag=false;
		
		for(int i:a) {
			if(i==num) {
				System.out.println("Element found");
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element not found");
		}

	}

}
