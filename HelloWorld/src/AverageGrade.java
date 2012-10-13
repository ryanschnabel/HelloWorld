
public class AverageGrade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int grade1;
		int grade2;
		int grade3;
		
		TextIO.readFile("testdata.txt");
		name = TextIO.getln(); 
		grade1 = TextIO.getlnInt(); 
		grade2 = TextIO.getlnInt(); 
		grade3 = TextIO.getlnInt(); 
		
		TextIO.writeFile("testdata_final.txt");  // subsequent output goes to the file
        TextIO.putln("Name:        	" + name); 
        TextIO.putln("Grade 1:           " + grade1);
        TextIO.putln("Grade 2:           " + grade2);
        TextIO.putln("Grade 3:           " + grade3);
        TextIO.putf("Average Grade:  " + (grade1 + grade2 + grade3) / 3);
        
        System.out.println("Hello, " + name.toUpperCase() + ", here are your grades!");
        System.out.println("On the first test you got a " + grade1 + "%.");
        System.out.println("On the second test you got a " + grade2 + "%.");
        System.out.println("On the third test you got a " + grade3 + "%.");
        System.out.println("Your GPA for the class is " + ((grade1 + grade2 + grade3) / 3) + "%.");
	}

}
