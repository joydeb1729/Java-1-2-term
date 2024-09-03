package Designing_Classes;

class MyClass {
   private static int count = 0;

   public MyClass () {
      count++;
   }
   public MyClass (int n) {
      count-=n;
   }
   public static int getCount () {
      return count;
   }
   public int get_Count () {
      return count;
   }
   public void inc_Count (int n) {
      count+=n;
   }
}
