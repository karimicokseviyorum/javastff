public class ArrayWorker
{

   public static void doubleLastHalf(int[] values)
   {
     for (int i = values.length / 2; i < values.length; i++)
     {
       values[i] = values[i] * 2;
     }
   }

   public static void printArray(int[] values)
   {
      for (int i = 0; i < values.length; i++)
      {
        System.out.print(  values[i] + " " );
      }
   }

   public static void main(String[] args)
   {
     int[] numArray = {3,8,-3};
     doubleLastHalf(numArray);
     printArray(numArray);
   }
}
