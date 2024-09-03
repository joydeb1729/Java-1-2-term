package Designing_Classes;

class Num {
  private int value;
  
  public Num (int update) {
    value = update;
  }
  
  public void setValue (int update)
  {
    value = update;
  }
  
  public String toString () {
    return value + "";
  }
}
