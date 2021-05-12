/****

Overloading the same method to calculate feet, and inces into centimeters for one set of parmeters, and then convert inches to feet with remaineder in another. 

***/

import java.util.Scanner; 

public class Overloading {

      public static void main(String args[]){
        
        
        calcFeetAndInchesToCentimeters(10, 50);
        
        calcFeetAndInchesToCentimeters(-5);
        
        
        
       }
       
       public static double calcFeetAndInchesToCentimeters(double feet, double inches){
       
         if ((feet >= 0) && (inches >= 0 && inches <= 12)){
         double newInches = feet * 12;
         newInches = newInches + inches;
        
         double  centimeters = newInches * 2.54;
         System.out.println(centimeters);
         return centimeters;
         
         }
         else {
         System.out.println("Invalid feet or inches parameters");
         return -1;
         }
       }
       
        public static double calcFeetAndInchesToCentimeters(double inches){
        
        if(inches <0) {
         
            return -1;
         }
         double feet = (int) inches /12;
         double remainingInches = (int) inches % 12;
         System.out.println("The inches " + inches + ", feet " + feet + " and the remaining inches " + remainingInches);
         return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
       

 }
       
       



