
public class ChangeCounter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double quarters;
		double dimes;
		double nickels;
		double pennies;
		double totalChange;
		
		System.out.println("How many quarters do you have?");
		quarters = TextIO.getlnInt() * 25;
		System.out.println("How many dimes do you have?");
		dimes = TextIO.getlnInt() * 10;
		System.out.println("How many nickels do you have?");
		nickels = TextIO.getlnInt() * 5;
		System.out.println("How many pennies do you have?");
		pennies = TextIO.getlnInt();
		
		totalChange = ((quarters + dimes + nickels + pennies)/100);
		
		System.out.print("You have $");
		System.out.printf( "%1.2f", totalChange );
		
	}

}
