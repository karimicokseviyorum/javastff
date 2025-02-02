public class TestFormat
{
   public static void main(String[] args)
   {
     // Test numbers (positive and negative)
     double posNumber = 1234.5678;
     double negNumber = -1234.5678;
     
     System.out.println("Basic Format Flags Examples:\n");
     
     // 1. Default alignment (right-justified)
     System.out.println("Default:  " + String.format("%10.2f", posNumber));     // "   1234.57"
     
     // 2. Left justify with '-'
     System.out.println("Left (-): " + String.format("%-10.2f", posNumber));    // "1234.57   "
     
     // 3. Always show sign with '+'
     System.out.println("Sign (+): " + String.format("%+8.2f", posNumber));     // "+1234.57"
     System.out.println("Sign (+): " + String.format("%+8.2f", negNumber));     // "-1234.57"
     
     // 4. Space for sign with ' ' (space flag)
     // Adds space for positive numbers, minus for negative
     System.out.println("Space ( ): " + String.format("% 8.2f", posNumber));    // " 1234.57"
     System.out.println("Space ( ): " + String.format("% 8.2f", negNumber));    // "-1234.57"
     
     // 5. Zero padding with '0'
     System.out.println("Zeros (0): " + String.format("%010.2f", posNumber));   // "0001234.57"
     
     // 6. Parentheses for negative numbers with '('
     System.out.println("Paren ((): " + String.format("%(8.2f", posNumber));    // "1234.57"
     System.out.println("Paren ((): " + String.format("%(8.2f", negNumber));    // "(1234.57)"
     
     // 7. Grouping with ','
     double bigNum = 1234567.89;
     System.out.println("Group (,): " + String.format("%,12.2f", bigNum));      // "1,234,567.89"
     
     System.out.println("\nCombining Multiple Flags:\n");
     
     // Changed: Removed zero padding as it conflicts with left justify
     System.out.println("Combined 1: " + String.format("%-+10.2f", posNumber));    // "+1234.57  "
     
     // Combine grouping, parentheses, and width
     System.out.println("Combined 2: " + String.format("%(,12.2f", negNumber));   // "(1,234.57)"
     
     // Combine sign and grouping (removed zero padding)
     System.out.println("Combined 3: " + String.format("%+,12.2f", bigNum));       // "+1,234,567.89"
     
     System.out.println("\nSpecial Cases:\n");
     
     // Very small number with scientific notation
     double tiny = 0.0000123;
     System.out.println("Scientific: " + String.format("%e", tiny));
     System.out.println("Scientific: " + String.format("%.2e", tiny));
     
     // Percentage
     double percent = 0.8457;
     System.out.println("Percent  : " + String.format("%.1f%%", percent * 100)); // "84.6%"
     System.out.println("Percent  : " + String.format("%.1f%n", percent * 100)); // n is new line
     System.out.println("hands up");
     
     // Currency (using default locale)
     System.out.println("Currency : " + String.format("$%,.2f", bigNum));        // "$1,234,567.89"
   }
}