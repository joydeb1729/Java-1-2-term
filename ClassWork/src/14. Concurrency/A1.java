import java.lang.Thread;
class A1 extends Thread
{
  public void run()
  {
    System.out.println("thread A is started:");
    for(int i=1;i<=100;i++)
    {
      System.out.println("\t from thread A:i="+i);
    }
    System.out.println("exit from thread A:");
  }
}
