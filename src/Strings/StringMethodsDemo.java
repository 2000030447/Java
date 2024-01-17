package Strings;

public class StringMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*string is nothing but a collection of characters */
		
		String s="welcome"; //String s=new String();
		
		//1.length()
		
//		int len= s.length();
		System.out.println(s.length());
		
		//2.concat()---join the strings
		
		String s1="Welcome";
		String s2="To Selenium";
		s1.concat(s2);
		
		//ways to concatenate a string
		System.out.println(s1+" "+s2);
		System.out.println("Welcome"+" "+"To Selenium");
		
		System.out.println(s1.concat(s2));
		System.out.println("Welcome".concat("To Selenium"));
		
		//trim()
		
		s="        Java Programming Language             ";
		System.out.println(s);
		System.out.println(s.trim());//it removes the leading and trailing spaces in a string
		
		
		//CharAt()---returns a char value at the given index number starts from 0
		
		s="Welcome";
		System.out.println(s.charAt(5));
		System.out.println(s.charAt(2));
		
		//contains()--return true/false after searching the given sequence in our main string
		
		System.out.println(s.contains("come"));
		System.out.println(s.contains("Come"));//C is Uppercase here so gives false
		
		//equals() & eualsIgnorecase() --returns true if characters matches uppercase & lowercase differences
		
		System.out.println(s.equals("Welcome"));//true
		System.out.println(s.equals("welcome"));//false because lowercase
		
		
		System.out.println(s.equalsIgnoreCase("Welcome"));//true
		System.out.println(s.equalsIgnoreCase("welcome"));//true because using method equalsIgnorecase()
		
		
		//replace()-- returns a string replacing all the old characters or char sequence to new characters.2ways to 
		//this method
		
		
		s="Welcome to Java Welcome to selenium";
		System.out.println(s.replace('e','a'));//Walcoma to Java Walcoma to salanium
		System.out.println(s.replace("Welcome","Hello"));//Hello to Java Hello to selenium
		
		
		//substring(startindex,endingindex);--returns substring between start to end index
		
		s="Welcome";
		System.out.println(s.substring(1,3));//between e and l no characters so el
		System.out.println(s.substring(0,4));//Welc
		
		//toLowercase() & toUppercase()
		
		s="WELCOME";
		System.out.println(s.toLowerCase());//welcome
		
		s="welcome";
		System.out.println(s.toUpperCase());//WELCOME
		
		s="welCOME";
		System.out.println(s.toLowerCase());//welcome

		
		
	
	}

}
