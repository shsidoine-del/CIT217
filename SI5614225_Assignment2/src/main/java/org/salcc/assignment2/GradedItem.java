/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.salcc.assignment2;

/**
 *
 * @author shema
 */
public class GradedItem {
    private String name;
    private int month;
    private int day;
    private int hour;
    private int minute;
    private double grade;
    
    public GradedItem(String name, int month, int day, int hour, int minute) {
        this.name = name;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    public String getName() {
        return name; }
    public int getMonth() {
        return month; }
    public int getDay() {
        return day; }
    public int getHour() {
        return hour; }
    public int getMinute() {
        return minute; }
    
    public double getGrade() {
        return grade;}

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        
        String mon,d, hr, min;
        
        if(month <10){
            mon = "0" + month;
        }else {
            mon = "" + month;   }
        if(day <10){
            d = "0" + day;
        }else {
            d = "" + day;   }
        if(hour <10){
            hr = "0" + hour;
        }else {
            hr = "" + hour;   }
        if(minute <10){
            min = "0" + minute;
        }else {
            min = "" + minute;   }
        
        return "GradedItem:" + name  + " ( date: " + mon + " - "
                + d + " at " + hr + ":" + min + ") : grade=" + grade ;
    }

    
    
}
