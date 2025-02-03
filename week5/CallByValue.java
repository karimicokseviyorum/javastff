public class CallByValue {
    public static void main(String[] args) {
        int a = 5;
        square(a);
        System.out.println("Value of a after square: " + a);
    }
    public static void square(int x) {
        x = x * x;
        System.out.println("Value of x inside square: " + x);
    }
}
