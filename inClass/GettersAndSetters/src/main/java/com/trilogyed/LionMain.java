package com.trilogyed;

public class LionMain {

    public static void main(String[] args) {

        Lion lion1 = new Lion("luv", 12, 200, "male");

        System.out.println(lion1.name);
        lion1.setName("love");
        System.out.println(lion1.getName());
        System.out.println("\n");

        // pass by reference
        Person p1 = new Person(30, "Usman", "Instructor");

        System.out.println("Person name before method call  -> " + p1.getName());
        changeName(p1);
        System.out.println("Person name after method call -> " + p1.getName());
        System.out.println("\n");

        // pass by value
        int oldAge = 20;

        System.out.println("Old age before method call = " + oldAge);
        changeAge(oldAge);
        System.out.println("Old age after method call = " + oldAge);
    }

    public static void changeName(Person p) {
        p.setName("Mark");
        System.out.println("Person name in changeName-> " + p.getName());
    }

    public static void changeAge(int newAge) {
        newAge = 50;
        System.out.println("Age = " + newAge);
    }
}
