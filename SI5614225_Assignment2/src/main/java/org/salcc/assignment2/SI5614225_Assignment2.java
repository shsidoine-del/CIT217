/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.salcc.assignment2;

/**
 *
 * @author shema
 */
public class SI5614225_Assignment2 {

    public static void main(String[] args) {
        
        //Create the list
        GradedItemList list = new GradedItemList();
        
        //Create an Exam object
        Exam finals = new Exam("Final",12, 13, 8, 0,"final.pdf");
        finals.setGrade(0.78);
        
       Assignment lab = new Assignment("Lab 1",8,26,23,59,"lab1.pdf", "calendar.csv");
       lab.setGrade(0.50);
       
       list.addItem(finals);
       list.addItem(lab);
       
        System.out.println (list);
         System.out.println ("Average Grade: " + list.averageGrade()) ;
        
        
       
    }
}

