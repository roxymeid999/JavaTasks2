package java_coding_tasks.week_6;

import java.util.Arrays;

public class MaxNumberInArray {
     /*
    Write a method that can find the maximum number in an int Array
     */

    public static int FindMaximum (int[] intArray){

        int max = 0; //This will contain the maximum number

        for (int each : intArray) { //We will iterate through the intArray
            if (each > max) {
                max = each; //max will change whenever each > max
            }
        }
        return max;
    }

    public static int FindMaximum2(int[] intArray){
        Arrays.sort(intArray);
        return  intArray[intArray.length-1];
    }

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 3, 2, 1};

        System.out.println(FindMaximum(intArray));

        System.out.println(FindMaximum2(intArray));

    }
}
