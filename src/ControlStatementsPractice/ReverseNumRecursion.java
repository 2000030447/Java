package ControlStatementsPractice;

public class ReverseNumRecursion {
	
	public static void reverse_number(int num) {
		if(num<10) {
			System.out.println(num);
		}
		else {
			System.out.print(num%10);
			reverse_number(num/10);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
	    reverse_number(num);

	}

}
