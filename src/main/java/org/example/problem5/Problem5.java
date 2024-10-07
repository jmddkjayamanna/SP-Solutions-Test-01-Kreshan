package org.example.problem5;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {
    public static void main(String[] args) {

        List<String> results = new ArrayList<>();
        findExpressions("", 1, results);

        for (String expression : results) {
            System.out.println(expression + " = 100");
        }
    }

    private static void findExpressions(String expression, int currentNum, List<String> results) {

    }

}
