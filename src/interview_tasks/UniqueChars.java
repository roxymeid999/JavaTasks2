package interview_tasks;

public class UniqueChars {

    public static String uniqueLetters(String str){
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            String letters = "";
            letters+=str.charAt(i);

            if (!result.contains(letters)){
                result+=letters;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("uniqueLetters(\"apple\") = " + uniqueLetters("apple"));
    }
}
