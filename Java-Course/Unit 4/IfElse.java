public class IfElse {
    public static void main(String[] args) {
        boolean isMale = false;
        String name = "Pendu";

        if (isMale) {
            System.out.println("Mr. " + name);
        } else {
            System.out.println("Mrs. " + name);
        }

        boolean isOld = false;
        boolean isAdult = false;

        if (isOld) {
            System.out.println("Hello Senior Citizen");
        } else if (isAdult) {
            System.out.println("Hello Adult");
        } else {
            System.out.println("Hello Child");
        }
    }
}
