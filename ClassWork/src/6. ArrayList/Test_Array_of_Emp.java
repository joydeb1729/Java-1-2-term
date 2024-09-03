public class Test_Array_of_Emp
{  
    public static void main(String args[])
    {
        
        Emp[] employees = new Emp[3];
        
        for(int i=0; i<employees.length; i++){
            employees[i] = new Emp(i+1," ");
        }
        employees[0].setName("Anis");
        employees[1].setName("Karim");
        employees[2].setName("Rahim");
        
        for(int i=0; i<employees.length; i++){
            System.out.println(employees[i]);
        }
    }
}

