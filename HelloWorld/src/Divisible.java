
public class Divisible {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		int x = 1;
		int tmpCounter = 0;
		int nCounter = 0;
		String nLargestAmountOfDivisors = "0";
		int largestAmountOfDivisors = 0;
		
		while (n <= 10000) {
			while (x <= ((n/2) + 1))
				if (n%x == 0) {
					
					tmpCounter = tmpCounter + 1;
					x = x + 1;
					
				}	
				else {
					x = x + 1;
				}
			if (tmpCounter > largestAmountOfDivisors) {
				nLargestAmountOfDivisors = ("" + n);
				largestAmountOfDivisors = tmpCounter;
			    n = n + 1;
			    x = 1;
			    nCounter = 1;
			    tmpCounter = 0;
			}
			else if (tmpCounter == largestAmountOfDivisors) {
				nLargestAmountOfDivisors = (nLargestAmountOfDivisors + "," + n);
				largestAmountOfDivisors = tmpCounter;
			    n = n + 1;
			    x = 1;
			    nCounter = nCounter + 1;
			    tmpCounter = 0;
			}
			else {
				n = n + 1;
			    x = 1;
			    tmpCounter = 0;
			}
			
		}
		if (nCounter <= 1){

			System.out.println(nLargestAmountOfDivisors + " is the number between 1 and 10000 that has the largest amount of divisors.");
			System.out.println("It has " + largestAmountOfDivisors + " divisors.");
		}
		else {
			System.out.println(nLargestAmountOfDivisors + " are the numbers between 1 and 10000 that have the largest amount of divisors.");
			System.out.println("They all have " + largestAmountOfDivisors + " divisors.");
		}
	}

}
