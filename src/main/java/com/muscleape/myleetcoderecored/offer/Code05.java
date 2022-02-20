package com.muscleape.myleetcoderecored.offer;

/**
 * 剑指offer-05
 * <p>
 * https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 *
 * 剑指 Offer 05. 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 *
 *
 *
 * 示例 1：
 *
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 *
 *
 * 限制：
 *
 * 0 <= s 的长度 <= 10000
 *
 * @author muscleape
 * @date 2022/02/14 09:33
 **/
public class Code05 {

    public static void main(String[] args) {
        System.out.println(handleMethod("add s c s"));;
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
