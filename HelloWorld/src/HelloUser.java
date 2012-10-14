
public class HelloUser {

	/**
	 * A program that gets a users name and greets them with the
	 * upper case version
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName;
		
		System.out.println("What is your name?");
		userName = TextIO.getlnString();
		System.out.println("Hello, " + userName.toUpperCase() + ", nice to meet you!");

	}

}
