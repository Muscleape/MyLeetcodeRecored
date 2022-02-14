package com.muscleape.myleetcoderecored.offer;

/**
 * 剑指offer-05
 * <p>
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 *
 * @author muscleape
 * @date 2022/02/14 09:33
 **/
public class Code05 {

    public static void main(String[] args) {

    }

    public static String handleMethod(String param) {
        StringBuilder sb = new StringBuilder();
        for (char item : param.toCharArray()) {
            if (' ' == item) {
                sb.append("%20");
            } else {
                sb.append(item);
            }
        }
        return sb.toString();
    }
}
