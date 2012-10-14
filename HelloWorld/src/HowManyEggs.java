
public class HowManyEggs {

	/**
	 * This program asks the user how many eggs the user has and converts
	 * that amount into gross, dozens, and the remainder
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int eggs;
		int gross;
		int dozens;
		
		System.out.println("How many eggs do you have?");
		eggs = TextIO.getlnInt();
		gross = eggs / 144;
		dozens = (eggs % 144)/12;
		eggs = eggs % 12;
		
		
		System.out.println("Your number of eggs is " + gross + " gross, " + dozens + " dozens, and " + eggs + " eggs!");
		

	}

}
