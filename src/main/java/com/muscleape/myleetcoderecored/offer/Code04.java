package com.muscleape.myleetcoderecored.offer;

/**
 * 剑指offer-04
 * <p>
 * https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 *
 * @author muscleape
 * @date 2022/02/10 09:45
 **/
public class Code04 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        boolean result = findNumberIn2DArray(matrix, 5);
        System.out.println(result);
    }

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (null == matrix || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int a = 0, b = matrix[0].length - 1, c = matrix.length;
        while (a < c && b >= 0) {
            if (matrix[a][b] == target) {
                return true;
            }
            if (matrix[a][b] > target) {
                b--;
            } else {
                a++;
            }
        }
        return false;
    }
}
