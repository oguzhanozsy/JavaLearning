/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project4;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Mini_Project4 {

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        int x;
        int y;
          
        System.out.print("Birinci Dik Kenarı Giriniz: ");
        x = a.nextInt();
        
        System.out.print("İkinci Dik Kenarı Giriniz: ");
        y = a.nextInt();
        
        double h = Math.sqrt((x * x) + (y * y));
        
        System.out.print("Hipotenüs:" + h);
                
    }
}
