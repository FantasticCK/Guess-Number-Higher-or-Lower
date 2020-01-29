package com.CK;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1, r = n;
        while (l + 1 < r) {
            int mid = l + (r - l) / 2, midVal = guess(mid);
            if (midVal == 0) {
                return mid;
            }

            if (midVal < 0) {
                r = mid;
            } else
                l = mid;
        }
        return guess(l) == 0 ? l : r;
    }
}

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;
            int res1 = guess(mid1);
            int res2 = guess(mid2);
            if (res1 == 0)
                return mid1;
            if (res2 == 0)
                return mid2;
            else if (res1 < 0)
                high = mid1 - 1;
            else if (res2 > 0)
                low = mid2 + 1;
            else {
                low = mid1 + 1;
                high = mid2 - 1;
            }
        }
        return -1;
    }
}