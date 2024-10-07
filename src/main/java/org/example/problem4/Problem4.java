package org.example.problem4;

import java.util.Arrays;

public class Problem4 {
    public static void main(String[] args) {
        int[] nums = {50,2,1,9};
        System.out.println("Largest Number formed by "+largestNumberOrder(nums));
    }

    public static String largestNumberOrder(int[] nums) {

        String[] numsStr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsStr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numsStr, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder largestNum = new StringBuilder();
        for (String numStr : numsStr) {
            largestNum.append(numStr);
        }

        return largestNum.toString();
    }
}
