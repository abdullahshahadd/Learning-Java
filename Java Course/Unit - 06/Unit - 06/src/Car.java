public class Car {

    static int noOfCarsSold;

    int noOfWheel;

    String color;

    float maxSpeed;

    float currentFuelInLitres;

    int noOfSeats;

    static {
        noOfCarsSold = 0;
        System.out.println("I am a Static Block");
    }

    {
        noOfCarsSold++;
        System.out.println("I am in Init Block");
    }

    Car(String color) {  // Default Constructor
        this.color = color;
        noOfWheel = 4;
        maxSpeed = 150;
        currentFuelInLitres = 2;
        noOfSeats = 5;
    }

    Car() {  // Default Constructor
        this("Black");
        currentFuelInLitres = 5;
    }

    public Car start() {
        if (currentFuelInLitres <= 0) {
            System.out.println("Car is out fuel, cannot start");
        } else if (currentFuelInLitres < 5) {
            System.out.println("Car is in reserve mode, please refuel. Car is started. Vroom");
        } else {
            System.out.println("Car is started, Vrooom.");
        }
        return this;
    }

    public void drive() {
        currentFuelInLitres--;
        System.out.println("Car is driving.");
    }

    public void addFuel(float currentFuelInLitres) {
        this.currentFuelInLitres += currentFuelInLitres;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLitres;
    }

}