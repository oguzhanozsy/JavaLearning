/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ic_ice_exeption;

/**
 *
 * @author ASUS
 */
public class App {

    public static void ucuncufonksiyon(){
        try{
            int a = 12 / 0;
        }
        catch(ArithmeticException e){
            System.out.println("Bir sayi 0'a bolunemez...");
        }
        
        
    }
    
    public static void ikincifonksiyon(){
        
        ucuncufonksiyon();
    }
            
    public static void birincifonksiyon(){
        
        ikincifonksiyon();
    }
    
    public static void main(String[] args) {

        /*
        KONU ANLATIMI:
        
        -->Exception Propagation: iç içe fonksiyonlarda exceptionlarımızın yakalanmasıdır...
        */
        
        birincifonksiyon();
        
    }
}
