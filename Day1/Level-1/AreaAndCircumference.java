import java.util.Scanner;

public class AreaAndCircumference {
   // declaring the radius
    double radius;
    // created the funciton to calculate the area of circle
    public void CalculateTheArea() {
        System.out.println(Math.PI * Math.pow(radius, 2));
    }

    // created the function to calculate the circumfernece of the  cirle
    public void CalculateTheCircumference() {
        System.out.println(Math.PI * radius * 2);

    }

    public static void main(String[] args) {
        // creating the object area of the Class AreaOfCircleandCircumherence
        AreaAndCircumference area = new AreaAndCircumference();
       // Scanner of taking input
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the radius of the Circle");
       // taking input from the user
        area.radius = input.nextDouble();
        // calling the function CalculateTheArea
        area.CalculateTheArea();
        // calling the function CalculateTheCircumfernce
        area.CalculateTheCircumference();

    }
}