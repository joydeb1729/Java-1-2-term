package JavaLabDay1;


public class Coin
{
  private final int HEADS = 0;
  private final int TAILS = 1;
  
  private int face;
  
  public Coin () {
    flip();
  }
  public void flip () {
    face = (int) (Math.random() * 2);
  }
  public boolean isHeads () {
    return (face == HEADS);
  }
  public String toString() {
    if (face == HEADS)
      return "Heads";
    else
      return "Tails";
  }
}
