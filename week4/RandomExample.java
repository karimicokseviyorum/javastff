import java.util.Scanner;
import java.lang.Math;

public class RandomExample {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        byte random = (byte)(Math.random()*8+1);
        System.out.println("my so secret num p is: " + random);
        System.out.println("Guess my random n00b: ");
        byte guess = Byte.parseByte(line.nextLine());
        if (guess == random)
            System.out.println("pwned kek");
        else
            System.out.println("git gut");
    }
}