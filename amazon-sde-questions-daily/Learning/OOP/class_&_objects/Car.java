public class Car {
    int noOfWheels;
    String color;
    String model;
    float speed;
    int fuel;
    int currentFuelInLiters; 
    int maxFuelCapacityInLiters;

    public Car(int noOfWheels, String color, String model, float speed, int maxFuelCapacityInLiters) {
        this.noOfWheels = noOfWheels;
        this.color = color;
        this.model = model;
        this.speed = speed;
        this.maxFuelCapacityInLiters = maxFuelCapacityInLiters;
        this.currentFuelInLiters = 0; // Initially, the car has no fuel
    }

    public void drive() {
        if(this.currentFuelInLiters <= 0) {
            System.out.println("Cannot drive. The car has no fuel.");
            System.out.println("Please refuel the car.");
            return;
        }

        System.out.println("The car is driving at " + this.speed + " Km/h.");
        this.currentFuelInLiters--; // Decrease fuel by 1 liter for each drive
    }

    public void refuel(int fuel){
        this.currentFuelInLiters += fuel;
        if (this.currentFuelInLiters == this.maxFuelCapacityInLiters){
            System.out.println("The car is now fully refueled.");
        } else if (this.currentFuelInLiters > this.maxFuelCapacityInLiters){
            System.out.println("The car cannot hold that much fuel. Excess fuel will be ignored.");
            this.currentFuelInLiters = this.maxFuelCapacityInLiters; // Cap the fuel to max capacity
        } else {
            System.out.println("The car has been refueled. Current fuel: " + this.currentFuelInLiters + " liters.");
        }
    }

    public void getCurrentFuel() {
        System.out.println("Current Fuel in the car: " + this.currentFuelInLiters + " Liters.");
    }

    
}