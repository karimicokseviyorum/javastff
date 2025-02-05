import java.util.Arrays;

public class ArrayAPI {
	public static void main(String[] args) {
		double[] values = {1.9, 2.0, 3.0, 1.2, 5.2, 2.1,7.4};
		System.out.println("Unsorted:");
		for(double t : values)
			System.out.println(t);
		Arrays.sort(values);
		
		System.out.println("Sorted: ");
		for(double t : values)
			System.out.println(t);
	}
}