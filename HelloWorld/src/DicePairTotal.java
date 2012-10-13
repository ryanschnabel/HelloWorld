
public class DicePairTotal {

	/**
	 * A Program that rolls two dice and totals them
	 * @return 
	 * @return 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstDice;
		int secondDice;
		int totalDice;
		
		firstDice = (int)(Math.random()*6) + 1;
		secondDice = (int)(Math.random()*6) + 1;
	    totalDice = firstDice + secondDice;
	    
	    System.out.println("The first die comes up " + firstDice);
	    System.out.println("The second die comes up " + secondDice);
	    System.out.println("Your total role is " + totalDice);
	    
	}

}
