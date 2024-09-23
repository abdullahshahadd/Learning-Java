public class StudentClass70 {
    String name;

    int age;

    int rollNum;

    String house;

    public StudentClass70(String name, int age, int rollNum, String house) {
        this.name = name;
        this.age = age;
        this.rollNum = rollNum;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student Details: \n{" +
                "Name: " + name + ",\n age: " + age + ",\n Roll Number: " + rollNum + ",\n House: " + house + "}";
    }

    public static void main(String[] args) {
        StudentClass70 student = new StudentClass70("Messi", 37, 32, "Suiiii");
        System.out.println(student);
    }
}
