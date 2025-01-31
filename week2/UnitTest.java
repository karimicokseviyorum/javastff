import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * This class compares salary calculations between Task4 and SalaryAdvanced implementations
 * to ensure they produce the same results.
 */
public class UnitTest {
    /**
     * Main method that runs both salary calculations and compares their outputs
     * 
     * @param args Command line arguments (not used)
     * @throws Exception If there are any errors during execution
     */
    public static void main(String[] args) throws Exception {
        // Capture output from Task4
        ByteArrayOutputStream baosTask4 = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; // Save original output stream
        System.setOut(new PrintStream(baosTask4)); // Redirect output to our capture buffer
        Task4.main(new String[0]); // Run Task4 calculation
        System.out.flush(); // Make sure all output is written
        String task4Output = baosTask4.toString(); // Get Task4's output as string

        // Capture output from SalaryAdvanced
        ByteArrayOutputStream baosSalaryAdv = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baosSalaryAdv)); // Redirect output again
        SalaryAdvanced.main(new String[0]); // Run SalaryAdvanced calculation
        System.out.flush();
        String salaryAdvOutput = baosSalaryAdv.toString();

        System.setOut(originalOut); // Restore original output stream

        // Extract salary values from both outputs
        double salaryTask4 = extractSalary(task4Output);
        double salaryAdv = extractSalary(salaryAdvOutput);

        // Compare salaries with small tolerance for floating point differences
        double tolerance = 0.0001;
        if (Math.abs(salaryTask4 - salaryAdv) < tolerance) {
            System.out.println("Salaries match: " + salaryTask4 + " EUR");
        } else {
            System.out.println("Salaries do not match. Task4: " + salaryTask4 + " EUR, SalaryAdvanced: " + salaryAdv + " EUR");
        }
    }

    /**
     * Extracts the salary value from a string containing program output
     * 
     * @param output The string containing program output with salary information
     * @return The extracted salary value as a double, or 0.0 if no valid salary is found
     */
    private static double extractSalary(String output) {
        // Split output into lines
        String[] lines = output.split("\\r?\\n");
        for (String line : lines) {
            // Look for lines containing a colon (typical format "Label: value")
            int colonIndex = line.indexOf(":");
            if (colonIndex != -1) {
                // Extract everything after the colon
                String numPart = line.substring(colonIndex + 1);
                // Remove everything except numbers, decimal points and minus signs
                numPart = numPart.replaceAll("[^0-9.\\-]", "").trim();
                if (!numPart.isEmpty()) {
                    try {
                        return Double.parseDouble(numPart); // Convert to number
                    } catch (NumberFormatException e) {
                        // Skip if the string isn't a valid number
                    }
                }
            }
        }
        return 0.0; // Return 0 if no valid salary found
    }
} 