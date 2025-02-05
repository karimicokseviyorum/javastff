public class PrimeNumber{
	public static boolean isPrime(int a) {
		for(int i = 2; i < a; i++)
			if((a % i) == 0)
				return false;
		return true;
	}
	
	public static void main(String[] args){
		System.out.println(isPrime(7));
		System.out.println(isPrime(8));
	}
}