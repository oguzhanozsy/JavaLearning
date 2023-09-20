/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {
       
        Scanner a = new Scanner(System.in);
        int bakiye = 1000;
        String islemler =  "1.İşlem : Bakiye Öğrenme\n"
                         + "2.İşlem : Para Çekme\n"
                         + "3.İşlem : Para Yatırma\n"
                         + "Çıkış İçin q'a basın";
        
        System.out.println("*************************");
        System.out.println(islemler);
        System.out.println("*************************");
        
        while (true) {
            
            System.out.print("İşlem Seçiniz: ");
            String islem = a.nextLine();
            
            if(islem.equals("q")){
                
                System.out.println("Programdan Çıkılıyor...");
                break;
                
            } else if(islem.equals("1")){
                
                System.out.println("Bakiyeniz : " + bakiye);
                
            } else if(islem.equals("2")){
                
                System.out.print("Çekmek İstediğiniz Tutar : ");
                int tutar = a.nextInt();
                a.nextLine();  // nextInt/nextLine hatasını önlemek için boş bir değer atanıldı...
                
                if(bakiye - tutar < 0){
                    
                    System.out.println("Yetersiz Bakiye...");
                
                }else{
                    
                  bakiye -= tutar;
                  System.out.println("Kalan Bakiyeniz: " + bakiye);
                }
                
                
            } else if(islem.equals("3")){
                
                System.out.print("Yatırman İstediğiniz Tutar: ");
                int tutar = a.nextInt();
                a.nextLine();  // nextInt/nextLine hatasını önlemek için boş bir değer atanıldı...
                
                bakiye += tutar;
                
                System.out.println("Yeni Bakiyeniz: " + bakiye);
                
            } else {
                System.out.println("Geçersiz İşlem...");
            }
            
            
        }
    }
}
