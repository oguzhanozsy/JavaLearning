/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project1;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        // Login Class'ı Kullanıcı Girişini Kontrol Edecek.
        // Hesap Class'ı Hesap İşlemlerini Yapacak.
        // ATM ise Uygulamayı Çalıştıracak.
        
        ATM atm = new ATM();
        
        Hesap hesap = new Hesap("Oguzhan Ozsoy","123456",2000);
        
        
        atm.calis(hesap);
        System.out.println("Programdan Çıkılıyor...");
        
    }
    
    
}
