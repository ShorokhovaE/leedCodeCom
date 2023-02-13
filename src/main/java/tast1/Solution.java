package tast1;

public class Solution {

    public static void main(String[] args) {

    }

    // https://leetcode.com/problems/two-sum/

    public static int[] twoSum(int[] nums, int target) {

        if (nums.length < 2 || nums.length > Math.pow(10,4)) {
            throw new IllegalArgumentException("Некорректное количество элементов массива");
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > Math.pow(10,9) || nums[i] < -(Math.pow(10,9))) {
                throw new IllegalArgumentException("Ограничение на значение элемента массива");
            }
        }

        if (target > Math.pow(10,9) || target < -(Math.pow(10,9))) {
            throw new IllegalArgumentException("Ограничение на значение target");
        }

        for (int i = 0; i < (nums.length - 1); i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i != j && target == nums[i] + nums[j]) {
                    int[] arr = {i, j};
                    return arr;
                }
            }
        }
        throw new IllegalArgumentException("В этом массиве нет подходящих элементов, чтобы их сумма была равна " + target);
    }

}
