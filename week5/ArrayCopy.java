public class ArrayCopy {
	public static void main(String[] args) {
		// unutma butun java.lang importlari deafult olarak geliyor
		char[] c1 = {'a','b','c','d','e','f','g','h'};
		char[] c2 = {'l', 'o', 'l'};
		
		System.arraycopy(c2, 0, c1, 3, 3);
		System.out.println(c1);
	}
}