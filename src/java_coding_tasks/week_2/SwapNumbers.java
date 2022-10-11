package java_coding_tasks.week_2;

public class SwapNumbers {

    public static void swapNumbers(int a, int b){
        // a = 5;
        // b = 8;
        System.out.println("a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {

        swapNumbers(5,8);

    }

}
