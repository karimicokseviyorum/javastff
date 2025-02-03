public class TestCopy {
    public static void main(String[] args) {
        char[] ca = {'h','e','l','l','o'};
        char[] cb = {'p','e','o','p','l','e'};
        System.arraycopy(ca, 2, cb, 2, 3);
        // After copying, cb becomes: ['p', 'e', 'l', 'l', 'l', 'e']
        System.out.println(cb);
    }
}
