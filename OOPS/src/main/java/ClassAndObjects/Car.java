package ClassAndObjects;

/**
 * The type Car.
 */
// Class definition for Car
public class Car {
    /**
     * The Brand.
     */
    String brand;
    /**
     * The Model.
     */
    String model;

    /**
     * Instantiates a new Car.
     *
     * @param brand the brand
     * @param model the model
     */
// Constructor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    /**
     * Display info.
     */
// Method to display car information
    public void displayInfo() {
        System.out.println("Car: " + brand + " " + model);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
// Main method
    public static void main(String[] args) {
        // Creating objects
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Tesla", "Model S");

        // Accessing object properties
        System.out.println(car1.brand);  // Output: Toyota

        // Calling object methods
        car2.displayInfo();  // Output: Car: Tesla Model S
    }
}

