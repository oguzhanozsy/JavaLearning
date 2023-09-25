/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mini_project1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Login {
    
    public boolean login(Hesap hesap){ //parantez içi (int a) gibi düşün (classın ismi/değişken ismi)
     
        Scanner a = new Scanner(System.in);
        String kullanici_adi;
        String parola;
        
        System.out.print("Kullanıcı Adı: ");
        kullanici_adi = a.nextLine();
        System.out.print("Parola: ");
        parola = a.nextLine();
        
        if(hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)){
            
            return true;
            
        }else {
            
            return false;
        }
    }
}
