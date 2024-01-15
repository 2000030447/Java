package ControlStatementsPractice;


public class JumpingStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//exit after value becomes 5
//		for(int i=1;i<=10;i++) {
//			
//			if(i==5) {
//				break;
//			}
//			
//			
//			System.out.println(i);
//			
//		}
		
		
		//skip value printing at a particular number it may be single or multiple
		for(int i=1;i<=10;i++) {
			
			if(i==5 || i==7 ||i==9) {
				continue;
			}
			
			
			System.out.println(i);
			
		}

	}

}
