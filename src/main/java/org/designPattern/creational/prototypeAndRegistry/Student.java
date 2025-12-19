package org.designPattern.creational.prototypeAndRegistry;


import java.util.HashSet;

// Concrete Prototype
class Student implements Prototype {
    private String name;
    private int age;
    private HashSet<String> friends;

    public Student(String name, int age, HashSet<String> friends) {
        this.name = name;
        this.age = age;
        this.friends = friends;
    }

    public void setAge(int n){
        this.age = n;
    }


    public void addFriend(String f) {
        friends.add(f);
    }

    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();  // shallow copy
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone not supported", e);
        }
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", friends=" + friends + "}";
    }
}

