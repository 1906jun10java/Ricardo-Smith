import java.util.Scanner;

public class CalculatorBehavior extends CalculatorOperations {


	public static void main(String[] args) {
		//while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Hello, please enter a number to calculate");
		double number1 = sc.nextDouble();

		System.out.println("Please enter the other number to calculate");
		double number2 = sc.nextDouble();


		System.out.println("how would you like to operate onthese numbers? ( press +, -, * or / )");


		char arithmaticOp = sc.next().charAt(0);

		switch(arithmaticOp){

		//first case

		case '+' :
		{
			System.out.println(" The addition of " + number1+ " and " + number2+ " is " + add(number1, number2));
			break;
		}

		//another case

		case '-' :
		{
			System.out.println("did you mean " + number1 + " - " + number2 + " ? Please press Y or N");
			char response = sc.next().charAt(0);

			if(response == ('Y' | 'y')) {
				System.out.println(number1 + " minus " +number2+ " is " +minus(number1, number2));
				break;
			}else{

				System.out.println("Apologies human, didyou mean " + number2 + " - " + number1 + " ? Please press Y or N");
				char response2 = sc.next().charAt(0);

				if(response2 == ('Y' | 'y')) {
					System.out.println("Great!" +number2 + " minus " + number1+ " is " +minus(number2, number1));
					break;
				}else {

					System.out.println("I am sorry,it appears we have an error in your selection. Please run program again, goodbye.");
					break;

				}
			}
		}

		//third case

		case '*' :
		{
			System.out.println(" The multiplication of " +number1+ " and " + number2+ " is " +multiply(number1, number2));
			break;
		}

		//fourth case

		case '/' :
		{
			System.out.println("did you mean " + number1 + "/ " + number2 + " ? Please press Y or N");
			char response = sc.next().charAt(0);

			if(response == ('Y' | 'y')) {
				System.out.println(number1 + " / " +number2+ " is " +divide(number1, number2));
				break;
			}else{

				System.out.println("Apologies human, did you mean " + number2 + " / " + number1 + " ? Please press Y or N");
				char response2 = sc.next().charAt(0);

				if(response2 == ('Y' | 'y')) {
					System.out.println("Great! : " +number2 + " divided by " + number1+ " is " +divide(number2, number1));
					break;
				}else {

					System.out.println("I am sorry,it appears we have an error in your selection. Please run program again, goodbye.");
					break;

				}
			}
		}

		default :
		{
			System.out.println("It seems you did not enterany valid response. Please try again, goodbye.");
		}


		sc.close();

		}

	//}
	}
}

