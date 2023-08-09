/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author Apipz
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bangundatar016 bangundatar = new Bangundatar016();
        
        Persegi016 persegi = new Persegi016();
        persegi.sisi = 3;
        
        Lingkaran_016 lingkaran = new Lingkaran_016();
        lingkaran.r = 22;
          
        Persegipanjang_016 persegiPanjang = new Persegipanjang_016();
        persegiPanjang.panjang = 8;
        persegiPanjang.lebar = 4;
        
        segitiga_016 mSegitiga = new segitiga_016();
        mSegitiga.alas = 65;
        mSegitiga.tinggi = 5;
        
        bangundatar.luas();
        bangundatar.keliling();
       
        persegi.luas();
        persegi.keliling();
       
        float luas = lingkaran.luas();
        lingkaran.keliling();
       
        persegiPanjang.luas();
        persegiPanjang.keliling();
       
        mSegitiga.luas();
       
    }
    
}
