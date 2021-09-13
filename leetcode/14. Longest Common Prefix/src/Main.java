class Solution {
    public String longestCommonPrefix(String[] strs) {
        boolean out = false;
        String ans = "";
        for(int index =0; index < strs[0].length(); index++){
            for(int y =0; y<strs.length; y++){
                if (strs[y].length() -1 < index){
                    out = true;
                    break;
                }
                if(strs[0].charAt(index) != strs[y].charAt(index)){
                    out = true;
                    break;
                }
            }
            if(out) break;
            ans += strs[0].charAt(index);
        }
        return ans;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = {"dog","racecar","car"};
        String ans = solution.longestCommonPrefix(strs);
        System.out.println(ans);
    }
}
