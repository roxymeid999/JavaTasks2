package interview_tasks;

public class ReverseInt {
    public static void main(String[] args) {

        int num = 1234;
        int reversed = 0;

        while (num != 0){
            int digit = num%10; //4 3 2 1
            reversed = (reversed*10) + digit; //4 43 432 4321
            num /= 10; // 123 12 1 0.1
        }

        System.out.println(reversed);
    }
}
