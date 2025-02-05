import java.util.Scanner;

public class RandomInt {
	public static void main(String[] args) {
		Scanner line = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a, b;
		a = Integer.parseInt(line.next());
		b = Integer.parseInt(line.next());
		System.out.println("a: " + a + "b: " + b);
	}
}