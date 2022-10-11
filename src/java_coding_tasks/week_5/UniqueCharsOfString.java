package java_coding_tasks.week_5;

public class UniqueCharsOfString {

    public static String uniqueChars(String str){

        String finalResult = "";

        for (int i = 0; i < str.length(); i++) {

            int counter = 0;
            char letter = str.charAt(i);

                for (int j = 0; j < str.length(); j++) {

                    char eachLetter = str.charAt(j);

                    if (letter == eachLetter){
                        counter += 1;
                    }
                }
                if (counter == 1){
                    finalResult += letter;
                }
        }
        return finalResult;
    }

    public static void main(String[] args) {
        System.out.println("uniqueChars(\"apple\") = " + uniqueChars("apple"));
    }
}
