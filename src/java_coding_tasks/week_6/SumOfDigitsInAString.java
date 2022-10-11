package java_coding_tasks.week_6;

public class SumOfDigitsInAString {
    /*
    Write a method that can return the sum of digits in a string
     */

    public static String SumOfDigitsInAString(int a, int b) {

//        return a + " + " + b + " = " + (a + b);
////Because of concatenation we will use the integers and turn them into a String
////With (a + b) we can sum the digits, and they are not affected from concatenation
//    }

        int sum = a + b;
        String strSum = String.valueOf(sum);
        return strSum;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        System.out.println(SumOfDigitsInAString(a, b));

    }
}

