public class FloatingComparision {
    public static void main(String[] args) {
        double a = 1/3; // when dividing integers, the result is an integer
        double b = 1.0/3; // when dividing a double by an integer, the result is a double
        System.out.println(a);
        System.out.println(b);
        double c = 1.0/3.0;
        double d = 10 + c - 10;
        System.out.println(d);
        if (d == c) { // this is not a good way to compare floating point numbers
            System.out.println("d is equal to c");
        } else {
            System.out.println("d is not equal to c");
        }
        // instead, we can use a small tolerance to compare floating point numbers
        double tolerance = 1e-10;
        if (Math.abs(d - c) < tolerance) {
            System.out.println("d is equal to c");
        } else {
            System.out.println("d is not equal to c");
        }
    }
}