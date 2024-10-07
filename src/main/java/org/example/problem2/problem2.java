package org.example.problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem2 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3);
        List<String> stringList = Arrays.asList("a", "b", "c");
        mergeLists(integerList, stringList);

    }

    public static void mergeLists(List<Integer> integerList, List<String> stringList) {
        List<Object> mergedList = new ArrayList<>();
        int size = Math.min(integerList.size(), stringList.size());

        for (int i = 0; i < size; i++) {
            mergedList.add(stringList.get(i));
            mergedList.add(integerList.get(i));
        }
        System.out.println(mergedList);
    }
}
