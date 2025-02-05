public class FactorialCalculator {
	public static int fac(int a) {
		if (a==1) return 1;
		return a * fac(a-1);
	}
	public static void main(String[] args) {
		int x = 5;
		System.out.println(fac(x));
	}
}