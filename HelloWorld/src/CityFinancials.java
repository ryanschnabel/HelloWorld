
public class CityFinancials {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lineLength;  // used to determine the length of the line in the file that I am currently on
		int lineLengthCounter; // used in the for loop to determine where the line ends
		String currentLine; // holds the data from the current line that I am on.
		double runningTotal = 0; // holds the total sales of all of the cities in the file
		int numberOfCitiesNoData = 0; // holds the number of cities that have no sales total
		int numberOfCities = 0; //holds the number of cities that are in the file
		char currentChar; // this is the current character the logic is checking
		String currentCityTotal; // this holds the information after the character
		double currentCityTotalDouble; // if currenCityTotal is a valid double it will hold the currentCityTotal as a double.
		int postColon = 0; // this is an on/off switch used to tell if I am after the colon.
		
		TextIO.readFile("sales.dat");
		while (TextIO.eof() == false) {
			currentLine = TextIO.getln();
			lineLength = currentLine.length();
			currentCityTotal = "";
			numberOfCities = numberOfCities + 1;
			for ( lineLengthCounter = 0;  lineLengthCounter < lineLength;  lineLengthCounter++ ) {
				currentChar = currentLine.charAt(lineLengthCounter);
				if (currentChar == ':'){
					postColon = 1;
				}
				else if (postColon == 1){
					currentCityTotal = currentCityTotal + currentChar;
				}
			}
			try {
				currentCityTotalDouble = Double.parseDouble(currentCityTotal);
				runningTotal = runningTotal + currentCityTotalDouble;
				postColon = 0;
				}
				catch ( NumberFormatException e ) {
					numberOfCitiesNoData = numberOfCitiesNoData + 1;
					postColon = 0;
				}
		}
		if (numberOfCities > 1){
			System.out.println("The total sales from all " + numberOfCities + " cities are $" + runningTotal + ".");
		}
		else if (numberOfCities == 1){
			System.out.println("The total sales from your only location cities is $" + runningTotal + ".");
		}
		else {
			System.out.println("I'm not sure what you are totaling, your total of nothing is $" + runningTotal + ".  Put something in your file, Dumb Ass!");
		}
		
		if (numberOfCitiesNoData != 1){
			System.out.println(numberOfCitiesNoData + " cities reported no data");	
		}
		else{
			System.out.println(numberOfCitiesNoData + " city reported no data");
		}
		
		
	}

}
