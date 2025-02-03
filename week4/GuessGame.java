import java.util.Scanner;
import java.lang.Math;

public class GuessGame {
    public static void main(String[] args) {
        byte randomNumber = (byte)(Math.random()*100+1);
        System.out.println("psst, my secret is " + randomNumber);
        byte guess = 101;
        System.out.println("guess, digga between 1 and 100");
        Scanner line = new Scanner(System.in);
        guess = Byte.parseByte(line.nextLine());
        while(guess != randomNumber) {
            if(guess < randomNumber)
                System.out.println("too low");
            else
                System.out.println("too high");
            System.out.println("guess, digga between 1 and 100");
            line = new Scanner(System.in);
            guess = Byte.parseByte(line.nextLine());
        }
        System.out.println("goodjob luckfag");
    }
}