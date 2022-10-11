package java_coding_tasks.week_4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SameLetters {

    public static boolean sameLetters(String str, String str2) {

        char[] array = str.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array);
        Arrays.sort(array2);

        if (Arrays.equals(array,array2)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(sameLetters("one", "oen"));

        String [] fruits = {"apple", "orange"};
        System.out.println("String.join(\",\", fruits) = " + String.join(",", fruits));


    }
}
