public class ModulusSign {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        System.out.println(a + " % " + b + " = " + (a % b));    // 7 % 3 = 1 (positive)
        System.out.println(a + " % " + (-b) + " = " + (a % -b)); // 7 % -3 = 1 (positive)
        
        int c = -7;
        System.out.println(c + " % " + b + " = " + (c % b));     // -7 % 3 = -1 (negative)
        System.out.println(c + " % " + (-b) + " = " + (c % -b)); // -7 % -3 = -1 (negative)
        
        System.out.println("\nNote: The result of the modulus operation (%) always");
        System.out.println("has the same sign as the left operand, regardless");
        System.out.println("of the sign of the right operand.");
    }
}
