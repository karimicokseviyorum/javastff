public class Insurance {
    public static int calculateCost(int price, int type) {
        switch (type) {
            case 1:
                return (int) (50 + 4.0 / 100 * price);
            case 2:
                return (int) (5.0 / 100 * price);
            case 3:
                return (int) (100 + 3.5 / 100 * price);
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        int startPrice = 1000, endPrice = 6000, step = 200;
        int size = (endPrice - startPrice) / step + 1; // Dynamic array size

        int[] ins1 = new int[size];
        int[] ins2 = new int[size];
        int[] ins3 = new int[size];

        System.out.printf("%-10s %-10s %-10s %-10s %s\n", "Price (?)", "Type 1 (?)", "Type 2 (?)", "Type 3 (?)", "Best Option");

        int index = 0;
        for (int price = startPrice; price <= endPrice; price += step) {
            ins1[index] = calculateCost(price, 1);
            ins2[index] = calculateCost(price, 2);
            ins3[index] = calculateCost(price, 3);

            String bestOption = findBestInsurance(ins1[index], ins2[index], ins3[index]);

            System.out.printf("%-10d %-10d %-10d %-10d %s\n", price, ins1[index], ins2[index], ins3[index], bestOption);

            index++;
        }
    }

    public static String findBestInsurance(int ins1, int ins2, int ins3) {
        if (ins1 <= ins2 && ins1 <= ins3) {
            if (ins1 == ins2 && ins1 == ins3) return "All same";
            if (ins1 == ins2) return "1 & 2 best";
            if (ins1 == ins3) return "1 & 3 best";
            return "Type 1 best";
        } else if (ins2 <= ins1 && ins2 <= ins3) {
            if (ins2 == ins3) return "2 & 3 best";
            return "Type 2 best";
        } else {
            return "Type 3 best";
        }
    }
}
