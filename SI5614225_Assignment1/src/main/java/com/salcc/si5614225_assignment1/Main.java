/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.salcc.si5614225_assignment1;

/**
 *
 * @author shema
 */
public class Main {

    public static void main(String[] args) {
        
        testNumber1();
        testNumber2();
    }
        public static void testNumber1(){
        
        System.out.println("Number 1 Test");
            
        Stock stock1 =new Stock("ORCL", "Oracle Corporation");
        stock1.setPreviousClosingPrice(34.5);
        stock1.setCurrentPrice(34.35);
        
        System.out.println(stock1.toString());
        System.out.println("Chaange Percent:" + 
                stock1.getChangePercent() + "%");
        }
        
        public static void testNumber2(){
            
        System.out.println("Number 2 Test");
            
       Person human = new Person("Felix");
       Student study = new Student(" Lee", Student.freshman);
       Employee  hired = new Employee("Christopher");
       Faculty dept= new Faculty("Science");
       Staff lecturer = new Staff("Keisha");
       
       System.out.println(human);
       System.out.println(study);
       System.out.println(hired);
       System.out.println(dept);
       System.out.println(lecturer);
        }
}
