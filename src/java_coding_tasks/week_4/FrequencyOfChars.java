package java_coding_tasks.week_4;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChars {

    public static void freqOfChars(String str){

        Map <Character, Integer> result = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char key = str.charAt(i);

            if (result.containsKey(key)){

                result.put(key, result.get(key) + 1);
            }else{
                result.put(key, 1);
            }

        }
        System.out.println(result);

    }

    public static void freqOfChars2(String str){

        String checked = "";

        for (int i = 0; i < str.length(); i++) {

            int counter = 0;
            char letter = str.charAt(i);

            if (checked.contains("" + letter)){
                continue;
            }else {
                for (int j = 0; j < str.length(); j++) {

                    char eachLetter = str.charAt(j);

                    if (letter == eachLetter) {
                        checked = "" + letter;
                        counter++;
                    }

                }
            }

            System.out.println("" + letter + counter);

        }

    }

    public static void main(String[] args) {
        freqOfChars("apple");
        freqOfChars2("apple");
    }


}
