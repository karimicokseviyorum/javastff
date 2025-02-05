public class Task1{
	public static void main(String[] args) {
		char[] characters = new char[3];
		int[] numbers = new int[9];
		double[] doubles = new double[5];
		String[] months = {"Jan", "Feb", "Mar", "Apr", "May","Jun", "Jul", "Aug", "Oct", "Nov", "Sep", "Dec"};
		
		characters[0] = 'a';
		characters[1] = 'b';
		characters[2] = 'c';
		
		for (int i = 0; i < 9; i++)
			numbers[i] = i+1;
		
		doubles[0] = 7.6; 
		doubles[1] = 3.5;
		doubles[2] = 1.3;
		doubles[3] = 4.6;
		doubles[4] = 4.4;
		
		for(char i : characters)
			System.out.print(i + " ");
		System.out.println("");
		for (double i : doubles)
			System.out.print(i + " ");
		System.out.println("");
		for (String i : months)
			System.out.print(i + " ");
		
	}
}