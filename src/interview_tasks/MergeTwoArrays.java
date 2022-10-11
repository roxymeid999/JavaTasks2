package interview_tasks;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6};
        int [] arr2 = {7,8,9,10,11};

        int [] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] += arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[i+arr1.length] += arr2[i];
        }

        System.out.println(Arrays.toString(result));

        System.out.println("Ok");
        System.out.println("ok");
    }
}
