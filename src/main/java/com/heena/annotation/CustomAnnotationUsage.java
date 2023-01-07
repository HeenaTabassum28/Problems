package com.heena.annotation;

import java.util.ArrayList;

public class CustomAnnotationUsage {
    public static void main(String[] args) {
        genericsTest();
    }

    @Override
    @CustomAnnotation(author = "Pankaj1", comments = "Main method", date = "Nov 17 2012", revision = 1)
    public String toString() {
        return "Overridden toString method";
    }

    @Deprecated
    @CustomAnnotation(comments = "deprecated method", date = "Nov 28 2022")
    public static void oldMethod() {
        System.out.println("Old method, don't use it");
    }

    @SuppressWarnings({"unchecked", "depreciation"})
    @CustomAnnotation(author = "Pankaj", comments = "Main method", date = "Nov 17 2012", revision = 10)
    public static void genericsTest() {
        ArrayList<Object> list = new ArrayList<>();
        list.add("abc");
        oldMethod();
    }
}
