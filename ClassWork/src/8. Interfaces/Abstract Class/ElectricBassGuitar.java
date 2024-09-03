/*
 * ElectricBassGuitar implements the functionality of  StringedIntrument
 */
public class ElectricBassGuitar extends StringedInstrument {
   public ElectricBassGuitar() {
         this.name = "Bass Guitar";
         this.numberOfStrings = 4;
     }
    public ElectricBassGuitar(int numberOfStrings) {
         this.name = "Bass Guitar";
         this.numberOfStrings = numberOfStrings;
    }
    public void play() {
         System.out.println("An electric " + numberOfStrings + "-string " + name
               + " is rocking!");
    }
}
