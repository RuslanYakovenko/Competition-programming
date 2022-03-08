package org.training;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int leftPointer = 0;
        int rightPointer = nums.length - 1;
        int index = nums.length - 1;
        int[] answer = new int[nums.length];
        while (leftPointer <= rightPointer) {
            int leftValue = nums[leftPointer] * nums[leftPointer];
            int rightValue = nums[rightPointer] * nums[rightPointer];
            if (leftValue > rightValue) {
                answer[index] = leftValue;
                leftPointer++;
            } else {
                answer[index] = rightValue;
                rightPointer--;
            }
            index--;
        }
        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
    }
}
