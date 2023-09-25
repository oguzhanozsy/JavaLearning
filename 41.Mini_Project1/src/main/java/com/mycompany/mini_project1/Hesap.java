/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_project1;

/**
 *
 * @author ASUS
 */
public class Hesap {
    
    private String kullanici_adi;
    private String parola;
    private int bakiye;

    public Hesap(String kullanici_adi, String parola, int bakiye) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }
    
    public void paraYatir(int tutar){
        
        bakiye += tutar; //this.bakiye += tutar;
        System.out.println("Yeni Bakiyeniz: " + bakiye);
    }
    
    public void paraCek(int tutar){
        
        if((bakiye - tutar) < 0){
            
            System.out.println("Yeterli Bakiyeniz Yok...");
        
        }else{
            
            bakiye -= tutar;
            System.out.println("Yeni Bakiyeniz : " + bakiye);
        }
    }
    
    
    
    
}
