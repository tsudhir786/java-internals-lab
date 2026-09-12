package com.tirumareddy.javalab.oops;

public class Person {
    String name;
    static String test = "test";

    Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        sameObjectExample();
        reassignReferenceExample();
    }

    static void sameObjectExample() {
        Person p1 = new Person("Sudhir");
        Person p2 = p1;

        p2.name = "John";

        System.out.println(p1.name);
        System.out.println(p2.name);
    }

    static void reassignReferenceExample() {
        Person p1 = new Person("Sudhir");
        Person p2 = p1;

        p2 = new Person("John");

        System.out.println(p1.name);
        System.out.println(p2.name);
    }
}

