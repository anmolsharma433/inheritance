package com.lambton;

import java.time.LocalDate;
import java.util.Date;

public abstract class Person {
    int id;
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
    private String gender;

    public Person() {

    }

    public Person(int id, String firstname, String lastname, LocalDate birthdate, String gender) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
        this.gender = gender;
    }

    public Person(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }


    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract void display();

}

