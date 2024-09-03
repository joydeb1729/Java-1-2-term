
public class Deserializer_Test {
  
  public static void main (String args[]) {
    
    Deserializer deserializer = new Deserializer();
    Student student = deserializer.deserialzeStudent();
    System.out.println(student);
  } 
}
