package com.heena.datastructure.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Integer num1 = 303;
        Integer num2 = 102;
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(7);
        list1.add(5);
        list1.add(9);
        list1.add(4);
        list1.add(6);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(8);
        list2.add(4);

        int list1Size = list1.size();
        int list2Size = list2.size();
        int max = Math.max(list1Size, list2Size);
        List<Integer> sumList = new LinkedList<>();
        int carry = 0;
        for (int i = 0; i < max; i++) {
            int sum = carry + getData(list1, i, list1Size) + getData(list2, i, list2Size);
            carry = (sum > 9) ? 1 : 0;
            sum = sum % 10;
            sumList.add(sum);
        }
        if (carry > 0) {
            sumList.add(carry);
        }
        Collections.reverse(sumList);
        System.out.println(sumList);
    }

    private static Integer getData(LinkedList<Integer> list, int index, int size) {
        return (size <= index) ? 0 : list.get(index);
    }
}
