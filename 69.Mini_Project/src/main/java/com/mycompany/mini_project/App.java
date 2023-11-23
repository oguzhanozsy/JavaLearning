/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String islemler = "Islemler...\n"
                           +"1.Kare Alan Hesapla\n"
                           +"2.Ucgen Alan Hesapla\n"
                           +"3.Daire Alan Hesapla\n"
                           +"Cikis: q";
        
        while(true){
            System.out.println(islemler);
            System.out.println("Hangi Seklin Alanini Hesaplamak Istiyorsunuz: ");
            String sekil_turu = scanner.nextLine();
            Sekil sekil = null;
            
            if(sekil_turu.equals("q")){
                System.out.println("Programdan Cikiliyor...");
                break;
            }else if(sekil_turu.equals("1")){
                System.out.println("Karenin Kenari: ");
                int kenar = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Kare("Kare1", kenar);
                sekil.alanHesapla();                
            }else if(sekil_turu.equals("2")){
                
                System.out.println("Kenar 1: ");
                int kenar1 = scanner.nextInt();
                
                System.out.println("Kenar 2: ");
                int kenar2 = scanner.nextInt();
                
                System.out.println("Kenar 3: ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Ucgen("Ucgen 1", kenar1, kenar2, kenar3);
                
                sekil.alanHesapla();
            }else if(sekil_turu.equals("3")){
                System.out.println("Dairenin Yaricapi: ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                
                sekil = new Daire("Daire 1", yaricap);
                
                sekil.alanHesapla();
            }else{
                System.out.println("Gecersiz Islem...");
            }
            
        }
        
    }
}
