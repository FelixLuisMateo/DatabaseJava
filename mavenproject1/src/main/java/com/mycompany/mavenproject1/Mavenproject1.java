/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author CL2~PC35
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    
     
          // game continues while both players have health
            System.out.println("\n[1] - matcha");
            System.out.println("[2] - blanca");
            System.out.println("[3] - cookies");
            System.out.println("[4] - brown");
            System.out.println("[5] - black");
            

            Scanner input = new Scanner(System.in);
            System.out.print("Enter Your Order: ");
            int order = input.nextInt();
            
            int price = 0;
            String productname = "";

            if (order == 1) {
                productname = "matcha";
                price = 65;
            }else if(order == 2){
                productname = "blanca";
                price = 75;
            }else if(order == 3){
                productname = "coockies";
                price = 89;
            }else if(order == 4){
                productname = "brown";
                price = 60;
            }else if(order == 5){
                productname = "black";
                price = 20;
            }else{
                System.out.println("Invalid Choice");
            }
            System.out.println(productname);
                System.out.print("Price: "  +price);
                System.out.println("\nEnter Your Quantity!");
                int quant = input.nextInt();
                
                
                int total = price * quant;
                double discount = 0;
                
                
                if(total >= 100){
                    discount = total *0.01;
                }
                
                double all = total - discount;
                       
                System.out.println("Total is!" + total);
                if(discount > 0){
                    System.out.println("your total is!" + discount);
                }
                System.out.println("Your total discount!" + total);
                
                double cash = 0;
                while(cash < total){
                    System.out.println("Enter Your Cash!" );
                    cash = input.nextDouble();
                    
                    if(cash < total){
                        System.out.println("Issuficient Cash! Try again");
                    }
                }
                System.out.print("\nDo you want to order Drinks? (yes/no): ");
                String again = input.next();
                if (again.equalsIgnoreCase("no")) {
                System.out.println("Goodbye! Come again.");
            }
                     
                double change = cash - total;
                System.out.println("Payment Accepted");
                System.out.println("Change!" + change);
                System.out.println("ThankYou For Buying!!, Come Again!");
                
                   
                
                
       
    }
}
