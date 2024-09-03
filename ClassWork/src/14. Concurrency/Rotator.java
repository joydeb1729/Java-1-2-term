/* j.n.magee
//updated: daniel.sykes 2013
 */


import java.awt.*;
import java.applet.*;



class Rotator implements Runnable {

  public void run() {
    try {
      while(true) ThreadPanel.rotate();
    } catch(InterruptedException e) {}
  }
}


