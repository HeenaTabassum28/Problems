package com.heena.datastructure.queue;

public class LinkedListQueueDriver {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.deQueue();
    }
}

class QNode {
    int data;
    QNode next;

    public QNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListQueue {
    QNode front, rear;
    int size = 0;

    public LinkedListQueue() {
        this.front = null;
        this.rear = null;
    }


    public void enQueue(int data) {
        QNode qNode = new QNode(data);
        if (this.rear == null) {
            this.front = this.rear = qNode;
        } else {
            this.rear.next = qNode;
            this.rear = qNode;
        }
        size++;
    }

    public void deQueue() {
        if (front == null) {
            return;
        }
        QNode temp = this.front;
        this.front = this.front.next;
        if (this.front == null) {
            rear = null;
        }
    }
}
