package org.example.problem3;

public class Problem3 {

    public static void main(String[] args) {
        int number = 100;
        fibonacciCal(number);
    }

    private static void fibonacciCal(int number) {
        int a = 0, b = 1, c = 1;

        for (int x = 1; x <= number; x++) {
            System.out.print(a + ",");
            a = b;
            b = c;
            c = a + b;
        }
    }
}
