package org.training;

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> values = new HashMap<>();
        int[] answer = new int[2];
        for (int index = 0; index < numbers.length; index++) {
            if (values.containsKey(target - numbers[index])) {
                answer[0] = values.get(target - numbers[index]) + 1;
                answer[1] = index + 1;
                break;
            }
            values.put(numbers[index], index);
        }
        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
    }
}
