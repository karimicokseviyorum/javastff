import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        // System is a class that provides methods related to the "system", or environment, where programs run. It also provides System.out, which is a special value that has additional methods (like println) for displaying output.
        // In fact, we can use System.out.println to display the value of System.out:
        System.out.println(System.out);
        // result java.io.PrintStream@4517d9a3
        // This output indicates that System.out is a PrintStream, which is defined in a package called java.io.
        String line;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        line = scanner.nextLine();
        System.out.println(line);
        System.out.println("hahahahah, imagine saying : " + line);
        System.out.println("Enter a byte value:");
        String input = scanner.nextLine();
        byte value2 = Byte.parseByte(input);
        System.out.println("You entered: " + value2);

        // Using scanner.nextByte() directly is not recommended because:
        // 1. It throws InputMismatchException if input is not a valid byte
        // 2. It leaves the newline character in the input buffer which can cause issues with subsequent reads
        // 3. It provides no opportunity to validate or sanitize the input before parsing
        // 4. Error recovery is more difficult since the invalid input remains in the scanner
        //
        // Instead, use scanner.nextLine() and parse with Byte.parseByte() in a try-catch block
        // This gives more control over error handling and input validation
        // MORE ON WHY AT why.java

    }
}