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
public class jb6nilaiB {
     public static void main(String[] args) {
        String a = "";
        String b = "";
        String c = "";
        a = JOptionPane.showInputDialog("Masukkan nilai pertama Anda");
        int pertama = Integer.valueOf(a).intValue();
        b = JOptionPane.showInputDialog("Masukkan nilai kedua Anda");
        int kedua = Integer.valueOf(b).intValue();
        c = JOptionPane.showInputDialog("Masukkan nilai ketiga Anda");
        int ketiga = Integer.valueOf(c).intValue();
        int rata_rata = (pertama + kedua + ketiga) / 3;

        String hasil = "";
        hasil += "Nilai pertama: " + pertama + "\n";
        hasil += "Nilai kedua: " + kedua + "\n";
        hasil += "Nilai ketiga: " + ketiga + "\n";
        hasil += "Rata-rata nilai Anda adalah " + rata_rata + "\n";
        if (rata_rata <= 60) {
            hasil += ":-(" + "\n";
        } else {
            hasil += ":-)" + "\n";
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
