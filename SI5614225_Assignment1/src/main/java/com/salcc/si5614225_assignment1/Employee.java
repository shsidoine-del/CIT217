/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salcc.si5614225_assignment1;

/**
 *
 * @author shema
 */
public class Employee extends Person{
    
    protected String office;
    protected double salary;
    protected String dateHired;
    
    public Employee(String name){
        super(name);
        dateHired = new String();
    }
    @Override
    public String toString(){
        return "Employee: " + name;
    }
}
