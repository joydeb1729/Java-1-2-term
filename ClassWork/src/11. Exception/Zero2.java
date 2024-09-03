public class Zero2 {
   public static void main (String[] args) {
      int numerator = 10;
      int denominator = 0;

      m1(numerator, denominator);
      System.out.println ("This text will not be printed.");
   }
   
   static void m1(int num, int denom) {
       m2(num, denom);
       System.out.println ("This text will not be printed either.");
   }
   static void m2(int num, int denom) {
        int div = num / denom;
        System.out.println ("no chance here as well");
   }
}
