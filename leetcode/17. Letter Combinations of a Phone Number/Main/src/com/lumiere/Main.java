package com.lumiere;

import java.util.ArrayList;
import java.util.List;

class Solution {
    String[] values = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    List<String> list = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return list;
        return list;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String string = "";
        List<String> list = solution.letterCombinations(string);
        System.out.println(list);
	}
}
