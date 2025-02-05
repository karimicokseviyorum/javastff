import java.util.Scanner;

public class RandomInt {
	public static int randomGen(int a, int b) {
		int random = (int)(Math.random() * (b-a+1) + a);
		return random;
	}
	
	
	public static void main(String[] args) {
		Scanner line = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a, b;
		a = Integer.parseInt(line.next());
		b = Integer.parseInt(line.next()); // space kadar okuyor
		// simdi burada random int olusturmak istiyorum
		System.out.println(randomGen(a, b));
	}
}