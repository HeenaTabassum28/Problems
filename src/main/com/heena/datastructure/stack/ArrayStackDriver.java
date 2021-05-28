package com.heena.datastructure.stack;

public class ArrayStackDriver {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Top in stack : " + stack.peek());
        System.out.println(stack.pop() + " Popped from stack");

    }
}

class ArrayStack {
    static final int max = 1000;
    int top;
    int[] arr = new int[max];

    public ArrayStack() {
        this.top = -1;
    }

    public boolean push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return false;
        }
        arr[++top] = data;
        System.out.println(data + " pushed to stack");
        return true;
    }

    private boolean isFull() {
        return top >= max - 1;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return arr[top];
    }

    private boolean isEmpty() {
        return top < 0;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return arr[top--];
    }
}
