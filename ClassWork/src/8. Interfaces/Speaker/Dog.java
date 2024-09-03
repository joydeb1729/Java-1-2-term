public class Dog implements Speaker
{
   private String name;

   public Dog (String nName)
   {
      name = nName;
   }

   public void speak()
   {
      System.out.println("Gheu-Gheu");
   }

   public String toString()
   {
      return "Dog: " + name;
   }
}
