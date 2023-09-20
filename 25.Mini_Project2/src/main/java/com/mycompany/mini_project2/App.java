/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        System.out.print("Sayi Giriniz: ");
        int sayi = a.nextInt();
        
        
        
        System.out.print("Basamak Sayisini Giriniz: ");
        int basamak_sayisi = a.nextInt();
        
        int gecici_sayi = sayi;
        int toplam = 0;
        
        do{
            
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi /= 10;
            
            toplam += Math.pow(basamak_degeri,basamak_sayisi);
            
        }while(gecici_sayi > 0);
    
    
    if(sayi == toplam){
        
        System.out.println(sayi + " Sayisi Armstrong Sayidir...");
    
    }else {
    
            System.out.println(sayi + " Sayisi Armstrong Sayi Değildir...");
    }  
    
   }
}
