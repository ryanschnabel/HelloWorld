public class WordBreakOut {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput;
		int userInputLength;
		int userInputCounter;
		int userInputCounterTwo = 0;
		char userInputChar;
		boolean userInputCharBoolean;
		int exitUserInput = 1;
		
		while (exitUserInput == 1){
		System.out.println();
		
		System.out.println( "Please enter a line of text, I will break it down for you.  If you would like to exit, type 'exit'.");
		userInput = TextIO.getlnString();
		userInputLength = userInput.length();
		
		if (userInput.equals("exit")){
			exitUserInput = 0;
			System.out.println("The program is finished!");
		}
		if (exitUserInput != 0){
		for ( userInputCounter = 0;  userInputCounter < userInputLength;  userInputCounter++ ) {
			userInputChar = userInput.charAt(userInputCounter);
			userInputCharBoolean = Character.isLetter(userInputChar);
			if ((userInputCharBoolean == true || userInputChar == '\'') && exitUserInput == 1) {
				System.out.print(userInputChar);
				userInputCounterTwo = 0;
			}
			else if (userInputCounterTwo > 0 && exitUserInput == 1){
				userInputCounterTwo = userInputCounterTwo + 1;
			}
			else if (exitUserInput != 1){
				break;
			}
			else {
				System.out.println();
				userInputCounterTwo = userInputCounterTwo + 1;
			}
		}
		}
		}
	}

}