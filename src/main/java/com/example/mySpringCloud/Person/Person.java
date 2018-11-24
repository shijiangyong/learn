package com.example.mySpringCloud.Person;

/**
 * @author shijy
 * @Date 2018/11/24 17 : 22
 * @Descriprion
 */

public class Person {
    private String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
