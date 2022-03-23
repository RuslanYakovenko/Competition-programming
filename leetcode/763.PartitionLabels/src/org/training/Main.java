package org.training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> answer = new ArrayList<Integer>();
        Map<Character, int[]> mapOfDistance = new HashMap<>();

        int leftPointer = 0;
        int rightPointer = s.length() - 1;
        while (leftPointer <= rightPointer) {
            if (mapOfDistance.containsKey(s.charAt(leftPointer))) {
                int[] latestEntries = mapOfDistance.get(s.charAt(leftPointer));
                latestEntries[1] = leftPointer;
                mapOfDistance.put(s.charAt(leftPointer), latestEntries);
            } else {
                mapOfDistance.put(s.charAt(leftPointer), new int[]{leftPointer, leftPointer});
            }
            leftPointer++;
            if (mapOfDistance.containsKey(s.charAt(rightPointer))) {
                int[] firstAppearance = mapOfDistance.get(s.charAt(rightPointer));
                firstAppearance[0] = rightPointer;
                mapOfDistance.put(s.charAt(rightPointer), firstAppearance);
            } else {
                mapOfDistance.put(s.charAt(rightPointer), new int[]{rightPointer, rightPointer});
            }
        }

        int distance = mapOfDistance.get(s.charAt(0))[1];
        int leftSide = 0;

        for (int index = 0; index < s.length(); index++) {
            if (index == distance) {
                answer.add(index - leftSide + 1);
                leftSide = index + 1;
                distance = index + 1 < s.length() ? mapOfDistance.get(s.charAt(index + 1))[1] : distance;
                continue;
            }
            int indexOfLastCharacter = mapOfDistance.get(s.charAt(index))[1];
            if (indexOfLastCharacter > distance) {
                distance = indexOfLastCharacter;
            }
        }
        return answer;
    }
}

public class Main {

    public static void main(String[] args) {
    }
}
