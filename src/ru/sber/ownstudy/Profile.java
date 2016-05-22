package ru.sber.ownstudy;

import java.io.Serializable;

public class  Profile implements Serializable{
     String name;
     String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}