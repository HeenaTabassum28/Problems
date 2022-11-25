package com.heena.leetcode;

public class MergeTwoSortedList {
    ListNode list1, list2, mergedSortedList;

    public static void main(String[] args) {
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        mergeTwoSortedList.list1 = new ListNode(1);
        mergeTwoSortedList.list1.next = new ListNode(2);
        mergeTwoSortedList.list1.next.next = new ListNode(4);

        mergeTwoSortedList.list2 = new ListNode(1);
        mergeTwoSortedList.list2.next = new ListNode(3);
        mergeTwoSortedList.list2.next.next = new ListNode(4);

        mergeTwoSortedList.mergeList(mergeTwoSortedList.list1, mergeTwoSortedList.list2);
    }

    private ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode head = node;
        while (l1 != null || l2 != null) {
            if (l2 == null || (l1 != null && l1.val <= l2.val)) {
                node.next = l1;
                l1 = l1.next;
            } else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        return head.next;
    }
}
