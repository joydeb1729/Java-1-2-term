package Designing_Classes;

class ParameterTester
{

   public void changeValues (int f1, Num f2, Num f3)
   {
      System.out.println ("Before changing the values: (in change value mathod)");
      System.out.println ("f1\tf2\tf3");
      System.out.println (f1 + "\t" + f2 + "\t" + f3 + "\n");

      f1 = 999;
      f2.setValue(888);
      f3 = new Num (777);

      System.out.println ("After changing the values: (in change value mathod)");
      System.out.println ("f1\tf2\tf3");
      System.out.println (f1 + "\t" + f2 + "\t" + f3 + "\n");
   }
}
