package com.heena.scenarios.immutable;

public final class ImmutableStudent {
    private final int id;
    private final String name;
    private final Age age;

    public ImmutableStudent(int id, String name, Age age) {
        this.name = name;
        this.id = id;
        this.age = age;
        /*To make class as immutable use clone object*/
        /*Age cloneAge = new Age(day, month, year);
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        this.age = cloneAge;*/
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
       /* Age cloneAge = new Age(day, month, year);
        cloneAge.setDay(this.age.getDay());
        cloneAge.setMonth(this.age.getMonth());
        cloneAge.setYear(this.age.getYear());

        return cloneAge;*/
        return age;
    }
}
