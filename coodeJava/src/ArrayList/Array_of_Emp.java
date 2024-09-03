package ArrayList;

import ArrayList.Emp;
import java.util.Scanner;
public class Array_of_Emp
{  
  Emp[] employees;
  
  Scanner scan = new Scanner(System.in);
  
  public Array_of_Emp(int n){
    employees = new Emp[n];
    
    for(int i=0; i<n; i++){
      System.out.println("Input name for employee"+(i+1)+": ");
      String s = scan.nextLine();
      employees[i] = new Emp(i+1,s);//this will call constructor.
    }  
  }
  public Emp[] getEmployees(){
    return employees;
  }
  public String toString(){
    String S= "\nList of employees\n-----------------\n";
    for(int i=0; i<employees.length; i++){
      S+=employees[i];
    }
    return S;
  }
}

