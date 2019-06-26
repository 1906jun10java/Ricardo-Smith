import java.util.Scanner;

public class FizzBuzz {
	
	//variable declarations
	String a = "fizz";
	String b = "buzz";
	int lowerLimit;
	int upperLimit;
	int[] intArray = new int[3];
	String[] stringArray = new String[3];
	Scanner sc = new Scanner(System.in);
	
	//method declaration
	public void fizzBuzzBasic(){
		
	//for loop	
	for(int i = 1; i<=100; i++) {
		if(i % 3 == 0 && i % 5 ==0 ) {
			System.out.println(a.concat(b)); //use concat function
		}else if(i % 3 == 0) {
			System.out.println(a);
		}else if(i % 5 ==0) {
			System.out.println(b);
		}else {
			System.out.println(i);
		}
	}
	
	}
	
	public void limits(){
		System.out.println("please enter the lower limit");
		Scanner sc = new Scanner(System.in);
		lowerLimit = sc.nextInt();
		System.out.println("please enter the upper limit");
		upperLimit = sc.nextInt();
		while(upperLimit < lowerLimit) {
			System.out.println("Your upper limit must be larger than lower limit. Please enter another number");
			upperLimit = sc.nextInt();
		}if(upperLimit > lowerLimit) {
			System.out.println("Thank you. \n");
		}
	}
	public void intArrayMethod() {
		System.out.println("now time for us to take three integers");
		System.out.println("please enter first integer");
		intArray[0] = sc.nextInt();
		System.out.println("please enter second integer");
		intArray[1] = sc.nextInt();
		System.out.println("please enter third integer");
		intArray[2] = sc.nextInt(); 
		
		/*for(int i=0; i<=3; i++) {   
			Scanner scanInt = new Scanner(System.in);     //I tried to use a loop to grab user input
			System.out.println("please enter a number");  //but could not quite get it to work
			intArray[i] = scanInt.nextInt();
			i++;
			*/	
		}
	
	public void stringArrayMethod() {
		System.out.println("now time for us to take three strings");
		System.out.println("please enter first string");
		stringArray[0] = sc.next();
		System.out.println("please enter second string");
		stringArray[1] = sc.next();
		System.out.println("please enter third string");
		stringArray[2] = sc.next(); 
	}
	
	public void linkArrays() {
		
	}
	
	
	public void fizzBuzzAdvanced() {
		
		for(int i = lowerLimit; i <= upperLimit; i++) { 							 //iterates through the limits set by the user
			if(i % intArray[0] == 0 & i % intArray[1] == 0 & i % intArray[2] == 0) { //array limited to 3 values for right now
				System.out.println(stringArray[0].concat(stringArray[1]).concat(stringArray[2]));
				
			}else if(i % intArray[0] == 0 & i % intArray[1] == 0) {
				System.out.println(stringArray[0].concat(stringArray[1])); 
												//lines 78 - 88 involve a lot of unnecessary code combinations								
			}else if(i % intArray[1] == 0 & i % intArray[2] == 0) {			// that I am going to correct in the near future(once i figure out how).
				System.out.println(stringArray[1].concat(stringArray[2]));  //Unless i break the program up and incrementally add more 
											//functionality and elegance later, i get pretty 
											//frustrated and overwhelmed
			}else if(i % intArray[0] == 0 & i % intArray[2] == 0) {
				System.out.println(stringArray[0].concat(stringArray[2]));
				
			} else if(i % intArray[0] == 0){
				System.out.println(stringArray[0]);
			} else if(i % intArray[1] == 0) {
				System.out.println(stringArray[1]);
			}else if(i % intArray [2] == 0) {
				System.out.println(stringArray[2]);
			}else {
				System.out.println(i);
			}
		}
		
		
		
	}
}

