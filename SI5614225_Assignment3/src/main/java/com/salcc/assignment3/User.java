/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salcc.assignment3;

/**
 *
 * @author shema
 */
abstract public class User {
    protected int id;
    protected String name;
    protected String studentId;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    
    @Override
    public String toString(){
        return "User ID: "+ id + ", Name: " + name + ", Student ID: " + studentId;
    }
    
    abstract public String displayInfo();
    
}
