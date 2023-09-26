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
        
        Scanner a = new Scanner(System.in);
        
        System.out.println("Idman Programına Hoşgeldiniz...");
        
        String idmanlar = "Geçerli Hareketler...\n"
                         + "Burpee\n"
                         + "Pushup(Şınav)\n"
                         + "Situp(Mekik)"
                         + "Squat";
        System.out.println(idmanlar);
        
        System.out.println("Bir İdman Oluşturun...");
        
        System.out.print("Burpee Sayısı: ");
        int burpee = a.nextInt();
        System.out.print("Pushup Sayısı: ");
        int pushup = a.nextInt();
        System.out.print("Situp Sayısı: ");
        int situp = a.nextInt();
        System.out.print("Squat Sayısı: ");
        int squat = a.nextInt();
        
        a.nextLine();
    
        Idman idman = new Idman(burpee, pushup,situp,squat );
        
        System.out.println("İdmanının Başlıyor...");
        
        while(idman.idmanBittiMi() == false){
            
            System.out.print("Hareket Türü(Burpee,Pushup,Situp,Squat): ");
            String tur = a.nextLine();
            System.out.print("Hareket Sayısı: ");
            int sayi = a.nextInt();
            a.nextLine();
            idman.hareketYap(tur, sayi);
            
        }
  } 
}
