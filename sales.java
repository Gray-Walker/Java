/**
  
 
   This program demonstrates how to create an array, that can be manipulated and calculated for inventory/sales purposes
 
 */

import java.util.Scanner;

public class sales {

   public static void main(String args[]) {
   
        int[] partnumber = new int[6]; // creating the arry
        int[] quantity = new int[6];
        int[] costofpart = new int[6];
        int[] dollaramount = new int[6];
        
        int totalSales = 0; // the final revenue
        
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 6; i++) { // the loop for the first three arrays
        
            partnumber[i] = (i+1);
            
            System.out.println("Part Num" + (i+1));
            
            System.out.print("Type the amount of parts: ");
            
            quantity[i] = input.nextInt();
            
            System.out.print("Type the cost of the parts: ");
            
            costofpart[i] = input.nextInt(); 
         }
         
        for (int i = 0; i < 6; i++) { // the loop to calculate theprice
        
            dollaramount[i] = costofpart[i] * quantity[i] ;
            
         }
         
         for (int i = 0; i<6; i++) { // printing out each transaction
         
            System.out.println("Your Transaction for Part Number " + partnumber[i] + " is going to be " + dollaramount[i]); 
            }
            
          
         
         for (int i = 0; i < 6; i++){ // Adding the price to the totalSales revenue, to calculate all the revenue earned from the car parts sold. 
         
            totalSales += dollaramount[i];
            
           }
           
         System.out.println("The total revenue is  " + totalSales);    //printing out revenue.
         
   
   }

}
