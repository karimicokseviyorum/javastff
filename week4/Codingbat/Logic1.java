public class Logic1 {
    public static void main(String[] args) {
        more20(21);  // Should print true
        more20(22);  // Should print true 
        more20(23);  // Should print false
    }
    
    public static void more20(int n) {
        System.out.println(n % 20 == 1 || n % 20 == 2);
    }
}