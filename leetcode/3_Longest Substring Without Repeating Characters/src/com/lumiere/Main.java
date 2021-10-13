package com.lumiere;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        HashSet<Character> hashSet = null;
        for (int i = 0; i < s.length(); i++) {
            hashSet = new HashSet<>();
            int maxValue = 1;
            hashSet.add(s.charAt(i));
            for (int y = i+1; y < s.length(); y++) {
                if (hashSet.contains(s.charAt(y))) {
                    break;
                }
                hashSet.add(s.charAt(y));
                maxValue++;
            }
            answer = Math.max(answer, maxValue);
        }
        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
    }
}
