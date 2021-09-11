class Solution {
    public boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        boolean ans = true;
        for(int index = 0; index < (int)value.length()/2; index++){
            if(value.charAt(index) != value.charAt(value.length() - 1 - index)){
                ans = false;
                break;
            }
        }
        return ans;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println(new Solution().isPalindrome(121));
    }
}
