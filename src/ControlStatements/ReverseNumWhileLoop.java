package ControlStatements;

public class ReverseNumWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234,rem,rev=0;
		
		//here we are taking the remainder and initializing reverse with 0 when 4 is remainder it is single and how 
		//many times a number comes out that many times it is multiplied with 10 gives reverse of number
		
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println(rev);
		
		
		//another type
//		int a=1234,rem;
//		while(a!=0) {
//			rem=a%10;
//			System.out.print(rem);
//			a=a/10;
//		}

	}

}
