package com.lambton;

import java.time.LocalDate;

public class Faculty extends Person {
    String designation;
    int salary;
    String specialization;

    public Faculty(int id, String firstname, String lastname, LocalDate birthdate, String gender, String designation, int salary, String specialization) {
        super(id, firstname, lastname, birthdate, gender);
        this.designation = designation;
        this.salary = salary;
        this.specialization = specialization;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }



    @Override
    public void display() {
        System.out.println("Student id is :" +getId());
        System.out.println("Student fisrtname is :"+getFirstname());
        System.out.println("Student last name is :" +getLastname());
        System.out.println("Student gender is: "+getGender());
        System.out.println("Student birtdate is :"+getBirthdate());
        System.out.println("Student coursename is :"+this.getDesignation());
        System.out.println("Student coursesemester is :"+this.getSpecialization());


    }
}
