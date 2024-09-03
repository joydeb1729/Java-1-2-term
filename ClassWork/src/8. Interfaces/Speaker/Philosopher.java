public class Philosopher implements Speaker
{
   private String name;

   public Philosopher (String nName)
   {
      name = nName;
   }

   public void speak()
   {
      System.out.println("I am "+name);
   }

   public String toString()
   {
      return "Philosopher: " + name;
   }
}
