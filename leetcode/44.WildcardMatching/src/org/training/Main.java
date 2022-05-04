package org.training;

class Solution {
    public boolean isMatch(String str, String pattern) {
        boolean[][] dp = new boolean[pattern.length() + 1][str.length() + 1];
        dp[0][0] = true;
        for (int i = 1; i < pattern.length() + 1; i++) {
            if (pattern.charAt(i - 1) == '*')
                dp[i][0] = dp[i - 1][0];
        }
        for (int i = 1; i < pattern.length() + 1; i++) {
            for (int j = 1; j < str.length() + 1; j++) {
                if (pattern.charAt(i - 1) != '*') {
                    if (pattern.charAt(i - 1) == str.charAt(j - 1) || pattern.charAt(i - 1) == '?')
                        dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }
            }
        }
        return dp[pattern.length()][str.length()];
    }
}

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "qwqeefgzdqwefgzqeqwegwh3232323";
        String p = "*fgz??qwe*gwh*";
        boolean result = solution.isMatch(s, p);
        System.out.println(result);
    }
}
