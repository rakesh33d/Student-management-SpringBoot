package com.avengers.studentManagement;

public class Student {
    private String name;
    private int admnNo;
    private String state;
    private int age;

    public Student(String name, int admnNo, String state, int age) {
        this.name = name;
        this.admnNo = admnNo;
        this.state = state;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdmnNo() {
        return admnNo;
    }

    public void setAdmnNo(int admnNo) {
        this.admnNo = admnNo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
