package com.heena.hexaware;

public class PassByValue {
    public static void main(String[] args) {
        /*int x = 5;
        int y = updateVariable(x);
        System.out.println(x);
        System.out.println(y);
*/
        /*Test t = new Test(5);
        change(t);
        System.out.println(t.x);*/

        Integer i = 10;
        Integer j = 20;
        swap(i, j);
        System.out.println("i = " + i + ", j = " + j);
    }

    public static void swap(Integer i, Integer j) {
        Integer temp = i;
        i = j;
        j = temp;
    }

    private static void change(Test t) {
        t.x = 20;
        t = new Test();
        t.x = 10;
    }

    private static int updateVariable(int z) {
        z = 10;
        return z;
    }
}

class Test {
    int x;

    Test(int i) {
        x = i;
    }

    Test() {
        x = 0;
    }
}
