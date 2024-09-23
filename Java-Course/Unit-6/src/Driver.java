public class Driver {

    static int minAgeForDriving = 18;

    String name;

    String dateOfLicence;

    int age;

    public  boolean isAllowedToDrive() {
        return this.age >= minAgeForDriving;
    }

    public static void main(String[] args) {

/*        Car mycar = new Car();
        mycar.addFuel(6);
        mycar.drive();
        mycar.drive();
        mycar.drive();
        mycar.addFuel(3);
        System.out.println(mycar.getCurrentFuelLevel());*/

        Car swift = new Car("Red");
        Car thar = new Car();
        // swift.addFuel(6);
        swift.start().drive();
        System.out.println(swift.color);

        /*Driver myDriver = new Driver();
        myDriver.dateOfLicence = "1/Jan/2024";
        System.out.println(Driver.minAgeForDriving);*/
    }
}


