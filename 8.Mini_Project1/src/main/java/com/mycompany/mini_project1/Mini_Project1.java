/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Mini_Project1 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        
        System.out.print("Kilonuzu Giriniz:");
        int kilo = a.nextInt();
        
        System.out.print("Boyunuzu Giriniz:");
        double boy = a.nextDouble();
        
        double index = kilo / (boy*boy);
        
        System.out.print("Beden Kitle Indeksiniz:" + index);
        
        
    }
}
