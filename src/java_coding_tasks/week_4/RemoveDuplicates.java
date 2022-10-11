package java_coding_tasks.week_4;

import java.lang.reflect.Array;
import java.util.*;

public class RemoveDuplicates {

    public static String removeDuplicates(String str) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        LinkedHashSet<String> list2 = new LinkedHashSet<>(list);

        String result = "";

        Iterator<String> it = list2.iterator();

        while (it.hasNext()) {
            result += it.next();

        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(removeDuplicates("annnnbbbbrttt"));
    }
    }
