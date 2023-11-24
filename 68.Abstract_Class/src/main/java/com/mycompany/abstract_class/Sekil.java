/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstract_class;

/**
 *
 * @author ASUS
 */
public abstract class Sekil {
    
    private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }
    
    public void isminiSoyle(){
        System.out.println("Bu obje " + isim + " objesidir...");
    }
    
    abstract void alan_hesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
}
