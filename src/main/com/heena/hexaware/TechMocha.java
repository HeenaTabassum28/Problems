package com.heena.hexaware;

public class TechMocha {
    public static void main(String[] args) {
        new TechMocha().start();
    }

    float add(int a, float b){
        return 0F;
    }
    static float add(float a,  int b){
        return 0F;
    }

    private void start() {
        long[] a1= {3,4,5};
        long[] a2=fix(a1);
        System.out.print(a1[0]+a1[1]+a1[2]+" ");
        System.out.println(a2[0]+a2[1]+a2[2]+" ");
    }

    private long[] fix(long[] a3) {
        a3[1]=7;
        return a3;
    }
}
