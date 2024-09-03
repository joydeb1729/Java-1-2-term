package Lab_Test_3_2024;

import java.util.*;

public class Main {
    public static void main(String[] args) {
               
        ArrayList<Shape> sList = new ArrayList<Shape>();
        
        sList.add(new Rectangle(3.14,1));
        sList.add(new Rectangle(1,3.14));
        Rectangle s1 =  new Square(2);
        sList.add(s1);
        sList.add(new Circle(1));
               
        for(int i=1; i<=3; i++){
            if(sList.get(0).equals(sList.get(i)))
                System.out.println(sList.get(0)+" has the same area as "+sList.get(i));
            else
                System.out.println(sList.get(0)+" does not have the same area as "+sList.get(i));
        }
        
        
        
    }
}
