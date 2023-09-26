/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance2;

/**
 *
 * @author ASUS
 */
public class Kopek extends Hayvan {
    
    private int dis_sayisi;
    
    public Kopek(String isim , int kilo , int boy , int bacak_sayisi , int dis_sayisi){
        
        super(isim, kilo, boy, bacak_sayisi);
        
        this.dis_sayisi = dis_sayisi;
        
    }

    public void kos(int hiz){
        
        System.out.println("Köpek koşuyor...");
        super.harekete_gec(hiz);
        
    }
    
    public int getDis_sayisi() {
        return dis_sayisi;
    }

    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }
    
    
}
