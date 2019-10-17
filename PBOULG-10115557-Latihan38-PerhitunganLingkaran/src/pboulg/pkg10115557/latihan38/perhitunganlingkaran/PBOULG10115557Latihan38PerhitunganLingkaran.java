/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pboulg.pkg10115557.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Rayan
 * KELAS    : PBO-Ulg
 * NIM      : 10115557
 * Deskripsi Program : Membuat program Perhitungan Lingkaran berbasis object
 */
public class PBOULG10115557Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String diameter;
        double d; //operand
        Scanner scn = new Scanner(System.in);
        Lingkaran l = new Lingkaran();
        
        System.out.println("===Perhitungan Lingkaran===");
        
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            diameter = scn.nextLine();
            System.out.println((!diameter.matches("[0-9]*"))
                    ?"Nilai Diameter Tidak Sesuai\n":"");

        } while (!diameter.matches("[0-9]*"));
        
        System.out.println("===Hasil Perhitungan Lingkaran===");
        d = Double.parseDouble(diameter); 
        
        System.out.printf("Jari-jari Lingkaran = %.0f cm %n",
                l.jari2Lingkaran(d));
        System.out.printf("Luas Lingkaran = %.2f cm %n",
                l.luasLingkaran(l.jari2Lingkaran(d)));
        System.out.printf("Keliling Lingkaran = %.2f cm %n",
                l.kelilingLingkaran(l.jari2Lingkaran(d)));
    }
    
}
