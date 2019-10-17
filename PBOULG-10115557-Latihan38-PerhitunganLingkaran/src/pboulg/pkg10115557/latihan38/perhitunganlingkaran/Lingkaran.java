/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pboulg.pkg10115557.latihan38.perhitunganlingkaran;

/**
 *
 * @author
 * NAMA     : Rayan
 * KELAS    : PBO-Ulg
 * NIM      : 10115557
 * Deskripsi Program : Membuat program Perhitungan Lingkaran berbasis object
 */
class Lingkaran {
   double jari;
    double luas;
    double kel;
    
    public double jari2Lingkaran(double diameter) {
        jari = diameter/2;
        return jari;
    }
    public double luasLingkaran(double r) {
        luas = Math.PI*r*r;
        return luas;
    }
    public double kelilingLingkaran(double r) {
        luas = 2*Math.PI*r;
        return luas;
    } 
}
