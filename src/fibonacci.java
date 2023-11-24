import java.util.Arrays;
import java.sql.Array;
import java.util.Arrays;

public class fibonacci {

    public static void main(String[] args) {
        int[] array = new int[20];
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            array[i] =  array[i-1] + array[i-2];
        }

        System.out.println(Arrays.toString(array));
    }
}
