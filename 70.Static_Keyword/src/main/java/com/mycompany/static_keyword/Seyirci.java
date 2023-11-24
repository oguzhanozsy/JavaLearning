/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.static_keyword;

/**
 *
 * @author ASUS
 */
public class Seyirci {
 
    private String isim;

    public static int seyirci_sayisi = 0;
    
    
    
    public Seyirci(String isim) {
        this.isim = isim;
        seyirci_sayisi++;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public void oyun_seyret(){
        
        System.out.println(isim + " oyun seyrediyor...");
    }
    
    public static int getSeyirciSayisi(){
        
        return seyirci_sayisi;
    }
         
    
}
