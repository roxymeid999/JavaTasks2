package java_coding_tasks.week_1;

public class OddOrEven {

     /*
         Numbers -- odd && even
         Write a method which can identify given number is even or odd
         Ex:
            Identify(5) -> "odd"
            Identify(6) -> "even"
          */

    public static String oddOrEven(int num){

        if(num == 0){
            return "null";
        }else if (num % 2 == 0){
            return "even";
        } else if(num % 2 != 0){
            return "odd";
        }
        return "";
    }
}
