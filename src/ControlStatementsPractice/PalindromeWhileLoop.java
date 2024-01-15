package ControlStatementsPractice;

public class PalindromeWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12321,rem,rev=0;
		int temp=num;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
//		System.out.println(num);
//		System.out.println(rev);
		if(temp == rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}
