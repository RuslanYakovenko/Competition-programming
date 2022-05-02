package org.training;

class Solution {
    public boolean isMatch(String s, String p) {
        boolean isUniversal = false;
        int index = 0;
        int indexInString = 0;
        int start = -1;
        int endInPattern = 0;
        boolean answer = false;
        while (index < p.length()) {
            if (indexInString >= s.length()) {
                return false;
            }
            if (p.charAt(index) == '*') {
                endInPattern = index;
                start = indexInString;
                index++;
                isUniversal = true;
                answer = true;
            } else if (p.charAt(index) == '?') {
                answer = true;
                indexInString++;
                index++;
            } else {
                if (isUniversal) {
                    if (p.charAt(index) == s.charAt(indexInString)) {
                        start = start == -1 ?  indexInString : start;
                        index++;
                        indexInString++;
                        answer = true;
                    } else {
                        answer = false;
                        index = endInPattern;
                        indexInString = ++start;

                    }
                } else {
                    if (p.charAt(index) == s.charAt(indexInString)) {
                        start = start == -1 ? indexInString : start;
                        answer = true;
                        index++;
                        indexInString++;
                    } else {
                        answer = false;
                        index = endInPattern;
                        indexInString = ++start;
                    }
                }
            }
        }
        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "cb";
        String p = "******";
        System.out.println(solution.isMatch(s, p));
    }
}
