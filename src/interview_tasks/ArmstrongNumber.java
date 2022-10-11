package interview_tasks;

public class ArmstrongNumber {

    public static boolean armstrongNum(int num){
        int numToComp = num;
        int result = 0;

        while(num != 0){
            int reminder = num % 10;
            result += Math.pow(reminder, 3);
            num/=10;
        }
        if (result==numToComp){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("armstrongNum(371) = " + armstrongNum(371));


    }
}
