package com.heena.datastructure.linkedlist;

public class SinglyLinkedList {
    Node head;
    int size = 0;

    /*static*/ class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        /*myLinkedList.head = new Node(1);
        myLinkedList.head.next = new Node(2);
        myLinkedList.head.next.next = new Node(3);

        while (myLinkedList.head != null) {
            System.out.println(myLinkedList.head.data);
            myLinkedList.head = myLinkedList.head.next;
        }*/

        System.out.println("Is Empty :" + singlyLinkedList.isEmpty());
        singlyLinkedList.add(1);
        singlyLinkedList.add(2);
        singlyLinkedList.add(3);
        singlyLinkedList.add(3);
        singlyLinkedList.display();
        System.out.println("Linked list size : " + singlyLinkedList.size());
        singlyLinkedList.deleteByKey(3);
        singlyLinkedList.display();
        singlyLinkedList.deleteByKey(4);
        singlyLinkedList.deleteByPosition(3);
        System.out.println("Linked list size : " + singlyLinkedList.size());
        System.out.println("Is Empty :" + singlyLinkedList.isEmpty());
    }

    private void deleteByPosition(int position) {
        checkElementIndex(position);

    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index)) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + size;
    }

    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private int size() {
        return size;
    }

    private boolean deleteByKey(int data) {
        Node current = head;
        Node prev = null;
        /*CASE 1 : Head node itself holds the key to be deleted*/
        if (current != null && current.data == data) {
            head = current.next;
            size--;
            return true;
        }
        //
        // CASE 2:
        // If the key is somewhere other than at head
        //

        // Search for the key to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }
        // If the key was present, it should be at currNode
        // Therefore the currNode shall not be null
        if (current != null) {
            prev.next = current.next;
            size--;
            return true;
        }
        System.out.println("Key not found");
        return false;
    }

    private void display() {
        Node current = head;
        System.out.print("LinkedList : ");
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
        System.out.println();
    }

    private void add(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
        size++;
    }

    private boolean isEmpty() {
        return head == null;
    }

}
