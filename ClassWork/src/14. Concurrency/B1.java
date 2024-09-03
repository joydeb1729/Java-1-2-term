class B1 extends Thread
{
  public void run()
  {
    System.out.println("thread B is started:");
    for(int j=1;j<=100;j++)
    {
      System.out.println("\t from thread B:j="+j);
    }
    System.out.println("exit from thread B:");
  }
}