/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PercabanganIF;

/**
 *
 * @Created Azzahra21343004
 */
import java.util.Scanner;
public class Grade {
  public static void main(String[] args) {
     double grade = 92.0;
     
     if(grade >= 90){
         System.out.println("Excellent!");
     }
     else if((grade < 90) && (grade >= 80)){
         System.out.println("Study harder!");
     }
     else {
         System.out.println("Sorry, you failed.");
     }
  }  
}
  
