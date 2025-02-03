public class TwoD {
    public static void main(String args[]) {
        double[][] table = {
            {1.3, 3.5, 7.8, 4.0}, 
            {7.5, 8.3, 6.9, 3.2}, 
            {4.5, 6.7, 3.4, 7.2}
        };
        System.out.println("Length 1st dimension: " + table.length);
        System.out.println("Length 2nd dimension: " + table[0].length);
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
    }
}