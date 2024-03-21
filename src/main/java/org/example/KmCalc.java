package org.example ;
import java.util.Scanner;

public class KmCalc { //Km_80
    public static void main (String [] args) {
Scanner scanner = new Scanner(System.in) ;
// Create an object of Scanner class

 // Enter numbers
        System.out.println("Welcome human!") ;
        System.out.println("Enter the first number:") ;
     double num1 = scanner.nextDouble() ;
// Enter numbers
        System.out.println("Enter second number:") ;
     double num2 = scanner.nextDouble() ;
// Enter operator
        System.out.println("Choose operation") ;
        char operator = scanner.next().charAt(0) ;

     double result ;

   switch (operator) { //Km_80
       case'+' :
           result = num1 + num2 ;
           System.out.println("Result:" + result) ;
           break ;
       case'-' :
           result = num1 - num2 ;
           System.out.println("Result:" + result) ;
           break ;
       case'*' :
           result = num1 * num2 ;
           System.out.println("Result:" + result) ;
           break ;
       case'/' :
         if (num2 != 0) {
             result = num1 / num2 ;
             System.out.println("Result:" + result) ;
         } else {
             System.out.println("Error: Cannot divide by zero!") ;
         }
           break ;
       case'%' :
           result = num1 % num2 ;
           System.out.println("Result:" + result) ;
           break ;
       default:
           System.out.println("Error: Invalid operator!");

   }

    scanner.close() ;
    }

}