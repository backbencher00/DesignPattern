package org.designPattern.creational.builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Student student = Student.getBuilder().setName("sourabh")
                .build();

        System.out.println(student.getName());
    }
}