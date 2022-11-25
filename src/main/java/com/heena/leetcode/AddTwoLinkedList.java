package com.heena.leetcode;

public class AddTwoLinkedList {
    ListNode sumNodeHead, list1, list2;

    public static void main(String[] args) {
        AddTwoLinkedList linkedList = new AddTwoLinkedList();
        linkedList.list1 = new ListNode(7);
        linkedList.list1.next = new ListNode(5);
        linkedList.list1.next.next = new ListNode(9);
        linkedList.list1.next.next.next = new ListNode(4);
        linkedList.list1.next.next.next.next = new ListNode(6);

        linkedList.list2 = new ListNode(8);
        linkedList.list2.next = new ListNode(4);

        System.out.println(linkedList.addTwoNumbers(linkedList.list1, linkedList.list2));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum;
        int carry = 0;
        while (l1 != null || l2 != null) {
            sum = carry + getData(l1) + getData(l2);
            carry = sum > 9 ? 1 : 0;
            sum = sum % 10;
            addNode(sum);
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            addNode(carry);
        }
        return sumNodeHead;
    }

    private int getData(ListNode node) {
        return node != null ? node.val : 0;
    }

    private void addNode(int sum) {
        if (sumNodeHead == null) {
            sumNodeHead = new ListNode(sum, null);
        } else {
            ListNode current = sumNodeHead;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(sum, null);
        }
    }
}

 class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
