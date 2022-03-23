package org.training;

class Solution {
    public int jump(int[] nums) {
        int answer = 0;
        int indexOfElementWithMaxJump = 0;
        int indexOfCurrentElement = 0;
        if (nums.length == 1) {
            return 0;
        }
        for (int index = 0; index < nums.length; index++) {
            if (indexOfCurrentElement + nums[indexOfCurrentElement] >= nums.length - 1) {
                answer++;
                break;
            }
            if (nums[index] + index > indexOfElementWithMaxJump + nums[indexOfElementWithMaxJump]) {
                indexOfElementWithMaxJump = index;
            }
            if (indexOfCurrentElement + nums[indexOfCurrentElement] == index) {
                answer++;
                indexOfCurrentElement = indexOfElementWithMaxJump;
                index = indexOfCurrentElement - 1;
            }
        }
        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
    }
}
