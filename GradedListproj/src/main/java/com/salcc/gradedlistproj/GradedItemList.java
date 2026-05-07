/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salcc.gradedlistproj;

/**
 *
 * @author shema
 */
public class GradedItemList {
    
    
    private ArrayList<GradedItem> gradedlist;

    public GradedItemList(){
        gradedlist = new ArrayList<GradedItemList>();
    }
    
    public void addItem(GradedItem item){
        gradedlist.add(item);
       
}
    public double averageGrade(){
        double totalGrade =0;
        for(int i=0; i <gradedlist.size()-1; i++){
            totalGrade = totalGrade + gradedlist.get(i).getGrade()        
        }
        return [totalGrade / gradedlist.size()]
    }
}
    public ArrayList getGradedlist() {
        return gradedlist;
    }

    public void setGradedlist(ArrayList gradedlist) {
        this.gradedlist = gradedlist;
    }
    
    
  
 
    
}
