import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Deserializer{

   public Student deserialzeStudent(){
    
    Student student;
  
    try{
      
     FileInputStream fin = new FileInputStream("student.ser");
     ObjectInputStream ois = new ObjectInputStream(fin);
     student = (Student) ois.readObject();
     ois.close();
    
     return student;
     
    }catch(Exception ex){
     ex.printStackTrace();
     return null;
    } 
   } 
}