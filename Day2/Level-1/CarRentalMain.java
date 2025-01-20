public class CarRentalMain {

    public static void main(String[] args) {
        // create car rental instances
        CarRental car1 = new CarRental("Shaun", "Swift", 5);
        CarRental car2 = new CarRental("Peter", "Baleno", 6);

        // display car details
        car1.displayDetails();
        car2.displayDetails();
    }
}

class CarRental {

    // create construcor of car rental class
    public CarRental(String customerName, String modelType, int days) {
        this.customerName = customerName;
        this.modelType = modelType;
        this.days = days;
        this.totalCost = calculateCost();
    }
    // declare attributes of car rental class
    private String customerName;
    private String modelType;
    private int days;
    private double totalCost;

    // create a method to calculate total cost
    private double calculateCost() {
        return 500 * days;
    }

    // create a method to display car rental details
    public void displayDetails() {
        System.out.println("Customer name: " + customerName);
        System.out.println("Model type: " + modelType);
        System.out.println("Total days: " + days);
        System.out.println("Total cost: " + totalCost);
    }
}