// toString()
public class Car {
    int noOfWheels;

    int noOfDoors;

    int maxSpeed;

    String name;

    String modelName;

    String company;

    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelName, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelName = modelName;
        this.company = company;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", noOfDoors=").append(noOfDoors);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", name='").append(name).append('\'');
        sb.append(", modelName='").append(modelName).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        Car swift = new Car(4, 4, 120, "Swift", "SW876", "Messi");
        System.out.println(swift.toString());
    }
}
