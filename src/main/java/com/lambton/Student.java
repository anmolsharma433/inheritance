package com.lambton;

import java.time.LocalDate;
import java.util.Date;

public class Student extends Person
{
    private String coursename;
    private int coursesemester;

    public Student(int id) {
        super(id);
    }

    public Student(int id, String firstname, String lastname, LocalDate birthdate, String gender, String coursename, int coursesemester) {
        super(id, firstname, lastname, birthdate, gender);
        this.coursename = coursename;
        this.coursesemester = coursesemester;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public int getCoursesemester() {
        return coursesemester;
    }

    public void setCoursesemester(int coursesemester) {
        this.coursesemester = coursesemester;
    }

    @Override
    public void display() {
        System.out.println("Student id is :" +getId());
        System.out.println("Student fisrtname is :"+getFirstname());
        System.out.println("Student last name is :" +getFirstname());
        System.out.println("Student gender is: "+getGender());
        System.out.println("Student birtdate is :"+getBirthdate());
        System.out.println("Student coursename is :"+this.getCoursename());
        System.out.println("Student coursesemester is :"+this.getCoursesemester());

    }
}
