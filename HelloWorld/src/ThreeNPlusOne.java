
public class ThreeNPlusOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N;
		int nCount = 0;
		
		System.out.println("What is your starting N for the algorithm?");
		N = TextIO.getlnInt();
		while (N < 1){
			System.out.println("Please Enter a positive number!");
			N = TextIO.getlnInt();
		}
		while (N != 1) {
			if ((N % 2) !=0){
				N = ((N*3) + 1);
				nCount = nCount + 1;
				System.out.println("N=" + N);
			}
			else {
				N = N/2;
				nCount = nCount + 1;
				System.out.println("N=" + N);
			}
		}

		System.out.println("It looped " + nCount + " times");

	}

}
