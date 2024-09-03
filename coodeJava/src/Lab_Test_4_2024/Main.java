package Lab_Test_4_2024;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Rose r1 = new Rose(20);
        Rose r2 = new Rose(30);
        Tulip t1 = new Tulip(20);
        r1.Compare(r2);
        r1.Compare(t1);
        t1.Compare(r1);
        t1.Compare(t1);
    }
}
