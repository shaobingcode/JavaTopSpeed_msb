package com.msb.pojo;

public class Book {
    private int id;
    private String name;

    public Book() {
        System.out.println("Book类空构造器");
    }

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Book有参构造器");
    }

    public int getId() {
        System.out.println("id的get方法");
        return id;
    }

    public void setId(int id) {
        System.out.println("id的set方法");
        this.id = id;
    }

    public String getName() {
        System.out.println("name的get方法");
        return name;
    }

    public void setName(String name) {
        System.out.println("name的set方法");
        this.name = name;
    }
}
