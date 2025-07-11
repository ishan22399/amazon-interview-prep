public class Driver {
    public static void main(String[] args) {
        Car myCar = new Car(4, "Red", "Toyota", 120.5f, 50);
        // myCar.drive(); // Should prompt to refuel
        myCar.refuel(20); // Refuel the car with 20 liters
        myCar.getCurrentFuel(); // Should show current fuel
        myCar.drive(); // Should drive the car
        myCar.getCurrentFuel();
        myCar.refuel(40); // Attempt to refuel with 40 liters, exceeding max capacity
        myCar.getCurrentFuel(); // Should show current fuel after refueling 
        myCar.getCarDetails(); // Display car details
    }
}
