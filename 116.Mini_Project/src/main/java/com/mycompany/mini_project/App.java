/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) throws InterruptedException{
        
        System.out.println("Sabiha Gokcen Havalimanina Hosgeldiniz...");
        
        String sartlar = "Yurtdisi Cikis Kurallari:\n"
                        +"Herhangi Bir Siyasi Yasaginizin Bulunmamasi Gerekiyor\n"
                        +"15 TL Harc Bedelini Tam Olarak Yatirmaniz Gerekiyor\n"
                        +"Gideceginiz Ulkeye Vizeniz Bulunmasi Gerekiyor";
        
        String messege = "Yurdisi Cikis Sartlarinin Hepsini Saglamaniz Gerekiyor...";
        
        while (true) {            
            
            System.out.println("*************************************************");
            System.out.println(sartlar);
            System.out.println("*************************************************");
            

            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harc Bedeli Kontrol Ediliyor...");
            Thread.sleep(3000); //programın 3 saniye beklemesini sağlar...
           
            try {
                yolcu.yurtdisiHarciKontrol();
            } catch (HarcException ex) {
                ex.printStackTrace();
                continue;
            }
            
            
                
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);//programın 3 saniye beklemesini sağlar...
            try {            
                yolcu.siyasiYasakKontrol();
            } catch (SiyasiException ex) {
                ex.printStackTrace();
                continue;
            }
            
            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(3000);//programın 3 saniye beklemesini sağlar...
            try {
                yolcu.vizeDurumuKontrol();
            } catch (VizeException ex) {
                ex.printStackTrace();
                continue;
            }
            
            
            System.out.println("ISLEMLERINIZ TAMAM! YURTDISINA CIKABILIRSINIZ...");
            break;
        }

    }
}
