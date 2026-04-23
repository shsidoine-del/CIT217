/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salcc.assignment3;

/**
 *
 * @author shema
 */
public class Book extends Item{
    private String author;
    private String genre;

    public Book(int id, String title, String author, String genre) {
        super(id, title);
        this.author = author;
        this.genre = genre;
    }
        
    @Override
    public String toString(){
        return "Book [Author:" +author + " and Genre: " +genre +"]";
    }
    
    @Override
    public String displayInfo(){
        return "Book:"+ author + genre ;
    }    
}
