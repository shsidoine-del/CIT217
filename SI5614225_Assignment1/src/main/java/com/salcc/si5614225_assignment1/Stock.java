/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salcc.si5614225_assignment1;

/**
 *
 * @author shema
 */
public class Stock {
    
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    
    public Stock (Stock stock){
        this.symbol = stock.symbol;
        this.name = stock.name;
        this.previousClosingPrice = stock.previousClosingPrice;
        this.currentPrice = stock.currentPrice;
    }
    
    public void setPreviousClosingPrice(double pastPrice) {
        this.previousClosingPrice = pastPrice;
    }
    public void setCurrentPrice(double cPrice) {
        this.currentPrice = cPrice;
    }
    
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }
    
    @Override
    public String toString(){
        return "Stock {Symbol:" + this.symbol +
                " Name:" + this.name +
                " Closing Price:" + this.previousClosingPrice +
                " Current Price:" + this.currentPrice + "}";
    }

    
    
    
    
}
