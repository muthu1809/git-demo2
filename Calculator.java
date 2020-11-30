package oops.learning;

public class Calculator {

	public static void main(String[] args) {
		
		String s1 = "RajarajaChozhan"; 
		String s2 = "Kumar"; 
		s1.concat(s2); 
		System.out.println(s1);
		System.out.println(s1.contains("xyz")); 
		System.out.println(s1.endsWith("mar")); 
		System.out.println(s1.equals(s2)); 
	System.out.println(s1.indexOf('s')); 
	System.out.println(s1.lastIndexOf('s')); 
	s1 = s1.replace('o', 'a'); 
	System.out.println(s1);
	String first = s1.substring(0, 5); 
	System.out.println(first);
	char[] ch = s1.toCharArray(); 
	int no = 5; 
	System.out.println(no+5);
	String s3 = String.valueOf(no); 
	System.out.println(s3+5);



	}

}
