package com.lambton;

import java.time.LocalDate;

public class FullTime extends Faculty {
    private float bonus;

    public FullTime(int id, String firstname, String lastname, LocalDate birthdate, String gender, String designation, int salary, String specialization,float bonus) {
        super(id, firstname, lastname, birthdate, gender, designation, salary, specialization);
        this.bonus = bonus;
    }


    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public float calculatetotalsalary() {
        float totalsalary=this.getSalary()+this.bonus;
        return totalsalary;
    }
    public void display()
    {
        System.out.println("The name is "+getFirstname()+" "+getLastname());
        System.out.println("the totalsalary is : "+calculatetotalsalary());

    }

}
