/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance;

/**
 *
 * @author Apipz
 */
public class Lingkaran_016 extends Bangundatar016 {
    int r;
    @Override
    float luas(){
        float luas = (float) ( Math.PI * r);
        System.out.println("luasnya persegi panjang adalah "+ luas);
        return 0;
        
    }
    @Override
    float keliling(){
        float keliling = (float) ( 2 * Math.PI * r);
        System.out.println("keliling persegi panjang adalah "+ keliling);
        return 0x0;
    }
}
