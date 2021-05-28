package com.heena.netcracker;

public class Comparisons {
    public static void main(String[] args) {
        Integer a1 = new Integer(67);
        Integer a2 = Integer.valueOf(67);
        Integer a3 = Integer.valueOf(67);
        Integer a4 = new Integer(67);
        System.out.println("a2 == a3" + (a2 == a3));
        System.out.println("a1 == a3" + (a1 == a3));
        System.out.println("a4 == a3" + (a4 == a3));

        Integer b1 = new Integer(280);
        Integer b2 = Integer.valueOf(280);
        Integer b3 = Integer.valueOf(280);
        System.out.println("b2 == b3" + (b2 == b3));
        System.out.println("b1 == b3" + (b1 == b3));
        System.out.println("b1.equals(b3)" + (b1.equals(b3)));


    }
}
