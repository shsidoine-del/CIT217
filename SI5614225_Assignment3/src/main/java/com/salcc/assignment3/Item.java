/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salcc.assignment3;

/**
 *
 * @author shema
 */
abstract public class Item {
    private int bookid;
    private String title;
    private boolean available =true;

    public Item(int bookid, String title) {
        this.bookid = bookid;
        this.title = title;
    }
    
    @Override
    public String toString(){
        return "Item Id:" + bookid + "and Title:" +title;
}
    
    abstract public String displayInfo();

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getTitle() {
        return title;
    }
    
}
