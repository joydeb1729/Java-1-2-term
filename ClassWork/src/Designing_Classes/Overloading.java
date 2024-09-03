package Designing_Classes;

class Overloading
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " ! "+num);
    }
    public void disp(int num, char c)  
    {
         System.out.println(c + " # "+num);
    }
}