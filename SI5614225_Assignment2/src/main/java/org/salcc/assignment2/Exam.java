/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.salcc.assignment2;

/**
 *
 * @author shema
 */
public class Exam extends GradedItem{
    
    private String problemset;
    
    
    public Exam(String name, int month, int day, int hour, int minute, String problemset){
        super(name, month, day, hour, minute);
        this.problemset = problemset;
    }

    @Override
    public String toString() {
        return super.toString() +  ": problem set=" + problemset;
    }
    
    
   
}
