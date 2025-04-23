package com.ucode.main.beans;

public class Student {

    private String Name;
    private int rollNo;
    private float marks;

    public Student(String name, int rollNo, float marks) {
        super();
        Name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }
}
