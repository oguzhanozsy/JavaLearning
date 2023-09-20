/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        int giris_hakki = 3;
        String kullanici_adi = "oguzhanozsy";
        String parola = "123456";
        
        
        System.out.println("******************************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz");
        System.out.println("******************************");
        
        while (true) {            
            
            System.out.print("Kullanici Adini Giriniz: ");
            String ad = a.nextLine();
            System.out.print("Parolayı Giriniz: ");
            String sifre = a.nextLine();
            
            if(ad.equals(kullanici_adi) && sifre.equals(parola)){
                
                System.out.println("Giriş Başarili...");
                break;
                
            }else if(!ad.equals(kullanici_adi) && sifre.equals(parola)){
                
                System.out.println("Kullanici Adi Hatali...");
                giris_hakki -= 1;
                System.out.println("Kalan Giris Hakkınız: " + giris_hakki);
            
            }else if(ad.equals(kullanici_adi) && !sifre.equals(parola)) {
             
                System.out.println("Parola Hatalı...");
                giris_hakki -= 1;
                System.out.println("Kalan Giris Hakkınız: " + giris_hakki);
            
            }else{
                
                System.out.println("Kullanıcı Adınız ve Parolanız Hatalı...");
                giris_hakki -= 1;
                System.out.println("Kalan Giris Hakkınız: " + giris_hakki);
            }
            
            if(giris_hakki == 0){
                
                System.out.println("Giriş Hakkınız Bitti...");
                break;
            }
                
            
        }
    }
}
