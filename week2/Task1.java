public class Task1 {
    public static void main(String[] args) {
        // First set of variable declarations with initialization
        byte bVar1 = 5;
        short sVar1 = 400;
        int iVar1 = -356576;
        long lVar1 = 100000000000L;
        float fVar1 = 0.123f; // java automatically converts to double if no suffix is provided
        double dVar1 = 0.123;
        boolean isBool1 = false;
        char cVar1 = 'x';

        // Printing first set of values
        System.out.println("bVar1: " + bVar1);
        System.out.println("sVar1: " + sVar1);
        System.out.println("iVar1: " + iVar1);
        System.out.println("lVar1: " + lVar1);
        System.out.println("fVar1: " + fVar1);
        System.out.println("dVar1: " + dVar1);
        System.out.println("isBool1: " + isBool1);
        System.out.println("cVar1: " + cVar1);

        // Note: The following will cause compilation errors due to value ranges
        // They are included as per instructions but won't compile
        
        byte bVar2 = 128;                  // Error: byte range is -128 to 127
        short sVar2 = -18453;
        int iVar2 = 2147483648;            // Error: exceeds int maximum
        long lVar2 = 345236577970L;
        float fVar2 = 4.37456678f;
        double dVar2 = 3645.987654321;
        boolean isBool2 = true;
        char cVar2 = 'hello';              // Error: char can only hold single character

        // Printing second set of values
        System.out.println("\nbVar2: " + bVar2);
        System.out.println("sVar2: " + sVar2);
        System.out.println("iVar2: " + iVar2);
        System.out.println("lVar2: " + lVar2);
        System.out.println("fVar2: " + fVar2);
        System.out.println("dVar2: " + dVar2);
        System.out.println("isBool2: " + isBool2);
        System.out.println("cVar2: " + cVar2);
    }
}

