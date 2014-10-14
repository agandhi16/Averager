/**
* @author Alex Gandhi
* @version 14/10/14
*
*/

import java.util.Scanner;

public class Averager {
	
	public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double totalNumbers = 0.0;
      double enterNumbers = 0.0;
      System.out.println("Enter number you would like averaged, when finished enter -1");
      double addNumbers = scnr.nextDouble();
      while (addNumbers != -1) { // while addCalories does NOT have the value of -1
         totalNumbers = totalNumbers + addNumbers;
         enterNumbers = enterNumbers + 1;
         System.out.println("Enter another number or -1 to exit");

         addNumbers = scnr.nextDouble();
       }
       
       System.out.println("Average of Numbers: " + totalNumbers / enterNumbers);
     }
} 

   



