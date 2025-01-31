/**
 * The programme adds the numbers from 0 up to a given boundary value.
 * boundary. The sum is stored in the variable sum. The variable
 * counter contains the current number to be added.
 */

public class SumTemplate {
	public static void main(String[] args) {
		// Declare:
		int boundary; // Integer which is counted up to
		int sum; // Sum of the previously added digits
		int counter;// Integer which comes next

		// Initialise the starting value of the variables
		boundary = 14;
		sum = 0;
		counter = 1;
		
		// Hier kommt mein Superalgorithmus
				
		/*
		Hier ein KOmmentar
		über
		mehrere Zeilen
		*/

		// Calculate the sum of all digits from 1 to boundary
		while (counter <= boundary) {
			sum = sum + counter;
			counter = counter + 1;
		}

		// Output the sum, together with an explanatory text
		System.out.print("The sum of the digits from 0 to ");
		System.out.print(boundary);
		System.out.print(" is ");
		System.out.println(sum);
	}
}

