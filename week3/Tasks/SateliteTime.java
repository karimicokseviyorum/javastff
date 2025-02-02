import java.util.Scanner;

public class SateliteTime {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Please enter satelite time  time in seconds: ");
        int time = Integer.parseInt(read.nextLine());
        int days = time / 86400;
        time = time % 86400;
        int hours = time / 3600;
        time = time % 3600;
        int minutes = time / 60;
        time = time % 60;
        System.out.println(days + "d " + hours + "h " + minutes + "m " + time + "s");
    }
}