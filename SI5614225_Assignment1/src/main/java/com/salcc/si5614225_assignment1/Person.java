/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salcc.si5614225_assignment1;

/**
 *
 * @author shema
 */
public class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String email;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person:" + name;
    }
    
    
}
