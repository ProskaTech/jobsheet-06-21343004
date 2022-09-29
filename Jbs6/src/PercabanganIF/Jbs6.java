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
public class Jbs6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double total_pembelian, diskon =0;
       Scanner dataMasuk = new Scanner(System.in);
       System.out.print("Masukan Total Pembelian: Rp");
       total_pembelian = dataMasuk.nextDouble();
       
       if (total_pembelian >= 50000)
           diskon = 0.1 * total_pembelian;
       
       System.out.println("Besarnya disko : Rp " + diskon);
       
    } 
       
       
     
       
       
     
       
       
       
      
    
   
}