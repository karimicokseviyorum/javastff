import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        int a, b, c;
        // read 3 numbers from the user in a single line
        Scanner scanner = new Scanner(System.in);
        a = Integer.parseInt(scanner.next());
        b = Integer.parseInt(scanner.next());
        c = Integer.parseInt(scanner.next());
        // print the largest number
        if (a > b && a > c) {
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}