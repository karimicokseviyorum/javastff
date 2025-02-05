public class ForEach {
    public static void main(String[] args) {
        // Method 1: Array literal - Most concise way
        // Memory is allocated and values are initialized in one step
        int[] numbers = {1, 2, 3, 4, 5};
        
        // Method 2: Declaration and initialization in separate steps
        // Just declaring - no memory is allocated yet, numbers2 is null
        int[] numbers2;
        // Now memory is allocated for 5 integers
        // All elements are automatically initialized to 0
        numbers2 = new int[5];
        // Manually setting each value
        numbers2[0] = 1;
        numbers2[1] = 2;
        numbers2[2] = 3;
        numbers2[3] = 4;
        numbers2[4] = 5;

        // Method 3: Anonymous array creation
        // Similar to Method 1 but more verbose
        // Useful when you need to create a new array after declaration
        // or when passing as a method parameter
        int[] numbers3 = new int[]{1, 2, 3, 4, 5};

        // Demonstrating output for all arrays
        System.out.println("Array 1:");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("\nArray 2:");
        for (int number : numbers2) {
            System.out.println(number);
        }

        System.out.println("\nArray 3:");
        for (int number : numbers3) {
            System.out.println(number);
        }
    }   
}
