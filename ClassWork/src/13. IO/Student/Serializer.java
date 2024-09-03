
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializer {
  
  public void serializeStudent(String name, int roll, float marks){
    
    //Student s = new Student("Anis",12,99);
    Student s = new Student(name,roll,marks);
    try{
      
      FileOutputStream fout = new FileOutputStream("student.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fout);   
      oos.writeObject(s);
      oos.close();
      System.out.println("Done");
      
    }catch(Exception ex){
      ex.printStackTrace();
    }
  }
}