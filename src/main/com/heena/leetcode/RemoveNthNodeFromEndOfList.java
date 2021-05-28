package com.heena.leetcode;

public class RemoveNthNodeFromEndOfList {
    ListNode head;

    public static void main(String[] args) {
        RemoveNthNodeFromEndOfList list = new RemoveNthNodeFromEndOfList();
        /*list.head = new ListNode(1);
        list.head.next = new ListNode(2);
        list.head.next.next = new ListNode(3);
        list.head.next.next.next = new ListNode(4);
        list.head.next.next.next.next = new ListNode(5);*/

        //list.head = new ListNode(1);
        list.head = new ListNode(1);
        list.head.next = new ListNode(2);

        list.removeNthFromEnd(list.head, 2);

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int indexOfNodeToBeRemoved = size(head) - n;
        int currentIndex = 0;
        ListNode current = head;
        ListNode previous = null;
        while (currentIndex != indexOfNodeToBeRemoved) {
            currentIndex++;
            previous = current;
            current = current.next;
        }
        if (null != previous) {
            previous.next = current.next;
        } else {
            head = current.next;
        }
        return head;
    }

    private int size(ListNode head) {
        ListNode current = head;
        int size = 0;
        while (null != current) {
            size++;
            current = current.next;
        }
        return size;
    }
}
