public class EscapeLoop {
    public static void main(String[] args) {
        System.out.println("Example 1: break in while loop");
        int i = 0;
        while (i < 10) {
            if (i == 5) {
                break; // exits the loop when i reaches 5
            }
            System.out.println("i = " + i);
            i++;
        }
        
        System.out.println("\nExample 2: continue in while loop");
        i = 0;
        while (i < 5) {
            if (i == 3) {
                i++; // Prevent infinite loop by incrementing before continue
                continue; // skips the rest of the loop body when i is 3
            }
            System.out.println("i = " + i);
            i++;
        }

        System.out.println("\nExample 3: break in for loop");
        for (int j = 0; j < 10; j++) {
            if (j == 7) {
                break; // exits the loop when j reaches 7
            }
            System.out.println("j = " + j);
        }

        System.out.println("\nExample 4: continue in for loop");
        for (int j = 0; j < 5; j++) {
            if (j % 2 == 0) {
                continue; // skips printing even numbers
            }
            System.out.println("j = " + j);
        }
    }
}
