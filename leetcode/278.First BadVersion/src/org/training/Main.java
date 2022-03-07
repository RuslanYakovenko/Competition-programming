package org.training;

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int lastNumber = 0;
        while(left < right) {
            int mid = left  + (right - left)/2;
            if(isBadVersion(mid)) {
                lastNumber = mid;
                right = mid ;
            }
            else  {
                left = mid +1;
            }
        }
        return left;
    }
}

public class Main {

    public static void main(String[] args) {
    }
}
