package com.domain;

public class Student {
    private String name;
    private int age;
    private String password;
    private int id;
    public Student(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Student(String name, int age, String password, int id) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.id = id;
    }
}
