package com.test.prob_solving;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
    }

    int sumInRrecurse(ListNode node, int sum) {
        if (node == null) {
            return sum;
        } else {
            sumInRrecurse(node.next, node.val + sum);
        }
        return 0;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}