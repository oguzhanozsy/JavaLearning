/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Mini_Project3 {

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        int birinci_sayi;
        int ikinci_sayi;
        
        System.out.print("Birinci Sayi:");
        birinci_sayi = a.nextInt();
        
        System.out.print("İkinci Sayi:");
        ikinci_sayi = a.nextInt();
        
        System.out.print("Değiştirmeden Önce: " + birinci_sayi + " // " + ikinci_sayi);
        System.out.println();
        int gecici = birinci_sayi;
        birinci_sayi = ikinci_sayi;
        ikinci_sayi = gecici;
        
        System.out.print("Değiştirdikten Sonra: " + birinci_sayi + " // " + ikinci_sayi);
               
    }
}
