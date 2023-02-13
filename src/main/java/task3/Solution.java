package task3;

public class Solution {
    // https://leetcode.com/problems/longest-common-prefix/

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length < 1 || strs.length > 200) {
            throw new IllegalArgumentException("Огранчение на длину массива");
        }

        for (int i = 0; i < strs.length; i++) {
            if (!strs[i].matches("[a-z]+\\D")) {
                throw new IllegalArgumentException("Ограничение на значение элемента в массиве (только строчные английские буквы, без цифр и пробелов)");
            }
            if (strs[i].length() < 0 || strs[i].length() > 200) {
                throw new IllegalArgumentException("Ограничение на длину элемента в массиве");
            }
        }

        char[] check = strs[0].toCharArray();
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < check.length; i++) {
            sb.append(check[i]);
            for (int j = 0; j < strs.length; j++) {
                if (!strs[j].startsWith(sb.toString())) {
                    sb.deleteCharAt(sb.length() - 1);
                    return sb.toString();
                }
            }
        }
        return sb.toString();
    }
}
