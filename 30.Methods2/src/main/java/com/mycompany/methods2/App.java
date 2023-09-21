/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methods2;

/**
 *
 * @author ASUS
 */
public class App {

    public static void toplama(int a , int b , int c){
        
        System.out.println("Toplamları = " + (a + b + c));
        
    }
    
    
    
    
     public static void selamlama(String isim){
         
         System.out.println("Selamlar " + isim);
         
     }
    
    
    public static void main(String[] args) {
        
        selamlama("Oğuzhan");
        selamlama("Ali");
        
        toplama(1 , 2 ,3 );
        
    }
}
