package interview_tasks;

public class Even_Odd {

    public static String evenOdd(int num){

        if(num%2==0){
            return "Even";
        }
        return "Odd";
    }


    public static void main(String[] args) {
        System.out.println("evenOdd(3) = " + evenOdd(3));
    }
}
