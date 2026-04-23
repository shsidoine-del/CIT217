/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salcc.si5614225_assignment1;

/**
 *
 * @author shema
 */
public class Staff extends Employee{
    
    private String title;

    public Staff(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Staff:" + name;
    }
    
    
}
