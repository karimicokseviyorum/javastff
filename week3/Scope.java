
public class Scope {

    public static void main(String[] args) {

        int n = 100;
        int sum = 0;
        int z = 0;

        while (z < n) {
            int square = z * z;
            z++;
            sum = sum + square;
        }
        System.out.println(square); // square is not in the scope of the while loop

        for (int i = 0; i<10; i++) {
            System.out.print(i + ", ");

            for (int j = 0; j < 10; j ++) {
                System.out.print(j + ", ");
            }
            System.out.println(j); // j is in the scope of the for loop
        }

    }

}
