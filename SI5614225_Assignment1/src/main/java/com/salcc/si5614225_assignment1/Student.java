/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salcc.si5614225_assignment1;

/**
 *
 * @author shema
 */
public class Student extends Person {
    
    public static final String freshman ="Freshman";
    public static final String sophomore = "Sophomore";
    public static final String junior = "Junior";
    public static final String senior = "Senior";
    
    private String status;

    public Student(String name, String status) {
        super(name);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Student:" + name;
    }    
    
}
