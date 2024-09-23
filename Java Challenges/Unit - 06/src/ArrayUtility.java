import java.util.Objects;

public class ArrayUtility {

    public static int occur(String[] array, String name) {
        int occur = 0;
        int i = 0;
        while (i < array.length) {
            if (array[i] == name) {
                occur++;
            }
            i++;
        }

        return occur;
    }

    public static String[] deleteFromArray(String[] array, String name) {
        int occur = occur(array, name);
        int size = array.length - occur;
        String[] newArray = new String[size];
        int i = 0, j = 0;
        while (i < array.length) {
            if (!Objects.equals(array[i], name)) {
                newArray[j] = array[i];
                j++;
            }
            i++;
        }

        return newArray;
    }

}
