package org.training;

class Solution {
    public void moveZeroes(int[] nums) {
        int temporaryIndex = 0;

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != 0) {
                nums[temporaryIndex] = nums[index];
                temporaryIndex++;
            }
        }
        for (int index = temporaryIndex; index < nums.length; index++) {
            nums[index] = 0;
        }
    }
}

public class Main {

    public static void main(String[] args) {
    }
}
