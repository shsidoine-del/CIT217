/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.salcc.assignment2;

/**
 *
 * @author shema
 */
public class Assignment extends GradedItem {
    
    private String specification;
    private String data;

    public Assignment(String name, int month, int day, int hour, int minute, String specification, String data) {
        super(name, month, day, hour, minute);
        this.specification = specification;
        this.data = data;
    }

    @Override
    public String toString() {
        return super.toString() +  " : specification= " + specification + " : datasource=" + data ;
    }
    
    
    
}
