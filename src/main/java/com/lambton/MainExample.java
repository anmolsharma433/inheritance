package com.lambton;

import javafx.scene.input.DataFormat;

import java.time.LocalDate;

public class MainExample {
    public static void main(String[] args)
    {

        /*
        Student s1 = new Student(1,"ANmol","Sharma", LocalDate.now(),"Male","MADT",2);
        p1=s1;
        s1.display();
         */

        FullTime f1 =new FullTime(1,"Anmol","Sharma",LocalDate.now(),"MALE","TEACHER",5000,"ANDROID",500);
        f1.calculatetotalsalary();
        f1.display();

        PartTime pt1 = new PartTime(1,"Anmol","Sharma",LocalDate.now(),"MALE","TEACHER",5500,"SWIFT",60);
        pt1.calculatetotalsalary();
        pt1.display();
    }

}
