package com.trilogyed;

public class Lion {

    // Encapsulation
    public String name;
    private int age;
    private int weight;
    private static String sex;

    // Constructor
    public Lion(String name, int age, int weight, String sex) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
    }

    // Note: Getter/Setter methods must be public
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    // Other Methods
    public void roar() {
        System.out.println("ROAR!!!!!!");
    }

    public void nap() {
        System.out.println("ZZZzzzZZZ");
    }

}
