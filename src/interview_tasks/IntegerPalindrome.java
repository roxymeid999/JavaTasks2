package interview_tasks;

public class IntegerPalindrome {

    public static boolean intPalindrome( int num) {
        int palindrome = num;
        int reversed = 0;

        while (palindrome != 0){
            int digit = palindrome % 10;
            reversed = (reversed * 10) + digit;
            palindrome /= 10;
        }

        if (num == reversed){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("intPalindrome(1221) = " + intPalindrome(1221));
    }
}
