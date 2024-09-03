/*
 * an Instrument object contains a field name and a method called play, that must be implemented by a sub-class.
*/
abstract class Instrument {
     protected String name;
     abstract public void play();
}
