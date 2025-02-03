public class Rectangle {
    public static void main(String[] args) {
        int a = 4, b = 5;
        for (int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++)
                System.out.print("*");
            System.out.println("");
        }

        // Write the code below to print 55555, 4444, 333, 22, 1 with each on a different line.
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++)
                System.out.print(i);
            System.out.println("");
        }

        //print a triangle with a height of 5
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println("");
        }
    }

}