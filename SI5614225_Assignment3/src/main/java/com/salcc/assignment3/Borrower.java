/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salcc.assignment3;

import java.util.ArrayList;

/**
 *
 * @author shema
 */
public class Borrower extends User {
    private ArrayList<Item> borrowedItems;

        public Borrower( int id, String name) {
            super(id, name);
            borrowedItems = new ArrayList<Item>();
        }

    public Borrower(String name, String studentId) {
        super(name, studentId);
        borrowedItems = new ArrayList<Item>();
    }
        
     public void setBorrowedItems(ArrayList<Item> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }
     
     public String getName(){
         return name;
     }
     
    public void borrowedItem(Item item){
       if(item.isAvailable()){
            borrowedItems.add(item); 
            item.setAvailable(false);
            System.out.println("Item borrowed successfully");
       }else{
           System.out.println("Item is Unavailable");
       }
       
    }
    
      public void returnItem(Item item){
           if(borrowedItems.remove(item)){
           item.setAvailable(true);
           System.out.println("Item returned");
       }else{
    System.out.println("Item was not borrowed");
        }  
    }
      
      @Override 
        public String toString(){
          return "Items borrowed:" + borrowedItems;
      }
      
        @Override
        public String displayInfo(){
            return "ID:"+ id +"Name:" + name + "\n Borrowed Items: " + borrowedItems;
        }

}
