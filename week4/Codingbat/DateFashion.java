public class DateFashion {
    public static void main(String[] args) {
        System.out.println(dateFashion(5, 10));
        System.out.println(dateFashion(5, 2));
        System.out.println(dateFashion(5, 5));
    }

    public static int dateFashion(int you, int date) {
        if(you > 2 && date > 2)
            if(you >= 8 || date >=8) return 2;
            else return 1; 
        else return 0;
    }
}
