/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {
        
        /*
            Beden Kitle İndeksi: Kilo / Boy(m) * Boy(m)
        
            BKİ 18.5'un altındaysa ---------> Zayıf
            BKİ 18.5 ile 25 arsındaysa ----------> Normal
            BKİ 25 ile 30 arasındaysa ----------> Fazla Kilolu
            BKİ 30'un üstündeyse ----------> Obez
        
        */
        
        Scanner a = new Scanner(System.in);
        
        System.out.print("Boy: ");
        double boy = a.nextDouble();
        
        System.out.print("Kilo: ");
        int kilo = a.nextInt();
        
        double bki = (kilo / (boy * boy));
        
        if(bki > 30){
            
            System.out.println("OBEZSİNİZ...");
            
        }else if(bki > 25 && bki <= 30){
            
            System.out.println("FAZLA KİLOLUSUNUZ...");
            
        }else if (bki >= 18.5 && bki <= 25) {
        
            System.out.println("NORMALSİNİZ...");
        
        }else{
        
            System.out.println("ZAYIFSINIZ...");    
                
        }
        
            
        
    }
}
