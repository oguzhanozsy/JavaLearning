/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_prjocect3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class App {

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        System.out.println("********************");
        System.out.println("1. Toplama İşlemi\n"
                           + "2.Çıkartma İşlemi\n"
                           + "3.Çarpma İşlemi\n"
                           + "4.Bölme İşlemi");
        System.out.println("********************");
        System.out.print("İşlemi Seçiniz:");
        String islem = a.nextLine();
        
        int x;
        int y;
        
        switch (islem) {
            case "1":
                System.out.print("Birinci Sayi:");
                x = a.nextInt();
                System.out.print("İkinci Sayi:");
                y = a.nextInt();
                System.out.println("Toplam: " + (x + y));
                break;
            case "2":
                System.out.print("Birinci Sayi:");
                x = a.nextInt();
                System.out.print("İkinci Sayi:");
                y = a.nextInt();
                System.out.println("Fark: " + (x - y));
                break;
            case "3":
                System.out.print("Birinci Sayi:");
                x = a.nextInt();
                System.out.print("İkinci Sayi:");
                y = a.nextInt();
                System.out.println("Çarpım:" + (x * y));
                break;
            case "4":
                System.out.print("Birinci Sayi:");
                x = a.nextInt();
                System.out.print("İkinci Sayi:");
                y = a.nextInt();
                System.out.println("Bölüm: " + ((double)x / y));
                break;
            default:
                System.out.println("Geçersiz İşlem Tipi...");
            }
    
    }
}
