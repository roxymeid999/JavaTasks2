package interview_tasks;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 3, 4, 2, 3, 2, 1, 2, 3, 4, 5, 4, 6));

        Set<Integer> removeDuplicatesFromList = new HashSet<>(list);

        System.out.println(removeDuplicatesFromList);
    }
}