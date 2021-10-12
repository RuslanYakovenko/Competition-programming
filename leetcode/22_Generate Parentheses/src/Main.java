import java.util.ArrayList;
import java.util.List;

class Solution {
    private  int n;
    private final List<String> answer = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        this.n = n;
        generator("", 0, 0);
        return answer;
    }
    private void generator(String subsequence, int left, int right) {
        if(right > left) return;
        if(right ==n && left == n) {
            answer.add(subsequence);
        }
        if(left < n) {
            generator(subsequence + "(", left+1, right);
        }
        if(right < n) {
            generator(subsequence + ")", left, right+1);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> list = solution.generateParenthesis(3);
        for(String val : list) {
            System.out.println(val);
        }
    }
}
