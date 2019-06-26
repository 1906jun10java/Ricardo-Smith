public class CalculatorOperations {

	public static double add(double a, double b) {
		return a+b;
	}
	public static double minus(double a, double b) {
		return a-b;
	}
	public static double multiply(double a, double b) {
		return a*b;
	}
	public static double divide(double a, double b) {
		if(b==0) {
			System.out.println("Unfortunately, your divisor cannot be equal to zero. This will yield infinity.");
			throw new ArithmeticException("your divisor cannot be equal to zero");
		}else {
		return a/b;
		}
	}

}
