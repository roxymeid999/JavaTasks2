package interview_tasks;

public class SumOfDigits {

    public static int sumOfNums(int num){

        int cont = 0;

        while(num != 0){
            int reminder = num%10;
            cont += reminder;
            num /= 10;
        }
        return cont;
    }

    public static void main(String[] args) {
        System.out.println("sumOfNums(1233) = " + sumOfNums(12333));
    }
}
