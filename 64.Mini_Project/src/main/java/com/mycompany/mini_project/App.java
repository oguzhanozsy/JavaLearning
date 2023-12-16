/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) throws InterruptedException {
        
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
            yolcu.yurtdisiHarciKontrol();
            
            if(yolcu.yurtdisiHarciKontrol() == false){
                
                System.out.println(messege);
                continue;//döngünün başına gider...
            }
                
            System.out.println("Siyasi Yasak Kontrol Ediliyor...");
            Thread.sleep(3000);//programın 3 saniye beklemesini sağlar...
            
            if(yolcu.siyasiYasakKontrol() == false){
                
                System.out.println(messege);
                continue;//döngünün başına gider...
            }
            
            System.out.println("Vize Durumu Kontrol Ediliyor...");
            Thread.sleep(3000);//programın 3 saniye beklemesini sağlar...
            
            if(yolcu.vizeDurumuKontrol() == false){
                
                System.out.println(messege);
                continue;
            }
            
            System.out.println("ISLEMLERINIZ TAMAM! YURTDISINA CIKABILIRSINIZ...");
            break;
        }

    }
}
