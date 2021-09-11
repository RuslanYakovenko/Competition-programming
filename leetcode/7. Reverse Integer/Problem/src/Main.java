class Solution {
    public int reverse(int x) {
        double ans = 0;
        while(x != 0){
            int value = x %10;
            x/=10;
            ans = 10 * ans + value;
            if (ans>Integer.MAX_VALUE || ans < Integer.MIN_VALUE) return 0;
        }
        return (int)ans;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int temp = solution.reverse(123456);

        System.out.println(temp);
    }
}
