/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methods3;

/**
 *
 * @author ASUS
 */
public class App {

    public static int toplama(int a , int b , int c){
        
        return (a + b + c);
    }
    
    public static int iki_ile_carp(int a){
        
        return a * 2;
    }
    
    public static int iki_ile_topla(int a){
        
        return a + 2;
    }
    
    public static int dort_ile_carp(int a){
        
        return a * 4;
    }
    
    public static void main(String[] args) {

        System.out.println("Toplamları = " + toplama(1 , 2 , 3));
        
        System.out.println("Çıktı = " + dort_ile_carp(iki_ile_topla(iki_ile_carp(8))));
        
    }
}
