package java_coding_tasks.week_1;

public class DivideWithNoSign {

    /*
    Numbers -- Divide without / operator
    Write a method that can divide two numbers without using division operator
     */

    public static int divideWithoutDivisionSign(int num1, int num2){
        int count = 0;

        while(num1 >= num2){

            count++;
            num1 = num1 - num2;
        }
        return count;
    }

}
