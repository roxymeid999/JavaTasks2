package java_coding_tasks.week_2;

public class Numbers_DivisibleBy_3_5_15 {

    public static void divisibleBy3_5_15(){

        String by15 = "";
        String by3 = "";
        String by5 = "";
        String noi = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0){
                by15 += " " + i;
            } else if (i % 3 == 0 && i % 15 != 0 ){
                by3 += " " + i;
            }else if (i % 5 == 0 && i % 15 != 0 ){
                by5 += " " + i;
            }
        }
        System.out.println("Divide By 15: " + by15);
        System.out.println("Divide By 5: " + by5);
        System.out.println("Divide By 3: " + by3);

    }

    public static void main(String[] args) {
        divisibleBy3_5_15();
    }
}
