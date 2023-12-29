/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finally_bloklari;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {

        /*
        KONU ANLATIMI:
        -->try ve catch bloklarımız çalışsada çalışmasada(yani exception oluşsada oluşmasada) finally bloklarımız her zaman çalışır...
        */
        
        try{
            
            int a = 30 / 0;
 
        }
        catch(ArithmeticException e){
            System.out.println("Bir sayi 0'a bolunemez...");
        }
        finally{
            
            System.out.println("Finally bloğu çalisiyor...");
        }
    }
}
