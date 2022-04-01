package org.jeecg.leetcode.easy;


import org.jeecg.leetcode.easy.entity.ListNode;

public class num1_2_9 {

    //1. 两数之和
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    //2.两数相加
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (l1 != null || l2 != null) {
            int v1 = l1 != null ? l1.getVal() : 0;
            int v2 = l2 != null ? l2.getVal() : 0;
            int sum = v1 + v2 + cur.getVal();
            int a = sum / 10;
            int b = sum % 10;
            cur.setVal(b);
            if (l1 != null || l2 != null) {
                cur.setNext(new ListNode(a));
                cur = cur.getNext();
            }
            if (l1 != null) {
                l1 = l1.getNext() != null ? l1.getNext() : null;
            }
            if (l2 != null) {
                l2 = l2.getNext() != null ? l2.getNext() : null;
            }

        }
        return head;
    }


    public void addTwoNumbers() {
        ListNode a1 = new ListNode(9);
        ListNode a2 = new ListNode(9, a1);
        ListNode a3 = new ListNode(9, a2);
        ListNode a4 = new ListNode(9, a3);
        ListNode a5 = new ListNode(9, a4);
        ListNode a6 = new ListNode(9, a5);
        ListNode a7 = new ListNode(9, a6);

        ListNode b1 = new ListNode(9);
        ListNode b2 = new ListNode(9, b1);
        ListNode b3 = new ListNode(9, b2);
        ListNode b4 = new ListNode(9, b3);
        ListNode listNode = addTwoNumbers(a7, b4);
        System.out.println(listNode);
    }

    //9. 回文数
    public boolean isPalindrome(int x) {
        //负数和0肯定不是回文数
        if (x < 0) {
            return false;
        }
        //个位数为0的非0整数，肯定不是回文数
        if (x % 10 == 0 && x != 0) {
            return false;
        }
        int a = 0;
        while (x > a) {
            a = x % 10 + a * 10;
            x = x / 10;
        }
        if (a == x) {
            return true;
        }
        if (a / 10 == x) {
            return true;
        }
        return false;
    }

    public void isPalindrome() {
        boolean palindrome = isPalindrome(123454321);
        System.out.println(palindrome);
    }


}
