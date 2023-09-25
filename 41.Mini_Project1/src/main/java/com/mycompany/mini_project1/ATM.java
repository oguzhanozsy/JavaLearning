/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_project1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class ATM {
    
    public void calis(Hesap hesap){
        
        Login login = new Login();
        
        Scanner a = new Scanner(System.in);
        
        System.out.println("BANKAMIZA HOŞGELDİNİZ");
        System.out.println("*********************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("*********************");
        int giris_hakki = 3;
        
        while (true) {            
            
            if(login.login(hesap)){
                
                System.out.println("Giriş Başarılı...");
                break;
                
            }else {
                
                System.out.println("Giriş Başarısız...");
                giris_hakki -= 1;
                System.out.println("Kalan Giriş Hakkı: " + giris_hakki);
                
            }
            if(giris_hakki == 0){
                
                System.out.println("Giriş Hakkınız Bitti...");
                return;
                
            }
        }
        
        System.out.println("*********************");
        String islemler = "1.Bakiye Görüntüle\n"
                          + "2.Para Yatırma\n"
                          + "3.Para Çekme\n"
                          + "Çıkış için q'ya basın";
        System.out.println(islemler);
        System.out.println("*********************");
        
        while (true) {            
            
            System.out.print("İşlem Seçiniz: ");
            String islem = a.nextLine();
            
            if(islem.equals("q")){
                
                break;
                
            }else if(islem.equals("1")){
                
                System.out.println("Bakiyeniz: " + hesap.getBakiye());
                
            }else if(islem.equals("2")){
                
                System.out.print("Yatırmak İstediğiniz Tutar: ");
                int tutar = a.nextInt();
                a.nextLine();
                hesap.paraYatir(tutar);
                
            }else if(islem.equals("3")){
                
                System.out.print("Çekmek İstediğiniz Tutar: ");
                int tutar = a.nextInt();
                a.nextLine();
                hesap.paraCek(tutar);
                
            }else {
                
                System.out.println("Geçersiz İşlem...");
                
            }
        }
        
    }
    
}
