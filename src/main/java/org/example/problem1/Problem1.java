package org.example.problem1;

import java.util.Arrays;
import java.util.List;

public class Problem1 {
    public static void main(String[] args) {

        List<Integer> testList = Arrays.asList(10, 20, 30, 40, 50);

        int sumForLoop = sumListForLoop(testList);
        int sumWhileLoop = sumListWhileLoop(testList);
        int sumRecursion = sumListRecursion(testList);

        System.out.println("Sum using for loop - " + sumForLoop);
        System.out.println("Sum using while loop - " + sumWhileLoop);
        System.out.println("Sum using recursion - " + sumRecursion);
    }

    public static int sumListForLoop(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }

    public static int sumListWhileLoop(List<Integer> list) {
        int sum = 0;
        int i = 0;
        while (i < list.size()) {
            sum += list.get(i);
            i++;
        }
        return sum;
    }

    public static int sumListRecursion(List<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.get(0) + sumListRecursion(list.subList(1, list.size()));
        }
    }
}

