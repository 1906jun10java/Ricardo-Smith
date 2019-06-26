import java.util.Scanner;

public class StringClass {
	
	public static void main(String [] args) {
		
		//i commented this out so that you can run one at a time
		//reverse();
		//isPalindrome();
		//System.out.println(calcFact(5));
		//System.out.println(triangle(4));
		System.out.println(containsString("hello", "lo"));
		
	}
	
	

	public static void reverse() {
		
		System.out.println("please enter your string");
		Scanner sc = new Scanner(System.in);
		String userString = sc.next();
		userString.toCharArray();
		System.out.println(userString.length());
		for(int i = userString.length()-1 ; i>=0 ;i--) {
			System.out.print(userString.charAt(i));
			sc.close();

		}
		//return userString;
		
	}
	
	/*
	public static boolean isPalindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your string");
		String userString = sc.next();
		userString.toCharArray();
		for(int i = userString.length()-1/2; i>=0; i--) {
			if(userString.charAt(0) == userString.charAt(i)) {
				return true;
			}else {
				return false;
			}
			
		}
	}

	*/
	
	public static void isPalindrome () {
		System.out.println("please enter your string");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str.toCharArray();
		for(int i = 0; i < str.length()/2; i++) {
			for(int j = str.length()-1; j>str.length()/2; j-- ) {
				if(str.charAt(i) == str.charAt(j)) {
					System.out.println("this is a palindrome");
				}else {
					System.out.println("this is not a palindrome");	
				} 
								
			}
		}
		
	}
	
	public static int calcFact(int n) {
		
		
		if(n == 0 || (n == 1) ) {
			return 1;
		}else{
			
			return n * (calcFact(n-1));
			
		}
	
	}
	
	public static String reverseStringWithRecursion(String str) {
		char[] str1 = str.toCharArray();
		if(str1.length == 1) {
			return str;
		}else {
			
		}
		
		return "string";
	}
	
	public static boolean containsString(String str, String subString) {
		if(str.indexOf(subString) != -1) {
		
			return true;
			
		}else {
			return false;
		}
		
	}
	
	public static int triangle(int numRows) {
		
		if(numRows ==0) {
			return 0;
		}else if(numRows ==1) {
			return 1;
		}else{
			return numRows = numRows + triangle(numRows - 1);
		}
		
	}
	
	
	
}


