import java.util.Scanner;
// created a class Moblie Phone Details to show the details of phone
class MobilePhoneDetails
{
    String brandName;
    String model;
    int price;

    // created the Constructor MobliePhonedatails
    public MobilePhoneDetails(String brandName, String model, int price) {
        this.brandName=brandName;
        this.model = model;
        this.price = price;
    }
    // created the Function Display the output
    public void DisplayOutput()
    {
        System.out.println("The Moblie Phone Brand Name is "+ brandName);
        System.out.println("The Moblie Phone Model is : " + model);
        System.out.println("The Moblie Phoen Price is : "+ price);
    }
}
// this is our main class
public class MobilePhones {
    public static void main(String[] args) {
        // Scanner to take input from the user
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Moblie Phone Brand Name");
        String brandName= input.next();
        System.out.println("Enter the Moblie Phone Model Number");
        String model= input.next();
        System.out.println("Enter the Moblie Phone Price ");
        int price = input.nextInt();
        // Calling the constructor
        MobilePhoneDetails details= new MobilePhoneDetails(brandName , model, price);
        // calling the constructor TO display the out put
        details.DisplayOutput();
    }
}