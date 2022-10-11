package java_coding_tasks.week_6;

public class PasswordValidation {
    /*
    Write a return method that can verify if a password is valid or not!
    If all below requirements are met then, the method returns true, otherwise returns false
     */


    public static boolean passwordValidation (String password) {

        boolean validPassword = false;
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean specialChar = false;
        boolean containsDigit = false;

        //~Password MUST have at least 6 characters and should not contain space GOOD
        if (password.length() >= 6 && !password.contains(" ")) {

            //~Password should at least contain one upper character GOOD
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                    upperCase = true;
                    break;

                } else {
                    upperCase = false;
                    break;
                }
            }

            //~Password should at least contain one lower character GOOD
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                    lowerCase = true;
                    break;
                } else {
                    lowerCase = false;
                }
            }

            //~Password should at least contain one special character GOOD
            for (int i = 0; i < password.length(); i++) {
                if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                    containsDigit = true;
                    break;

                } else {
                    containsDigit = false;
                }
            }

            //~Password should at least contain a digit GOOD
            for (int i = 0; i < password.length(); i++) {
                if ((password.charAt(i) >= '!' && password.charAt(i) <= '/') || (password.charAt(i) >= ':' && password.charAt(i) <= '@')) {
                    specialChar = true;
                    break;

                } else {
                    specialChar = false;
                }
            }
        }
        //If all booleans are ture we have a valid password
        if (upperCase == true && lowerCase == true && specialChar == true && containsDigit == true) {
            return true;

        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(passwordValidation("Group!B26"));

    }
}
