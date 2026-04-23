/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.salcc.assignment2;

import java.util.ArrayList;

/**
 *
 * @author shema
 */
public class GradedItemList {
    
     private ArrayList<GradedItem> gradedItem;

    public GradedItemList(){
        gradedItem = new ArrayList<GradedItem>();
    }
    
    public void addItem(GradedItem item){
        gradedItem.add(item);
       
}
    public double averageGrade(){
        
    double totalGrade =0;
        
        for(int item=0; item < gradedItem.size(); item++){
            totalGrade = totalGrade + gradedItem.get(item).getGrade();    
        }
        return totalGrade / gradedItem.size();
    }

    public ArrayList getGradedlist() {
        return gradedItem;
    }

    public void setGradedlist(ArrayList gradedItem) {
        this.gradedItem = gradedItem;
    }

    @Override
    public String toString() {
        String result = " ";
        for(int item =0; item < gradedItem.size(); item++){
            result = result + gradedItem.get(item).toString() + "\n";
        }
        return result;
    }
    
}

