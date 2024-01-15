package ControlStatements;


public class LargestOF3Numbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=30;
		int c=40;
//		if(a>b && a>c) {
//			System.out.println("a is largest number");
//		}
//		else if(b>a && b>c) { 
//			System.out.println("b is largest number");
//		}
//		else {
//			System.out.println("c is largest number");
//		}
		
		//using tenrary operator -composed of three items expression a value if true or a value if false
		
//		int temp=(a>b)?a:b;
//		int largest=(temp>c)?temp:c;
//		System.out.println(largest+" is the largest number");
		
		//if we want to compare three numbers in a single statement it is possible by tenrary operator
		
		int d=c>((a>b)?a:b)?c:((a>b)?a:b);
		System.out.println(d);
		
	} 
	
}
