package org.designPattern.creational.builder;


import lombok.Getter;

@Getter
public class Student {
    private String name;
    private String mobile;
    private int age;
    private double fees;
    private StudentMark marks;

    //constructor
    Student(StudentBuilder builder){
        this.name = builder.name;
        this.mobile = builder.mobile;
        this.age = builder.age;
        this.fees = builder.fees;
        this.marks = builder.marks;
    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

    static class StudentBuilder{
        private String name;
        private String mobile;
        private int age;
        private double fees;
        private StudentMark marks;

        public Student build(){
            return new Student(this);
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setFees(Double fees) {
            this.fees = fees;
            return this;
        }

        public StudentBuilder setMarks(StudentMark marks) {
            this.marks = marks;
            return this;
        }

    }
}


