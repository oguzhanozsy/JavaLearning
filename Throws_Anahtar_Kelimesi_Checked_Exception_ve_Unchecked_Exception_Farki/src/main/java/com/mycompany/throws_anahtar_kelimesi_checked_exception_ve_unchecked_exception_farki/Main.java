/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.throws_anahtar_kelimesi_checked_exception_ve_unchecked_exception_farki;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void mekan_kontrol(int yas) throws IOException{
            
            if(yas < 18){
                throw new IOException();
            }else{
                
                System.out.println("Mekana Hosgeldiniz...");
            }
        }
    
    public static void main(String[] args) {
        /*
        KONU ANLATIMI:
        Checked Exception: Java bunu önceden öngörüyo ve programcıya senin bunu yakalaman lazım diyor.
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen Yasinizi Giriniz:");
        int yas = scanner.nextInt();
         
        try {
            mekan_kontrol(yas);
        } catch (IOException ex) {
            System.out.println("IOException oluştu...");
        }
        
        
    }
}
