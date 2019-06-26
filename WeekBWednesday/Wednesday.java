import java.util.Scanner;

public class Wednesday {
	
	public static void main(String [] args) {
		
		//i commented this out so that you can run one at a time
		reverse();
		//isPalindrome();
		//calcFact(5);
		
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
	
	public static void calcFact(int n) {
		
		
		if(n == 0 || (n == 1) ) {
			System.out.println("wrong value");
		}else{
			
			n = n*(n-1);
			calcFact(n);
			
			System.out.println(n);
		}
	
	}
	
	
	
}


