package Strings;

public class StringPresenceinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//search string present in array of strings.
		
		String s[]= {"Welcome","Java","selenium","python","JavaScript"};
		
		String searchString="selenium";
//		String searchString="xyz"; 
		boolean flag=false;
		
		//one method to find string
		
//		for(int i=0;i<=s.length-1;i++) {
//			if(s[i]== searchString) {
//				flag=true;
//				System.out.println("Element Found");
//			}
//		}
//		if(flag==false) {
//			System.out.println("Element Not Found");
//		}
		
		//another way to find string
		for(String i:s) {
			if(i.equals(searchString)) {
				flag=true;
				System.out.println("String found in Array");
				break;
			}
		}
		if(flag==false) {
			System.out.println("String Not found in Array");
		}
	}

}
