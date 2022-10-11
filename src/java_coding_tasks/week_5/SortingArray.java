package java_coding_tasks.week_5;

import java.util.Arrays;

public class SortingArray {

    public static String sortedStr (String str2){

        for(int i=0;i< str2.length();i++){
            
            char each= str2.charAt(i);

            String container = "";

            if(Character.isDigit(each)){
                container+=each;
            } else {
                container+=each;
            }
        }


        String[] split = str2.split("");
        Arrays.sort(split);
        String result = String.join("", split);

        return result;
    }

}
