
import java.util.Random;
import java.util.Scanner;

public class LiveDemo {

    public static void main(String[] args) {

        // simple if statement
        boolean isDark = true;
        boolean isLightOn = false;
        if (isDark) {
            isLightOn = true;
        }

        // if-else statement
        Random random = new Random();
        int time = random.nextInt(24) + 1;
        if (time >= 19) {
            System.out.println("Let's switch the lights on.");
            isLightOn = true;
        } else {
            System.out.println("Safe energy!");
            isLightOn = false;
        }

        // if-else if-else statement
        if ( (time >= 19) && isDark ) {
            System.out.println("Let's switch the lights on.");
            isLightOn = true;
        } else if (time >= 19 && !isDark) {
            System.out.println("Not dark yet ... let's wait some more time to turn on the lights.");
            isLightOn = false;
        } else {
            System.out.println("Safe energy!");
            isLightOn = false;
        }

        // switch statement
        isDark = true;
        isLightOn = false;
        time = 19;
        switch (time) {
            case 19:
                if (isDark) {
                    System.out.println("Let's switch the lights on.");
                    isLightOn = true;
                } else {
                    System.out.println("Not dark yet ... let's wait some more time to turn on the lights.");
                    isLightOn = false;
                }
            default:
                System.out.println("Safe energy!");
                isLightOn = false;

        }
        System.out.println("isLightOn: " + isLightOn); // why?


        // dangling else problem ---
        // in case of a not equal to 1 --> b == 36, right?
        // int a = 1, b = 1; // all good
        int a = 2, b = 1;
        if (a == 1)
            if (b == 1)
                a = 36;
        else
            b = 36;
        System.out.println("a: " + a);
        System.out.println("b: " + b);


        // do - loop
        int number = 11;
        do {
            System.out.println(number);
            number += 1;

        } while (number < 10);

        // while loop
        number = 10;
        while (number < 10) {
            System.out.println(number);
            number += 1;
        }

        // while loop with scanner
        Scanner myScanner = new Scanner(System.in);
        String input = "";
        do {
            System.out.println("Hi! One more round? [y - yes, n - no]");
            input = myScanner.next();
        } while (input.equals("y")); // Attention - as we are comparing Strings we cannot use == to test for content
        // equality --> within one of the next chapters

        // for example
        for (int i = 30; i >= 0; i--){
            System.out.print(i + ", ");
        }
        System.out.println();

        int j = 30;
        while (j >= 0)  {
            System.out.print(j+ ", ");
            j--;
        }
        System.out.println();

        for (int i = 0; i <30; i += 2){
            System.out.print(i + ", ");
        }
        System.out.println();

    }
}
