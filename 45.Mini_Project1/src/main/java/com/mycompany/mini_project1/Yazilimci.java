/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_project1;

/**
 *
 * @author ASUS
 */
public class Yazilimci extends Calisan{
    
    private String diller;
    
    public Yazilimci(String ad, String soyad, int id,String diller) {
        super(ad, soyad, id);
        this.diller = diller;
        
    }
    public void formatAt(String isletim_sistemi) {
        
        System.out.println(getAd() + " " + isletim_sistemi + "ni yüklüyor...");
    }

   //override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Yazılımcının Bildiği Diller :" + diller);
        
    }
}
