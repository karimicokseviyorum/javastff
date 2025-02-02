import java.util.Scanner;
import java.util.InputMismatchException;

public class Why {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Problem 1: Buffer issues with mixed input types
        System.out.println("Enter a byte:");
        byte number = scanner.nextByte();  // User enters "42" + Enter
        // The newline (\n) is still in buffer!
        
        System.out.println("Enter your name:");
        String name = scanner.nextLine();  // This gets skipped because it reads the leftover \n
        
        // Problem 2: Error handling issues
        System.out.println("Enter another byte:");
        try {
            byte another = scanner.nextByte();  // User enters "not a number"
            // Scanner gets "stuck" here with invalid input
        } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            // The invalid input is still in the buffer!
            // Further reads will fail until buffer is cleared
            //After this, if you try to read anything else from the scanner, it will keep failing because "hello" is still sitting in the buffer! It's like having a clogged pipe - nothing new can come through until you clear it.
        }
        
        // Better approach:
        System.out.println("Enter a byte:");
        String input = scanner.nextLine();
        try {
            byte value = Byte.parseByte(input);
            System.out.println("Enter your name:");
            String name2 = scanner.nextLine();  // Works as expected
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, but we can continue safely");
        }
        
        scanner.close();
    }
}