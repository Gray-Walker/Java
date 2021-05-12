/**
 
   This program demonstrates how to create a list of cars, replace specified element in array, delete, and add. Finally printing them all out. 
   
 
 */



import java.util.ArrayList;

public class list {

   public static void main(String args[]) {
      
      ArrayList<String> car = new ArrayList<String>(); // creating the array
      car.add("Mustang");
      car.add("Mclaren P1");
      car.add("Hummer");
      car.add("Dodge Challenger");
      car.add("Tesla Roadster");
      car.add("Chevy Impala");
      car.add("Lamborgini");
      car.add("Knight Rider");
      car.add("Delorean");
      car.add("Dragon");
      
      System.out.println("There are the cars I would like to own some day: " + car); // printing out the cars
      System.out.print("Car from index 4: " + car.get(4));
      car.remove(9);
      car.add(2,"Corvette"); // addin corvette to the list at index 2
      car.set(7,"Mercedes");
      System.out.println("The size of the list of cars is : " + car.size()); 
      for (int index = 0; index < car.size(); index++)
      {
         System.out.println(index + " " + car.get(index));
   
      }
   }
   
}