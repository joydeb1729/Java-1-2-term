package Designing_Classes;


public class Test_MyClass {
  
  
  public static void main(String[] args) { 
    
    MyClass obj1;
    
    for (int scan=1; scan <= 10; scan++)
      obj1 = new MyClass();
    
    System.out.println ("Objects created: " + MyClass.getCount());
    
    MyClass obj2 = new MyClass();
    obj1 = new MyClass(-2);
    obj2.inc_Count(5);
    System.out.println ("Value of count is now: " + obj2.get_Count());
    System.out.println ("Value of count is now: " + obj1.get_Count());
  }
  
}
