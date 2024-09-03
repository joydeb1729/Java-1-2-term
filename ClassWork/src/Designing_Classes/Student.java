package Designing_Classes;

/**
 * Auto Generated Java Class.
 */
  public class Student
  {
    private String firstName, lastName;
    private Address homeAddress, schoolAddress;
    
    //-----------------------------------------------------------------
    //  Constructor: Sets up this student with the specified values.
    //-----------------------------------------------------------------
    public Student (String first, String last, Address home, Address school)   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
    }
    
    public String toString()
    { 
      return "Name: "+firstName+" "+lastName+
        "\n\nHome Address of "+firstName+
        "\n---------------------\n"+homeAddress+
        "\n\nSchool Address of "+firstName+
        "\n----------------------\n"+schoolAddress;
    }
  }
