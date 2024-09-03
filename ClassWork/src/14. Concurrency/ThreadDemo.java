import java.awt.*;
import java.applet.*;

public class ThreadDemo extends Applet {
  ThreadPanel A;
  ThreadPanel B;

  public void init() {
    A = new ThreadPanel("Thread A",Color.blue);
    B = new ThreadPanel("Thread B",Color.blue);
    add(A);
    add(B);
 setBackground(Color.lightGray);
  }

  public void start() {
    A.start(new Rotator());
    B.start(new Rotator());
  }

  public void stop() {
    A.stop();
    B.stop();
  }
}
