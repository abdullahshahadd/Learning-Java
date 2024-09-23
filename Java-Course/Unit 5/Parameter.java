public class Parameter {
    public static void main(String[] args) {
        System.out.println(sum(4,7));
        System.out.println(sum(5,9));
        System.out.println(sum(-67,67));
    }

    public static int sum(int num1, int num2) {
        System.out.println("First Number recieved: " + num1);
        System.out.println("Second Number recieved: " + num2);
        return num1 + num2;
    }
}
