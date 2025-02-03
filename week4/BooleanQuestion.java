public class BooleanQuestion {
    public static void main(String[] args) {
        boolean sunny = false;
        boolean raining = false;
        int temperature = 32;

        if ( sunny || ( (temperature >= 26) ) && !raining) {
            System.out.println("Let's go to Lake Chiemsee!");
        } else {
            System.out.println("Weather is too bad for a trip to Lake Chiemsee!");
        }
    }
}