class Solution {
    public int maxArea(int[] height) {
        int max = 0, i =0, j = height.length -1;
        while(i < j){
            if(height[i] < height[j]){
                max = Math.max(max, height[i] * (j - i));
                i++;
            } else{
                max = Math.max(max, height[j] * (j - i));
                j--;
            }
        }
        return max;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(solution.maxArea(height));
    }
}
