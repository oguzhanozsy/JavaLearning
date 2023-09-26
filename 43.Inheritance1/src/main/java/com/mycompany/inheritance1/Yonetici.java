/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance1;

/**
 *
 * @author ASUS
 */
public class Yonetici extends Calisan { //SubClass
    
    //extends Calisan ifadesi şunu der --> Calisan classındaki her özelliği miras al...
    
    private int sorumlu_kisi;//ekstra özellik
    
    public Yonetici(String isim , int maas , String departman , int sorumlu_kisi){
        /*
        Bunları kullanırsak hata vericek çünkü Calisan classında private olarak tanımlanmış...
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
        
        */
        //constructor aracılığı ile erişiyoruz...
        super(isim, maas, departman);
        
        
        this.sorumlu_kisi = sorumlu_kisi;
        
    }
    
    public void zam_yap(int zam_miktari){
        
        System.out.println("Çalışanlara " + zam_miktari + " tl zam yapildi");
    }
    
    public void bilgilerigöster(){ //override
        /*
        System.out.println("İsim: " + getIsim());
        System.out.println("Maas: " + getMaas());
        System.out.println("Departman: " + getDepartman());
        */
        super.bilgilerigoster();
                
        System.out.println("Sorumlu Kişi Sayısı: " + this.sorumlu_kisi);
    }
    
    
}
