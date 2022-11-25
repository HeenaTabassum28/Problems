package com.heena.datastructure.queue;

public class ArrayQueueDriver {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.deQueue();
        queue.enQueue(4);

        System.out.println(queue.peek());
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
    }
}

class ArrayQueue {
    private final int[] arr;
    private int rear;
    private int front;
    private final int capacity;
    private int size;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.arr = new int[capacity];
    }

    public void enQueue(int item) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        System.out.println("Item enqueued : "+item);
        size++;
    }

    private boolean isFull() {
        return size() == capacity;
    }

    private int size() {
        return size;
    }

    public void deQueue() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        front = (front + 1) % capacity;
        size--;
    }

    private boolean isEmpty() {
        return size() == 0;
    }

    //returns the first element of queue
    public int peek() {
        if (isEmpty()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return arr[front];
    }
}
