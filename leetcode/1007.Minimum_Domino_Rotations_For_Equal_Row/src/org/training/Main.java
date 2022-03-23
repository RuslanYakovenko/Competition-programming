package org.training;

class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int answer = -1;
        int[][] tableOfValue = new int[3][7];
        for (int index = 0; index < tops.length; index++) {
            tableOfValue[0][tops[index]]++;
            tableOfValue[1][bottoms[index]]++;
            if (tops[index] == bottoms[index]) {
                tableOfValue[2][tops[index]]++;
                answer = searchInTable(tableOfValue, tops.length, tops[index], answer);
            } else {
                answer = searchInTable(tableOfValue, tops.length, tops[index], answer);
                answer = searchInTable(tableOfValue, tops.length, bottoms[index], answer);
            }
        }
        return answer;
    }

    private int searchInTable(int[][] tableOfValue, int sizeOfArray, int currentValue, int answer) {
        int countOfUniqueTopElement = tableOfValue[0][currentValue] - tableOfValue[2][currentValue];
        int countOfUniqueBottomElement = tableOfValue[1][currentValue] - tableOfValue[2][currentValue];
        if (countOfUniqueTopElement + countOfUniqueBottomElement + tableOfValue[2][currentValue] == sizeOfArray) {
            if (answer == -1) {
                answer = Math.min(countOfUniqueTopElement, countOfUniqueBottomElement);
            } else {
                answer = Math.min(answer, Math.min(countOfUniqueTopElement, countOfUniqueBottomElement));
            }
        }
        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] tops = new int[]{2, 1, 2, 4, 2, 2};
        int[] bottoms = new int[]{5, 2, 6, 2, 3, 2};
        int result = solution.minDominoRotations(tops, bottoms);
        System.out.println(result);
    }
}
