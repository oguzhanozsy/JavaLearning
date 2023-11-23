/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_project;

/**
 *
 * @author ASUS
 */
public class Kare extends Sekil{
    
    private int kenar;

    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    public void alanHesapla() {
        
        System.out.println(getIsim() + " in alani: " + (kenar * kenar));
    }
}
