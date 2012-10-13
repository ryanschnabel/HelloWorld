
public class UserTypedExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numberOne = 1;
		char symbol;
		double numberTwo;
		double result;
		
		
		  
		while (numberOne != 0) {
			System.out.println("If you would like to exit, please type 0, otherwise please write the first number in your expression:");
			numberOne = TextIO.getlnDouble();
			if (numberOne != 0){				
			
			System.out.println("Would you like to +, -, *, or / the first number?");
			symbol = TextIO.getlnChar();
			if ((symbol == '*') || (symbol == '/') || (symbol == '+') || (symbol == '-')) {
				System.out.println("Please write the second number:");
				numberTwo = TextIO.getlnDouble();
				if ((symbol == '*')) {

					result = numberOne * numberTwo;
					System.out.println("The result is " + result + "!");
				}
				if ((symbol == '+')) {

					result = numberOne + numberTwo;
					System.out.println("The result is " + result + "!");
				}
				if ((symbol == '-')) {

					result = numberOne - numberTwo;
					System.out.println("The result is " + result + "!");
				}
				if ((symbol == '/')) {

					result = numberOne / numberTwo;
					System.out.println("The result is " + result + "!");
				}
			}
			else {
				System.out.println("You fail at typing...");
			}
			}
		}
		System.out.println("Good bye!");	
		
	}

	private static double valueOf(double d) {
		// TODO Auto-generated method stub
		return 0;
	}

}
