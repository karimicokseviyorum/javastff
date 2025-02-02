import java.util.Scanner;

public class TempConvert {
    public static void main(String[] args) {
        System.out.println("Enter a temperature in celsius:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        double temperature = Double.parseDouble(line);
        System.out.println(temperature + " degrees Celsius correspond to " + String.format("%2.2f" , 9.0/5*temperature + 32) + " degrees Fahrenheit. ");
    }
}