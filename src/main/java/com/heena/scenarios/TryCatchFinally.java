package com.heena.scenarios;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println(checkReturnInTryAndFinally());
    }

    private static int checkReturnInTryAndFinally() {
        try {
            throw new ArithmeticException();
        }catch (Exception e) {
             return 30;
        }finally{
            return 100;
        }
    }
}
