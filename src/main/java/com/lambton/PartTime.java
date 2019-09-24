package com.lambton;

import java.time.LocalDate;

public class PartTime extends Faculty{
    int hourworked;
    int perhourwage = 500;

    public PartTime(int id, String firstname, String lastname, LocalDate birthdate, String gender, String designation, int salary, String specialization, int hourworked) {
        super(id, firstname, lastname, birthdate, gender, designation, salary, specialization);
        this.hourworked = hourworked;
    }

    public int getHourworked() {
        return hourworked;
    }

    public void setHourworked(int hourworked) {
        this.hourworked = hourworked;
    }

    @Override
    public float calculatetotalsalary() {
        float totalsalary = this.getSalary()+(this.hourworked*perhourwage);
        return totalsalary;
    }
    public void display()
    {
        System.out.println("The name is "+getFirstname()+" "+getLastname());
        System.out.println("the totalsalary is : "+calculatetotalsalary());
    }
}
