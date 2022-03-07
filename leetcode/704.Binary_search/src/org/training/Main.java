package org.training;

class Solution {

    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }
    public int binarySearch(int[] nums, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;

            if (target < nums[mid]) return binarySearch(nums, target, left, mid - 1);
            else return binarySearch(nums, target, mid +1 , right );
        }
        return -1;
    }
}
public class Main {

    public static void main(String[] args) {
    }
}
