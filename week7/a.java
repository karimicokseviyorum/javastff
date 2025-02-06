public class a {
 public static boolean isRotated = false;
 public static boolean isMultiplied = false;
 public static int[] rotate(int[] a, int b) {
 int[] t = new int[a.length];
 for (int i = a.length-1; i>=0; i--) {
	System.out.println("aa " + (a.length-1-i));
 t[i] = multiply(a[a.length-1-i],b);
 }
 isRotated = true;
 return t;
 }
 public static int multiply(int b, int a) {
 if (a!=1) {
 isMultiplied = true;}
 return a * b;
 }
 public static void main(String[] args) {
 int[] b = { 1000, 100, 10, 1 };
 b = rotate(b,b[b.length-1]);
 System.out.println("Multiply = " + isMultiplied);
 System.out.println("Rotate = " + isRotated);
 for (int i = 0; i<b.length; i++) {
 System.out.println("b[" + i + "] = " + b[i]*4);
 }
 }
}