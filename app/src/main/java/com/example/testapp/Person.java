package com.example.testapp;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int id;
    private String email;

    public Person(String name, int id, String email) {
        this.setName(name);
        this.setId(id);
        this.setEmail(email);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @NonNull
    public String toString() {
        return "Name: " + getName() +
                "\nId: " + getId() +
                "\nEmail: " + getEmail();
    }
}
