package org.designPattern.creational.prototypeAndRegistry;

import java.util.HashSet;

public class Client {
    public static void main(String[] args) throws Exception {
        HashSet<String> f1 = new HashSet<>();
        f1.add("Alice");
        f1.add("Bob");
        Student s1 = new Student("John", 25, f1);
        Student s2 = (Student) s1.clone(); // clone s1

        System.out.println(s1);
        System.out.println(s2);

        s2.setAge(6); // will not happen in premitive data type and immutable object
        s1.addFriend("sourabh"); //mutable so adding this in s1 will also reflect in s2

        System.out.println(s1);
        System.out.println(s2);
        if(s1 == s2)System.out.print("yes");

        //----------------------
        System.out.println("-------------- copy through registry----------------------------");

        // Register prototypes
        Registry registry = new Registry();
        registry.register("student1", new Student("Alice", 20, f1));
        registry.register("student2", new Student("Bob", 22, f1));

        // Get new copies
        Student s11 = (Student) registry.get("student1");
        Student s22 = (Student) registry.get("student2");

        System.out.println(s11);
        System.out.println(s22);
    }
}
