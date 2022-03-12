package org.training;

class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];
        k = k % nums.length;
        for (int index = 0; index < nums.length; index++) {
            if (index >= nums.length - k) {
                int newIndex = index + k - nums.length;
                temp[newIndex] = nums[index];
            } else {
                temp[index + k] = nums[index];
            }
        }
        for (int index = 0; index < nums.length; index++) {
            nums[index] = temp[index];
        }
    }
}

public class Main {

    public static void main(String[] args) {
    }
}
