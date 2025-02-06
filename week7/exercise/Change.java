import java.util.Scanner;

public class Change {
    public static boolean change(int priceInCents, int paidInCents) {
        int giveBack = paidInCents - priceInCents;
        int[] bills = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1}; // Values in cents
        int[] usedTimes = new int[bills.length];

        if (giveBack < 0) {
            System.out.println("Insufficient payment!");
            return false;
        }

        System.out.println("Change to give: " + (giveBack / 100.0) + " EUR\n");

        for (int i = 0; i < bills.length; i++) {
            if (giveBack >= bills[i]) {
                usedTimes[i] = giveBack / bills[i];
                giveBack %= bills[i];
            }
        }

        for (int i = 0; i < usedTimes.length; i++) {
            if (usedTimes[i] > 0) {
                String str = (bills[i] >= 100 ? "EUR" : "ct");
                System.out.println(usedTimes[i] + " x " + (bills[i] >= 100 ? bills[i] / 100 : bills[i]) + " " + str);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the price (?): ");
        double price = scanner.nextDouble();
        System.out.print("Please enter the amount paid (?): ");
        double paid = scanner.nextDouble();

        int priceInCents = (int) Math.round(price * 100);
        int paidInCents = (int) Math.round(paid * 100);

        change(priceInCents, paidInCents);
    }
}
