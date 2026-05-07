/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.salcc.si5614225_assignment4;

/**
 *
 * @author shema
 */
public class Inventory {
    
    Node head;

    public Inventory() {
        this.head = null;
    }
    
    public void addProduct(Product prod){
        Node newNode = new Node(prod);
        if(head == null){
            head = newNode; 
        }else{
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next=newNode; 
        }
    }
    
    public void displayInventory(){
        Node current = head;
        if(current == null){
            System.out.println("Inventory is empty");
            return;
        }
        while(current!= null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    
    //Search product by ID 
    public Product searchID(int prodid){
        Node current = head;
        while(current != head){
            if (current.data.prodID == prodid){
                return current.data;
            }
            current = current.next;
        }
        return null;
    }
    
    //Update stock quantity
    public boolean updateQuantity(int prodid, int newquant){
        Product pr = searchID(prodid);
        if(pr !=null){
            pr.quant = newquant;
            return true;
        }
        return false;
    }
    
    //Delete product by ID
    public boolean deleteProduct(int prodid){
        if(head == null)
            return false;
        if (head.data.prodID == prodid){
            head = head.next;
            return true;
        }
        
        Node current = head;
        while(current.next !=null){
            if(current.next.data.prodID == prodid){
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    //Calculate total inventory value
    public float totalValue(){
        float total = 0;
        Node current =head;
        while(current != null){
            total += current.data.quant * current.data.price;
            current= current.next;
        }
        return total;
    }
}
