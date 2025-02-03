public class SortaSum {
    public static void main(String[] args) {
        System.out.println(sortaSum(10, 11));  // Should print 21
        System.out.println(sortaSum(12, 13));  // Should print 25
        System.out.println(sortaSum(19, 2));   // Should print 21
    }

    public static int sortaSum(int a, int b) {
        if(a+b <= 19 && a+b >= 10)
            return 20;
        else
            return a+b;
    }
}
