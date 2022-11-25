package com.heena.enquerro;

import java.util.HashMap;

public class Student {
    private final Integer rollNumber;
    private final String name;

    public Student(Integer rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (!rollNumber.equals(student.rollNumber)) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = rollNumber.hashCode();
        result = 31 * result + name.hashCode();
        return result;
    }

   /* public static void main(String[] args) {
        HashMap hashMap = new HashMap<>(String.CASE_INSENSITIVE_ORDER);
        new Student(1,"Wasim");
    }*/
}
