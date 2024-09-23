public class CourseClass52 {

    static int maxCapacity = 100;

    String courseName;

    int enrollments;

    String[] enrolledStudents;

    CourseClass52(String courseName) {
        this.courseName = courseName;
        enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity) {
        CourseClass52.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName) {
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    void unEnrollStudent(String studentName) {
        enrolledStudents = ArrayUtility.deleteFromArray(enrolledStudents, studentName);
        System.out.println("Student removed");
        enrollments--;
    }


}
