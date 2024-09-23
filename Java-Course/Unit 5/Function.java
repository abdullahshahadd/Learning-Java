public class Function {
    public static void main(String[] args) {
       /* System.out.println("In main method");
        greetUser();
        System.out.println("Method calling Complete");
        greetUser();*/
        printFirstPattern();
        /*thirdPattern();
        secondPattern();*/
    }

    public static void greetUser() {
        System.out.println("Good Morning from KGCoding");
    }

    public static void printFirstPattern() {
        int rows = 0;
        while (rows < 5) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }

    }

    public static void secondPattern() {
        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *\n");
    }

    public static void thirdPattern() {
        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }
}
