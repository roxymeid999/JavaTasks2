package interview_tasks;

public class Factorial {

    public static int factorial(int num){

        int sum = 1;

        for (int i = num; i >0; i--) {

            sum *= i;

        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("factorial(10) = " + factorial(9));
    }
}
