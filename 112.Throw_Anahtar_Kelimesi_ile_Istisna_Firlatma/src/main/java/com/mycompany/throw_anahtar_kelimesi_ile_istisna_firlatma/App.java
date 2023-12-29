/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.throw_anahtar_kelimesi_ile_istisna_firlatma;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static void mekan_kontrol(int yas){
            
            if(yas < 18){
                throw new ArithmeticException();
            }else{
                
                System.out.println("Mekana Hosgeldiniz...");
            }
        }
        
    
    public static void main(String[] args) {

        /*
        KONU ANLATIMI:
        -->Istedigimiz exceptionlarımızı throw anahtar kelimesiyle fırlatabiliriz...
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen Yasinizi Giriniz:");
        int yas = scanner.nextInt();
        
        mekan_kontrol(yas);
        
        // çalıştırdığımızda çıkan ArithmeticException hatasının çözümü...
        /*
        try{
            mekan_kontrol(yas);
        }
        catch(ArithmeticException e){
            
            System.out.println("18 Yasindan kucukler mekana giremez...");
        }
        */
    }
}
