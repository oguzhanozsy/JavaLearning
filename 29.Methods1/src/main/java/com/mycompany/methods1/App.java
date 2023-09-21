/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methods1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static void selamlama(){
        
        System.out.println("Merhaba Nasılsınız?");
        System.out.println("Selamlar...");
    }
    
    public static void faktoriyel(){
        
        Scanner a = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        int sayi = a.nextInt();
        
        int faktoriyel = 1;
        
        while (sayi > 0) {

            faktoriyel *= sayi;
            sayi--;
            
        }
        
        System.out.println("Faktoriyel = " + faktoriyel);
    }
    
    
    
    public static void main(String[] args) {
        
        /*
            -->Kod bloğudur. Her çağırıldığında içindeki kodlar çalışır.
            -->Java da method olarak geçen yapılar diğer programlama dillerinde fonksiyon olarak da bilinir.
            -->System.out.println(); bu ekrana yazdıran bir methot örneğidir. 
            -->KULLANIMI;
                
                Erişim_Belirleyici(Opsiyonel) Ekstra_Özellikler Dönüş_Tipi Fonksiyon_Adı(Parametreler){
                
        
                }
        
        */
        
        selamlama();
        selamlama();
        faktoriyel();
    }
}
