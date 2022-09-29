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
import javax.swing.JOptionPane;
public class Tugas2A {
     public static void main(String[]args){
        String angka ="";
        angka = JOptionPane.showInputDialog("Silahkan masukkan angka ");
        int a = Integer.valueOf(angka).intValue();
   
        String hasil ="";
        if (a >= 1 && a <= 10){
            hasil += "Valid number";
        }
        else{
            hasil += "Invalid Number";
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
