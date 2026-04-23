/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.salcc.assignment3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shema
 */
public class Library {
    
    public static ArrayList<Item> items = new ArrayList<>();
    public static ArrayList<Borrower> borrowers = new ArrayList<>();

    public static void main(String[] args) {
        int opt= 0;
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("************Menu**************");
            System.out.println("1 -Add User");
            System.out.println("2 -Add Book");
            System.out.println("3 -Borrow Book");
            System.out.println("4 -Return Book");
            System.out.println("5 -Search a Book by Name");
            System.out.println("6 -Search borrower by name");
            System.out.println("7 -Quit");
            System.out.println("*****************************");
            opt = scanner.nextInt();
            scanner.nextLine();
            System.out.println(" ");
            
       
        
        switch (opt){
            
            case 1:
                System.out.print("Enter Student Name:");
                String name = scanner.nextLine();
                
                System.out.print("Enter ID (or 0 if none):");
                int id = scanner.nextInt();
                scanner.nextLine();
                
                System.out.print("Enter Student ID (or Enter if none):");
                String studentId = scanner.nextLine();
                
                Borrower bor;
                
                if(id !=0){
                    bor = new Borrower(id,name);
                }else{
                    bor = new Borrower(name, studentId);
                }
                borrowers.add(bor);
                System.out.println("");

                System.out.println("User Added");
                break;
            //Add bood
            case 2:
                System.out.print("Book ID:");
                int bookid = scanner.nextInt();
                scanner.nextLine();
                
                System.out.print("Enter Title:");
                String title = scanner.nextLine();
                              
                System.out.print("Enter Author:");
                String author = scanner.nextLine();
                
                System.out.print("Enter Genre:");
                String genre = scanner.nextLine();
                
                Book bo = new Book(bookid, title, author,genre);
                items.add(bo);
                
                System.out.print("Book Added");
                break;
            //Borrow Book
            case 3:
                System.out.print("Enter Borrower Name:");
                String bName = scanner.nextLine();
                              
                System.out.print("Enter Book Title:");
                String bTitle = scanner.nextLine();
                
                Borrower foundBorrower= searchBorrower(bName);
                Item foundItem = searchItem(bTitle);
             
                   if (foundBorrower != null && foundItem != null){
                       foundBorrower.borrowedItem(foundItem);
                    }else {
                       System.out.println("Borrower or Book not found");
                     }
                break;
            //Return Book
            case 4:
                System.out.print("Enter Borrower Name:");
                String rName = scanner.nextLine();
                              
                System.out.print("Enter Book Title:");
                String rTitle = scanner.nextLine();
                
                Borrower rborrow = searchBorrower(rName);
                Item rItem;
                rItem = searchItem(rTitle);
                
                if(rborrow != null && rItem != null){
                rborrow.returnItem(rItem);
                }else{
                    System.out.println("Borrower or Book not found");
                    }
                break;
            //Search Book
            case 5:                              
                System.out.print("Enter Book Title:");
                String sTitle = scanner.nextLine();
                
                Item found;
                found = sItem(sTitle);
                
                if (found != null){
                    System.out.println(found);
                }else{
                    System.out.println("Book not found");
                }
                break;
            
            case 6:
                System.out.print("Enter Borrower Name:");
                String sName = scanner.nextLine();
                
                
                Borrower foundUser;
                foundUser = sBorrower(sName);
        
                
                if(foundUser != null){
                    System.out.println(foundUser.displayInfo());
                }else{
                    System.out.println("Borrower not found");
                }
                break;
        }
        
         }while(opt !=7);
        
        scanner.close();
        }

    private static Item searchItem(String bTitle) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static Borrower searchBorrower(String rName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static Item sItem(String sTitle) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static Borrower sBorrower(String sName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

}
