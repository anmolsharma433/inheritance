package com.lambton;

import javafx.scene.input.DataFormat;

import java.time.LocalDate;

public class MainExample {
    public static void main(String[] args)
    {
        Person p1;
        /*
        Student s1 = new Student(1,"ANmol","Sharma", LocalDate.now(),"Male","MADT",2);
        p1=s1;
        s1.display();
         */

        Faculty f1 =new Faculty(1,"Anmol","Sharma",LocalDate.now(),"MALE","Teacher",2000,"Android Development");
        f1.display();
    }

}
