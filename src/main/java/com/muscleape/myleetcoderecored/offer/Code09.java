package com.muscleape.myleetcoderecored.offer;

import java.util.LinkedList;

/**
 * 剑指offer09
 * https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 * <p>
 * 剑指 Offer 09. 用两个栈实现队列
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 *
 *
 * 示例 1：
 *
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead"]
 * [[],[3],[],[]]
 * 输出：[null,null,3,-1]
 * 示例 2：
 *
 * 输入：
 * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 * [[],[],[5],[2],[],[]]
 * 输出：[null,-1,null,null,5,2]
 * 提示：
 *
 * 1 <= values <= 10000
 * 最多会对 appendTail、deleteHead 进行 10000 次调用
 *
 * @author muscleape
 * @date 2022/02/20 16:07
 **/
public class Code09 {

    public static void main(String[] args) {
        CQueue tempQuery = new CQueue();
        System.out.println(tempQuery.deleteHead());
        tempQuery.appendTail(2);
        tempQuery.appendTail(5);
        tempQuery.appendTail(6);
        tempQuery.appendTail(7);
        tempQuery.appendTail(8);
        tempQuery.appendTail(9);
        System.out.println(tempQuery.deleteHead());
        System.out.println(tempQuery.deleteHead());
        System.out.println(tempQuery.deleteHead());
        System.out.println(tempQuery.deleteHead());
        System.out.println(tempQuery.deleteHead());
        System.out.println(tempQuery.deleteHead());
        System.out.println(tempQuery.deleteHead());
        System.out.println(tempQuery.deleteHead());
    }
}

class CQueue {

    private LinkedList<Integer> memberMain;
    private LinkedList<Integer> memberHelper;
    private static final int DEFAULT = -1;

    public CQueue() {
        memberMain = new LinkedList<>();
        memberHelper = new LinkedList<>();
    }

    public void appendTail(int value) {
        memberMain.add(value);
    }

    public int deleteHead() {
        if (!memberHelper.isEmpty()) {
            return memberHelper.removeLast();
        }
        if (memberMain.isEmpty()) {
            return DEFAULT;
        }
        while (!memberMain.isEmpty()) {
            memberHelper.add(memberMain.removeLast());
        }
        return memberHelper.removeLast();
    }
}
