package java_coding_tasks.week_5;

public class ReverseString {

    public static String reversedString(String str){

        String result = "";

        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }



    public static void main(String[] args) {
        System.out.println("reversedString(\"apple\") = " + reversedString("apple"));
    }
}
