public class Array {
    public static void main(String[] args) {
        /*int[] myArr = new int[5];
        myArr[0] = 98;
        myArr[3] = 65;
        myArr[1] = 2;
        myArr[2] = 8;
        myArr[4] = 37;*/

        int[] myArr = {98, 2, 8, 65, 37};
        int index = 2;

        /*System.out.println(myArr[0]);
        System.out.println(myArr[1]);
        System.out.println(myArr[index]);
        System.out.println(myArr[3]);
        System.out.println(myArr[4]);*/

        // Array Traversal
        int i = 0;
        while (i < myArr.length) {
            System.out.println(myArr[i]);
            i++;
        }

        String[] strArr = new String[4];
        strArr[0] = "My String";

        String[] newStrArr = {"first", "second", "third"};
        System.out.println(newStrArr.length);

    }
}
