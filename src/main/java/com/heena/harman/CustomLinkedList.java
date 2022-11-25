package com.heena.harman;

import java.util.LinkedList;

public class CustomLinkedList<E> {
    Node head;

    class Node<E> {
        E data;
        Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        CustomLinkedList<Integer> linkedList = new CustomLinkedList<>();
       // new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.print();
        CustomLinkedList<String> strings = new CustomLinkedList<>();
        strings.add("Heena");
        strings.add("Heena1");
        strings.print();
        CustomLinkedList combination = new CustomLinkedList<>();
        combination.add(1);
        combination.add("Heena");
    }

    private void print() {
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print(current.data + " ");
    }

    private void add(E data) {
        Node<E> node = new Node(data);
        if (null == head) {
            this.head = node;
        } else {
            Node current = head;
            while (null != current.next) {
                current = current.next;
            }
            current.next = node;
        }
    }
}
