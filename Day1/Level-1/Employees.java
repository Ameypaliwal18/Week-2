// created the class Employee
public class Employees {
    // Created the name id and Salary of the employee
    String name;
    int id;
    double Salary;
    // made function to display the details of the Employee
    public  void  Display()
    {
        System.out.println(" The Name of the Employee is :"+ name);
        System.out.println(" The Id of the EMmployee is :" + id);
        System.out.println(" The Salary of the Employee is "+ Salary);
    }


    public static void main(String[] args) {
        // declaration of oject of Employee Class and Instance
        Employees employee1= new Employees();
       // added  the name to the Employee Class using the .
        employee1.name= "Amey";
        employee1.id= 022;
        employee1.Salary=100000;
        // calling the Display function with help of object Display;
        employee1.Display();



    }
}