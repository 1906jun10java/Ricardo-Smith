import java.util.Scanner;

public class MutationUtility {
	
	static Scanner sc = new Scanner(System.in);
	static String endGene;
	static String startGene;
	static int geneNumber;
	static String[] genePool;
	static char[] startGeneChar = new char[8];
	static char[] endGeneChar = new char [8];
	static char a = 'a';
	static char t = 't';
	static char c = 'c';
	static char g = 'g';
	static int critical;
	
	
	//method for taking in the start gene
	public static void endingString() {							// method for taking in and evaluating end genes.
		System.out.println("Please enter your end gene");
		endGene = sc.nextLine();
		while(endGene.length() != 8) {
			System.out.println("Please enter a valid gene");
			endGene = sc.nextLine();
		}
		System.out.println("Thank you.");
		char[] endGeneChar = endGene.toCharArray();				// making a character array to make comparing individual genes easier
		
	}
	
	public static void startingString() {						//method for taking in an evaluating start genes.
		System.out.println("Please enter your start gene");
		startGene = sc.nextLine();
		while(startGene.length() != 8) {
			System.out.println("Please neter a valid gene");
			startGene = sc.nextLine();
		}
		System.out.println("Thank you.");
		char[] startGeneChar = startGene.toCharArray();			// again, making a character array to make comparing individual genes easier
		
	}
	
	public static void geneBank() {
		System.out.println("How many gene strings would you like in your gene pool?");
		geneNumber = sc.nextInt();
		while(geneNumber < 1) {
			System.out.println("We need a valid amount in the gene pool. Please try again");
			geneNumber = sc.nextInt();
		}	
		String[] genePool = new String[geneNumber];				// initialize gene pool array size
		
		for(int i = 0; i < geneNumber; i++) {
			System.out.println("please enter the next entry for gene pool");
			sc.nextLine();
			genePool[i] = sc.nextLine();						// loop to take in arbitrary number of array elements
		}
		System.out.println("Thank you. Comparing Genes..");
		compare();												// invoking method to compare start and end genes
	}
	
	
	public static int program(String gene1, String gene2) {
		
		if(gene1.equalsIgnoreCase(gene2)) {
			return 0;
		}else {
		return 1;
		}
		
	}
	
	public static void compare() {
		for(int i =0 ; i<8; i++) {						// iterates through all 8 gene indices. 
			if(startGeneChar[i] == endGeneChar[i]) {	// comparing each index of the start gene against the index of another
				System.out.println("Your start and end genes are the same at : " + i + "which translates to " + startGene.charAt(i));
			}else {
				System.out.println("Your start and end genes differ at gene# " + i + "start gene has a value of: " + startGene.charAt(i) + " end gene has a vlaue of: "+endGene.charAt(i));
				critical = i; 	// here I store the index so that I can call it outside of the scope of this for-loop (especially within my genePoolComparison method)
								// I am accounting for only one instance of mutation so that I can get the program running. More implementation to come late on
				// here I would take the indices [i] at which the genes are different and pass them into a method to compare them
				// against the genes in my gene pool but haven't quite resolved how to successfully compare them as yet.
				
				//genePoolComparisons();
			}
		}
		
	}
	
	
	 static void genePoolComparison() {	// I will now compare my mutations to the genes I have in the pool
		 								// my reasoning from here will be to iterate through the genes in my genePool array and see
			 							// if any of them contain the substring, I will get the index where that substring stops 
			 							// and compare it to my critical variable. If they are the same, I will try to implement a check for the rest of the string
			 							//
	}
	
	
	public static void main(String[] args) {
		endingString();
		startingString();
		geneBank();
		program(startGene, endGene);
	}
	

}


