/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.salcc.si5614225_assignment4;

import java.util.Scanner;
/**
 *
 * @author shema
 */
public class Menu {

    public static void main(String[] args) {
        int choice;
        int prodID;
        String name;
        int quant;
        float price;
        
        Inventory store = new Inventory();
        Scanner scanner = new Scanner(System.in);
        

       // Displaying the MENU
        do {  
            System.out.println("******* Store MENU *******************");
            System.out.println("1 - Add a Product");
            System.out.println("2 - Display Inventory");
            System.out.println("3 - Search for Product by ID");
            System.out.println("4 - Update Stock Quantity");
            System.out.println("5 - Delete a Product");
            System.out.println("6 - Inventory Value");
            System.out.println("7 - Quit");
            System.out.println("********************************");
            choice = scanner.nextInt();
            System.out.println("");
            
            switch (choice){
              case 1:
                    System.out.print("Enter the product: ");
                    prodID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the product's Name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter the Qunatity of the stock: ");
                    quant = scanner.nextInt();
                    System.out.print("Enter the Product's Price: ");
                    price = scanner.nextFloat();
                    store.addProduct(new Product(prodID, name, quant, price));                    
                    break;
                    
                case 2:
                    store.displayInventory();
                    break;
                    
                case 3:
                    System.out.print("Enter the Product ID to search");
                    prodID = scanner.nextInt();
                    
                    Product found = store.searchID(prodID);
                    
                    if (found != null){
                        System.out.println("Found Proucduct:" + found);
                    } else {
                        System.out.println("Product not found");
                    }
                    break;
                
                case 4:
                    System.out.println("Enter Product ID to update:");
                    prodID = scanner.nextInt();
                    System.out.print("Enter New Quantity: ");
                    quant = scanner.nextInt();
                    if(store.updateQuantity(prodID, quant)){
                        System.out.print("Quantity: ");
                    }else {
                        System.out.print("Product not found ");
                    }
                    break;
                case 5:
                    System.out.print("Enter the ID of the Product to delete");
                    prodID = scanner.nextInt();
                    if(store.deleteProduct(prodID)){
                        System.out.print("Product deleted");
                    }else {
                        System.out.print("Product not found ");
                    }
                    break;
                
                case 6:
                    System.out.print("Total Inventory Value: "+ store.totalValue());
                    break;
                
                case 7:
                    System.out.println("Program Ended");
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Invalide choice");
                
            }
        } while (choice != 7 );
        
        scanner.close();
    }
}
