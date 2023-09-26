/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritance1;

/**
 *
 * @author ASUS
 */
public class Calisan { //Superclass veya BaseClass
    
    private String isim;
    private int maas;
    private String departman;
    
    public Calisan(String isim , int maas , String departman){
        
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
        
    }
    
    public void calis(){
        
        System.out.println("Çalışan Çalışıyor...");
        
    }
    
    public void bilgilerigoster(){
        
        System.out.println("İsim: " + isim);
        System.out.println("Maas: " + maas);
        System.out.println("Departman: " + departman);
    }
    
    public void departman_degistir(String yeni_departman){
        
        System.out.println("Departman Değiştiriliyor...");
        this.departman = yeni_departman;
        
        System.out.println("Yeni Departman: " + this.departman);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
    
    
}
