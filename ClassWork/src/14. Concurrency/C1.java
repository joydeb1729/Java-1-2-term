class C1 extends Thread
{
  public void run()
  {
    System.out.println("thread C is started:");
    for(int k=1;k<=100;k++)
    {
      System.out.println("\t from thread C:k="+k);
    }
    System.out.println("exit from thread C:");
  }
}
