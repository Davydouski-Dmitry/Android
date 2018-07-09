package com.davydouski.androidpvt.Homework6;


public class Student {

    private int imageStudent;
    private String name;
    private String surname;

    public Student(int imageStudent, String name, String surname) {
        this.imageStudent = imageStudent;
        this.name = name;
        this.surname = surname;
    }

    public int getImageStudent() {
        return imageStudent;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
