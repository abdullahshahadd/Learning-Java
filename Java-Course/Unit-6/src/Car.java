public class Car {

    static int noOfCarsSold;

    int noOfWheels;

    String color;

    float maxSpeed;

    float currentFuelInLitres;

    int noOfSeats;

    static {
        noOfCarsSold = 0;
        System.out.println("I am IN static block");
    }

    {
        noOfCarsSold++;
        System.out.println("I am IN init block");
    }

    Car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLitres = 2;
        noOfSeats = 5;
    }

    Car() {
        this("Black");
        currentFuelInLitres = 5;
    }

    public Car start() {
        if (currentFuelInLitres <= 0) {
            System.out.println("Car is out of Fuel, cannot start");
        } else if (currentFuelInLitres < 5) {
            System.out.println("Car is in reserve mode, please refill");
        } else {
            System.out.println("Car is started. Vroooom....");
        }
        return this;
    }

    public void drive() {
        currentFuelInLitres--;
        System.out.println("Car is driving.");
    }

    public  void addFuel(float currentFuelInLitres) {
        this.currentFuelInLitres =+ currentFuelInLitres;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLitres;
    }

    public float currentFuelInLitres() {
        return currentFuelInLitres;
    }
}
