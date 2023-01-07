package com.heena.scenarios.immutable;

public class ImmutableClassDemo {
    public static void main(String[] args) {
        Age age = new Age(1, 1, 1992);
        ImmutableStudent student = new ImmutableStudent(1, "Alex", age);

        System.out.println("Alex age year before modification = " + student.getAge().getYear());

        // age.setYear(1993);
        //student.getAge().setYear(1993);
        System.out.println("Alex age year after modification = " + student.getAge().getYear());
    }
}
