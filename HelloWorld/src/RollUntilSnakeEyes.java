
public class RollUntilSnakeEyes {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rolls = 0;
		int firstDice = 0;
		int secondDice = 0;
		int totalDice;
		
		while (firstDice != 1 || secondDice != 1){
			DicePairTotal.main(null);
			rolls = rolls + 1;
			firstDice = (int)(Math.random()*6) + 1;
			secondDice = (int)(Math.random()*6) + 1;
		    totalDice = firstDice + secondDice;
		    
		    System.out.println("The first die comes up " + firstDice);
		    System.out.println("The second die comes up " + secondDice);
		    System.out.println("Your total role is " + totalDice);
			System.out.println(rolls + " rolls");
		}
			

	}

}
