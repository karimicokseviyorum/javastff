public class Octal {
    public static void main(String[] args) {
        // Octal values in Java start with 0
        int octalNumber1 = 010;    // Octal 10 = Decimal 8
        int octalNumber2 = 0100;   // Octal 100 = Decimal 64
        int octalNumber3 = 0777;   // Octal 777 = Decimal 511

        // Print both octal and decimal representations
        System.out.println("Octal 010 = Decimal " + octalNumber1);
        System.out.println("Octal 0100 = Decimal " + octalNumber2); 
        System.out.println("Octal 0777 = Decimal " + octalNumber3);

        // Converting decimal to octal using Integer.toOctalString()
        int decimal = 64;
        String octalString = Integer.toOctalString(decimal);
        System.out.println("\nDecimal " + decimal + " = Octal " + octalString);
    }
}
