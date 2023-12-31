/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kendi_exception_classimizi_olusturmak;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static void mekan_kontrol(int yas){
        
        if(yas < 18){
            
            throw new InvalidAgeException("Invalid Age");
        }else{
            
            System.out.println("Mekana Hosgeldiniz...");
        }
    }
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Lutfen Yasinizi Girin:");
        int yas = scanner.nextInt();
        
        try{
            mekan_kontrol(yas);
        }catch(InvalidAgeException e){
            e.printStackTrace();
        }
    }
}
