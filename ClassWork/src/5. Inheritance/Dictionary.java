public class Dictionary extends Book
{
   private int definitions = 52500;

   //----------------------------------------------------
   //  Prints a message using both local and inherited values.
   //----------------------------------------------------
   public void definitionMessage ()
   {
      System.out.println ("Number of definitions: " + definitions);

      System.out.println ("Definitions per page: " + definitions/pages);
   }
}

