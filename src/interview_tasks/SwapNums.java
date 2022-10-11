package interview_tasks;

public class SwapNums {

    public static void swap(int x, int y){

        x=x+y; //2+3
        y=x-y; //5-3
        x=x-y; //5-2

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void main(String[] args) {
        swap(94,26);
    }
}
