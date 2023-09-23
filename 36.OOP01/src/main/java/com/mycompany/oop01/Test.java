/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop01;

/**
 *
 * @author ASUS
 */
public class Test {
    
    public static void main(String[] args) {
        
        Araba araba1 = new Araba(); //Araba classına ulaşmak için araba1 referansını oluşturduk.
        
        araba1.renk = "Kırmızı";
        araba1.kapilar = 4;
        araba1.tekerlekler = 4;
        araba1.motor = "16V";
        araba1.model = "CADDY";
        
        System.out.println(araba1.motor);
    }
}
