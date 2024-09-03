/*
 * ElectricGuitar implements the functionality of  StringedIntrument
 */
public class ElectricGuitar extends StringedInstrument {
   public ElectricGuitar() {
         this.name = "Guitar";
         this.numberOfStrings = 6;
   }
   public ElectricGuitar(int numberOfStrings) {
         this.name = "Guitar";
         this.numberOfStrings = numberOfStrings;
    }
   @Override
    public void play() {
         System.out.println("An electric " + numberOfStrings + "-string " + name
                + " is rocking!");
    }
}
