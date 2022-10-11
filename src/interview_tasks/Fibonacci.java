package interview_tasks;

import java.util.List;

public class Fibonacci {
    public static void Fibonacci(int[] arr) {

        for (int i = arr[0]; i < arr.length; i++) {
            System.out.println(arr[i] + arr[i-1] );
        }
    }

    public static void main(String[] args) {
        Fibonacci(new int[]{1, 2, 3, 5, 9});
    }
    }
