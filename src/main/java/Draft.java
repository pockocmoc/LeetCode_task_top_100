
import java.util.Arrays;

public class Draft {
    public static void main(String[] args) {
        int[] arraySource = {1, 2, 3, 4, 5, 6};
        int[] arrayDestination = {21, 31, 41, 51, 61, 71, 81, 91};

        System.out.println("arraySource: " + Arrays.toString(arraySource));
        System.out.println("arrayDestination: "
                + Arrays.toString(arrayDestination));

        System.arraycopy(arraySource, 1, arrayDestination, 2, 3);
        System.out.println("arrayDestination after arrayCopy: "
                + Arrays.toString(arrayDestination));
    }
}

