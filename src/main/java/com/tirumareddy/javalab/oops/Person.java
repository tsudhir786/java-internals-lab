package com.tirumareddy.javalab.oops;

public class Person {

    static String species = initializeSpecies();

    String name = initializeName();

    static {
        System.out.println("2. Static block");
    }

    {
        System.out.println("4. Instance block");
    }

    Person() {
        System.out.println("5. Constructor");
    }

    static String initializeSpecies() {
        System.out.println("1. Static field");
        return "Humans";
    }

    String initializeName() {
        System.out.println("3. Instance field");
        return "Sudhir";
    }

    Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        System.out.println("------ main started ------");
        Person p3 = new Person();
        Person p4 = new Person();

//        sameObjectExample();
//        reassignReferenceExample();

        Person p1 = new Person("Sudhir");
//        changeName(p1);
        System.out.println(p1.name);

        Person p2 = new Person("Sudhir");
        reassignPerson(p2);
        System.out.println(p2.name);

        System.out.println(Person.species);
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

    static void changeName(Person p) {
        p.name = "John";
    }

    static void reassignPerson(Person p) {
        p = new Person("John");
    }
}

