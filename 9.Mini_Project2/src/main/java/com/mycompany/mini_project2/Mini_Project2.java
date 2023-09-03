/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mini_project2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Mini_Project2 {

    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
        
        System.out.print("Aracınız Kilometrede Kaç TL yakıyor:");
        double tl = a.nextDouble();
        
        System.out.print("Aracınızla Kaç Kilometre Gittiniz:");
        int km = a.nextInt();
        
        System.out.print("Toplam Ödemeniz Gereken Tutar:" + (km*tl) + "tl dir...");
    }
}
