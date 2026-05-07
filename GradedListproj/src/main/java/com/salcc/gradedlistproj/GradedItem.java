/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salcc.gradedlistproj;

/**
 *
 * @author shema
 */
public class GradedItem {
    private String name;
    private double grade;
    private int month;
    private int day;
    private int hour;
    private int minute;
    

    public GradedItem(String name, int month, int day, int hour, int minute) {
        this.name = name;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.grade = 0.0;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
    @Override 
    public String toString(){
        return "GradedItem {name: " + this.name +
                "grade: " + this.grade +
                "month: " + this.month +
                "day: " + this.day +
                "hour: " + this.hour +
                "minute: " + this.minute;
    }
    
    
}
