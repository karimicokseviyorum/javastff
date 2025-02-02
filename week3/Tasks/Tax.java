import java.util.Scanner;
import java.util.Locale;


public class Tax {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter a gross amount: ");
        double grossAmount = Double.parseDouble(read.nextLine());
        System.out.println("Please enter a VAT rate: ");
        double vatRate = Double.parseDouble(read.nextLine());

        // Please enter a VAT rate: 0.19
        // Net amount: 420.1680672268908
        // Taxes: 79.8319327731092
        // Net amount formatted: 420.17 €
        // Tax rounded: 79.83 €
        // Use the following calculation formula:
        // net = gross / (1 + vat)
        // So sth like this should work: String.format(Locale.ENGLISH,"%1.2f €", net)
        // IMPLEMENTATION;
        double net = grossAmount / (1 + vatRate);
        double taxes = grossAmount - net;
        System.out.println("Net amount: " + net);
        System.out.println("Taxes: " + taxes);
        System.out.println("Net amount formatted: " + String.format(Locale.ENGLISH, "%7.2f €", net));
        System.out.println("Tax rounded: " + String.format(Locale.ENGLISH, "%1.2f €", taxes));
    }
}