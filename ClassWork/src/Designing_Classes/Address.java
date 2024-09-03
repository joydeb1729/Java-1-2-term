package Designing_Classes;

/**
 * Auto Generated Java Class.
 */
  public class Address {
    private String streetAddress, city, state;
    private long zipCode;
    
    //-----------------------------------------------------------------
    //  Constructor: Sets up this address with the specified data.
    //-----------------------------------------------------------------
    public Address (String street, String town, String st, long zip)   {
      streetAddress = street;
      city = town;
      state = st;
      zipCode = zip;
    }
    
    //-----------------------------------------------------------------
    //  Returns a description of this Address object.
    //-----------------------------------------------------------------
    public String toString() {
      return "Street: "+streetAddress+"\nCity: "+city+"\nState :"+state+"\nZip Code :"+zipCode;
    }
  }
  
  
