package task2;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/palindrome-number/

    public static boolean isPalindrome(int x) {

        int y = x;

        List<Integer> arr = new ArrayList<>();

        while (x != 0) {
            arr.add(x % 10);
            x /= 10;
        }

        for (int i = 0; i < arr.size(); i++) {
            x += arr.get(i);
            if (i != arr.size() - 1) {
                x *= 10;
            }
        }

        if (x == y) {
            return true;
        } else {
            return false;
        }
    }
}
