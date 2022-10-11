package interview_tasks;

import java.util.Arrays;

public class Anagram {

    public static boolean isAnagram(String str1, String str2){
        String copyOf1 = str1.replaceAll(" ", "");
        String copyOf2 = str2.replaceAll(" ", "");
        char [] chars1 = copyOf1.toLowerCase().toCharArray();
        char [] chars2 = copyOf2.toLowerCase().toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);


        if (Arrays.equals(chars1, chars2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("isAnagram(\"peek\", \"keep\") = " + isAnagram("Dirty Room", "dormitory"));
    }
}
