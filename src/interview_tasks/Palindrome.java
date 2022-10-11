package interview_tasks;

public class Palindrome {
    public static void main(String[] args) {

        String word = "racecar";
        String reversed = "";

        for (int i = word.length()-1; i >= 0 ; i--) {
            reversed+=word.charAt(i);
        }
        if (word.equalsIgnoreCase(reversed)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
