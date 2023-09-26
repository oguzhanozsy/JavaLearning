/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance2;

/**
 *
 * @author ASUS
 */
public class Hayvan {
    
    private String isim;
    private int kilo;
    private int boy;
    private int bacak_sayisi;
    
    public Hayvan(String  isim , int kilo , int boy , int bacak_sayisi){
        
        this.isim = isim;
        this.kilo = kilo;
        this.boy = boy;
        this.bacak_sayisi = bacak_sayisi;
        
    }
    
    public void yemek_ye(){
        
        System.out.println("Hayvan Şuanda Yemek Yiyor...");
    
    }
    
    public void harekete_gec(int hiz){
        
        System.out.println("Hayvan " + hiz + " ile hareket ediyor...");
        
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getBacak_sayisi() {
        return bacak_sayisi;
    }

    public void setBacak_sayisi(int bacak_sayisi) {
        this.bacak_sayisi = bacak_sayisi;
    }
    
    
}
