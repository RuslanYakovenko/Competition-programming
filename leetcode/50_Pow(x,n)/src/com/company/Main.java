package com.company;

class Solution {
    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }

        return n > 0 ? rec(x, n) : 1 / rec(x, -n);
    }

    public double rec(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double val = rec(x, n / 2);
        if (n % 2 == 1) {
            return val * val * x;
        } else {
            if (val == 1 && x != 1)
                return x;
            return val * val;
        }

    }
}

public class Main {

    public static void main(String[] args) {
    }
}
