import java.util.HashMap;
class Solution{
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> used = new HashMap<>();
        int[] ans = new int[0];
        for(int index =0; index<nums.length ; index++){
            int value = target - nums[index];
            if(used.get(value) != null){
                ans = new int[]{used.get(value), index};
                break;
            }
            if (used.get(nums[index]) == null) {
                used.put(nums[index], index);
                continue;
            }
        }
        return ans;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int []nums = {3, 3};
        nums = solution.twoSum(nums, 6);
        for(Integer i : nums){
            System.out.println(i);
        }
    }
}
