/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstract_class;

/**
 *
 * @author ASUS
 */
public class Kare extends Sekil {

    private int kenar;
    
    public Kare(String isim,int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim() + " alani " + (kenar * kenar) + " dir");
    }
    
    public void cevre_hesapla(){
        
        setIsim(getIsim()  + " in cevresi " + (4 * kenar));
    }
    
}
