package arrays;

public class SearchStringinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s[]= {"welcome","java","selenium"};
		boolean flag=false;
		for(String i:s) {
			if(i=="java") {
				System.out.println("Element found");
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Element not Found");
		}

	}

}
